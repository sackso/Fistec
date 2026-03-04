package com.firstec.custom;

import com.firstec.common.util.fstDomainUtil;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.*;
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
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class fstStampForDrawing2511 {
    private static Logger logger= LoggerFactory.getLogger("SHP");
    private Context context;
    private String srcPathInfo = "\\..\\__stamp\\";//""C:\\Dev\\workspace\\FIRSTEC_PLM\\temp\\watermark\\";
    private final String tmpPathInfo = srcPathInfo + "\\tempimage\\";
    private final String templatePathInfo = srcPathInfo + "\\template\\";
    private boolean bImageFileCreate = false;//이미지 파일로 생성할지 여부 확인

    private boolean bDrawCrossLine = false;//가이드라인

    public fstStampForDrawing2511() throws Exception {
        Context context = fstDomainUtil.getContext();
        new fstStampForDrawing2511(context);
    }
    /**
     * 초기화 루틴
     */
    public fstStampForDrawing2511(Context context) throws FrameworkException {
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
     * pdf 파일에 이미지를 추가
     * @param pdfReader
     * @param pdfWriter
     * @param approvalStampImages
     * @param companyStampImages
     * @param bottomImage
     * @throws Exception
     * @since 2025-11-20
     * @author shpark
     */
    public void addStampnInfoImageToPdf2511(PdfDocument pdfDoc
            , BufferedImage  approvalStampImages,BufferedImage companyStampImages
            , BufferedImage bottomImage) throws Exception {

        // 1. PdfDocument 객체 생성 (원본 읽기 및 새 문서 쓰기)
//        PdfDocument pdfDoc  = new PdfDocument(pdfReader,pdfWriter);

        // 첫 번째 페이지 객체를 가져옵니다.
        // iText7은 페이지 번호가 1부터 시작합니다.
        PdfPage page = pdfDoc.getPage(1);

        // 페이지의 미디어 박스(MediaBox)를 통해 크기를 가져옵니다.
        Rectangle pageSize = page.getMediaBox();

        // 너비와 높이를 구합니다.
        float widthInPt  = pageSize.getWidth();
        float heightInPt = pageSize.getHeight();

//        logger.debug("페이지 너비: w={}pt h={} " , widthInPt ,heightInPt);


        //상단 결재정보 x,y
        float xApproval = 30f;
        float yApproval = heightInPt -40;

        //중앙 회사 로고
        float xCompany = widthInPt/2 - 130;
        float yCompany =  heightInPt/2 - 320;

        logger.debug("xApproval : {} , yApproval : {} xCompany : {} , yCompany : {} ", xApproval , yApproval , xCompany , yCompany );
        // 2. 모든 페이지에 결재도장 삽입
        int pageCount = pdfDoc.getNumberOfPages();
        for (int i = 1; i <= pageCount; i++) {
            PdfCanvas canvas = new PdfCanvas(pdfDoc.getPage(i));

            // 상단의 결재정보 이미지 추가
            if(approvalStampImages != null && approvalStampImages.getWidth() > 0 && approvalStampImages.getHeight() > 0) {
                this.combineImageToPdf(approvalStampImages, canvas, xApproval, yApproval);//Top
            }
            // 중앙의 회사 로고 이미지 추가
            if(companyStampImages != null && companyStampImages.getWidth() > 0 && companyStampImages.getHeight() > 0) {
                //2025-11-20 ; 중앙으로 위치 ; shpark
                // 2026-03-04 ; 회사로고 이미지 제거 ; shpark
//                this.combineImageToPdf(companyStampImages, canvas, xCompany, yCompany);//Center
            }

            //[S] 하단의 이미지 추가
            String isPrintBottomInfo = EnoviaResourceBundle.getProperty(this.context
                    , "fstConfig.System.Stamp.Bottom.Info.IsPrint");
            if("true".equalsIgnoreCase(isPrintBottomInfo)) {
                // 이미지들을 왼쪽에서부터 20px = 시작위치
                float xPos = 30f;
                // 이미지를 바닥에서 10px 위치에 배치
                float yPos = -30f;
                this.combineImageToPdf(bottomImage, canvas, xPos, yPos);
            }
            //[E] 하단의 이미지 추가
        }

        // 3. 문서 닫기
        pdfDoc.close();
        logger.debug("add pdf stamp image complete pagecnt={} ", pageCount);
    }


    /**
     *
     * @param bottomImage
     * @param canvas
     * @param xPos ; 왼쪽에서부터의 좌표
     * @param yPos ; 바닥에서부터의 좌표
     * @throws IOException
     * @since 2025-11-20
     * @author shpark
     */
    private void combineImageToPdf(BufferedImage bottomImage, PdfCanvas canvas, float xPos,float yPos)
            throws IOException {
        if(bDrawCrossLine) {
            // --- ★ 여기에 중앙 기준선 그리기 함수 호출 ★ ---
            this.drawCenterCrosshairs(canvas);
        }
        // ------------------------------------------
        // BufferedImage를 iText 7의 ImageData 객체로 변환
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(bottomImage, "png", baos);
        ImageData imageData = ImageDataFactory.create(baos.toByteArray());
        PdfImageXObject pdfImage = new PdfImageXObject(imageData);

        // 원본 이미지 크기
        float originalImageWidth = pdfImage.getWidth();
        float originalImageHeight = pdfImage.getHeight();

        // 페이지에 이미지 추가 (축소된 크기 적용)
        canvas.addImage(imageData, originalImageWidth, 0, 0, originalImageHeight, xPos, yPos);
    }
    /*
     * 페이지 전체를 십자가 모양의 선을 그리는 메서드 추가
     * 가이드를 통해 위치 파악
     */
    private void drawCenterCrosshairs(PdfCanvas canvas ) {
        PdfPage page = canvas.getDocument().getPage(1);
        // 1. 페이지 크기 가져오기
        float pageWidth = page.getPageSize().getWidth();
        float pageHeight = page.getPageSize().getHeight();

        // 2. 중앙 좌표 계산
        float centerX = pageWidth / 2;
        float centerY = pageHeight / 2;

        // 3. 선의 스타일 설정
        canvas.setStrokeColor(new DeviceRgb(255, 0, 0)); // 선 색상: 빨간색
        canvas.setLineWidth(0.5f); // 선 두께: 0.5 포인트 (얇게)

        // 4. 가로선 그리기 (페이지 왼쪽 끝에서 오른쪽 끝까지)
        canvas.moveTo(0, centerY)   // 시작점: (0, 중앙Y)
                .lineTo(pageWidth, centerY) // 끝점: (페이지넓이, 중앙Y)
                .stroke();

        // 5. 세로선 그리기 (페이지 아래쪽 끝에서 위쪽 끝까지)
        canvas.moveTo(centerX, 0)   // 시작점: (중앙X, 0)
                .lineTo(centerX, pageHeight) // 끝점: (중앙X, 페이지높이)
                .stroke();
    }

    /**
     * 25.11 요구사항 변경으로 인한 watermark 이미지 변경
     * 화면 상단에 출력
     * 출력정보
     * 1.PLM배포번호
     * 2.배포자 소속팀
     * 3.배포일자
     * 4.도면,문서의 Revision
     * BASE64로 인코딩된 문자열 반환
     * @param sDates
     * @param sPlmObjectNo
     * @param sDepts
     * @return
     * @throws Exception
     * @since 2025-11-20
     * @author shpark
     */
    public BufferedImage createTopApprovalImage( String sPlmObjectNo , String[] sDates,String[] sDepts,String sRevision,int fontSize) throws Exception {
        //투명도 (Alpha) 값: 0 (완전 투명) ~ 255 (완전 불투명)
        int alpha = 64; // 예시: 50% 투명도

        // Font.PLAIN (보통), Font.ITALIC (기울임), Font.BOLD (굵게)
        Font textFont = new Font("Malgun Gothic", Font.PLAIN, fontSize); // Bold 아님, 크기 12


        // 1. 이미지의 전체 사각형 크기 설정
        // 텍스트 길이에 맞춰 적절한 크기로 조정 (충분히 크게 설정)
        int width = 1500;
        int height = 70; // 한 줄 텍스트이므로 높이를 작게 설정

        // --- ★ 텍스트 출력 위치 제어 변수 설정 ★ ---
        // 텍스트가 캔버스 내에서 시작할 위치를 0, 0을 기준으로 이동시킵니다.
        int offsetX = 10;
        int offsetY = fontSize+30; // 텍스트를 위쪽에서 조금 내려서 그립니다.
        // ------------------------------------------

        // 2. BufferedImage 생성 (배경 투명)
        // BufferedImage.TYPE_INT_ARGB 타입은 기본적으로 알파 채널(투명도)을 지원하며,
        // 초기 픽셀 값은 모두 투명한 검은색 (0, 0, 0, 0)입니다.
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = bufferedImage.createGraphics();

        // 배경을 흰색으로 채우는 코드를 제거하여 투명 배경 유지
        g2d.setComposite(AlphaComposite.SrcOver);

        // 렌더링 품질 설정
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);

        // 3. 텍스트 색상 설정 (파란색, 불투명)
        Color textColor = new Color(0, 0, 255,alpha); // RGB (파란색) + Alpha
        g2d.setColor(textColor);

        // 4. 폰트 설정 (Bold 아님, 크기 16)
        StringBuffer sbFullText = new StringBuffer();
        sbFullText.append(sPlmObjectNo)
                .append(" ")
                .append(sDepts[0])
                .append(" ")
                .append(sDates[0])
       //         .append(" Rev.")
       //         .append(sRevision)
        ;

        if(!sDates[1].isEmpty()) {
            sbFullText.append("     ");
            sbFullText.append(sPlmObjectNo)
                    .append(" ")
                    .append(sDepts[1])
                    .append(" ")
                    .append(sDates[1])
//                    .append(" Rev.")
//                    .append(sRevision)
            ;
        }

        String fullText = sbFullText.toString();
        g2d.setFont(textFont);

        // 5. 텍스트 그리기 (회전 없음)
        FontMetrics metrics = g2d.getFontMetrics(textFont);

        // drawString의 Y 좌표는 텍스트의 베이스라인(baseline)을 기준으로 합니다.
        // offsetY에 metrics.getAscent()를 더하여 텍스트의 상단이 offsetY에 맞춰지도록 합니다.
        g2d.drawString(fullText, offsetX, offsetY);

        // 6. Graphics 리소스 해제
        g2d.dispose();

        // 7. 이미지 파일로 저장
        if(bImageFileCreate) {
            try {
                File outputFile = new File(this.tmpPathInfo + "approval_image.png");
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
     * 화면 중앙에 출력
     * 회사명을 watermark 형태로 출력
     * @param sCompanyName
     * @return
     * @throws Exception
     * @since 2025-11-20
     * @author shpark
     */
    public static BufferedImage BUFFER_COMPANY_IMAGE;//속도개선을 위해 중복된 이미지 생성하지 않음.
    public BufferedImage createCenterCompanyImage(String sCompanyName ) throws Exception {
        //투명도 (Alpha) 값: 0 (완전 투명) ~ 255 (완전 불투명)
        int alpha = 64;

        // 1. 이미지의 전체 사각형 크기 (이 크기가 '이미지 자체'의 크기입니다. 400x400 유지)
        int width = 400;
        int height = 400;

        if(BUFFER_COMPANY_IMAGE != null) {
            return BUFFER_COMPANY_IMAGE;
        }

        // 2. BufferedImage 생성 및 초기화
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = bufferedImage.createGraphics();

        // Fill the entire image background with white
//        g2d.setColor(Color.BLACK);
//        g2d.fillRect(0, 0, width, height);

        g2d.setComposite(AlphaComposite.SrcOver);

        // 렌더링 품질 설정
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);

        // 3. 색상, 투명도, 회전 각도 설정
        Color stampBlueTransparent = new Color(0, 0, 200, alpha); // 반투명
        g2d.setColor(stampBlueTransparent);
        g2d.setStroke(new BasicStroke(2.0f));
        double rotateAngle = Math.toRadians(-30); // 45도 회전

        // 4. 폰트 설정
        String koreanText ="FIRSTEC CO.,LTD.";// "";//sCompanyName;//"퍼스텍(주)";
        Font koreanFont = new Font("Malgun Gothic", Font.BOLD, 28);
        String englishText = "";//""FIRSTEC CO.,LTD.";
        Font englishFont = new Font("Arial", Font.BOLD, 16);

        // 5. 텍스트 그룹 중앙 정렬을 위한 높이 계산
        g2d.setFont(koreanFont);
        FontMetrics koreanMetrics = g2d.getFontMetrics(koreanFont);
        int koreanTextHeight = koreanMetrics.getHeight();

        g2d.setFont(englishFont);
        FontMetrics englishMetrics = g2d.getFontMetrics(englishFont);
        int englishTextHeight = englishMetrics.getHeight();

        // 텍스트 그룹의 중앙 정렬 기준점 (텍스트 두 줄 사이의 공간을 계산)
        int yGroupCenterOffset = (koreanTextHeight + englishTextHeight) / 4;


        // --- 6-1. 한글 텍스트 렌더링 (출력 위치 변수 적용) ---
        g2d.setFont(koreanFont);
        int koreanTextWidth = koreanMetrics.stringWidth(koreanText);

        AffineTransform originalTransform = g2d.getTransform();

        // 텍스트 시작 위치에 offsetX, offsetY 변수 적용
        int koreanX = 50;
        int koreanY = 120;

        g2d.translate(koreanX, koreanY - yGroupCenterOffset); // 위치 이동
        g2d.rotate(rotateAngle);

        // 텍스트의 실제 시작점(좌상단)에 정렬
        g2d.drawString(koreanText, 0, koreanMetrics.getAscent());


        // --- 6-2. 영문 텍스트 렌더링 (출력 위치 변수 적용) ---
        g2d.setTransform(originalTransform); // 변환 초기화
        g2d.setFont(englishFont);
        int englishTextWidth = englishMetrics.stringWidth(englishText);

        // 텍스트 시작 위치에 offsetX, offsetY 변수 적용
        int englishX = 80; // 한글보다 조금 오른쪽으로 이동시켜 균형 맞춤
        int englishY = 120+15; // 한글 텍스트보다 아래에 위치하도록 조정

        g2d.translate(englishX, englishY + yGroupCenterOffset); // 위치 이동
        g2d.rotate(rotateAngle);

        // 텍스트의 실제 시작점(좌상단)에 정렬
        g2d.drawString(englishText, 0, englishMetrics.getAscent());

        // 7. Graphics 리소스 해제
        g2d.dispose();

        // 8. 이미지 파일로 저장
        if(bImageFileCreate) {
            try {
                File outputFile = new File(this.tmpPathInfo + "center_company_image.png");
                ImageIO.write(bufferedImage, "png", outputFile);
                logger.info("이미지가 성공적으로 생성되었습니다: " + outputFile.getAbsolutePath());
            } catch (Exception e) {
                e.printStackTrace();
                logger.error("이미지 저장 중 오류가 발생했습니다: " , e);
            }
        }
        BUFFER_COMPANY_IMAGE = bufferedImage;
        return bufferedImage;
    }


    public BufferedImage createBottomInfos(String pDepartmentName, String disUserId){
        // 이미지의 너비와 높이 설정 (텍스트 길이에 따라 조정 가능)
        int width = 400;
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
        g2d.setFont(new Font("Nanum Gothic", Font.BOLD, 12));

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
