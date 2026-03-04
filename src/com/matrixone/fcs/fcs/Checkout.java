//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.matrixone.fcs.fcs;

import com.dassault_systemes.i3dx.util.ContextUtil;
import com.firstec.common.helper.PersontUtils;
import com.firstec.common.util.fstDateUtil;
import com.firstec.common.util.fstDomainUtil;
import com.firstec.constants.FSTConstants;
import com.firstec.custom.fstStampForDrawing;
import com.firstec.custom.fstStampForDrawing2511;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.*;
import com.matrixone.apps.domain.DomainConstants;
import com.matrixone.apps.domain.DomainObject;
import com.matrixone.apps.domain.util.EnoviaResourceBundle;
import com.matrixone.apps.domain.util.FrameworkException;
import com.matrixone.apps.domain.util.MqlUtil;
import com.matrixone.client.fcs.OutputStreamSource;
import com.matrixone.client.fcs.http.FcsBadDBChecksumException;
import com.matrixone.fcs.common.CheckoutData;
import com.matrixone.fcs.common.FcsException;
import com.matrixone.fcs.common.JobReceipt;
import com.matrixone.fcs.common.JobTicket;
import com.matrixone.fcs.common.Logger;
import com.matrixone.fcs.common.TransportUtil;
import com.matrixone.fcs.fcs.probe.CheckoutProbe;
import com.matrixone.servlet.Framework;
import matrix.db.Context;
import org.apache.commons.io.IOUtils;
import org.slf4j.LoggerFactory;

