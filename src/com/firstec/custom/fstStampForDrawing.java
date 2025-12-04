package com.firstec.custom;

import com.firstec.common.util.fstDomainUtil;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.kernel.pdf.xobject.PdfImageXObject;
import com.matrixone.apps.domain.util.EnoviaResourceBundle;
import com.matrixone.apps.domain.util.FrameworkException;
import com.matrixone.apps.domain.util.MqlUtil;
import matrix.db.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class fstStampForDrawing {
    private static Logger logger= LoggerFactory.getLogger("SHP");
    private Context context;
    private String srcPathInfo = "\\..\\__stamp\\";//""C:\\Dev\\workspace\\FIRSTEC_PLM\\temp\\watermark\\";
    private final String tmpPathInfo = srcPathInfo + "\\tempimage\\";
    private final String templatePathInfo = srcPathInfo + "\\template\\";
    private boolean bImageFileCreate = false;//이미지 파일로 생성할지 여부 확인
    //용지의 종류
    public static final int PAPER_TYPE_A0 = 0;
    public static final int PAPER_TYPE_A1 = 1;
    public static final int PAPER_TYPE_A2 = 2;
    public static final int PAPER_TYPE_A3 = 3;

    public fstStampForDrawing() throws Exception {
        Context context = fstDomainUtil.getContext();
        new fstStampForDrawing(context);
    }
    /**
     * 초기화 루틴
     */
    public fstStampForDrawing(Context context) throws FrameworkException {
        this.context = context;
        String _path = MqlUtil.mqlCommand(context,"list store STORE select path dump");
        logger.debug("_path :  {} ",_path);
        srcPathInfo = _path + "\\" + srcPathInfo;

        //STORE 경로에서 경로를 참조
       File srcPathDir = new File(srcPathInfo);
       File tmpImgDir = new File(tmpPathInfo);
       File templateDir = new File(templatePathInfo);
        logger.info("srcPathInfo :  {} ",srcPathDir.getAbsolutePath());


        if(!srcPathDir.exists()){
            srcPathDir.mkdir();
        }
        if(!tmpImgDir.exists()){
            tmpImgDir.mkdir();
        }
        if(!templateDir.exists()){
            templateDir.mkdir();
        }

    }
    /**
     * PDF 파일에 워터마크 이미지들을 삽입합니다.
     * 이 메소드는 iText7 라이브러리를 사용.
     *
     * @param pdfReader      워터마크를 추가할 원본 PDF 파일의 경로
     * @param pdfWriter 워터마크가 추가된 새 PDF 파일이 저장될 경로
     * @param watermarkImages    PDF에 삽입할 워터마크 이미지들의 배열
     * @throws Exception 예외 발생 시
     */
    public void addStampnInfoImageToPdf(PdfReader pdfReader, PdfWriter pdfWriter, BufferedImage[] watermarkImages, BufferedImage bottomImage,int pPaperType) throws Exception {
        // 1. PdfDocument 객체 생성 (원본 읽기 및 새 문서 쓰기)
        PdfDocument pdfDoc  = new PdfDocument(pdfReader,pdfWriter);
        // 첫 번째 페이지 객체를 가져옵니다.
        // iText7은 페이지 번호가 1부터 시작합니다.
        PdfPage page = pdfDoc.getPage(1);

        // 페이지의 미디어 박스(MediaBox)를 통해 크기를 가져옵니다.
        Rectangle pageSize = page.getMediaBox();

        // 너비와 높이를 구합니다.
        float widthInPt  = pageSize.getWidth();
        float heightInPt = pageSize.getHeight();

        // 1포인트(pt)는 0.352778밀리미터(mm)입니다.
        final float PT_TO_MM = 0.352778f;

        // 포인트 값을 밀리미터로 변환합니다.
        float widthInMM = widthInPt * PT_TO_MM;
        float heightInMM = heightInPt * PT_TO_MM;

        logger.debug("페이지 너비: {}mm " , widthInMM );
        logger.debug("페이지 높이: {}mm ",  heightInMM );

        //A0, A1, A2, A3 마다 바닥에서의 위치
        float[] xFromLeft   = {62f,71f,75f,89f};
        float[] yFromBottom = {35f,38f,42f,46f};

        // 2. 모든 페이지에 결재도장 삽입
        for (int i = 1; i <= pdfDoc.getNumberOfPages(); i++) {
            PdfCanvas canvas = new PdfCanvas(pdfDoc.getPage(i));

            // 이미지들을 동적으로 배치하기 위해 배열을 순회합니다.
            for (int j = 0; j < watermarkImages.length; j++) {
                BufferedImage currentImage = watermarkImages[j];

                // BufferedImage를 iText 7의 ImageData 객체로 변환
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ImageIO.write(currentImage, "png", baos);
                ImageData imageData = ImageDataFactory.create(baos.toByteArray());
                PdfImageXObject pdfImage = new PdfImageXObject(imageData);

                // 원본 이미지 크기
                float originalImageWidth = pdfImage.getWidth();
                float originalImageHeight = pdfImage.getHeight();

                // 이미지를 50% 크기로 축소
                float scaleRatio    = 0.7f;
                float scaledWidth   = originalImageWidth * scaleRatio;
                float scaledHeight  = originalImageHeight * scaleRatio;

                // 이미지들을 왼쪽에서부터 3px 간격으로 배치하기 위한 X 좌표 계산
                float xPos          = xFromLeft[pPaperType] + (scaledWidth + 3f) * j;//20f = 좌측 시작위치
                // 이미지를 바닥에서 70px 위치에 배치
                float yPos          = yFromBottom[pPaperType];


                // 페이지에 이미지 추가 (축소된 크기 적용)
                this.combineImageToPdf(currentImage, canvas,scaleRatio,xPos, yPos);
            }

            //[S] 하단의 이미지 추가
            String isPrintBottomInfo = EnoviaResourceBundle.getProperty(this.context, "fstConfig.System.Stamp.Bottom.Info.IsPrint");
            if("true".equalsIgnoreCase(isPrintBottomInfo)) {
                float scaleRatio = 0.3f;//이미지 축소율
                // 이미지들을 왼쪽에서부터 20px = 시작위치
                float xPos = xFromLeft[pPaperType];
                // 이미지를 바닥에서 10px 위치에 배치
                float yPos = 10f;
                this.combineImageToPdf(bottomImage, canvas, scaleRatio, xPos, yPos);
            }
            //[E] 하단의 이미지 추가
        }

        // 3. 문서 닫기
        pdfDoc.close();
        logger.debug("iText 7을 사용하여 PDF에 워터마크 3개를 성공적으로 추가했습니다.");
    }

    private void combineImageToPdf(BufferedImage bottomImage, PdfCanvas canvas, float scaleRatio,float xPos,float yPos) throws IOException {
        // BufferedImage를 iText 7의 ImageData 객체로 변환
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(bottomImage, "png", baos);
        ImageData imageData = ImageDataFactory.create(baos.toByteArray());
        PdfImageXObject pdfImage = new PdfImageXObject(imageData);

        // 원본 이미지 크기
        float originalImageWidth = pdfImage.getWidth();
        float originalImageHeight = pdfImage.getHeight();

        // 이미지를 30% 크기로 축소

        float scaledWidth = originalImageWidth * scaleRatio;
        float scaledHeight = originalImageHeight * scaleRatio;


        // 페이지에 이미지 추가 (축소된 크기 적용)
        canvas.addImage(imageData, scaledWidth, 0, 0, scaledHeight, xPos, yPos);
    }

    /**
     * Watermark Image 생성
     * BASE64로 인코딩된 문자열 반환
     * @return base64 encoding 문자열
     * @throws Exception
     * @since 2025-07-23
     * @author shpark
     */
    public BufferedImage createStampImage(String sCompanyName, String sCurrentDate, String sPlmObjectNo, String sDepartName) throws Exception {
//        String sCurrentDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

        String companyNameText = sCompanyName;
        String dateAndPlmText = sCurrentDate + "\n" + sPlmObjectNo;

        //이미지의 전체 사각형 크기
        int width = 130;
        int height = 130;
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = bufferedImage.createGraphics();

        // Fill the entire image background with white
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);

        g2d.setComposite(AlphaComposite.SrcOver);

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);

        g2d.setColor(new Color(255, 0, 0, 200));
        g2d.setStroke(new BasicStroke(1.5f));

        int centerX = width / 2;
        int centerY = height / 2;
        int outerRadius = width / 2 - 1;//원과 전체이미지 사각형 여백간격
        g2d.drawOval(centerX - outerRadius, centerY - outerRadius, outerRadius * 2, outerRadius * 2);

        // 바깥 원 내부에 70% 위치에 작은 원 그리기
        int innerCircleRadius = (int) (outerRadius * 0.7);
        g2d.drawOval(centerX - innerCircleRadius, centerY - innerCircleRadius, innerCircleRadius * 2, innerCircleRadius * 2);

        // 위,아래 선 그리기
        this.drawStampCenterLines(outerRadius, centerY, g2d, centerX);


        // 투명도를 흰색으로 변경하는 부분: 날짜 및 PLM 번호 텍스트 배경을 흰색으로 채움
        Font fontMainContentForBounds = new Font("Nanum Gothic", Font.BOLD, 10);
        g2d.setFont(fontMainContentForBounds);
        FontMetrics fontMetricsForBounds = g2d.getFontMetrics(fontMainContentForBounds);
        String[] linesForBounds = dateAndPlmText.split("\n");
        int lineHeightForBounds = fontMetricsForBounds.getHeight();
        int totalTextHeightForBounds = linesForBounds.length * lineHeightForBounds;

        int maxTextWidth = 0;
        for (String line : linesForBounds) {
            int textWidthLine = fontMetricsForBounds.stringWidth(line);
            if (textWidthLine > maxTextWidth) {
                maxTextWidth = textWidthLine;
            }
        }

        // 텍스트 영역의 여백을 포함하여 흰색 사각형을 그립니다.
        int padding = 5; // 여백 추가
        int rectX = centerX - (maxTextWidth / 2) - padding;
        int rectY = centerY - (totalTextHeightForBounds / 2) - padding;
        int rectWidthFill = maxTextWidth + (2 * padding);
        int rectHeightFill = totalTextHeightForBounds + (2 * padding) + 2;//내부 원 삐져나오는 부분 처리를 위해 2을 더함.

        g2d.setColor(new Color(255, 255, 255, 255)); // 완전한 흰색으로 설정
        g2d.fillRect(rectX, rectY-1, rectWidthFill, rectHeightFill);


        Font fontCompanyName = new Font("Nanum Gothic", Font.BOLD, 13);
        Font fontMainContent = new Font("Nanum Gothic", Font.PLAIN, 13);
        Font fontDepartment = new Font("Nanum Gothic", Font.BOLD, 13);
        g2d.setColor(new Color(255, 0, 0, 200)); // 다시 원래 색상으로 설정


        // Draw Curved Text: Company Name (Top Arc) - Left adjustment
        // [S]회사명 정보 출력
        g2d.setFont(fontCompanyName);
        FontRenderContext frc = g2d.getFontRenderContext();
        GlyphVector gv = fontCompanyName.createGlyphVector(frc, companyNameText);
        Rectangle2D bounds = gv.getPixelBounds(frc, 0, 0);

        double textWidth = bounds.getWidth();
        double radiusForText = outerRadius - (fontCompanyName.getSize() / 2) - 10;
        double circumferenceForText = 2 * Math.PI * radiusForText;
        double textAngle = (textWidth / circumferenceForText) * 2 * Math.PI;

        double startAngle = Math.toRadians(-90 - (textAngle / 2) - 53);//마지막 빼기 수치가 커질수록 왼쪽에서 시작함.
        double angleIncrement = textAngle / (double) companyNameText.length();

        AffineTransform originalTransform = g2d.getTransform();
        g2d.translate(centerX, centerY);

        for (int i = 0; i < companyNameText.length(); i++) {
            char charToDraw = companyNameText.charAt(i);
            String charStr = String.valueOf(charToDraw);
            Shape charShape = fontCompanyName.createGlyphVector(frc, charStr).getOutline(0, 0);

            double currentAngle = startAngle + i * angleIncrement;

            AffineTransform charTransform = new AffineTransform();
            charTransform.translate(radiusForText * Math.cos(currentAngle), radiusForText * Math.sin(currentAngle));
            charTransform.rotate(currentAngle + Math.PI / 2);

            g2d.fill(charTransform.createTransformedShape(charShape));
        }
        g2d.setTransform(originalTransform);
        // [E]회사명 정보 출력

        // Draw Curved Text: Department Name (Bottom Arc) - Order corrected and rotated upright
        // [S]부서명 출력 부분
        this.drawStampDepartmentInfo(g2d, fontDepartment, frc, outerRadius, sDepartName, centerX, centerY, originalTransform);
        // [E]부서명 출력 부분

        // Draw Date and PLM Number (Centered in Rectangle)
        // [S]날짜와 PLM 번호 출력부분
        this.drawStampInfos(g2d, fontMainContent, dateAndPlmText, centerY, centerX);
        // [E]날짜와 PLM 번호 출력부분


        //출도 문자열 출력.
        this.drawStampInfos(g2d, fontMainContent, "출도", centerY-32, centerX);

        g2d.dispose();

        // Save the image to a file
        if(bImageFileCreate) {
            String outputFilePath = this.tmpPathInfo + System.currentTimeMillis() + ".png";
            try {
                File outputFile = new File(outputFilePath);
                if (outputFile.getParentFile() != null) {
                    outputFile.getParentFile().mkdirs();
                }
                ImageIO.write(bufferedImage, "png", outputFile);
                logger.debug("Watermark image saved to: {}" , outputFile.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
                logger.error(e.getMessage(),e);
            }
        }

        return bufferedImage;
    }

    private void drawStampCenterLines(int outerRadius, int centerY, Graphics2D g2d, int centerX) {
        // 날짜를 둘러싼 사각형의 위아래 선 그리기
        int rectWidth = (int) (outerRadius * 2 * 0.9);
        int rectHeight = (int) (outerRadius * 2 * 0.4);

        // 위쪽 선 (Top line)
        int topY = centerY - rectHeight / 2 + 4;
        // 시작(xy좌표) , 종료(xy좌표)
        g2d.draw(new Line2D.Double(centerX - rectWidth / 2 -3, topY, centerX + rectWidth / 2+3, topY));

        // 아래쪽 선 (Bottom line)
        int bottomY = centerY + rectHeight / 2 - 4;
        g2d.draw(new Line2D.Double(centerX - rectWidth / 2 -3, bottomY, centerX + rectWidth / 2+3, bottomY));
    }

    private void drawStampDepartmentInfo(Graphics2D g2d, Font fontDepartment, FontRenderContext frc, int outerRadius, String sDepartName, int centerX, int centerY, AffineTransform originalTransform) {
        GlyphVector gv;
        double circumferenceForText;
        double angleIncrement;
        Rectangle2D bounds;
        double radiusForText;
        double textAngle;
        double textWidth;
        double startAngle;
        g2d.setFont(fontDepartment);
        gv = fontDepartment.createGlyphVector(frc, sDepartName);
        bounds = gv.getPixelBounds(frc, 0, 0);


        textWidth = bounds.getWidth();
        // 텍스트가 바깥쪽 원에 더 가깝게 오도록 radiusForText 값을 조정 (예: -5에서 -2로 변경)
        radiusForText = outerRadius - (fontDepartment.getSize() / 2) ;
        circumferenceForText = 2 * Math.PI * radiusForText;
        textAngle = (textWidth / circumferenceForText) * 2 * Math.PI;

        int deptLength = this.getByteLength(sDepartName);
        int paddingNeeded = 0;
        if(deptLength < 15){
            paddingNeeded = (15 - (deptLength/2));
        }

        logger.debug(" sDepartName" + sDepartName + " [" + deptLength );
        float leftPoint = 32 -  paddingNeeded;//부서명 문자열 시작 위치
        startAngle = Math.toRadians(90 + (textAngle / 2) +leftPoint);//leftPoint 수치가 커질수록 왼쪽에서 시작함.;
        angleIncrement = textAngle / (double) sDepartName.length();

        g2d.translate(centerX, centerY);
        for (int i = 0; i < sDepartName.length(); i++) {
            char charToDraw = sDepartName.charAt(i);
            String charStr = String.valueOf(charToDraw);
            Shape charShape = fontDepartment.createGlyphVector(frc, charStr).getOutline(0, 0);

            // Corrected angle calculation to print "연구개발본부" in correct order from left to right
            double currentAngle = startAngle - i * angleIncrement;

            AffineTransform charTransform = new AffineTransform();
            charTransform.translate(radiusForText * Math.cos(currentAngle), radiusForText * Math.sin(currentAngle));
            charTransform.rotate(currentAngle - Math.PI / 2); // Rotate character to be upright (90 degrees to tangent)

            g2d.fill(charTransform.createTransformedShape(charShape));
        }
        g2d.setTransform(originalTransform);
    }

    private void drawStampInfos(Graphics2D g2d, Font fontMainContent, String dateAndPlmText, int centerY, int centerX) {
        g2d.setFont(fontMainContent);
        FontMetrics fontMetrics = g2d.getFontMetrics(fontMainContent);
        String[] lines = dateAndPlmText.split("\n");
        int lineHeight = fontMetrics.getHeight();
        int totalTextHeight = lines.length * lineHeight;
        int currentY = centerY - (totalTextHeight / 2) + fontMetrics.getAscent();

        for (String line : lines) {
            int textWidthLine = fontMetrics.stringWidth(line);
            int textX = centerX - (textWidthLine / 2);
            g2d.drawString(line, textX, currentY);
            currentY += lineHeight;
        }
    }

    public BufferedImage createBottomInfos(String pDepartmentName, String disUserId){
        // 이미지의 너비와 높이 설정 (텍스트 길이에 따라 조정 가능)
        int width = 800;
        int height = 100;

        // 텍스트 내용 설정
        String currentDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());
        StringBuffer sbText = new StringBuffer();
        sbText.append(currentDateTime)
                .append(" / ")
                .append(pDepartmentName)
                .append(" / ")
                .append(disUserId);

        // BufferedImage 객체 생성. 텍스트를 그릴 도화지 역할
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        // Graphics2D 객체를 얻어와 이미지에 그리기 시작
        Graphics2D g2d = bufferedImage.createGraphics();

        // 배경을 투명하게 채우기 (alpha = 0)
        g2d.setColor(new Color(0, 0, 0, 0)); // R, G, B, Alpha (0 = fully transparent)
        g2d.fillRect(0, 0, width, height);

        // 텍스트 색상 설정 (파란색)
        g2d.setColor(new Color(0, 102, 255)); // #0066FF 에 해당하는 RGB

        // 폰트 설정 (폰트, 스타일, 크기)
        // Arial, Bold 스타일을 사용하며, 크기는 30으로 설정
        g2d.setFont(new Font("Nanum Gothic", Font.BOLD, 30));

        // 텍스트의 너비와 높이를 계산하여 이미지 중앙에 배치
        int textWidth = g2d.getFontMetrics().stringWidth(sbText.toString());
        int textHeight = g2d.getFontMetrics().getAscent();