import java.awt.image.BufferedImage;
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Checkout implements Dispatche {
    private static org.slf4j.Logger logger= LoggerFactory.getLogger("SHP");
    public JobReceipt doIt(FcsServlet fcsServlet, String var2, FcsContext fcsContext, HttpServletRequest request, HttpServletResponse response) throws FcsException {
        try {
            fcsContext.setErrorPage(FcsServlet.getParam(request, "failurePage", ""));
            String var6 = FcsServlet.getParam(request, "jobTicket", (String)null);
            String reqHeader = request.getHeader("networkcheckoutchecksum");
            boolean var8 = Boolean.TRUE.toString().equals(reqHeader);
            fcsContext.setNetworkChecksum(var8);
            JobTicket jobTicket = new JobTicket(var6, fcsContext);
            List var10 = jobTicket.getRequests(CheckoutData.class);
            long var11 = 0L;

            try {
                var11 = Long.parseLong(jobTicket.getTotalTransferBytes());
            } catch (Exception var16) {
            }

            fcsContext.getProbe().setSize(var11);
            boolean var13 = var10.size() > 1;
            HttpOutputStreamSourceHandler hpptSrcHandler = HttpOutputStreamSourceHandler.getHandler(request, response, fcsContext, var13, FcsServlet.getParamBoolean(request, "attachment", false));
            Iterator itrCheckoutData = var10.iterator();
            checkoutInternal(itrCheckoutData, fcsContext, hpptSrcHandler,request);
            hpptSrcHandler.finish();
            return null;
        } catch (FcsException var17) {
            throw var17;
        } catch (Exception var18) {
            throw new FcsException(var18);
        }
    }

    static long checkoutInternal(Iterator<CheckoutData> itrCheckoutData, FcsContext fcsContext, OutputStreamSource outStream,HttpServletRequest request) throws FcsException {
        long var3 = 0L;
        CheckoutProbe var5 = new CheckoutProbe(fcsContext.getProbe());
        fcsContext.setProbe(var5);

        try {
            FcsItemController fic = new FcsItemController(fcsContext, itrCheckoutData);
            Context _ctx = getContext(fcsContext);

            while(fic.hasNext()) {
                Item item = fic.next();
                logger.debug("var7(item.getPath()) {}",item.getPath());
                String orgFileName = item.getFileName();
                logger.debug("var8(orgFileName) {}",orgFileName);
                fcsContext.setCurrent(item);
                var5.addFile(item.getSize());
                byte[] data = IOUtils.toByteArray(item.getInputStream());
                InputStream fileInStream = new ByteArrayInputStream(data);//다운로드 받을 파일 읽기
                InputStream processedFileInStream = null;

                //2025-09-15 ; [S] 다운로드 할 PDF를 받아 수정한 파일로 대체 ; shpark
                boolean bIsPdf = isPdf(fileInStream);
                if(bIsPdf){
                    // PDF 파일인 경우, makeStampPdf에서 도장 찍는 로직을 수행하고 스트림을 반환
                    fileInStream = new ByteArrayInputStream(data);//다운로드 받을 파일 읽기
                    processedFileInStream = makeStampPdf2511(_ctx, fileInStream, item,request);
                }else{
                    processedFileInStream = new ByteArrayInputStream(data);
                }
                //2025-09-15 ; [E] 다운로드 할 PDF를 받아 수정한 파일로 대체 ; shpark

                OutputStream var10 = outStream.getNextOutputStream(orgFileName, false);
                long var11 = 0L;

                try {
                    //파일을 실제 다운로드 진행함.
                    var11 = TransportUtil.transport(processedFileInStream, var10, fic);
                } catch (FcsBadDBChecksumException var14) {
                    if (!item.isDBChecksumWarnOnly()) {
                        throw new IOException("Error in the checkout of " + item.getFileName(), var14);
                    }

                    Logger.log(var14.getMessage() + " for file " + item.getFileName(), 3);
                }

                item.validateTransferedSize(var11);
                var10.close();
                var3 += var11;
                Logger.log(fcsContext, "Sending " + var11 + " bytes for file " + orgFileName);
            }

            return var3;
        } catch (FcsException var15) {
            var15.printStackTrace();
            throw var15;
        } catch (Exception var16) {
            var16.printStackTrace();
            throw new FcsException(var16);
        }
    }

    /**
     * PDF 파일을 입력받아 워터마크 처리
     * 1. 상단 : 연구기획팀,구매팀 정보 출력, 배포번호등 정보 출력
     * 2. 중앙 : 퍼스텍 회사 로고를 워터마크로 입력
     * @param context
     * @param fileInStream
     * @param item
     * @param request
     * @return
     * @throws Exception
     * @since 2025-11-20
     * @author shpark
     */
    private static InputStream makeStampPdf2511(Context context, InputStream fileInStream, Item item,HttpServletRequest request) throws Exception {
        //배포에서 호출시에만 stamp 추가
        //배포 객체를 넘겨받아 처리
        String appDir           = request.getParameter("appDir");
        String trackUsagePartId = request.getParameter("trackUsagePartId");
        String stDocId          = "";
        // 2025-10-30 ;[S] 일괄다운로드의 경우 fstBatchFileDownloadProcess.jsp 에서 값을 가져오도록 개선 ; shpark
        try {
//            HashMap ccd = (HashMap) request.getSession().getAttribute("_STAMP_INFO");
            HashMap ccd = getObjectStreamFrom3dspace(context,item.getFileName());
//            logger.debug("sessionid {}",request.getSession().getId());
            logger.debug("_STAMP_INFO => ccd {} ",ccd);
            if (ccd != null) {
                if (appDir == null || appDir.isEmpty() || appDir.equals("null")) {
                    appDir = "" + ccd.get("appDir");
                }

                if (trackUsagePartId == null || trackUsagePartId.isEmpty() || trackUsagePartId.equals("null")) {
                    trackUsagePartId = "" + ccd.get("trackUsagePartId");
                }
                stDocId          = ""+ccd.get("stDocId");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        // 2025-10-30 ;[E] 일괄다운로드의 경우 fstBatchFileDownloadProcess.jsp 에서 값을 가져오도록 개선 ; shpark

        logger.debug("context.getUser() {} ", context.getUser());
        logger.debug("getCADDrawingObject() START " );
        DomainObject cadObj = getCADDrawingObject(context, item, stDocId);
        logger.debug("getCADDrawingObject() END " );

        // CAD Drawing 객체를 찾지 못했거나
        if (cadObj == null) {
            logger.debug("CAD Drawing object not found for item: {}", item.getPath());
            return fileInStream;
        }

        String sType = cadObj.getInfo(context, DomainObject.SELECT_TYPE);
        // CAD Drawing 타입이 아니면 원본 스트림 반환
        if (!DomainConstants.TYPE_CAD_DRAWING.equals(sType)) {
            logger.debug("Stamping conditions not met: Type={} is not CAD Drawing for item: {}", sType, item.getPath());
            return fileInStream;
        }

        // --- Stamping Logic Starts Here (Replaced temporary file with in-memory stream) ---
        ByteArrayOutputStream stampedPdfBytes = new ByteArrayOutputStream();
        PdfReader pdfReader = null;
        PdfWriter pdfWriter = null;
        int fontSize = 20;

        try {
            // 2026-03-04 ; pdf 문서의 크기를 통해 판단이 필요한 정보 획득 ; shpark
            pdfReader = new PdfReader(fileInStream);
            pdfWriter = new PdfWriter(stampedPdfBytes);

            // 1. PdfDocument 객체 생성 (원본 읽기 및 새 문서 쓰기)
            PdfDocument pdfDoc  = new PdfDocument(pdfReader,pdfWriter);

            fontSize = getFontSizeByPaperType(pdfDoc);
            logger.info("=== 감지된 용지 규격에 따른 size: {}", fontSize);

            String sRevision = cadObj.getInfo(context, FSTConstants.SELECT_REVISION);

            fstStampForDrawing2511 sfd = new fstStampForDrawing2511(context);
            sfd.setbImageFileCreate(false);

            BufferedImage approvalStampImages = null;// 결재정보 도장
            BufferedImage companyStampImages = null; // 회사정보 도장

            // 2025-09-18 ; 앞에서 넣겨준 DIST 정보를 기본으로 존재하지 않으면 연결된 DIST stamp 실행 ; shpark
            String sContainDistId = trackUsagePartId;
//            if(sContainDistId == null || sContainDistId.isEmpty() || sContainDistId.equals("null")){
//                sContainDistId = cadObj.getInfo(context, "to[" + FSTConstants.RELATIONSHIP_FSTDISTRIBUTIONANDDOCUMENT + "].from.id");
//            }

            //stamp 인쇄 여부 flag
            boolean isPrintStamp = appDir != null && appDir.equalsIgnoreCase("fstDistributionDocumentSummary") ? true : false;

            logger.debug("appDir {}     sContainDistId {} ",appDir,sContainDistId);
            if(sContainDistId == null || sContainDistId.isEmpty() || sContainDistId.equals("null")){
                logger.debug("sContainDistId is null");
                isPrintStamp = false;
            }else {
                logger.debug("sContainDistId is not null");

                //DIST 객체의 상태가 배포이후가 아니면 출력하지 않음
                DomainObject distObj = new DomainObject(sContainDistId);
                String distCurrent = distObj.getInfo(context, FSTConstants.SELECT_CURRENT);
                logger.debug("distCurrent {} ",distCurrent);
                if (!("Deploy,Withdraw,Complete,Dispose".indexOf(distCurrent) > -1)) {
                    isPrintStamp = false;
                }
                logger.debug("isPrintStamp {} ",isPrintStamp);

                String sCompanyName = EnoviaResourceBundle.getProperty(context, "fstConfig.System.Watermark.Company.Name");
                logger.debug("sCompanyName {} ",sCompanyName);
                companyStampImages = sfd.createCenterCompanyImage(sCompanyName);


                // Stamping 조건 확인: 1-1.배포화면에서 다운로드 요청인가?
                if (isPrintStamp) {
                    logger.debug("DIST object found (id={}), creating approval stamps.", sContainDistId);
                    //[S]도장에 출력될 정보
//                    String sRnDDeptName = EnoviaResourceBundle.getProperty(context, "fstConfig.System.Watermark.Dept.RnD");
                    //2025-11-20 ; 배포자 소속팀 = owner의 소속팀 ; shpark
                    String owner = distObj.getInfo(context,DomainConstants.SELECT_OWNER);
                    //Test code ; shpark
//                    owner = "FSTB2033";// "FST90131";
                    String sDistDepatName = PersontUtils.getDeptName(context,owner);//배포자 소속팀
                    String sPurchaseDeptName = EnoviaResourceBundle.getProperty(context
                            , "fstConfig.System.Watermark.Dept.Purchase");
                    String sPlmObjectNo = distObj.getName(context);//item.getPath();

                    //결재승인일자 (Null-safe)
                    String sActualCompletionDate = distObj.getInfo(context
                            , "from[Object Route].to.to[Route Task].from.attribute[Actual Completion Date]");
                    sActualCompletionDate = (sActualCompletionDate != null && !sActualCompletionDate.equals(""))
                            ? fstDateUtil.convertMarixDateToYYYYMMDD(sActualCompletionDate) : "";

                    //출도여부,구매팀의 출도(승인)
                    String sPurchaseConfirmFlag = distObj.getInfo(context, FSTConstants.SELECT_ATTRIBUTE_FSTPURCHASECONFIRMEDFLAG);

                    //출도일자, 구매팀의 승인날짜
                    String sPurchaseConfirmDate = distObj.getInfo(context, FSTConstants.SELECT_ATTRIBUTE_FSTPURCHASECONFIRMEDDATE);
                    sPurchaseConfirmDate = (sPurchaseConfirmDate != null && !sPurchaseConfirmDate.equals(""))
                            ? fstDateUtil.convertMarixDateToYYYYMMDD(sPurchaseConfirmDate) : "";
                    //[E]도장에 출력될 정보

                    String[] sDates = new String[2];
                    String[] sDepts = new String[2];
                    //이미지 저장
                    if ("Y".equals(sPurchaseConfirmFlag)) {//구매팀 승인된 상태
                        //1.배포자 소속팀, 2.구매팀
                        sDates = new String[]{sActualCompletionDate,sPurchaseConfirmDate};
                        sDepts = new String[]{sDistDepatName,sPurchaseDeptName};
                    } else {//구매팀 승인 없음.
                        //1.배포자 소속팀
                        sDates = new String[]{sActualCompletionDate,""};
                        sDepts = new String[]{sDistDepatName,""};
                    }
                    logger.debug("sDates {}     sDepts {}",sDates,sDepts);
                    approvalStampImages = sfd.createTopApprovalImage(sPlmObjectNo,sDates,sDepts, sRevision,fontSize);
                } else {
                    logger.debug("DIST object not found for CAD Drawing. Skipping approval stamps, but will add bottom info.");
                }
            }

            // 하단 이미지는 항상 생성
            String disUserId = "test";//context.getUser();
            String pDepartmentName = "test dept";//PersontUtils.getDeptName(context, disUserId);
            BufferedImage bottomImage = sfd.createBottomInfos(pDepartmentName, disUserId);


            //이미지와 PDF 결합
            sfd.addStampnInfoImageToPdf2511(pdfDoc, approvalStampImages,companyStampImages, bottomImage);

        } finally {
            // IMPORTANT: Close streams in finally block to guarantee resource release.
            // Closing the writer finalizes the PDF content to the byte array stream.
            if (pdfWriter != null) {
                pdfWriter.close();
            }
            if (pdfReader != null) {
                pdfReader.close();
            }
            // The original fileInStream is managed by the calling method, so we don't close it here.
        }

        //신규 생성된 파일의 용량 다시 계산
        item.setSize(stampedPdfBytes.size());

        // Return a new input stream from the in-memory byte array, which is garbage collected.
        return new ByteArrayInputStream(stampedPdfBytes.toByteArray());

    }
    /**
     * 25.11.20 ; 요구사항 변경으로 인해 아래의 method 사용하지 않음 ; shpark
     * 도장을 찍은 PDF 파일 작성.
     * CAD Drawing 객체이며, 연결된 DIST 객체가 존재할 경우에만 Stamp를 찍어 신규 스트림을 반환합니다.
     * 그 외의 경우에는 원본 스트림을 그대로 반환합니다.
     * @param context
     * @param fileInStream 원본 파일 입력 스트림
     * @param item
     * @return 도장이 찍힌 신규 파일 입력 스트림 또는 원본 파일 입력 스트림
     * @throws Exception
     * @since 2025-09-15
     * @author shpark
     */
    private static InputStream makeStampPdf(Context context, InputStream fileInStream, Item item,HttpServletRequest request) throws Exception {
        //배포에서 호출시에만 stamp 추가
        //배포 객체를 넘겨받아 처리
        String appDir = request.getParameter("appDir");
        String trackUsagePartId= request.getParameter("trackUsagePartId");

        // 2025-10-30 ;[S] 일괄다운로드의 경우 fstBatchFileDownloadProcess.jsp 에서 값을 가져오도록 개선 ; shpark
        HashMap ccd = (HashMap)request.getSession().getAttribute("_STAMP_INFO");
        if(ccd != null) {
            if (appDir == null || appDir.isEmpty() || appDir.equals("null")) {
                appDir = "" + ccd.get("appDir");
            }

            if (trackUsagePartId == null || trackUsagePartId.isEmpty() || trackUsagePartId.equals("null")) {
                trackUsagePartId = "" + ccd.get("trackUsagePartId");
            }
            //일괄다운로드 종료시 session 제거
            request.getSession().setAttribute("_STAMP_INFO", null);
        }
        // 2025-10-30 ;[E] 일괄다운로드의 경우 fstBatchFileDownloadProcess.jsp 에서 값을 가져오도록 개선 ; shpark

        logger.debug("context {} ", context.toString());
        DomainObject cadObj = getCADDrawingObject(context, item, trackUsagePartId);

        // CAD Drawing 객체를 찾지 못했거나
        if (cadObj == null) {
            logger.debug("CAD Drawing object not found for item: {}", item.getPath());
            return fileInStream;
        }

        String sType = cadObj.getInfo(context, DomainObject.SELECT_TYPE);
        // CAD Drawing 타입이 아니면 원본 스트림 반환
        if (!DomainConstants.TYPE_CAD_DRAWING.equals(sType)) {
            logger.debug("Stamping conditions not met: Type={} is not CAD Drawing for item: {}", sType, item.getPath());
            return fileInStream;
        }

        // --- Stamping Logic Starts Here (Replaced temporary file with in-memory stream) ---
        ByteArrayOutputStream stampedPdfBytes = new ByteArrayOutputStream();
        PdfReader pdfReader = null;
        PdfWriter pdfWriter = null;

        try {
            String drawingSize = cadObj.getInfo(context, FSTConstants.SELECT_ATTRIBUTE_FSTDRAWINGSIZE);
            int iPaperType = 3;

            HashMap<String, Integer> drwSizeMap = new HashMap<String, Integer>();
            drwSizeMap.put("A0", fstStampForDrawing.PAPER_TYPE_A0);
            drwSizeMap.put("A1", fstStampForDrawing.PAPER_TYPE_A1);
            drwSizeMap.put("A2", fstStampForDrawing.PAPER_TYPE_A2);
            drwSizeMap.put("A3", fstStampForDrawing.PAPER_TYPE_A3);

            if (drwSizeMap.containsKey(drawingSize)) {
                iPaperType = drwSizeMap.get(drawingSize);
            }

            fstStampForDrawing sfd = new fstStampForDrawing(context);
            sfd.setbImageFileCreate(false);

            BufferedImage[] stampImages = new BufferedImage[0]; // 기본적으로 빈 도장 이미지 배열로 시작

            // 2025-09-18 ; 앞에서 넣겨준 DIST 정보를 기본으로 존재하지 않으면 연결된 DIST stamp 실행 ; shpark
            String sContainDistId = trackUsagePartId;
//            if(sContainDistId == null || sContainDistId.isEmpty() || sContainDistId.equals("null")){
//                sContainDistId = cadObj.getInfo(context, "to[" + FSTConstants.RELATIONSHIP_FSTDISTRIBUTIONANDDOCUMENT + "].from.id");
//            }

            //stamp 인쇄 여부 flag
            boolean isPrintStamp = appDir != null && appDir.equalsIgnoreCase("fstDistributionDocumentSummary") ? true : false;

            if(sContainDistId == null || sContainDistId.isEmpty() || sContainDistId.equals("null")){
                isPrintStamp = false;
            }else {

                //DIST 객체의 상태가 배포이후가 아니면 출력하지 않음
                DomainObject distObj = new DomainObject(sContainDistId);
                String distCurrent = distObj.getInfo(context, FSTConstants.SELECT_CURRENT);
                if (!("Deploy,Withdraw,Complete,Dispose".indexOf(distCurrent) > -1)) {
                    isPrintStamp = false;
                }

                // Stamping 조건 확인: 1-1.배포화면에서 다운로드 요청인가?
                if (isPrintStamp) {
                    logger.debug("DIST object found (id={}), creating approval stamps.", sContainDistId);
                    //[S]도장에 출력될 정보
                    String sCompanyName = EnoviaResourceBundle.getProperty(context, "fstConfig.System.Watermark.Company.Name");
                    String sRnDDeptName = EnoviaResourceBundle.getProperty(context, "fstConfig.System.Watermark.Dept.RnD");
                    String sPurchaseDeptName = EnoviaResourceBundle.getProperty(context, "fstConfig.System.Watermark.Dept.Purchase");
                    String sPlmObjectNo = distObj.getName(context);//item.getPath();

                    //결재승인일자 (Null-safe)
                    String sActualCompletionDate = distObj.getInfo(context, "from[Object Route].to.to[Route Task].from.attribute[Actual Completion Date]");
                    sActualCompletionDate = (sActualCompletionDate != null && !sActualCompletionDate.equals("")) ? fstDateUtil.convertMarixDateToYYYYMMDD(sActualCompletionDate) : "";

                    //출도여부
                    String sPurchaseConfirmFlag = distObj.getInfo(context, FSTConstants.SELECT_ATTRIBUTE_FSTPURCHASECONFIRMEDFLAG);

                    //출도일자 (Null-safe)
                    String sPurchaseConfirmDate = distObj.getInfo(context, FSTConstants.SELECT_ATTRIBUTE_FSTPURCHASECONFIRMEDDATE);
                    sPurchaseConfirmDate = (sPurchaseConfirmDate != null && !sPurchaseConfirmDate.equals("")) ? fstDateUtil.convertMarixDateToYYYYMMDD(sPurchaseConfirmDate) : "";
                    //[E]도장에 출력될 정보

                    if ("Y".equals(sPurchaseConfirmFlag)) {
                        stampImages = new BufferedImage[]{
                                sfd.createStampImage(sCompanyName, sPlmObjectNo, sActualCompletionDate, sRnDDeptName),
                                sfd.createStampImage(sCompanyName, sPlmObjectNo, sPurchaseConfirmDate, sPurchaseDeptName)
                        };
                    } else {
                        stampImages = new BufferedImage[]{
                                sfd.createStampImage(sCompanyName, sPlmObjectNo, sActualCompletionDate, sRnDDeptName)
                        };
                    }
                } else {
                    logger.debug("DIST object not found for CAD Drawing. Skipping approval stamps, but will add bottom info.");
                }
            }

            // 하단 이미지는 항상 생성
            String disUserId = context.getUser();
            String pDepartmentName = PersontUtils.getDeptName(context, disUserId);
            BufferedImage bottomImage = sfd.createBottomInfos(pDepartmentName, disUserId);

            pdfReader = new PdfReader(fileInStream);
            pdfWriter = new PdfWriter(stampedPdfBytes);

            //이미지와 PDF 결합
            sfd.addStampnInfoImageToPdf(pdfReader, pdfWriter, stampImages, bottomImage, iPaperType);

        } finally {
            // IMPORTANT: Close streams in finally block to guarantee resource release.
            // Closing the writer finalizes the PDF content to the byte array stream.
            if (pdfWriter != null) {
                pdfWriter.close();
            }
            if (pdfReader != null) {
                pdfReader.close();
            }
            // The original fileInStream is managed by the calling method, so we don't close it here.
        }

        //신규 생성된 파일의 용량 다시 계산
        item.setSize(stampedPdfBytes.size());

        // Return a new input stream from the in-memory byte array, which is garbage collected.
        return new ByteArrayInputStream(stampedPdfBytes.toByteArray());
    }

    /**
     * CAD Drawing Object 를 반환
     * @param item
     * @param context
     * @return
     * @since 2025-09-16
     * @author shpark
     */
    private static DomainObject getCADDrawingObject(Context context,Item item,String stDocId) throws Exception {
        String type = DomainConstants.TYPE_CAD_DRAWING;
        String name = item.getPath();
        if(item.getPath() == null || item.getPath().isEmpty() || item.getPath().equals("null")) {
            try{
                DomainObject __dObj = new DomainObject(stDocId);
                String __type = __dObj.getInfo(context, FSTConstants.SELECT_TYPE);
                String __name = __dObj.getInfo(context, FSTConstants.SELECT_NAME);
                name = __name;
                if(!type.equals(__type)) {
                   return  null;
                }
            }catch (Exception e){
//                e.printStackTrace();
            }
        }
        String rev = "*";
        String where = "format[generic].file.locationfile == '" + item.getHashName() + "'";
        logger.debug("getCADDrawingObject type:{}, name:{}, rev:{}, where:{}",type,name,rev,where);
        DomainObject cadObj = fstDomainUtil.getObjectByTNR(context,type,name,rev,where);
        logger.debug("cadObj:{}",cadObj);
        return cadObj;
    }

    private static Context getContext(FcsContext fcsContext) throws Exception {
//        Context context = Framework.getContext(fcsContext.getRequestObject().getSession());
        Context context = fstDomainUtil.getContext();
        logger.debug("context {} getUser={}",context,context.getUser());

        return context;
    }


    private static Map getObjectInfo(Context context){
        Map map = new HashMap();
        String objectName = "";
        String locationfile = "";



        return map;

    }
    /**
     * InputStream의 시작 4바이트를 읽어 PDF 매직 넘버(%PDF)와 일치하는지 확인합니다.
     * * 주의: 이 메서드를 호출한 후에는 InputStream의 스트림 포인터가 읽은 바이트만큼 이동합니다.
     * 스트림을 재사용해야 한다면, InputStream이 mark/reset을 지원하는지 확인해야 합니다.
     * * @param is 확인할 InputStream 객체
     * @return PDF 파일 형식의 데이터 스트림이면 true, 아니면 false를 반환합니다.
     */
    public static boolean isPdf(InputStream is) {
        if (is == null) {
            return false;
        }

        try {
            // PDF 매직 넘버를 읽을 바이트 배열 (4바이트: %PDF)
            byte[] header = new byte[4];

            // 스트림에서 4바이트를 읽습니다.
            int bytesRead = is.read(header);

            // 4바이트를 모두 읽지 못했다면 PDF 헤더가 아님
            if (bytesRead < 4) {
                return false;
            }

            // 읽은 바이트를 ASCII 문자열로 변환합니다.
            String magicNumber = new String(header, "US-ASCII");

            // 모든 PDF 파일은 %PDF로 시작해야 합니다.
            return magicNumber.startsWith("%PDF");

        } catch (IOException e) {
            // 스트림 읽기 오류가 발생하면 false 반환
            e.printStackTrace();
            return false;
        }
    }

    private static HashMap getObjectStreamFrom3dspace(Context context,String stFileName) throws Exception {
        String _path = MqlUtil.mqlCommand(context,"list store STORE select path dump");
        logger.debug("_path :  {} ",_path);
        String _fileName = _path + "/___" + stFileName;
        File f = new File(_fileName);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        HashMap hMap = (HashMap) ois.readObject();

        ois.close();
        try {
            f.delete();
        }catch (Exception e){e.printStackTrace();}
        return hMap;
    }

    /**
     * 문서의 종류 판단
     * @param pdfDoc
     * @return
     * @since 2026-03-04
     * @author shpark
     */
    private static int getFontSizeByPaperType(PdfDocument pdfDoc) {

        if (pdfDoc == null || pdfDoc.getNumberOfPages() < 1) {
            return 20;
        }

        // 1. 첫 번째 페이지의 크기(MediaBox) 가져오기
        PdfPage page = pdfDoc.getPage(1);
        Rectangle pageSize = page.getMediaBox();

        float w = pageSize.getWidth();
        float h = pageSize.getHeight();

        // 2. 오차 범위를 고려하여 규격 비교
        // (순서는 큰 용지부터 비교하는 것이 좋습니다)
        if (isMatch(w, h, PageSize.A0)) return 36;
        if (isMatch(w, h, PageSize.A1)) return 26;
        if (isMatch(w, h, PageSize.A2)) return 20;
        if (isMatch(w, h, PageSize.A3)) return 20;
        if (isMatch(w, h, PageSize.A4)) return 20;
//        if (isMatch(w, h, PageSize.LETTER)) return "Letter";
//        if (isMatch(w, h, PageSize.LEGAL)) return "Legal";

        // 일치하는 규격이 없을 경우 1반환
        return 20;
    }

    /**
     * epsilon(오차범위) 내에서 용지 크기가 일치하는지 확인하는 헬퍼 메서드
     * @param w
     * @param h
     * @param target
     * @return
     * @since 2026-03-04
     * @author shpark
     */
    private static boolean isMatch(float w, float h, Rectangle target) {
        float targetW = target.getWidth();
        float targetH = target.getHeight();
        float epsilon = 15.0f; // 5mm 허용 오차 (PDF 생성 툴에 따른 미세 차이 방지)

        // 정방향(Portrait) 비교
        boolean portrait = Math.abs(w - targetW) < epsilon && Math.abs(h - targetH) < epsilon;
        // 회전방향(Landscape) 비교
        boolean landscape = Math.abs(w - targetH) < epsilon && Math.abs(h - targetW) < epsilon;

        return portrait || landscape;
    }

}