//        int x = (width - textWidth) / 2;
        int y = (height + textHeight) / 2;
        int x = 10;

        // 이미지에 텍스트 그리기
        g2d.drawString(sbText.toString(), x, y);

        // Graphics 리소스 해제
        g2d.dispose();

        // 이미지 파일로 저장
        if(bImageFileCreate) {
            try {
                File outputFile = new File(this.tmpPathInfo + "output_image.png");
                ImageIO.write(bufferedImage, "png", outputFile);
                logger.info("이미지가 성공적으로 생성되었습니다: " + outputFile.getAbsolutePath());
            } catch (Exception e) {
                e.printStackTrace();
                logger.error("이미지 저장 중 오류가 발생했습니다: " , e);
            }
        }

        return bufferedImage;

    }

    /**
     * UTF-8 인코딩을 사용하여 주어진 문자열의 바이트 길이를 반환합니다.
     * 한글은 3바이트, 영어 및 기타 ASCII 문자는 1바이트로 계산됩니다.
     *
     * @param str 바이트 길이를 계산할 문자열
     * @return 문자열의 바이트 길이
     */
    private int getByteLength(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        try {
            // "UTF-8" 인코딩을 사용하여 문자열을 바이트 배열로 변환
            byte[] bytes = str.getBytes("UTF-8");
            return bytes.length;
        } catch (UnsupportedEncodingException e) {
            // UTF-8 인코딩이 지원되지 않는 경우 예외 처리
            System.err.println("UTF-8 인코딩이 지원되지 않습니다: " + e.getMessage());
            return -1;
        }
    }

    public String getTmpPathInfo() {
        return tmpPathInfo;
    }

    public String getSrcPathInfo() {
        return srcPathInfo;
    }

    public String getTemplatePathInfo() {
        return templatePathInfo;
    }

    public void setbImageFileCreate(boolean bImageFileCreate) {
        this.bImageFileCreate = bImageFileCreate;
    }
}
