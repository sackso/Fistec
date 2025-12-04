package com.fst.applet.constants;

import com.fst.applet.common.util.PropUtil;

public class AppletConstants {
	public static final String FST_ENVIRONMENT_PROPERTIES  = "AppletEnvironment.properties";
	public static final String FST_BATCH_PROPERTIES  = "AppletBatchStringResource_ko.properties";
	public static final String PROPERTIES_PATH 	= "properties.path";
	public static final String PROPERTIES_FILE 		= "properties.file";

	// VM 인수   설정시  인수의 key
	public static final String MASTER_PROPERTIES_FILE = "frame.config.file";
	public static final String MASTER_PROPERTIES_TYPE = "frame.config.type";
	// VM 인수 미설정시 default path 및 화일 정보 지정
	public static final String DEFAULT_MASTER_PROPERTIES_PATH = "user.dir";
	public static final String DEFAULT_MASTER_PROPERTIES_FILE = "AppletLibrary.properties";
	public static final String DEFAULT_MASTER_PROPERTIES_TYPE_PATH = "com.fst.applet.common.properties.";
	public static final String DEFAULT_MASTER_PROPERTIES_TYPE = "Default";
	public static final String MASTER_PROPERTIES_ID = "AppletLibrary";
	public static final String PROPERTIES = "Properties";
	public static final String PROPERTIES_TYPE = "properties.type";
	public static final int DEFAULT_COLUMN_SIZE = 50;
	public static final int HEADER_COLUMN_HEIGHT = 20;
	public static final int HEADER_SIZE = 14;

	public static final String APPLET_PARAM_USER                 = "USER";
	public static final String APPLET_PARAM_PASSWORD             = "PASSWORD";
	public static final String APPLET_PARAM_LANGUAGE             = "LANGUAGE";
	public static final String APPLET_PARAM_HOSTNAME             = "HOSTNAME";
	public static final String APPLET_PARAM_TABLE_NAME           = "table";
	public static final String APPLET_PARAM_VAULT                = "VAULT";
	public static final String APPLET_PARAM_PARENT_ID            = "PARENT_ID";
	public static final String APPLET_PARAM_OBJECT_ID            = "OBJECT_ID";
	public static final String APPLET_PARAM_BATCH_DIVISION       = "BATCH_DIVISION";
	public static final String APPLET_PARAM_BATCH_SELECTION      = "SELECTION";
	public static final String APPLET_PARAM_FILE_TRANSFER_SERVER = "FILE_TRANSFER_SERVER";
	public static final String APPLET_PARAM_FIXED_INDEX          = "FIXED_INDEX";
	public static final String APPLET_PARAM_SCHEMATIC_TYPE 		 = "SCHEMATIC_TYPE";
	public static final String APPLET_PARAM_PROJECT_CODE 		 = "PROJECT_CODE";
	public static final String APPLET_PARAM_SEND_CODE 		     = "SEND_CODE";
	public static final String APPLET_PARAM_CORR_TYPE 		     = "CORR_TYPE";
	public static final String APPLET_PARAM_SHOPDP_NO    		 = "SHOPDP_NO";
	public static final String APPLET_PARAM_DRAWING_TYPE         = "DRAWING_TYPE";
	public static final String APPLET_PARAM_PART_CONNECT         = "PART_CONNECT";
	public static final String APPLET_PARAM_PROJECT_LIST         = "PROJECT_LIST";
	public static final String APPLET_PARAM_FILE_MODE                 = "FILE_MODE";
	//added jcnam Start
	public static final String APPLET_PARAM_DISCIPLINE 		 		= "DISCIPLINE";
	public static final String APPLET_PARAM_TEMPLATE 		 		= "TEMPLATE";
	public static final String APPLET_TUBING_TEMPLET_FILE_PATH 		= "";
	public static final String APPLET_TRANCODE_CREATE				= "C";
	public static final String APPLET_TRANCODE_UPDATE				= "U";
	public static final String APPLET_TRANCODE_DELETE				= "D";

//	public static final String TYPE_PART							= "Part";
	public static final String TYPE_PARTFAMILY						= "Part Family";
	public static final String TYPE_DOCUMENTFAMILY					= "Document Family";
	public static final String TYPE_FST_EITUBINGMTOGROUP			= "fstEITubingMTOGroup";
	public static final String TYPE_FST_SCHEMATICPART				= "fstSchematicPart";
	public static final String TYPE_FSTSTANDARDPART				= "fstStandardPart";
	public static final String TYPE_FSTRECEIVE					= "fstReceive";
	public static final String TYPE_DOCUMENTS						= "DOCUMENTS";
	public static final String TYPE_FSTDATASHEET					= "fstDataSheet";

//	public static final String POLICY_EC_PART						= "EC Part";
	public static final String POLICY_FST_SCHEMATICPART						= "fstSchematicPart";
    public static final String POLICY_FST_TAGNUMBERTEMP = "fstTagNumberTemp";

//	public static final String RELATIONSHIP_CLASSIFIED_ITEM			= "Classified Item";
	public static final String RELATIONSHIP_FSTEITUBINGMTOGROUPTOPART	= "fstEITubingMTOGroupToPart";

	public static final String APPLET_TUBING 						= "TUBING";
	public static final String ATTRIBUTE_FST_EI_ITEMNO				= "fstEIItemNo";
	public static final String SELECT_ATTRIBUTE_FST_EI_ITEMNO		= "attribute["+ATTRIBUTE_FST_EI_ITEMNO+"]";
	public static final String ATTRIBUTE_FST_EI_PROJECTNAME			= "fstEIProjectName";
	public static final String SELECT_ATTRIBUTE_FST_EI_PROJECTNAME	= "attribute["+ATTRIBUTE_FST_EI_PROJECTNAME+"]";
	public static final String ATTRIBUTE_FST_EI_DISCIPLINE			= "fstEIDiscipline";
	public static final String SELECT_ATTRIBUTE_FST_EI_DISCIPLINE	= "attribute["+ATTRIBUTE_FST_EI_DISCIPLINE+"]";

	//added jcnam End

	//added jsjung start
	public static final String APPLET_PARAM_PARENTRELNAME         = "PARENTRELNAME";
	public static final String APPLET_PARAM_ISFROM                = "ISFROM";
	//added jsjung end

	public static final String TABLE_HEADER           			  = "HEADER";
	public static final String TABLE_HEADER_INFO 				  = "HEADER INFO";

    public static final String DEFAULT_APPLET_TABLE     		  = "";
    public static final String SYSTEM                             = "system";
    public static final String SYSTEM_RESULT_MESSAGE              = "message";
    public static final String SYSTEM_RESULT_CODE                 = "result";
    public static final String SYSTEM_SUCCESS                     = "SUCCESS";
    public static final String SYSTEM_SUCCESS_REFRESH_TABLE        = "SUCCESS_REFRESH_TABLE";
    public static final String SYSTEM_SCHEMATIC_SUCCESS                     = "SCHEMATIC_SUCCESS";
    public static final String SYSTEM_ERROR                       = "ERROR";
    public static final String SYSTEM_NODATAINLIST                       = "NODATAINLIST";
    public static final String SYSTEM_NOFOLDER                       = "NOFOLDER";
    public static final String SYSTEM_INTERFACE_FAIL              = "INTERFACE_FAIL";
    public static final String SYSTEM_OK                     = "O.K";
    public static final String SYSTEM_NG                       = "NG";

    //2015-09-02
    public static final String SYSTEM_FLAG                = "flag";

    public static final String SELECT_ORIGINATED                  = "originated";
	public static final String SELECTION_SINGLE                   = "single";
	public static final String SELECTION_MULTIPLE    	          = "multi";

	public static final String JTABLE_HEADER        		      = "header";
	public static final String JTABLE_HEADER_COLUMN 		      = "column";
	public static final String JTABLE_HEADER_NAME 		          = "name";
	public static final String JTABLE_HEADER_COLUMN_LABEL         = "label";
	public static final String JTABLE_HEADER_COLUMN_TITLE         = "title";
	public static final String JTABLE_HEADER_COLUMN_ALIGN         = "align";
	public static final String JTABLE_HEADER_COLUMN_EDITABLE      = "Editable";
	public static final String JTABLE_HEADER_COLUMN_DEFAULT       = "Default";
	public static final String JTABLE_HEADER_COLUMN_VALIDATION    = "Validation";
	public static final String JTABLE_HEADER_COLUMN_USERNOTNULL    = "UserNotNull";
	public static final String JTABLE_HEADER_COLUMN_TYPE          = "Column Type";
	public static final String JTABLE_HEADER_COLUMN_NAME          = "Column Name";
	public static final String JTABLE_HEADER_CHOICE_VALUES          = "Choices Values";
	public static final String JTABLE_HEADER_COLUMN_HIDDEN          = "Hidden";
	public static final String JTABLE_HEADER_COLUMN_SIZE            = "Column Size";
	public static final String JTABLE_HEADER_COLUMN_RANGE_PROGRAM   = "Range Program";
	public static final String JTABLE_HEADER_COLUMN_RANGE_FUNCTION  = "Range Function";
	public static final String JTABLE_HEADER_CHOICE_VALUE           = "Choice Value";

	public static final String FIELD_CHOICES         = "field_choices";
	public static final String FIELD_DISPLAY_CHOICES = "field_display_choices";

	public static final String PREFIX				= "prefix";
	public static final String PREFIX_CAD			= "CAD";
	public static final String PREFIX_DOC			= "DOC";

	public static final String ROW_NUMBER          = "ROW_NUMBER";
	public static final String ENOVIA_BASIC        = "BASIC";
	public static final String ENOVIA_ATTRIBUTE    = "ATTRIBUTE";
	public static final String ENOVIA_ETC          = "ETC";
	public static final String ENOVIA_PARAM        = "PARAM";


	public static final String ENOVIA_TABLE_LIST   = "TABLE-LIST";
	public static final String ENOVIA_PARAMETER    = "PARAMETER";

	public static final String FORMAT_GENERIC = "generic";
	public static final String FORMAT_NATIVE = "native";
	public static final String FORMAT_PDF = "PDF";

	public static final String VAULT_ESERVICE_PRODUCTION = "eService Production";

	public static final String SELECT_ID                                    = "id";
	public static final String SELECT_TYPE                                  = "type";
	public static final String SELECT_NAME                                  = "name";
	public static final String SELECT_REVISION                              = "revision";
	public static final String SELECT_POLICY                              	= "policy";
	//2021.02.02 ; description -> Description; shpark
	public static final String SELECT_DESCRIPTION                           = "Description";
	public static final String SELECT_CURRENT 							    = "current";
	public static final String SELECT_OWNER 							    = "owner";
	public static final String SELECT_LAST = "last";
	public static final String SELECT_LAST_ID = "last.id";

    public static final String ATTRIBUTE_FST_BLOCKNO            			= "fstBlockNo";
    public static final String SELECT_ATTRIBUTE_FST_BLOCKNO                 = "attribute["+ ATTRIBUTE_FST_BLOCKNO +"]";

    public static final String ATTRIBUTE_FST_BLOCK            			= "fstBlock";
    public static final String SELECT_ATTRIBUTE_FST_BLOCK                 = "attribute["+ ATTRIBUTE_FST_BLOCK +"]";

    public static final String SELECT_ATTRIBUTE_FST_PROJECTNAME             = "attribute[fstProjectName]";								// Projectn Name

    public static final String ATTRIBUTE_FST_SMBPROCESSINGSERIAL     		= "fstSMBProcessingSeraial";								// Processing Serial
    public static final String SELECT_ATTRIBUTE_FST_SMBPROCESSINGSERIAL     = "attribute[" + ATTRIBUTE_FST_SMBPROCESSINGSERIAL +"]";	// Processing Serial

    public static final String ATTRIBUTE_FST_SMBBENDINGDEPT     			= "fstSMBBendingDept";								// Processing Serial
    public static final String SELECT_ATTRIBUTE_FST_SMBBENDINGDEPT     		= "attribute[" + ATTRIBUTE_FST_SMBBENDINGDEPT +"]";	// Processing Serial

    public static final String SELECT_ATTRIBUTE_FST_SMBSCRAPWT              = "attribute[fstSMBScrapWt]";             // Scrap 중량

    public static final String SELECT_ATTRIBUTE_FST_SMBPARTNAME             = "attribute[fstSMBPartName]";            // Part Name
    public static final String SELECT_ATTRIBUTE_FST_PORBLKNO                = "attribute[fstPORBlkNo]";               // POR Part BLOCK NO
    public static final String SELECT_ATTRIBUTE_FST_PORLOTNO                = "attribute[fstPORLotNo]";               // POR Part LOT NO
    public static final String SELECT_ATTRIBUTE_FST_PORISSUEPLANQTY         = "attribute[fstPORIssuePlanQty]";        // 불출 수량
    public static final String SELECT_ATTRIBUTE_FST_PORISSUEPLANWGT         = "attribute[fstPORIssuePlanWgt]";        // IssuePart 중량

    public static final String ATTRIBUTE_FST_SMBREMNANTOCCRPLACE            = "fstSMBRemnantOccrPlace";    			  					 // 잔재 발생처
    public static final String SELECT_ATTRIBUTE_FST_SMBREMNANTOCCRPLACE     = "attribute[" + ATTRIBUTE_FST_SMBREMNANTOCCRPLACE + "]";    // 잔재 발생처

    public static final String ATTRIBUTE_FST_SMBREMNANTOCCRPLACENAME        = "fstSMBRemnantOccrPlaceName";			  					 // 잔재 발생처명
    public static final String SELECT_ATTRIBUTE_FST_SMBREMNANTOCCRPLACENAME = "attribute[" + ATTRIBUTE_FST_SMBREMNANTOCCRPLACENAME + "]";// 잔재 발생처명

    public static final String ATTRIBUTE_FST_DIVISIONCODE        			= "fstDivisionCode";
    public static final String SELECT_ATTRIBUTE_FST_DIVISIONCODE 			= "attribute[" + ATTRIBUTE_FST_DIVISIONCODE + "]";

    public static final String ATTRIBUTE_FST_SMBOUTDIA        				= "fstSMBOutDia";
    public static final String SELECT_ATTRIBUTE_FST_SMBOUTDIA 				= "attribute[" + ATTRIBUTE_FST_SMBOUTDIA + "]";

    public static final String ATTRIBUTE_FST_SMBFROMOUTDIA           		= "fstSMBFromOutDia";
    public static final String SELECT_ATTRIBUTE_FST_SMBFROMOUTDIA 			= "attribute[" + ATTRIBUTE_FST_SMBFROMOUTDIA + "]";

    public static final String ATTRIBUTE_FST_SMBTOOUTDIA        			= "fstSMBToOutDia";
    public static final String SELECT_ATTRIBUTE_FST_SMBTOOUTDIA 			= "attribute[" + ATTRIBUTE_FST_SMBTOOUTDIA + "]";

    public static final String ATTRIBUTE_FST_CODEITEM1        				= "fstCodeItem1";
    public static final String SELECT_ATTRIBUTE_FST_CODEITEM1 				= "attribute[" + ATTRIBUTE_FST_CODEITEM1 + "]";

    public static final String ATTRIBUTE_FST_SMBNCNO        				= "fstSMBNCNo";
    public static final String SELECT_ATTRIBUTE_FST_SMBNCNO		 			= "attribute[" + ATTRIBUTE_FST_SMBNCNO + "]";

    public static final String ATTRIBUTE_FST_SMBSTRUCTURALSTEELTYPE        	= "fstSMBStructuralSteelType";
    public static final String SELECT_ATTRIBUTE_FST_SMBSTRUCTURALSTEELTYPE	= "attribute[" + ATTRIBUTE_FST_SMBSTRUCTURALSTEELTYPE + "]";


	public static final String ATTRIBUTE_FST_ACTIVITYSTARTDATE     		= "fstActivityStartDate";
	public static final String SELECT_ATTRIBUTE_FST_ACTIVITYSTARTDATE		= "attribute[" + ATTRIBUTE_FST_ACTIVITYSTARTDATE + "]";
	public static final String ATTRIBUTE_FST_ACTIVITYFINISHDATE     		= "fstActivityFinishDate";
	public static final String SELECT_ATTRIBUTE_FST_ACTIVITYFINISHDATE	= "attribute[" + ATTRIBUTE_FST_ACTIVITYFINISHDATE + "]";
	public static final String ATTRIBUTE_TASKESTIMATEDFINISHDATE     		= "Task Estimated Finish Date";
	public static final String SELECT_ATTRIBUTE_TASKESTIMATEDFINISHDATE	= "attribute[" + ATTRIBUTE_TASKESTIMATEDFINISHDATE + "]";
	public static final String ATTRIBUTE_TASKACTUALFINISHDATE     		= "Task Actual Finish Date";
	public static final String SELECT_ATTRIBUTE_TASKACTUALFINISHDATE		= "attribute[" + ATTRIBUTE_TASKACTUALFINISHDATE + "]";
	public static final String ATTRIBUTE_FST_WPNO     					= "fstWPNo";
	public static final String SELECT_ATTRIBUTE_FST_WPNO					= "attribute[" + ATTRIBUTE_FST_WPNO + "]";

    public static final String ATTRIBUTE_FST_CODE_ITEM2        				= "fstCodeItem2";
    public static final String SELECT_ATTRIBUTE_FST_CODE_ITEM2				= "attribute[" + ATTRIBUTE_FST_CODE_ITEM2 + "]";

    public static final String ATTRIBUTE_TITLE        			            = "Title";
    public static final String ATTRIBUTE_FSTPROJECTCODE                     = "fstProjectCode";
    public static final String ATTRIBUTE_FSTPROJECTITEM                     = "fstProjectItem";
    public static final String ATTRIBUTE_FSTDPNO                            = "fstDPNo";
    public static final String ATTRIBUTE_FSTDWGDOCNO                        = "fstDwgDocNo";
    public static final String ATTRIBUTE_FSTSTAGE                           = "fstStage";
    public static final String ATTRIBUTE_ORIGINATOR                         = "Originator";
    public static final String ATTRIBUTE_FSTDIVISIONCODE                    = "fstDivisionCode";
    public static final String ATTRIBUTE_FSTDISCIPLINEGROUP                 = "fstDisciplineGroup";
    public static final String ATTRIBUTE_FSTDISCIPLINE                      = "fstDiscipline";
    public static final String ATTRIBUTE_FSTSUBDISCIPLINE                   = "fstSubDiscipline";
    public static final String ATTRIBUTE_FSTTEAMCODE                        = "fstTeamCode";
    public static final String ATTRIBUTE_FSTCORRMAXNO                       = "fstCorrMaxNo";
    public static final String ATTRIBUTE_FSTSERIALNO                        = "fstSerialNo";
    public static final String ATTRIBUTE_FSTSERIALSIZE                      = "fstSerialSize";
    public static final String ATTRIBUTE_FSTBLOCK                           = "fstBlock";
    public static final String ATTRIBUTE_FSTCADTYPE                         = "fstCADTYPE";
    public static final String ATTRIBUTE_FSTSHOPDRAWINGTYPE                 = "fstShopDrawingType";
    public static final String ATTRIBUTE_FSTSHEETNO                         = "fstSheetNo";
    public static final String ATTRIBUTE_FSTREVDATE                         = "fstRevDate";
    public static final String ATTRIBUTE_FSTCADNAME                         = "fstCADNAME";
    public static final String ATTRIBUTE_FSTRFQNO                           = "fstRFQNo";
    public static final String ATTRIBUTE_FSTVENDOR                          = "fstVendor";
    public static final String ATTRIBUTE_FSTENGINEER                        = "fstEngineer";
    public static final String ATTRIBUTE_FSTUNIQUEPARTNUMBER                = "fstUniquePartNumber";

    public static final String ATTRIBUTE_FSTSTANDARDPARTMANAGENO            = "fstStandardPartManageNo";
    public static final String ATTRIBUTE_FSTSTANDARDNEEDYN              	  = "fstStandardNeedYN";
    public static final String ATTRIBUTE_FSTSTANDARDCOMPLETEYN              = "fstStandardCompleteYN";

    public static final String SELECT_ATTRIBUTE_TITLE 			            = "attribute[" + ATTRIBUTE_TITLE + "]";
    public static final String SELECT_ATTRIBUTE_FSTPROJECTCODE 			    = "attribute[" + ATTRIBUTE_FSTPROJECTCODE + "]";
    public static final String SELECT_ATTRIBUTE_FSTPROJECTITEM 			    = "attribute[" + ATTRIBUTE_FSTPROJECTITEM + "]";
    public static final String SELECT_ATTRIBUTE_FSTDPNO                     = "attribute[" + ATTRIBUTE_FSTDPNO + "]";
    public static final String SELECT_ATTRIBUTE_FSTDWGDOCNO                 = "attribute[" + ATTRIBUTE_FSTDWGDOCNO + "]";
    public static final String SELECT_ATTRIBUTE_FSTSTAGE                    = "attribute[" + ATTRIBUTE_FSTSTAGE + "]";
    public static final String SELECT_ATTRIBUTE_ORIGINATOR                  = "attribute[" + ATTRIBUTE_ORIGINATOR + "]";
    public static final String SELECT_ATTRIBUTE_FSTDIVISIONCODE             = "attribute[" + ATTRIBUTE_FSTDIVISIONCODE + "]";
    public static final String SELECT_ATTRIBUTE_FSTDISCIPLINEGROUP          = "attribute[" + ATTRIBUTE_FSTDISCIPLINEGROUP + "]";
    public static final String SELECT_ATTRIBUTE_FSTDISCIPLINE               = "attribute[" + ATTRIBUTE_FSTDISCIPLINE + "]";
    public static final String SELECT_ATTRIBUTE_FSTSUBDISCIPLINE            = "attribute[" + ATTRIBUTE_FSTSUBDISCIPLINE + "]";
    public static final String SELECT_ATTRIBUTE_FSTTEAMCODE                 = "attribute[" + ATTRIBUTE_FSTTEAMCODE + "]";
    public static final String SELECT_ATTRIBUTE_FSTCORRMAXNO                = "attribute[" + ATTRIBUTE_FSTCORRMAXNO + "]";
    public static final String SELECT_ATTRIBUTE_FSTSERIALNO                 = "attribute[" + ATTRIBUTE_FSTSERIALNO + "]";
    public static final String SELECT_ATTRIBUTE_FSTSERIALSIZE               = "attribute[" + ATTRIBUTE_FSTSERIALSIZE + "]";
    public static final String SELECT_ATTRIBUTE_FSTBLOCK                    = "attribute[" + ATTRIBUTE_FSTBLOCK + "]";
    public static final String SELECT_ATTRIBUTE_FSTCADTYPE                  = "attribute[" + ATTRIBUTE_FSTCADTYPE + "]";
    public static final String SELECT_ATTRIBUTE_FSTSHOPDRAWINGTYPE          = "attribute[" + ATTRIBUTE_FSTSHOPDRAWINGTYPE + "]";
    public static final String SELECT_ATTRIBUTE_FSTSHEETNO                  = "attribute[" + ATTRIBUTE_FSTSHEETNO + "]";
    public static final String SELECT_ATTRIBUTE_FSTREVDATE                  = "attribute[" + ATTRIBUTE_FSTREVDATE + "]";
    public static final String SELECT_ATTRIBUTE_FSTCADNAME                  = "attribute[" + ATTRIBUTE_FSTCADNAME + "]";
    public static final String SELECT_ATTRIBUTE_FSTRFQNO                    = "attribute[" + ATTRIBUTE_FSTRFQNO + "]";
    public static final String SELECT_ATTRIBUTE_FSTVENDOR               	= "attribute[" + ATTRIBUTE_FSTVENDOR + "]";
    public static final String SELECT_ATTRIBUTE_FSTENGINEER                 = "attribute[" + ATTRIBUTE_FSTENGINEER + "]";
    public static final String SELECT_ATTRIBUTE_FSTUNIQUEPARTNUMBER         = "attribute[" + ATTRIBUTE_FSTUNIQUEPARTNUMBER + "]";

    public static final String SELECT_ATTRIBUTE_FSTSTANDARDPARTMANAGENO     = "attribute[" + ATTRIBUTE_FSTSTANDARDPARTMANAGENO + "]";
    public static final String SELECT_ATTRIBUTE_FSTSTANDARDNEEDYN           = "attribute[" + ATTRIBUTE_FSTSTANDARDNEEDYN + "]";
    public static final String SELECT_ATTRIBUTE_FSTSTANDARDCOMPLETEYN       = "attribute[" + ATTRIBUTE_FSTSTANDARDCOMPLETEYN + "]";

    public static final String ATTRIBUTE_FSTCUSTOMERDOCNUMBER                 	= "fstCustomerDocNumber";
    public static final String ATTRIBUTE_FSTCUSTOMERDOCREVISION               	= "fstCustomerDocRevision";
    public static final String ATTRIBUTE_FSTAPPROVERBYCUSTOMER               	= "fstApproverbyCustomer";
    public static final String ATTRIBUTE_FSTAPPROVERPLACE                    	= "fstApproverPlace";
    public static final String ATTRIBUTE_FSTAPPROVERPLACEDETAIL              	= "fstApproverPlaceDetail";
    public static final String ATTRIBUTE_FSTDESIGN                           	= "fstDesign";
    public static final String ATTRIBUTE_FSTDRAFTING                         	= "fstDrafting";
    public static final String ATTRIBUTE_FSTCHECKOFDRAWINGLEFT               	= "fstCheckOfDrawingLeft";
    public static final String ATTRIBUTE_FSTCHECKOFDRAWINGRIGHTDOWN          	= "fstCheckOfDrawingRightDown";
    public static final String ATTRIBUTE_FSTCHECKOFDRAWINGRIGHTCENTER        	= "fstCheckOfDrawingRightCenter";
    public static final String ATTRIBUTE_FSTAPPROVAL                         	= "fstApproval";
    public static final String ATTRIBUTE_FSTORIGIN                           	= "fstOrigin";
    public static final String ATTRIBUTE_FSTOUTDRAWINGDATE                   	= "fstOutDrawingDate";
    public static final String ATTRIBUTE_FSTOUTDRAWINGNUMBER                 	= "fstOutDrawingNumber";
    public static final String ATTRIBUTE_FSTEXPIRYDATE                       	= "fstExpiryDate";
    public static final String ATTRIBUTE_FSTCONFIGURATIONREGULATEOWNER       	= "fstConfigurationRegulateOwner";
    public static final String ATTRIBUTE_FSTOUTDRAWINGAPPROVEDDATE           	= "fstOutDrawingApprovedDate";
    public static final String ATTRIBUTE_FSTINDIVIDUALRECEIPTNUMBER          	= "fstIndividualReceiptNumber";
    public static final String ATTRIBUTE_FSTORIGINALSIZE                     	= "fstOriginalSize";
    public static final String ATTRIBUTE_FSTPRINTSIZE                        	= "fstPrintSize";
    public static final String ATTRIBUTE_FSTSTANDARDIZATIONTAGETYN           	= "fstStandardizationTagetYN";
    public static final String ATTRIBUTE_FSTSTANDARDIZATIONCOMPLETEYN        	= "fstStandardizationCompleteYN";

    public static final String SELECT_ATTRIBUTE_FSTCUTOMERDOCNUMBER                 	= "attribute[" + ATTRIBUTE_FSTCUSTOMERDOCNUMBER                 + "]";
    public static final String SELECT_ATTRIBUTE_FSTCUTOMERDOCREVISION               	= "attribute[" + ATTRIBUTE_FSTCUSTOMERDOCREVISION               + "]";
    public static final String SELECT_ATTRIBUTE_FSTAPPROVERBYCUSTOMER               	= "attribute[" + ATTRIBUTE_FSTAPPROVERBYCUSTOMER               + "]";
    public static final String SELECT_ATTRIBUTE_FSTAPPROVERPLACE                    	= "attribute[" + ATTRIBUTE_FSTAPPROVERPLACE                    + "]";
    public static final String SELECT_ATTRIBUTE_FSTAPPROVERPLACEDETAIL              	= "attribute[" + ATTRIBUTE_FSTAPPROVERPLACEDETAIL              + "]";
    public static final String SELECT_ATTRIBUTE_FSTDESIGN                           	= "attribute[" + ATTRIBUTE_FSTDESIGN                           + "]";
    public static final String SELECT_ATTRIBUTE_FSTDRAFTING                         	= "attribute[" + ATTRIBUTE_FSTDRAFTING                         + "]";
    public static final String SELECT_ATTRIBUTE_FSTCHECKOFDRAWINGLEFT               	= "attribute[" + ATTRIBUTE_FSTCHECKOFDRAWINGLEFT               + "]";
    public static final String SELECT_ATTRIBUTE_FSTCHECKOFDRAWINGRIGHTDOWN          	= "attribute[" + ATTRIBUTE_FSTCHECKOFDRAWINGRIGHTDOWN          + "]";
    public static final String SELECT_ATTRIBUTE_FSTCHECKOFDRAWINGRIGHTCENTER        	= "attribute[" + ATTRIBUTE_FSTCHECKOFDRAWINGRIGHTCENTER        + "]";
    public static final String SELECT_ATTRIBUTE_FSTAPPROVAL                         	= "attribute[" + ATTRIBUTE_FSTAPPROVAL                         + "]";
    public static final String SELECT_ATTRIBUTE_FSTORIGIN                           	= "attribute[" + ATTRIBUTE_FSTORIGIN                           + "]";
    public static final String SELECT_ATTRIBUTE_FSTOUTDRAWINGDATE                   	= "attribute[" + ATTRIBUTE_FSTOUTDRAWINGDATE                   + "]";
    public static final String SELECT_ATTRIBUTE_FSTOUTDRAWINGNUMBER                 	= "attribute[" + ATTRIBUTE_FSTOUTDRAWINGNUMBER                 + "]";
    public static final String SELECT_ATTRIBUTE_FSTEXPIRYDATE                       	= "attribute[" + ATTRIBUTE_FSTEXPIRYDATE                       + "]";
    public static final String SELECT_ATTRIBUTE_FSTCONFIGURATIONREGULATEOWNER       	= "attribute[" + ATTRIBUTE_FSTCONFIGURATIONREGULATEOWNER       + "]";
    public static final String SELECT_ATTRIBUTE_FSTOUTDRAWINGAPPROVEDDATE           	= "attribute[" + ATTRIBUTE_FSTOUTDRAWINGAPPROVEDDATE           + "]";
    public static final String SELECT_ATTRIBUTE_FSTINDIVIDUALRECEIPTNUMBER          	= "attribute[" + ATTRIBUTE_FSTINDIVIDUALRECEIPTNUMBER          + "]";
    public static final String SELECT_ATTRIBUTE_FSTORIGINALSIZE                     	= "attribute[" + ATTRIBUTE_FSTORIGINALSIZE                     + "]";
    public static final String SELECT_ATTRIBUTE_FSTPRINTSIZE                        	= "attribute[" + ATTRIBUTE_FSTPRINTSIZE                        + "]";
    public static final String SELECT_ATTRIBUTE_FSTSTANDARDIZATIONTAGETYN           	= "attribute[" + ATTRIBUTE_FSTSTANDARDIZATIONTAGETYN           + "]";
    public static final String SELECT_ATTRIBUTE_FSTSTANDARDIZATIONCOMPLETEYN        	= "attribute[" + ATTRIBUTE_FSTSTANDARDIZATIONCOMPLETEYN        + "]";

    public static final String ATTRIBUTE_FST_SMBSTRNDARD 						= "fstSMBStandard";
    public static final String SELECT_ATTRIBUTE_FST_SMBSTRNDARD 				= "attribute[" + ATTRIBUTE_FST_SMBSTRNDARD + "]";
	public static final String ATTRIBUTE_FST_SMBHYCONDSC 						= "fstSMBHycondsc";
    public static final String SELECT_ATTRIBUTE_FST_SMBHYCONDSC 				= "attribute[" + ATTRIBUTE_FST_SMBHYCONDSC + "]";
	public static final String ATTRIBUTE_FST_SMBADDPARTNAME 					= "fstSMBAddPartName";
    public static final String SELECT_ATTRIBUTE_FST_SMBADDPARTNAME 				= "attribute[" + ATTRIBUTE_FST_SMBADDPARTNAME + "]";
	public static final String ATTRIBUTE_FST_SMBPROJECTABBREVIATION 			= "fstSMBProjectAbbreviation";
    public static final String SELECT_ATTRIBUTE_FST_SMBPROJECTABBREVIATION 		= "attribute[" + ATTRIBUTE_FST_SMBPROJECTABBREVIATION + "]";
	public static final String ATTRIBUTE_FST_SMBCONSTRUCTIONUNIT                = "fstSMBConstructionUnit";
    public static final String SELECT_ATTRIBUTE_FST_SMBCONSTRUCTIONUNIT         = "attribute[" + ATTRIBUTE_FST_SMBCONSTRUCTIONUNIT + "]";
	public static final String ATTRIBUTE_FST_SMBCONSTRUCTIONOUTDIA              = "fstSMBConstructionOutDia";
    public static final String SELECT_ATTRIBUTE_FST_SMBCONSTRUCTIONOUTDIA       = "attribute[" + ATTRIBUTE_FST_SMBCONSTRUCTIONOUTDIA + "]";
	public static final String ATTRIBUTE_FST_SMBCONSTRUCTIONTHK                 = "fstSMBConstructionTHK";
    public static final String SELECT_ATTRIBUTE_FST_SMBCONSTRUCTIONTHK          = "attribute[" + ATTRIBUTE_FST_SMBCONSTRUCTIONTHK + "]";
	public static final String ATTRIBUTE_FST_SMBCONSTRUCTIONABBREVIATION        = "fstSMBConstructionAbbreviation";
    public static final String SELECT_ATTRIBUTE_FST_SMBCONSTRUCTIONABBREVIATION = "attribute[" + ATTRIBUTE_FST_SMBCONSTRUCTIONABBREVIATION + "]";
	public static final String ATTRIBUTE_FST_SMBCONSTRUCTIONCONDITION           = "fstSMBConstructionCondition";
    public static final String SELECT_ATTRIBUTE_FST_SMBCONSTRUCTIONCONDITION    = "attribute[" + ATTRIBUTE_FST_SMBCONSTRUCTIONCONDITION + "]";
	public static final String ATTRIBUTE_FST_SMBCONSTRUCTIONMANAGERCODE         = "fstSMBConstructionManagerCode";
    public static final String SELECT_ATTRIBUTE_FST_SMBCONSTRUCTIONMANAGERCODE  = "attribute[" + ATTRIBUTE_FST_SMBCONSTRUCTIONMANAGERCODE + "]";
	public static final String ATTRIBUTE_FST_REMARK        						= "fstRemark";
    public static final String SELECT_ATTRIBUTE_FST_REMARK 						= "attribute[" + ATTRIBUTE_FST_REMARK + "]";
	public static final String ATTRIBUTE_FST_SMBSTANDARDSIZEDIVISION        	= "fstSMBStandardSizeDivision";
    public static final String SELECT_ATTRIBUTE_FST_SMBSTANDARDSIZEDIVISION 	= "attribute[" + ATTRIBUTE_FST_SMBSTANDARDSIZEDIVISION + "]";
	public static final String ATTRIBUTE_FST_SMBSHAPE         					= "fstSMBShape";
    public static final String SELECT_ATTRIBUTE_FST_SMBSHAPE  					= "attribute[" + ATTRIBUTE_FST_SMBSHAPE + "]";
	public static final String ATTRIBUTE_FST_SMBWELDJOINTNO         			= "fstSMBWeldJointNo";
    public static final String SELECT_ATTRIBUTE_FST_SMBWELDJOINTNO  			= "attribute[" + ATTRIBUTE_FST_SMBWELDJOINTNO + "]";
	public static final String ATTRIBUTE_FST_SMBDEVICE        					= "fstSMBDevice";
    public static final String SELECT_ATTRIBUTE_FST_SMBDEVICE 					= "attribute[" + ATTRIBUTE_FST_SMBDEVICE + "]";
	public static final String ATTRIBUTE_FST_SMBSTEELKIND        				= "fstSMBSteelKind";
    public static final String SELECT_ATTRIBUTE_FST_SMBSTEELKIND 				= "attribute[" + ATTRIBUTE_FST_SMBSTEELKIND + "]";
	public static final String ATTRIBUTE_FST_SMBFROMTHICKNESS        			= "fstSMBFromThickness";
    public static final String SELECT_ATTRIBUTE_FST_SMBFROMTHICKNESS 			= "attribute[" + ATTRIBUTE_FST_SMBFROMTHICKNESS + "]";
	public static final String ATTRIBUTE_FST_SMBTOTHICKNESS        				= "fstSMBToThickness";
    public static final String SELECT_ATTRIBUTE_FST_SMBTOTHICKNESS 				= "attribute[" + ATTRIBUTE_FST_SMBTOTHICKNESS + "]";
	public static final String ATTRIBUTE_FST_SMBFROMLENGTH        				= "fstSMBFromLength";
    public static final String SELECT_ATTRIBUTE_FST_SMBFROMLENGTH 				= "attribute[" + ATTRIBUTE_FST_SMBFROMLENGTH + "]";
	public static final String ATTRIBUTE_FST_SMBTOLENGTH        					= "fstSMBToLength";
    public static final String SELECT_ATTRIBUTE_FST_SMBTOLENGTH 					= "attribute[" + ATTRIBUTE_FST_SMBTOLENGTH + "]";
	public static final String ATTRIBUTE_FST_SMBMINLENGTH        				= "fstSMBMinLength";
    public static final String SELECT_ATTRIBUTE_FST_SMBMINLENGTH 				= "attribute[" + ATTRIBUTE_FST_SMBMINLENGTH + "]";
	public static final String ATTRIBUTE_FST_ATTRIBUTEORIGINALNAME        		= "fstAttributeOriginalName";
    public static final String SELECT_ATTRIBUTE_FST_ATTRIBUTEORIGINALNAME 		= "attribute[" + ATTRIBUTE_FST_ATTRIBUTEORIGINALNAME + "]";
	public static final String ATTRIBUTE_FST_MCCSCODESTARTCOL        = "fstMCCSCodeStartCol";
    public static final String SELECT_ATTRIBUTE_FST_MCCSCODESTARTCOL = "attribute[" + ATTRIBUTE_FST_MCCSCODESTARTCOL + "]";
	public static final String ATTRIBUTE_FST_MCCSCODEENDCOL        = "fstMCCSCodeEndCol";
    public static final String SELECT_ATTRIBUTE_FST_MCCSCODEENDCOL = "attribute[" + ATTRIBUTE_FST_MCCSCODEENDCOL + "]";
	public static final String ATTRIBUTE_FST_COMMONCODE        = "fstCommonCode";
    public static final String SELECT_ATTRIBUTE_FSTCOMMONCODE = "attribute[" + ATTRIBUTE_FST_COMMONCODE + "]";
	public static final String ATTRIBUTE_FST_SMBMINIMUMORDERLENGTH        = "fstSMBMinimumOrderLength";
    public static final String SELECT_ATTRIBUTE_FST_SMBMINIMUMORDERLENGTH = "attribute[" + ATTRIBUTE_FST_SMBMINIMUMORDERLENGTH + "]";
	public static final String ATTRIBUTE_FST_SMBMARGIN        = "fstSMBMargin";
    public static final String SELECT_ATTRIBUTE_FST_SMBMARGIN = "attribute[" + ATTRIBUTE_FST_SMBMARGIN + "]";
	public static final String ATTRIBUTE_FST_SMBTOTALLENGTH        = "fstSMBTotalLength";
    public static final String SELECT_ATTRIBUTE_FST_SMBTOTALLENGTH = "attribute[" + ATTRIBUTE_FST_SMBTOTALLENGTH + "]";
	public static final String ATTRIBUTE_FST_SMBTOTALORDERLENGTH        = "fstSMBTotalOrderLength";
    public static final String SELECT_ATTRIBUTE_FST_SMBTOTALORDERLENGTH = "attribute[" + ATTRIBUTE_FST_SMBTOTALORDERLENGTH + "]";
	public static final String ATTRIBUTE_FST_SMBTOTALREMAINLENGTH        = "fstSMBTotalRemainLength";
    public static final String SELECT_ATTRIBUTE_FST_SMBTOTALREMAINLENGTH = "attribute[" + ATTRIBUTE_FST_SMBTOTALREMAINLENGTH + "]";
	public static final String ATTRIBUTE_FST_SMBWEIGHTRATIO        = "fstSMBWeightRatio";
    public static final String SELECT_ATTRIBUTE_FST_SMBWEIGHTRATIO = "attribute[" + ATTRIBUTE_FST_SMBWEIGHTRATIO + "]";
	public static final String ATTRIBUTE_FST_SMBORDERLENGTH        = "fstSMBOrderLength";
    public static final String SELECT_ATTRIBUTE_FST_SMBORDERLENGTH = "attribute[" + ATTRIBUTE_FST_SMBORDERLENGTH + "]";
	public static final String ATTRIBUTE_FST_SMBSIZEARRANGELENGTH        = "fstSMBSizeArrangeLength";
    public static final String SELECT_ATTRIBUTE_FST_SMBSIZEARRANGELENGTH = "attribute[" + ATTRIBUTE_FST_SMBSIZEARRANGELENGTH + "]";
	public static final String ATTRIBUTE_FST_SMBSIZEARRANGEPARTLENGTH        = "fstSMBSizeArrangePartLength";
    public static final String SELECT_ATTRIBUTE_FST_SMBSIZEARRANGEPARTLENGTH = "attribute[" + ATTRIBUTE_FST_SMBSIZEARRANGEPARTLENGTH + "]";
	public static final String ATTRIBUTE_FST_SMBREMAINLENGTH        = "fstSMBRemainLength";
    public static final String SELECT_ATTRIBUTE_FST_SMBREMAINLENGTH = "attribute[" + ATTRIBUTE_FST_SMBREMAINLENGTH + "]";
	public static final String ATTRIBUTE_FST_SMBINCREASEMINUTE        = "fstSMBIncreaseMinute";
    public static final String SELECT_ATTRIBUTE_FST_SMBINCREASEMINUTE = "attribute[" + ATTRIBUTE_FST_SMBINCREASEMINUTE + "]";
	public static final String ATTRIBUTE_FST_SMBTARGETLENGTH        = "fstSMBTargetlength";
    public static final String SELECT_ATTRIBUTE_FST_SMBTARGETLENGTH = "attribute[" + ATTRIBUTE_FST_SMBTARGETLENGTH + "]";
	public static final String ATTRIBUTE_FST_SMBPORWIDTH        = "fstSMBPORWidth";
    public static final String SELECT_ATTRIBUTE_FST_SMBPORWIDTH = "attribute[" + ATTRIBUTE_FST_SMBPORWIDTH + "]";
	public static final String ATTRIBUTE_FST_SMBPORLENGTH        = "fstSMBPORLength";
    public static final String SELECT_ATTRIBUTE_FST_SMBPORLENGTH = "attribute[" + ATTRIBUTE_FST_SMBPORLENGTH + "]";
	public static final String ATTRIBUTE_FST_SMBPORQUANTITY        = "fstSMBPORQuantity";
    public static final String SELECT_ATTRIBUTE_FST_SMBPORQUANTITY = "attribute[" + ATTRIBUTE_FST_SMBPORQUANTITY + "]";
	public static final String ATTRIBUTE_FST_SMBPORWEIGHT        = "fstSMBPORWeight";
    public static final String SELECT_ATTRIBUTE_FST_SMBPORWEIGHT = "attribute[" + ATTRIBUTE_FST_SMBPORWEIGHT + "]";
	public static final String ATTRIBUTE_FST_SMBPARTNAME        = "fstSMBPartName";
	public static final String ATTRIBUTE_FST_STEELMATERIALDIVISION        = "fstSteelMaterialDivision";
    public static final String SELECT_ATTRIBUTE_FST_STEELMATERIALDIVISION = "attribute[" + ATTRIBUTE_FST_STEELMATERIALDIVISION + "]";
	public static final String ATTRIBUTE_FST_SMBMATERIALMANAGERCODE  = "fstSMBMaterialManagerCode";
    public static final String SELECT_ATTRIBUTE_FST_SMBMATERIALMANAGERCODE = "attribute[" + ATTRIBUTE_FST_SMBMATERIALMANAGERCODE + "]";
	public static final String ATTRIBUTE_FST_SMBCPMANAGERCODE        = "fstSMBCPManagerCode";
    public static final String SELECT_ATTRIBUTE_FST_SMBCPMANAGERCODE= "attribute[" + ATTRIBUTE_FST_SMBCPMANAGERCODE + "]";
	public static final String ATTRIBUTE_FST_SMBNESTINGMANAGERCODE   = "fstSMBNestingManagerCode";
    public static final String SELECT_ATTRIBUTE_FST_SMBNESTINGMANAGERCODE = "attribute[" + ATTRIBUTE_FST_SMBNESTINGMANAGERCODE + "]";
	public static final String ATTRIBUTE_FST_MCCSCODEDESCRIPTION        = "fstMCCSCodeDescription";
    public static final String SELECT_ATTRIBUTE_FST_MCCSCODEDESCRIPTION = "attribute[" + ATTRIBUTE_FST_MCCSCODEDESCRIPTION + "]";
	public static final String ATTRIBUTE_FST_MCCSCODEDESCEXIST        = "fstMCCSCodeDescExist";
    public static final String SELECT_ATTRIBUTE_FST_MCCSCODEDESCEXIST = "attribute[" + ATTRIBUTE_FST_MCCSCODEDESCEXIST + "]";
	public static final String ATTRIBUTE_FST_ITEMID        = "fstItemID";
    public static final String SELECT_ATTRIBUTE_FST_ITEMID = "attribute[" + ATTRIBUTE_FST_ITEMID + "]";
	public static final String ATTRIBUTE_FST_SMBNESTINGMETHODDIVISION        = "fstSMBNestingMethodDivision";
    public static final String SELECT_ATTRIBUTE_FST_SMBNESTINGMETHODDIVISION = "attribute[" + ATTRIBUTE_FST_SMBNESTINGMETHODDIVISION + "]";
	public static final String ATTRIBUTE_FST_SMBMILLDIVISION        = "fstSMBMillDivision";
    public static final String SELECT_ATTRIBUTE_FST_SMBMILLDIVISION = "attribute[" + ATTRIBUTE_FST_SMBMILLDIVISION + "]";
	public static final String ATTRIBUTE_FST_SMBMILLPARTFAMILY        = "fstSMBMillPartFamily";
    public static final String SELECT_ATTRIBUTE_FST_SMBMILLPARTFAMILY = "attribute[" + ATTRIBUTE_FST_SMBMILLPARTFAMILY + "]";
	public static final String ATTRIBUTE_FST_SMBMANUFACTURECUTOFFDIVISION        = "fstSMBManufactureCutoffDivision";
    public static final String SELECT_ATTRIBUTE_FST_SMBMANUFACTURECUTOFFDIVISION = "attribute[" + ATTRIBUTE_FST_SMBMANUFACTURECUTOFFDIVISION + "]";
	public static final String ATTRIBUTE_FST_SMBTRANSPORTATIONCONDITION        = "fstSMBTransportationCondition";
    public static final String SELECT_ATTRIBUTE_FST_SMBTRANSPORTATIONCONDITION = "attribute[" + ATTRIBUTE_FST_SMBTRANSPORTATIONCONDITION + "]";
	public static final String ATTRIBUTE_FST_SMBUNLOADINGCONDITIONS        = "fstSMBUnloadingConditions";
    public static final String SELECT_ATTRIBUTE_FST_SMBUNLOADINGCONDITIONS = "attribute[" + ATTRIBUTE_FST_SMBUNLOADINGCONDITIONS + "]";
	public static final String ATTRIBUTE_FST_SMBNESTINGRECEPTIONIST        = "fstSMBNestingReceptionist";
	public static final String ATTRIBUTE_FST_SMBPARTFAMILYCODE        = "fstSMBPartFamilyCode";
    public static final String SELECT_ATTRIBUTE_FST_SMBPARTFAMILYCODE = "attribute[" + ATTRIBUTE_FST_SMBPARTFAMILYCODE + "]";
	public static final String ATTRIBUTE_FST_SMBSAWIDTH        = "fstSMBSAWidth";
    public static final String SELECT_ATTRIBUTE_FST_SMBSAWIDTH = "attribute[" + ATTRIBUTE_FST_SMBSAWIDTH + "]";
	public static final String ATTRIBUTE_FST_SMBSALENGTH        		= "fstSMBSALength";
    public static final String SELECT_ATTRIBUTE_FST_SMBSALENGTH 		= "attribute[" + ATTRIBUTE_FST_SMBSALENGTH + "]";
	public static final String ATTRIBUTE_FST_SMBSAQUANTITY        		= "fstSMBSAQuantity";
    public static final String SELECT_ATTRIBUTE_FST_SMBSAQUANTITY 		= "attribute[" + ATTRIBUTE_FST_SMBSAQUANTITY + "]";
	public static final String ATTRIBUTE_FST_SMBSAWEIGHT        		= "fstSMBSAWeight";
    public static final String SELECT_ATTRIBUTE_FST_SMBSAWEIGHT 		= "attribute[" + ATTRIBUTE_FST_SMBSAWEIGHT + "]";
	public static final String ATTRIBUTE_FST_SMBINDIVIDUALDRAWINGPAGENO     = "fstSMBIndividualDrawingPageNo";
    public static final String SELECT_ATTRIBUTE_FST_SMBINDIVIDUALDRAWINGPAGENO= "attribute[" + ATTRIBUTE_FST_SMBINDIVIDUALDRAWINGPAGENO  + "]";
	public static final String ATTRIBUTE_FST_SMBBASICSDRAWINGPAGENO         = "fstSMBBasicsDrawingPageNo";
    public static final String SELECT_ATTRIBUTE_FST_SMBBASICSDRAWINGPAGENO  = "attribute[" + ATTRIBUTE_FST_SMBBASICSDRAWINGPAGENO + "]";
	public static final String ATTRIBUTE_FST_SMBNCNUMBER                    = "fstSMBNCNumber";
    public static final String SELECT_ATTRIBUTE_FST_SMBNCNUMBER             = "attribute[" + ATTRIBUTE_FST_SMBNCNUMBER + "]";
	public static final String ATTRIBUTE_FST_SMBSTARBOARDQTY                = "fstSMBStarboardQty";
    public static final String SELECT_ATTRIBUTE_FST_SMBSTARBOARDQTY         = "attribute[" + ATTRIBUTE_FST_SMBSTARBOARDQTY + "]";
	public static final String ATTRIBUTE_FST_ALLOCATIONPLANQTY              = "fstAllocationPlanQty";
    public static final String SELECT_ATTRIBUTE_FST_ALLOCATIONPLANQTY       = "attribute[" + ATTRIBUTE_FST_ALLOCATIONPLANQTY + "]";
	public static final String ATTRIBUTE_FST_ACTUALUSEDQTY                  = "fstActualUsedQty";
    public static final String SELECT_ATTRIBUTE_FST_ACTUALUSEDQTY           = "attribute[" + ATTRIBUTE_FST_ACTUALUSEDQTY + "]";
	public static final String ATTRIBUTE_FST_PROJECTNAME        		= "fstProjectName";
	public static final String ATTRIBUTE_FST_PREWORKPORNO        		= "fstPreWorkPORNo";
    public static final String SELECT_ATTRIBUTE_FST_PREWORKPORNO 		= "attribute[" + ATTRIBUTE_FST_PREWORKPORNO + "]";
	public static final String ATTRIBUTE_FST_SMBNESTINGNO        		= "fstSMBNestingNo";
    public static final String SELECT_ATTRIBUTE_FST_SMBNESTINGNO 		= "attribute[" + ATTRIBUTE_FST_SMBNESTINGNO + "]";
	public static final String ATTRIBUTE_FST_SMBCPREASON                    = "fstSMBCPReason";
    public static final String SELECT_ATTRIBUTE_FST_SMBCPREASON             = "attribute[" + ATTRIBUTE_FST_SMBCPREASON + "]";
	public static final String ATTRIBUTE_FST_SMBORIGINATORDEPARTMENT        = "fstSMBOriginatorDepartment";
    public static final String SELECT_ATTRIBUTE_FST_SMBORIGINATORDEPARTMENT = "attribute[" + ATTRIBUTE_FST_SMBORIGINATORDEPARTMENT + "]";
	public static final String ATTRIBUTE_FST_SMBPARTNO                      = "fstSMBPartNo";
    public static final String SELECT_ATTRIBUTE_FST_SMBPARTNO               = "attribute[" + ATTRIBUTE_FST_SMBPARTNO + "]";
	public static final String ATTRIBUTE_FST_SMBCPNESTINGNO                 = "fstSMBCPNestingNo";
    public static final String SELECT_ATTRIBUTE_FST_SMBCPNESTINGNO          = "attribute[" + ATTRIBUTE_FST_SMBCPNESTINGNO + "]";
	public static final String ATTRIBUTE_FST_SMBMINWIDTH                 	= "fstSMBMinWidth";
    public static final String SELECT_ATTRIBUTE_FST_SMBMINWIDTH         	= "attribute[" + ATTRIBUTE_FST_SMBMINWIDTH + "]";
	public static final String ATTRIBUTE_FST_SMBPORPARTNO                     = "fstSMBPORPartNo";
	public static final String ATTRIBUTE_FST_SMBUSEDPLACE                     = "fstSMBUsedPlace";
	public static final String ATTRIBUTE_FST_SMBUSEDDATE                      = "fstSMBUsedDate";
	public static final String ATTRIBUTE_FST_SMBMARKNO                        = "fstSMBMarkNo";
	public static final String ATTRIBUTE_FST_CODENAME                         = "fstCodeName";
	public static final String SELECT_ATTRIBUTE_FST_CODENAME                  = "attribute[" + ATTRIBUTE_FST_CODENAME + "]";
	public static final String ATTRIBUTE_FST_SMBREMNANTSOCCRPLACE             = "fstSMBRemnantsOccrPlace";
    public static final String SELECT_ATTRIBUTE_FST_SMBREMNANTSOCCRPLACE      = "attribute[" + ATTRIBUTE_FST_SMBREMNANTSOCCRPLACE + "]";
	public static final String ATTRIBUTE_FST_SMBNESTINGREQUESTCONTENT         = "fstSMBNestingRequestContent";
    public static final String SELECT_ATTRIBUTE_FST_SMBNESTINGREQUESTCONTENT  = "attribute[" + ATTRIBUTE_FST_SMBNESTINGREQUESTCONTENT + "]";
	public static final String ATTRIBUTE_FST_SMBMAXWIDTH        			  = "fstSMBMaxWidth";
    public static final String SELECT_ATTRIBUTE_FST_SMBMAXWIDTH 			  = "attribute[" + ATTRIBUTE_FST_SMBMAXWIDTH + "]";
	public static final String ATTRIBUTE_FST_SMBMAXLENGTH         			  = "fstSMBMaxLength";
    public static final String SELECT_ATTRIBUTE_FST_SMBMAXLENGTH  			  = "attribute[" + ATTRIBUTE_FST_SMBMAXLENGTH + "]";
	public static final String ATTRIBUTE_FST_SMBMAXWEIGHT        			  = "fstSMBMaxWeight";
    public static final String SELECT_ATTRIBUTE_FST_SMBMAXWEIGHT 			  = "attribute[" + ATTRIBUTE_FST_SMBMAXWEIGHT + "]";
	public static final String ATTRIBUTE_FST_SMBWORKDIVISION        		  = "fstSMBWorkDivision";
	public static final String ATTRIBUTE_FST_SMBCARRYREMNANTDIVISION          = "fstSMBCarryRemnantDivision";
    public static final String SELECT_ATTRIBUTE_FST_SMBCARRYREMNANTDIVISION   = "attribute[" + ATTRIBUTE_FST_SMBCARRYREMNANTDIVISION + "]";
	public static final String ATTRIBUTE_FST_AVAILABLEQTY          		= "fstAvailableQty";
    public static final String SELECT_ATTRIBUTE_FST_AVAILABLEQTY   		= "attribute[" + ATTRIBUTE_FST_AVAILABLEQTY + "]";
	public static final String ATTRIBUTE_FST_COMEINSTOCKQTY          		= "fstComeInStockQty";
    public static final String SELECT_ATTRIBUTE_FST_COMEINSTOCKQTY   		= "attribute[" + ATTRIBUTE_FST_COMEINSTOCKQTY + "]";
	public static final String ATTRIBUTE_FST_INVENTORYQTY          		= "fstInventoryQty";
    public static final String SELECT_ATTRIBUTE_FST_INVENTORYQTY   		= "attribute[" + ATTRIBUTE_FST_INVENTORYQTY + "]";
	public static final String ATTRIBUTE_FST_PROCESSINGDATE             = "fstProcessingDate";
	public static final String SELECT_ATTRIBUTE_FST_PROCESSINGDATE      = "attribute[" + ATTRIBUTE_FST_PROCESSINGDATE + "]";
	public static final String ATTRIBUTE_FST_PROCESSINGCOMPANY          = "fstProcessingCompany";
	public static final String SELECT_ATTRIBUTE_FST_PROCESSINGCOMPANY   = "attribute[" + ATTRIBUTE_FST_PROCESSINGCOMPANY + "]";
	public static final String ATTRIBUTE_FST_CARRYINGDATE               = "fstCarryingDate";
	public static final String SELECT_ATTRIBUTE_FST_CARRYINGDATE        = "attribute[" + ATTRIBUTE_FST_CARRYINGDATE + "]";
	public static final String ATTRIBUTE_FST_RECEIPTDATE                = "fstReceiptDate";
	public static final String SELECT_ATTRIBUTE_FST_RECEIPTDATE         = "attribute[" + ATTRIBUTE_FST_RECEIPTDATE + "]";
	public static final String ATTRIBUTE_FST_WAREHOUSINGPLACE           = "fstWarehousingPlace";
	public static final String SELECT_ATTRIBUTE_FST_WAREHOUSINGPLACE    = "attribute[" + ATTRIBUTE_FST_WAREHOUSINGPLACE + "]";
	public static final String ATTRIBUTE_FST_DELIVERYPLANDATE           = "fstDeliveryPlanDate";
	public static final String SELECT_ATTRIBUTE_FST_DELIVERYPLANDATE    = "attribute[" + ATTRIBUTE_FST_DELIVERYPLANDATE + "]";
	public static final String ATTRIBUTE_FST_CARRYINGPLACE              = "fstCarryingPlace";
	public static final String SELECT_ATTRIBUTE_FST_CARRYINGPLACE       = "attribute[" + ATTRIBUTE_FST_CARRYINGPLACE + "]";
	public static final String ATTRIBUTE_FST_WORKRECEIPTDATE            = "fstWorkReceiptDate";
	public static final String SELECT_ATTRIBUTE_FST_WORKRECEIPTDATE     = "attribute[" + ATTRIBUTE_FST_WORKRECEIPTDATE + "]";
	public static final String ATTRIBUTE_FST_WAREHOUSINGCONFIRM         = "fstWarehousingConfirm";
	public static final String SELECT_ATTRIBUTE_FST_WAREHOUSINGCONFIRM  = "attribute[" + ATTRIBUTE_FST_WAREHOUSINGCONFIRM + "]";
	public static final String ATTRIBUTE_FST_SMBSCRAPWT                 = "fstSMBScrapWt";
	public static final String ATTRIBUTE_FST_SMBPROCQTY                 = "fstSMBProcQty";
	public static final String SELECT_ATTRIBUTE_FST_SMBPROCQTY          = "attribute[" + ATTRIBUTE_FST_SMBPROCQTY + "]";
	public static final String ATTRIBUTE_FST_SMBOCCURREMNANTSLENGTH     = "fstSMBOccurRemnantsLength";
	public static final String SELECT_ATTRIBUTE_FST_SMBOCCURREMNANTSLENGTH = "attribute[" + ATTRIBUTE_FST_SMBOCCURREMNANTSLENGTH + "]";
	public static final String ATTRIBUTE_FST_SMBMAINFILENAME            = "fstSMBMainFileName";
	public static final String SELECT_ATTRIBUTE_FST_SMBMAINFILENAME     = "attribute[" + ATTRIBUTE_FST_SMBMAINFILENAME + "]";
	public static final String ATTRIBUTE_FST_SMBREASONFORCHANGE         = "fstSMBReasonForChange";
	public static final String SELECT_ATTRIBUTE_FST_SMBREASONFORCHANGE  = "attribute[" + ATTRIBUTE_FST_SMBREASONFORCHANGE + "]";
	public static final String ATTRIBUTE_FST_SMBPUBLISHREASON         	= "fstSMBPublishReason";
	public static final String SELECT_ATTRIBUTE_FST_SMBPUBLISHREASON  	= "attribute[" + ATTRIBUTE_FST_SMBPUBLISHREASON + "]";
	public static final String ATTRIBUTE_FST_SMBPROJECTACCOUNTCODE     	= "fstSMBProjectAccountCode";
	public static final String SELECT_ATTRIBUTE_FST_SMBPROJECTACCOUNTCODE	= "attribute[" + ATTRIBUTE_FST_SMBPROJECTACCOUNTCODE + "]";
	public static final String ATTRIBUTE_FST_SMBPROCESSINGACCOUNTTYPE         = "fstSMBProcessingAccountType";
	public static final String SELECT_ATTRIBUTE_FST_SMBPROCESSINGACCOUNTTYPE  = "attribute[" + ATTRIBUTE_FST_SMBPROCESSINGACCOUNTTYPE + "]";
	public static final String ATTRIBUTE_FST_PORPORQTY                  	  = "fstPORPorQty";
	public static final String SELECT_ATTRIBUTE_FST_PORPORQTY	        	  = "attribute[" + ATTRIBUTE_FST_PORPORQTY + "]";
	public static final String ATTRIBUTE_FST_PORWIDTH       	              = "fstPORWidth";
	public static final String SELECT_ATTRIBUTE_FST_PORWIDTH	  	          = "attribute[" + ATTRIBUTE_FST_PORWIDTH + "]";
	public static final String ATTRIBUTE_FST_PORTHICK       	              = "fstPORThick";
	public static final String SELECT_ATTRIBUTE_FST_PORTHICK	  	          = "attribute[" + ATTRIBUTE_FST_PORTHICK + "]";
	public static final String ATTRIBUTE_FST_AVAILABLEQTYFORBLOCK       	  = "fstAvailableQtyForBlock";
	public static final String SELECT_ATTRIBUTE_FST_AVAILABLEQTYFORBLOCK 	  = "attribute[" + ATTRIBUTE_FST_AVAILABLEQTYFORBLOCK + "]";
	public static final String ATTRIBUTE_FST_ALLOCATIONPLANQTYFORBLOCK        = "fstAllocationPlanQtyForBlock";
	public static final String SELECT_ATTRIBUTE_FST_ALLOCATIONPLANQTYFORBLOCK = "attribute[" + ATTRIBUTE_FST_ALLOCATIONPLANQTYFORBLOCK + "]";
	public static final String ATTRIBUTE_FST_ACTUALUSEDQTYFORBLOCK        	  = "fstActualUsedQtyForBlock";
	public static final String SELECT_ATTRIBUTE_FST_ACTUALUSEDQTYFORBLOCK     = "attribute[" + ATTRIBUTE_FST_ACTUALUSEDQTYFORBLOCK + "]";
	public static final String ATTRIBUTE_FST_PORBLKNO                         = "fstPORBlkNo";
	public static final String ATTRIBUTE_FST_PORLOTNO                         = "fstPORLotNo";
	public static final String ATTRIBUTE_FST_PORLENGTH                        = "fstPORLength";
	public static final String SELECT_ATTRIBUTE_FST_PORLENGTH                 = "attribute[" + ATTRIBUTE_FST_PORLENGTH + "]";
	public static final String ATTRIBUTE_FST_PORMATNO                         = "fstPORMatNo";
	public static final String SELECT_ATTRIBUTE_FST_PORMATNO                  = "attribute[" + ATTRIBUTE_FST_PORMATNO + "]";
	public static final String ATTRIBUTE_FST_PORGUBUN 						  = "fstPORGubun";
    public static final String SELECT_ATTRIBUTE_FST_PORGUBUN 				  = "attribute[" + ATTRIBUTE_FST_PORGUBUN + "]";
	public static final String ATTRIBUTE_FST_SMBCHANGEREMNANTTYPE             = "fstSMBChangeRemnantType";
	public static final String ATTRIBUTE_FST_PORPORWGT                        = "fstPORPorWgt";
	public static final String SELECT_ATTRIBUTE_FST_PORPORWGT                 = "attribute[" + ATTRIBUTE_FST_PORPORWGT + "]";
	public static final String ATTRIBUTE_FST_PORUNITWGT                       = "fstPORUnitWgt";
	public static final String SELECT_ATTRIBUTE_FST_PORUNITWGT                = "attribute[" + ATTRIBUTE_FST_PORUNITWGT + "]";
	public static final String ATTRIBUTE_FST_PORISSUEPLANQTY                  = "fstPORIssuePlanQty";
	public static final String ATTRIBUTE_FST_PORISSUEPLANDATE                 = "fstPORIssuePlanDate";
	public static final String SELECT_ATTRIBUTE_FST_PORISSUEPLANDATE          = "attribute[" + ATTRIBUTE_FST_PORISSUEPLANDATE + "]";
	public static final String ATTRIBUTE_FST_PORISSUEACTQTY                   = "fstPORIssueActQty";
	public static final String SELECT_ATTRIBUTE_FST_PORISSUEACTQTY            = "attribute[" + ATTRIBUTE_FST_PORISSUEACTQTY + "]";
	public static final String ATTRIBUTE_FST_SMBSTANDARDLOTEQUIPMENT          = "fstSMBStandardLotEquipment";
	public static final String SELECT_ATTRIBUTE_FST_SMBSTANDARDLOTEQUIPMENT   = "attribute[" + ATTRIBUTE_FST_SMBSTANDARDLOTEQUIPMENT + "]";
	public static final String ATTRIBUTE_FST_PORRETPQTY         			  = "fstPORRetpQty";
	public static final String SELECT_ATTRIBUTE_FST_PORRETPQTY  			  = "attribute[" + ATTRIBUTE_FST_PORRETPQTY + "]";
	public static final String ATTRIBUTE_FST_SMBNESTINGTYPE       			  = "fstSMBNestingType";
	public static final String SELECT_ATTRIBUTE_FST_SMBNESTINGTYPE 			  = "attribute[" + ATTRIBUTE_FST_SMBNESTINGTYPE + "]";
	public static final String ATTRIBUTE_FST_PORPORIM       	    		  = "fstPORPorIm";
	public static final String SELECT_ATTRIBUTE_FST_PORPORIM    			  = "attribute[" + ATTRIBUTE_FST_PORPORIM + "]";
	public static final String ATTRIBUTE_FST_PORTELNO       	    		  = "fstPORTelNo";
	public static final String SELECT_ATTRIBUTE_FST_PORTELNO    			  = "attribute[" + ATTRIBUTE_FST_PORTELNO + "]";
	public static final String ATTRIBUTE_FST_PORSEQ       	        		  = "fstPORSeq";
	public static final String SELECT_ATTRIBUTE_FST_PORSEQ      			  = "attribute[" + ATTRIBUTE_FST_PORSEQ + "]";
	public static final String ATTRIBUTE_FST_PORMATDSC       	    		  = "fstPORMatDsc";
	public static final String SELECT_ATTRIBUTE_FST_PORMATDSC    			  = "attribute[" + ATTRIBUTE_FST_PORMATDSC + "]";
	public static final String ATTRIBUTE_FST_PORMUNIT       	    		  = "fstPORMUnit";
	public static final String SELECT_ATTRIBUTE_FST_PORMUNIT    			  = "attribute[" + ATTRIBUTE_FST_PORMUNIT + "]";
	public static final String ATTRIBUTE_FST_PORREQDATE       	    		  = "fstPORReqDate";
	public static final String SELECT_ATTRIBUTE_FST_PORREQDATE    			  = "attribute[" + ATTRIBUTE_FST_PORREQDATE + "]";
	public static final String ATTRIBUTE_FST_PORILPCOD       	    		  = "fstPORIlpCod";
	public static final String SELECT_ATTRIBUTE_FST_PORILPCOD    			  = "attribute[" + ATTRIBUTE_FST_PORILPCOD + "]";
	public static final String ATTRIBUTE_FST_PORPORMOD       	    		  = "fstPORPormod";
	public static final String SELECT_ATTRIBUTE_FST_PORPORMOD    			  = "attribute[" + ATTRIBUTE_FST_PORPORMOD + "]";
	public static final String ATTRIBUTE_FST_PORORGPORQTY         			  = "fstPOROrgPorQty";
	public static final String SELECT_ATTRIBUTE_FST_PORORGPORQTY  			  = "attribute[" + ATTRIBUTE_FST_PORORGPORQTY + "]";
	public static final String ATTRIBUTE_FST_PORORGPORWGT         			  = "fstPOROrgPorWgt";
	public static final String SELECT_ATTRIBUTE_FST_PORORGPORWGT  			  = "attribute[" + ATTRIBUTE_FST_PORORGPORWGT + "]";
	public static final String ATTRIBUTE_FST_PORDDEPT             			  = "fstPORDDept";
	public static final String SELECT_ATTRIBUTE_FST_PORDDEPT      			  = "attribute[" + ATTRIBUTE_FST_PORDDEPT + "]";
	public static final String ATTRIBUTE_FST_PORPRJTNO             			  = "fstPORPrjtNo";
	public static final String SELECT_ATTRIBUTE_FST_PORPRJTNO      			  = "attribute[" + ATTRIBUTE_FST_PORPRJTNO + "]";
	public static final String ATTRIBUTE_FST_CATEGORYOFCHANGE             	  = "fstCategoryofChange";
	public static final String SELECT_ATTRIBUTE_FST_CATEGORYOFCHANGE      	  = "attribute[" + ATTRIBUTE_FST_CATEGORYOFCHANGE + "]";
	public static final String ATTRIBUTE_FST_CHANGEDESCRIPTION       	      = "fstChangeDescription";
	public static final String SELECT_ATTRIBUTE_FST_CHANGEDESCRIPTION	      = "attribute[" + ATTRIBUTE_FST_CHANGEDESCRIPTION + "]";
	public static final String ATTRIBUTE_FST_PORDESIGNMEASURE       	      = "fstPORDesignMeasure";
	public static final String SELECT_ATTRIBUTE_FST_PORDESIGNMEASURE	      = "attribute[" + ATTRIBUTE_FST_PORDESIGNMEASURE + "]";
	public static final String ATTRIBUTE_FST_PORPURCHASEMEASURE       	      = "fstPORPurchaseMeasure";
	public static final String SELECT_ATTRIBUTE_FST_PORPURCHASEMEASURE	      = "attribute[" + ATTRIBUTE_FST_PORPURCHASEMEASURE + "]";
	public static final String ATTRIBUTE_FST_PORLOSSDESC       			      = "fstPORLossDesc";
	public static final String SELECT_ATTRIBUTE_FST_PORLOSSDESC			      = "attribute[" + ATTRIBUTE_FST_PORLOSSDESC + "]";
	public static final String ATTRIBUTE_FST_PORMATERIALMEASURE       	      = "fstPORMaterialMeasure";
	public static final String SELECT_ATTRIBUTE_FST_PORMATERIALMEASURE	      = "attribute[" + ATTRIBUTE_FST_PORMATERIALMEASURE + "]";
	public static final String ATTRIBUTE_FST_CONTRACTCOMPANY       			  = "fstContractCompany";
	public static final String SELECT_ATTRIBUTE_FST_CONTRACTCOMPANY			  = "attribute[" + ATTRIBUTE_FST_CONTRACTCOMPANY + "]";
	public static final String ATTRIBUTE_FST_CONTRACTNO       			      = "fstContractNo";
	public static final String SELECT_ATTRIBUTE_FST_CONTRACTNO			      = "attribute[" + ATTRIBUTE_FST_CONTRACTNO + "]";
	public static final String ATTRIBUTE_FST_PORPURCHASECONFIRM       	      = "fstPORPurchaseConfirm";
	public static final String SELECT_ATTRIBUTE_FST_PORPURCHASECONFIRM	      = "attribute[" + ATTRIBUTE_FST_PORPURCHASECONFIRM + "]";
	public static final String ATTRIBUTE_FST_REASONFORCHANGE       	          = "fstReasonforChange";
	public static final String SELECT_ATTRIBUTE_FST_REASONFORCHANGE  	      = "attribute[" + ATTRIBUTE_FST_REASONFORCHANGE + "]";
	public static final String ATTRIBUTE_FST_SMBBUILTUPGRIDERQTY				= "fstSMBBuiltUpGriderQty";
	public static final String SELECT_ATTRIBUTE_FST_SMBBUILTUPGRIDERQTY			= "attribute[" + ATTRIBUTE_FST_SMBBUILTUPGRIDERQTY + "]";
	public static final String ATTRIBUTE_FST_SMBBUILTUPGRIDERWEIGHT				= "fstSMBBuiltUpGriderWeight";
	public static final String SELECT_ATTRIBUTE_FST_SMBBUILTUPGRIDERWEIGHT		= "attribute[" + ATTRIBUTE_FST_SMBBUILTUPGRIDERWEIGHT + "]";
	public static final String ATTRIBUTE_FST_SMBBUILTUPNODEQTY					= "fstSMBBuiltUpNodeQty";
	public static final String SELECT_ATTRIBUTE_FST_SMBBUILTUPNODEQTY			= "attribute[" + ATTRIBUTE_FST_SMBBUILTUPNODEQTY + "]";
	public static final String ATTRIBUTE_FST_SMBBUILTUPNODEWEIGHT				= "fstSMBBuiltUpNodeWeight";
	public static final String SELECT_ATTRIBUTE_FST_SMBBUILTUPNODEWEIGHT		= "attribute[" + ATTRIBUTE_FST_SMBBUILTUPNODEWEIGHT + "]";
	public static final String ATTRIBUTE_FST_SMBLEGBRQTY						= "fstSMBLegBRQty";
	public static final String SELECT_ATTRIBUTE_FST_SMBLEGBRQTY					= "attribute[" + ATTRIBUTE_FST_SMBLEGBRQTY + "]";
	public static final String ATTRIBUTE_FST_SMBLEGBRWEIGHT						= "fstSMBLegBRWeight";
	public static final String SELECT_ATTRIBUTE_FST_SMBLEGBRWEIGHT				= "attribute[" + ATTRIBUTE_FST_SMBLEGBRWEIGHT + "]";
	public static final String ATTRIBUTE_FST_SMBDECKWALLQTY						= "fstSMBDeckWallQty";
	public static final String SELECT_ATTRIBUTE_FST_SMBDECKWALLQTY				= "attribute[" + ATTRIBUTE_FST_SMBDECKWALLQTY + "]";
	public static final String ATTRIBUTE_FST_SMBDECKWALLWEIGHT					= "fstSMBDeckWallWeight";
	public static final String SELECT_ATTRIBUTE_FST_SMBDECKWALLWEIGHT			= "attribute[" + ATTRIBUTE_FST_SMBDECKWALLWEIGHT + "]";
	public static final String ATTRIBUTE_FST_SMBGENERALQTY						= "fstSMBGeneralQty";
	public static final String SELECT_ATTRIBUTE_FST_SMBGENERALQTY				= "attribute[" + ATTRIBUTE_FST_SMBGENERALQTY + "]";
	public static final String ATTRIBUTE_FST_SMBGENERALWEIGHT					= "fstSMBGeneralWeight";
	public static final String SELECT_ATTRIBUTE_FST_SMBGENERALWEIGHT			= "attribute[" + ATTRIBUTE_FST_SMBGENERALWEIGHT + "]";
	public static final String ATTRIBUTE_FST_SMBSMALLQTY						= "fstSMBSmallQty";
	public static final String SELECT_ATTRIBUTE_FST_SMBSMALLQTY					= "attribute[" + ATTRIBUTE_FST_SMBSMALLQTY + "]";
	public static final String ATTRIBUTE_FST_SMBSMALLWEIGHT						= "fstSMBSmallWeight";
	public static final String SELECT_ATTRIBUTE_FST_SMBSMALLWEIGHT				= "attribute[" + ATTRIBUTE_FST_SMBSMALLWEIGHT + "]";
	public static final String ATTRIBUTE_FST_SMBACCOUNTTOTALQTY					= "fstSMBAccountTotalQty";
	public static final String SELECT_ATTRIBUTE_FST_SMBACCOUNTTOTALQTY			= "attribute[" + ATTRIBUTE_FST_SMBACCOUNTTOTALQTY + "]";
	public static final String ATTRIBUTE_FST_SMBACCOUNTTOTALWEIGHT				= "fstSMBAccountTotalWeight";
	public static final String SELECT_ATTRIBUTE_FST_SMBACCOUNTTOTALWEIGHT		= "attribute[" + ATTRIBUTE_FST_SMBACCOUNTTOTALWEIGHT + "]";
	public static final String ATTRIBUTE_FST_SMBINPUTPROCRAWPARTQTY				= "fstSMBInputProcRawPartQty";
	public static final String SELECT_ATTRIBUTE_FST_SMBINPUTPROCRAWPARTQTY		= "attribute[" + ATTRIBUTE_FST_SMBINPUTPROCRAWPARTQTY + "]";
	public static final String ATTRIBUTE_FST_SMBINPUTPROCRAWPARTWEIGHT			= "fstSMBInputProcRawPartWeight";
	public static final String SELECT_ATTRIBUTE_FST_SMBINPUTPROCRAWPARTWEIGHT	= "attribute[" + ATTRIBUTE_FST_SMBINPUTPROCRAWPARTWEIGHT + "]";
	public static final String ATTRIBUTE_FST_SMBINPUTREMNANTPARTQTY				= "fstSMBInputRemnantPartQty";
	public static final String SELECT_ATTRIBUTE_FST_SMBINPUTREMNANTPARTQTY		= "attribute[" + ATTRIBUTE_FST_SMBINPUTREMNANTPARTQTY + "]";
	public static final String ATTRIBUTE_FST_SMBINPUTREMNANTPARTWEIGHT			= "fstSMBInputRemnantPartWeight";
	public static final String SELECT_ATTRIBUTE_FST_SMBINPUTREMNANTPARTWEIGHT	= "attribute[" + ATTRIBUTE_FST_SMBINPUTREMNANTPARTWEIGHT + "]";
	public static final String ATTRIBUTE_FST_SMBINPUTETCREMNANTPARTQTY			= "fstSMBInputEtcRemnantPartQty";
	public static final String SELECT_ATTRIBUTE_FST_SMBINPUTETCREMNANTPARTQTY	= "attribute[" + ATTRIBUTE_FST_SMBINPUTETCREMNANTPARTQTY + "]";
	public static final String ATTRIBUTE_FST_SMBINPUTETCREMNANTPARTWEIGHT		= "fstSMBInputEtcRemnantPartWeight";
	public static final String SELECT_ATTRIBUTE_FST_SMBINPUTETCREMNANTPARTWEIGHT= "attribute[" + ATTRIBUTE_FST_SMBINPUTETCREMNANTPARTWEIGHT + "]";
	public static final String ATTRIBUTE_FST_SMBMBOMPARTQTY						= "fstSMBMBOMPartQty";
	public static final String SELECT_ATTRIBUTE_FST_SMBMBOMPARTQTY				= "attribute[" + ATTRIBUTE_FST_SMBMBOMPARTQTY + "]";
	public static final String ATTRIBUTE_FST_SMBMBOMPARTWEIGHT					= "fstSMBMBOMPartWeight";
	public static final String SELECT_ATTRIBUTE_FST_SMBMBOMPARTWEIGHT			= "attribute[" + ATTRIBUTE_FST_SMBMBOMPARTWEIGHT + "]";
	public static final String ATTRIBUTE_FST_SMBSCRAPPARTWEIGHT					= "fstSMBScrapPartWeight";
	public static final String SELECT_ATTRIBUTE_FST_SMBSCRAPPARTWEIGHT			= "attribute[" + ATTRIBUTE_FST_SMBSCRAPPARTWEIGHT + "]";
	public static final String ATTRIBUTE_FST_SMBSMALLSIZEMBOMPARTQTY			= "fstSMBSmallSizeMBOMPartQty";
	public static final String SELECT_ATTRIBUTE_FST_SMBSMALLSIZEMBOMPARTQTY		= "attribute[" + ATTRIBUTE_FST_SMBSMALLSIZEMBOMPARTQTY + "]";
	public static final String ATTRIBUTE_FST_SMBSMALLSIZEMBOMPARTWEIGHT			= "fstSMBSmallSizeMBOMPartWeight";
	public static final String SELECT_ATTRIBUTE_FST_SMBSMALLSIZEMBOMPARTWEIGHT	= "attribute[" + ATTRIBUTE_FST_SMBSMALLSIZEMBOMPARTWEIGHT + "]";
	public static final String ATTRIBUTE_FST_SMBBIGSIZEMBOMPARTQTY				= "fstSMBBigSizeMBOMPartQty";
	public static final String SELECT_ATTRIBUTE_FST_SMBBIGSIZEMBOMPARTQTY		= "attribute[" + ATTRIBUTE_FST_SMBBIGSIZEMBOMPARTQTY + "]";
	public static final String ATTRIBUTE_FST_SMBBIGSIZEMBOMPARTWEIGHT			= "fstSMBBigSizeMBOMPartWeight";
	public static final String SELECT_ATTRIBUTE_FST_SMBBIGSIZEMBOMPARTWEIGHT	= "attribute[" + ATTRIBUTE_FST_SMBBIGSIZEMBOMPARTWEIGHT + "]";
	public static final String ATTRIBUTE_FST_SMBPROCESSINGACCOUNTSTATE   		= "fstSMBProcessingAccountState";
	public static final String SELECT_ATTRIBUTE_FST_SMBPROCESSINGACCOUNTSTATE	= "attribute[" + ATTRIBUTE_FST_SMBPROCESSINGACCOUNTSTATE + "]";
	public static final String ATTRIBUTE_FST_SMBPROCREMAINQTY   				= "fstSMBProcRemainQty";
	public static final String SELECT_ATTRIBUTE_FST_SMBPROCREMAINQTY			= "attribute[" + ATTRIBUTE_FST_SMBPROCREMAINQTY + "]";
	public static final String ATTRIBUTE_FST_PERSONALOBJATTR1   				= "fstPersonalObjAttr1";
	public static final String SELECT_ATTRIBUTE_FST_PERSONALOBJATTR1			= "attribute[" + ATTRIBUTE_FST_PERSONALOBJATTR1 + "]";
	public static final String ATTRIBUTE_FST_PERSONALOBJATTR2   				= "fstPersonalObjAttr2";
	public static final String SELECT_ATTRIBUTE_FST_PERSONALOBJATTR2			= "attribute[" + ATTRIBUTE_FST_PERSONALOBJATTR2 + "]";
	public static final String ATTRIBUTE_FST_SOURCEPARTINFO   					= "fstSourcePartInfo";
	public static final String SELECT_ATTRIBUTE_FST_SOURCEPARTINFO				= "attribute[" + ATTRIBUTE_FST_SOURCEPARTINFO + "]";
	public static final String ATTRIBUTE_FST_SOURCEPARTINFO2   					= "fstSourcePartInfo2";
	public static final String SELECT_ATTRIBUTE_FST_SOURCEPARTINFO2				= "attribute[" + ATTRIBUTE_FST_SOURCEPARTINFO2 + "]";
	public static final String ATTRIBUTE_FST_SMBPROCESSPORNO 					= "fstSMBProcessPORNo";
	public static final String SELECT_ATTRIBUTE_FST_SMBPROCESSPORNO 			= "attribute[" + ATTRIBUTE_FST_SMBPROCESSPORNO + "]";
	public static final String ATTRIBUTE_FST_SMBCONTRACTCOMPANY 				= "fstSMBContractCompany";
	public static final String SELECT_ATTRIBUTE_FST_SMBCONTRACTCOMPANY			= "attribute[" + ATTRIBUTE_FST_SMBCONTRACTCOMPANY + "]";
	public static final String ATTRIBUTE_FST_SMBCONTRACTCOMPANYTELNO 			= "fstSMBContractCompanyTelNo";
	public static final String SELECT_ATTRIBUTE_FST_SMBCONTRACTCOMPANYTELNO 	= "attribute[" + ATTRIBUTE_FST_SMBCONTRACTCOMPANYTELNO + "]";
	public static final String ATTRIBUTE_FST_SMBTELNO 							= "fstSMBTelNo";
	public static final String SELECT_ATTRIBUTE_FST_SMBTELNO 					= "attribute[" + ATTRIBUTE_FST_SMBTELNO + "]";
	public static final String ATTRIBUTE_FST_SMBISSUEIM 						= "fstSMBIssueIm";
	public static final String SELECT_ATTRIBUTE_FST_SMBISSUEIM 					= "attribute[" + ATTRIBUTE_FST_SMBISSUEIM + "]";
	public static final String ATTRIBUTE_FST_SMBISSUEVND 						= "fstSMBIssueVnd";
	public static final String SELECT_ATTRIBUTE_FST_SMBISSUEVND 				= "attribute[" + ATTRIBUTE_FST_SMBISSUEVND + "]";
	public static final String ATTRIBUTE_FST_SMBREQDEPT 						= "fstSMBReqDept";
	public static final String SELECT_ATTRIBUTE_FST_SMBREQDEPT 					= "attribute[" + ATTRIBUTE_FST_SMBREQDEPT + "]";
	public static final String ATTRIBUTE_FST_SMBREQPERSON 						= "fstSMBReqPerson";
	public static final String SELECT_ATTRIBUTE_FST_SMBREQPERSON				= "attribute[" + ATTRIBUTE_FST_SMBREQPERSON + "]";
	public static final String ATTRIBUTE_FST_SMBISSUEREQDATE 					= "fstSMBIssueReqDate";
	public static final String SELECT_ATTRIBUTE_FST_SMBISSUEREQDATE 			= "attribute[" + ATTRIBUTE_FST_SMBISSUEREQDATE + "]";
	public static final String ATTRIBUTE_FST_SMBREQDATE 						= "fstSMBReqDate";
	public static final String SELECT_ATTRIBUTE_FST_SMBREQDATE 					= "attribute[" + ATTRIBUTE_FST_SMBREQDATE + "]";
	public static final String ATTRIBUTE_FST_PORNOTE 							= "fstPORNote";
	public static final String SELECT_ATTRIBUTE_FST_PORNOTE 					= "attribute[" + ATTRIBUTE_FST_PORNOTE + "]";
	public static final String ATTRIBUTE_FST_SMBCOMMENTS 						= "fstSMBComments";
	public static final String SELECT_ATTRIBUTE_FST_SMBCOMMENTS 				= "attribute[" + ATTRIBUTE_FST_SMBCOMMENTS + "]";
	public static final String ATTRIBUTE_FST_PORSER     						= "fstPORSer";
	public static final String SELECT_ATTRIBUTE_FST_PORSER                      = "attribute[" + ATTRIBUTE_FST_PORSER + "]";
	public static final String ATTRIBUTE_FST_PORSPECNO     						= "fstPORSpecNo";
	public static final String SELECT_ATTRIBUTE_FST_PORSPECNO                   = "attribute[" + ATTRIBUTE_FST_PORSPECNO + "]";
	public static final String ATTRIBUTE_FST_PORPROCCD     						= "fstPORProcCd";
	public static final String SELECT_ATTRIBUTE_FST_PORPROCCD                   = "attribute[" + ATTRIBUTE_FST_PORPROCCD + "]";
	public static final String ATTRIBUTE_FST_PORAPPEND     						= "fstPORAppend";
	public static final String SELECT_ATTRIBUTE_FST_PORAPPEND                   = "attribute[" + ATTRIBUTE_FST_PORAPPEND + "]";
	public static final String ATTRIBUTE_FST_PORSTGCOD     						= "fstPORStgCod";
	public static final String SELECT_ATTRIBUTE_FST_PORSTGCOD                   = "attribute[" + ATTRIBUTE_FST_PORSTGCOD + "]";
	public static final String ATTRIBUTE_FST_PORBGTAMTW     					= "fstPORBgtAmtw";
	public static final String SELECT_ATTRIBUTE_FST_PORBGTAMTW                  = "attribute[" + ATTRIBUTE_FST_PORBGTAMTW + "]";
	public static final String ATTRIBUTE_FST_PORTEAMCOD     					= "fstPORTeamCod";
	public static final String SELECT_ATTRIBUTE_FST_PORTEAMCOD                  = "attribute[" + ATTRIBUTE_FST_PORTEAMCOD + "]";
	public static final String ATTRIBUTE_FST_PORSHRTCOD     					= "fstPORShrtCod";
	public static final String SELECT_ATTRIBUTE_FST_PORSHRTCOD                  = "attribute[" + ATTRIBUTE_FST_PORSHRTCOD + "]";
	public static final String ATTRIBUTE_FST_PORPORBWBS     					= "fstPORPorBwbs";
	public static final String SELECT_ATTRIBUTE_FST_PORPORBWBS                  = "attribute[" + ATTRIBUTE_FST_PORPORBWBS + "]";
	public static final String ATTRIBUTE_FST_PORMPITMCOD     					= "fstPORMpitmCod";
	public static final String SELECT_ATTRIBUTE_FST_PORMPITMCOD                 = "attribute[" + ATTRIBUTE_FST_PORMPITMCOD + "]";
	public static final String ATTRIBUTE_FST_PORRESUPPLYNO     					= "fstPORReSupplyNo";
	public static final String SELECT_ATTRIBUTE_FST_PORRESUPPLYNO               = "attribute[" + ATTRIBUTE_FST_PORRESUPPLYNO + "]";
	public static final String ATTRIBUTE_FST_PORDOJANGCD       					= "fstPORDojangCd";
	public static final String SELECT_ATTRIBUTE_FST_PORDOJANGCD                 = "attribute[" + ATTRIBUTE_FST_PORDOJANGCD + "]";
	public static final String ATTRIBUTE_FST_PORCHULSTGCOD     					= "fstPORChulStgCod";
	public static final String SELECT_ATTRIBUTE_FST_PORCHULSTGCOD               = "attribute[" + ATTRIBUTE_FST_PORCHULSTGCOD + "]";
	public static final String ATTRIBUTE_FST_PORQCCOD       					= "fstPORQcCod";
	public static final String SELECT_ATTRIBUTE_FST_PORQCCOD                    = "attribute[" + ATTRIBUTE_FST_PORQCCOD + "]";
	public static final String ATTRIBUTE_FST_MODIFIER       					= "fstModifier";
	public static final String SELECT_ATTRIBUTE_FST_MODIFIER                    = "attribute[" + ATTRIBUTE_FST_MODIFIER + "]";
	public static final String ATTRIBUTE_FST_SMBEDGE       					    = "fstSMBEdge";
	public static final String SELECT_ATTRIBUTE_FST_SMBEDGE                     = "attribute[" + ATTRIBUTE_FST_SMBEDGE + "]";
	public static final String ATTRIBUTE_FST_PROCESSINGPORNO				    = "fstProcessingPORNo";
	public static final String SELECT_ATTRIBUTE_FST_PROCESSINGPORNO             = "attribute[" + ATTRIBUTE_FST_PROCESSINGPORNO + "]";
	public static final String ATTRIBUTE_FST_POROSMACSINTERFACEDFLAG    	    = "fstPOROSMACSInterfacedFlag";
	public static final String SELECT_ATTRIBUTE_FST_POROSMACSINTERFACEDFLAG     = "attribute[" + ATTRIBUTE_FST_POROSMACSINTERFACEDFLAG + "]";
	public static final String ATTRIBUTE_FST_PORREVCOD                  	    = "fstPORREVCOD";
	public static final String SELECT_ATTRIBUTE_FST_PORREVCOD                   = "attribute[" + ATTRIBUTE_FST_PORREVCOD + "]";
	public static final String ATTRIBUTE_FST_PORRECQTY                  	    = "fstPORRecQty";
	public static final String SELECT_ATTRIBUTE_FST_PORRECQTY                   = "attribute[" + ATTRIBUTE_FST_PORRECQTY + "]";
	public static final String ATTRIBUTE_FST_REQUESTDATE         	            = "fstRequestDate";
	public static final String SELECT_ATTRIBUTE_FST_REQUESTDATE                 = "attribute[" + ATTRIBUTE_FST_REQUESTDATE + "]";
	public static final String ATTRIBUTE_FST_RECEIVER            	            = "fstReceiver";
	public static final String SELECT_ATTRIBUTE_FST_RECEIVER                    = "attribute[" + ATTRIBUTE_FST_RECEIVER + "]";
	public static final String ATTRIBUTE_FST_RECEIVEDATE         	            = "fstReceiveDate";
	public static final String SELECT_ATTRIBUTE_FST_RECEIVEDATE                 = "attribute[" + ATTRIBUTE_FST_RECEIVEDATE + "]";
	public static final String ATTRIBUTE_FST_PREPORNO         	                = "fstPrePORNo";
	public static final String SELECT_ATTRIBUTE_FST_PREPORNO                    = "attribute[" + ATTRIBUTE_FST_PREPORNO + "]";
	public static final String ATTRIBUTE_FST_PORKAREA         	                = "fstPORKArea";
	public static final String SELECT_ATTRIBUTE_FST_PORKAREA                    = "attribute[" + ATTRIBUTE_FST_PORKAREA + "]";
	public static final String ATTRIBUTE_FST_SMBPREADDDIVISION         	        = "fstSMBPreAddDivision";
	public static final String SELECT_ATTRIBUTE_FST_SMBPREADDDIVISION           = "attribute[" + ATTRIBUTE_FST_SMBPREADDDIVISION + "]";
	public static final String ATTRIBUTE_FST_SMBMILLCHECKDIVISION               = "fstSMBMillCheckDivision";
	public static final String SELECT_ATTRIBUTE_FST_SMBMILLCHECKDIVISION        = "attribute[" + ATTRIBUTE_FST_SMBMILLCHECKDIVISION + "]";
	public static final String ATTRIBUTE_FST_MRFILENO 							= "fstMRFileNo";
	public static final String SELECT_ATTRIBUTE_FST_MRFILENO 					= "attribute[" + ATTRIBUTE_FST_MRFILENO + "]";
	public static final String ATTRIBUTE_FST_PORPDEPT 							= "fstPORPDept";
	public static final String SELECT_ATTRIBUTE_FST_PORPDEPT 					= "attribute[" + ATTRIBUTE_FST_PORPDEPT + "]";
	public static final String ATTRIBUTE_FST_MRIM 								= "fstMRIm";
	public static final String SELECT_ATTRIBUTE_FST_MRIM 						= "attribute[" + ATTRIBUTE_FST_MRIM + "]";
	public static final String ATTRIBUTE_FST_MRINSCODE 							= "fstMRInscode";
	public static final String SELECT_ATTRIBUTE_FST_MRINSCODE 					= "attribute[" + ATTRIBUTE_FST_MRINSCODE + "]";
	public static final String ATTRIBUTE_FST_MRTYPE 							= "fstMRType";
	public static final String SELECT_ATTRIBUTE_FST_MRTYPE 						= "attribute[" + ATTRIBUTE_FST_MRTYPE + "]";
	public static final String ATTRIBUTE_FST_MRLISTDATE 						= "fstMRListDate";
	public static final String SELECT_ATTRIBUTE_FST_MRLISTDATE 					= "attribute[" + ATTRIBUTE_FST_MRLISTDATE + "]";
	public static final String ATTRIBUTE_FST_MRPRJTSUB 							= "fstMRPrjtSub";
	public static final String SELECT_ATTRIBUTE_FST_MRPRJTSUB 					= "attribute[" + ATTRIBUTE_FST_MRPRJTSUB + "]";
	public static final String ATTRIBUTE_FST_MRUSEDATE 							= "fstMRUseDate";
	public static final String SELECT_ATTRIBUTE_FST_MRUSEDATE 					= "attribute[" + ATTRIBUTE_FST_MRUSEDATE + "]";
	public static final String ATTRIBUTE_FST_PREPROCESSCODE						= "fstPreProcessCode";
	public static final String SELECT_ATTRIBUTE_FST_PREPROCESSCODE				= "attribute[" + ATTRIBUTE_FST_PREPROCESSCODE	 + "]";
	public static final String ATTRIBUTE_FST_PORISSUEPLANWGT					= "fstPORIssuePlanwgt";
	public static final String ATTRIBUTE_FST_PORISOFE   						= "fstPORIsOFE";
	public static final String SELECT_ATTRIBUTE_FST_PORISOFE    				= "attribute[" + ATTRIBUTE_FST_PORISOFE	 + "]";
	public static final String ATTRIBUTE_FST_PORJUNGMSTAGE 						= "fstPORJUNGMSTAGE";
	public static final String SELECT_ATTRIBUTE_FST_PORJUNGMSTAGE  				= "attribute[" + ATTRIBUTE_FST_PORJUNGMSTAGE	 + "]";
	public static final String ATTRIBUTE_FST_PORJUNGDATE   						= "fstPORJUNGDATE";
	public static final String SELECT_ATTRIBUTE_FST_PORJUNGDATE    				= "attribute[" + ATTRIBUTE_FST_PORJUNGDATE	 + "]";
	public static final String ATTRIBUTE_FST_PORJUNGGONGJONG					= "fstPORJUNGGONGJONG";
	public static final String SELECT_ATTRIBUTE_FST_PORJUNGGONGJONG				= "attribute[" + ATTRIBUTE_FST_PORJUNGGONGJONG	 + "]";
	public static final String ATTRIBUTE_FST_PORGLOTNO      					= "fstPORGLOTNO";
	public static final String SELECT_ATTRIBUTE_FST_PORGLOTNO    				= "attribute[" + ATTRIBUTE_FST_PORGLOTNO	 + "]";
	public static final String ATTRIBUTE_FST_PORCHANGECODE   	        		= "fstPORChangeCode";
	public static final String SELECT_ATTRIBUTE_FST_PORCHANGECODE				= "attribute[" + ATTRIBUTE_FST_PORCHANGECODE	 + "]";
	public static final String ATTRIBUTE_FST_PORJREQNO       					= "fstPORJREQNo";
	public static final String SELECT_ATTRIBUTE_FST_PORJREQNO    				= "attribute[" + ATTRIBUTE_FST_PORJREQNO	 + "]";
	public static final String ATTRIBUTE_FST_PORGREQNO      					= "fstPORGREQNo";
	public static final String SELECT_ATTRIBUTE_FST_PORGREQNO    				= "attribute[" + ATTRIBUTE_FST_PORGREQNO	 + "]";
	public static final String ATTRIBUTE_FST_PORVNDCOD      					= "fstPORVndCod";
	public static final String SELECT_ATTRIBUTE_FST_PORVNDCOD    				= "attribute[" + ATTRIBUTE_FST_PORVNDCOD	 + "]";
	public static final String ATTRIBUTE_FST_PORCHANGEDIVISION              = "fstPORChangeDivision";
	public static final String SELECT_ATTRIBUTE_FST_PORCHANGEDIVISION       = "attribute[" + ATTRIBUTE_FST_PORCHANGEDIVISION + "]";
	public static final String ATTRIBUTE_FST_PORPORDATE_STRING				= "fstPORPorDate";
	public static final String SELECT_ATTRIBUTE_FST_PORPORDATE_STRING		= "attribute[" + ATTRIBUTE_FST_PORPORDATE_STRING	 + "]";
	public static final String ATTRIBUTE_FST_PORORDNO		        		= "fstPOROrdNo";
	public static final String SELECT_ATTRIBUTE_FST_PORORDNO			    = "attribute[" + ATTRIBUTE_FST_PORORDNO	 + "]";
	public static final String ATTRIBUTE_FST_WORKORDERPROJECTCODE			= "fstWorkOrderProjectCode";
	public static final String SELECT_ATTRIBUTE_FST_WORKORDERPROJECTCODE	= "attribute[" + ATTRIBUTE_FST_WORKORDERPROJECTCODE	 + "]";
	public static final String ATTRIBUTE_FST_PIPEBLOCKNO					= "fstPipeBlockNo";
	public static final String SELECT_ATTRIBUTE_FST_PIPEBLOCKNO			    = "attribute[" + ATTRIBUTE_FST_PIPEBLOCKNO	 + "]";
	public static final String ATTRIBUTE_FST_PORISSQTY		        		= "fstPORIssQty";
	public static final String SELECT_ATTRIBUTE_FST_PORISSQTY			    = "attribute[" + ATTRIBUTE_FST_PORISSQTY	 + "]";
	public static final String ATTRIBUTE_FST_PORRREQQTY		        		= "fstPORRreqQty";
	public static final String SELECT_ATTRIBUTE_FST_PORRREQQTY			    = "attribute[" + ATTRIBUTE_FST_PORRREQQTY	 + "]";
	public static final String ATTRIBUTE_FST_PORPROJECTCODE     		   	= "fstPORProjectCode";
	public static final String SELECT_ATTRIBUTE_FST_PORPROJECTCODE  		= "attribute[" + ATTRIBUTE_FST_PORPROJECTCODE	 + "]";
	public static final String ATTRIBUTE_FST_SMBCATEGORYOFCHANGE		   	= "fstSMBCategoryofChange";
	public static final String SELECT_ATTRIBUTE_FST_SMBCATEGORYOFCHANGE		= "attribute[" + ATTRIBUTE_FST_SMBCATEGORYOFCHANGE	 + "]";
	public static final String ATTRIBUTE_FST_SMBSCHEDULEBLOCKNO			   	= "fstSMBScheduleBlockNo";
	public static final String SELECT_ATTRIBUTE_FST_SMBSCHEDULEBLOCKNO		= "attribute[" + ATTRIBUTE_FST_SMBSCHEDULEBLOCKNO	 + "]";
	public static final String ATTRIBUTE_FST_PORDELDATE         		   	= "fstPORDelDate";
	public static final String SELECT_ATTRIBUTE_FST_PORDELDATE      		= "attribute[" + ATTRIBUTE_FST_PORDELDATE	 + "]";
	public static final String ATTRIBUTE_FST_PORORDDATE         		   	= "fstPOROrdDate";
	public static final String SELECT_ATTRIBUTE_FST_PORORDDATE      		= "attribute[" + ATTRIBUTE_FST_PORORDDATE	 + "]";
	public static final String ATTRIBUTE_FST_PORORDQTY         			   	= "fstPOROrdQty";
	public static final String SELECT_ATTRIBUTE_FST_PORORDQTY	      		= "attribute[" + ATTRIBUTE_FST_PORORDQTY	 + "]";
	public static final String ATTRIBUTE_FST_PORPURIM         			   	= "fstPORPurIm";
	public static final String SELECT_ATTRIBUTE_FST_PORPURIM	      		= "attribute[" + ATTRIBUTE_FST_PORPURIM	 + "]";
	public static final String ATTRIBUTE_FST_PORARRDATE        			   	= "fstPORArrDate";
	public static final String SELECT_ATTRIBUTE_FST_PORARRDATE	      		= "attribute[" + ATTRIBUTE_FST_PORARRDATE	 + "]";
	public static final String ATTRIBUTE_FST_PORARRIM        			   	= "fstPORArrIm";
	public static final String SELECT_ATTRIBUTE_FST_PORARRIM	      		= "attribute[" + ATTRIBUTE_FST_PORARRIM	 + "]";
	public static final String ATTRIBUTE_FST_PORARRNO        			   	= "fstPORArrNo";
	public static final String SELECT_ATTRIBUTE_FST_PORARRNO	      		= "attribute[" + ATTRIBUTE_FST_PORARRNO	 + "]";
	public static final String ATTRIBUTE_FST_PORARRQTY        			   	= "fstPORArrQty";
	public static final String SELECT_ATTRIBUTE_FST_PORARRQTY	      		= "attribute[" + ATTRIBUTE_FST_PORARRQTY	 + "]";
	public static final String ATTRIBUTE_FST_PORLOCNO        			   	= "fstPORLocNo";
	public static final String SELECT_ATTRIBUTE_FST_PORLOCNO	      		= "attribute[" + ATTRIBUTE_FST_PORLOCNO	 + "]";
	public static final String ATTRIBUTE_FST_PORWIM        			   		= "fstPORWIm";
	public static final String SELECT_ATTRIBUTE_FST_PORWIM	      			= "attribute[" + ATTRIBUTE_FST_PORWIM	 + "]";
	public static final String ATTRIBUTE_FST_PORPASQTY     			   		= "fstPORPasQty";
	public static final String SELECT_ATTRIBUTE_FST_PORPASQTY      			= "attribute[" + ATTRIBUTE_FST_PORPASQTY	 + "]";
	public static final String ATTRIBUTE_FST_PORQCDATE     			   		= "fstPORQcDate";
	public static final String SELECT_ATTRIBUTE_FST_PORQCDATE      			= "attribute[" + ATTRIBUTE_FST_PORQCDATE	 + "]";
	public static final String ATTRIBUTE_FST_POROHDQTY     			   		= "fstPOROhdQty";
	public static final String SELECT_ATTRIBUTE_FST_POROHDQTY      			= "attribute[" + ATTRIBUTE_FST_POROHDQTY	 + "]";
	public static final String ATTRIBUTE_FST_PORRECDATE     		   		= "fstPORRecDate";
	public static final String SELECT_ATTRIBUTE_FST_PORRECDATE     			= "attribute[" + ATTRIBUTE_FST_PORRECDATE	 + "]";
	public static final String ATTRIBUTE_FST_PORISSDATE     		   		= "fstPORIssDate";
	public static final String SELECT_ATTRIBUTE_FST_PORISSDATE     			= "attribute[" + ATTRIBUTE_FST_PORISSDATE	 + "]";
	public static final String ATTRIBUTE_FST_WORKORDERPROJECTCODEITEM     	= "fstWorkOrderProjectCodeItem";
	public static final String SELECT_ATTRIBUTE_FST_WORKORDERPROJECTCODEITEM   = "attribute[" + ATTRIBUTE_FST_WORKORDERPROJECTCODEITEM	 + "]";
	public static final String ATTRIBUTE_FST_PORPROCESSINGITEMDIVISION      = "fstPORProcessingItemDivision";
	public static final String SELECT_ATTRIBUTE_FST_PORPROCESSINGITEMDIVISION  = "attribute[" + ATTRIBUTE_FST_PORPROCESSINGITEMDIVISION	 + "]";
	public static final String ATTRIBUTE_FST_PORFACCOD                      = "fstPORFACCOD";
	public static final String SELECT_ATTRIBUTE_FST_PORFACCOD               = "attribute[" + ATTRIBUTE_FST_PORFACCOD	 + "]";
	public static final String ATTRIBUTE_FST_PORAPPROVESTATUSSTEP1          = "fstPORApproveStatusStep1";
	public static final String SELECT_ATTRIBUTE_FST_PORAPPROVESTATUSSTEP1   = "attribute[" + ATTRIBUTE_FST_PORAPPROVESTATUSSTEP1	 + "]";
	public static final String ATTRIBUTE_FST_PORAPPROVESTATUSSTEP2          = "fstPORApproveStatusStep2";
	public static final String SELECT_ATTRIBUTE_FST_PORAPPROVESTATUSSTEP2   = "attribute[" + ATTRIBUTE_FST_PORAPPROVESTATUSSTEP2	 + "]";
	public static final String ATTRIBUTE_FST_RESERVER                       = "fstReserver";
	public static final String SELECT_ATTRIBUTE_FST_RESERVER                = "attribute[" + ATTRIBUTE_FST_RESERVER + "]";
	public static final String ATTRIBUTE_FST_PORMCCSCODIS2H                 = "fstPORMCCSCODis2H";
	public static final String SELECT_ATTRIBUTE_FST_PORMCCSCODIS2H          = "attribute[" + ATTRIBUTE_FST_PORMCCSCODIS2H + "]";
	public static final String ATTRIBUTE_FST_PORSAGUPRSN                    = "fstPORSAGUPRSN";
	public static final String SELECT_ATTRIBUTE_FST_PORSAGUPRSN             = "attribute[" + ATTRIBUTE_FST_PORSAGUPRSN + "]";
	public static final String ATTRIBUTE_FST_SMBWORKORDERQTY1               = "fstSMBWorkOrderQty1";
	public static final String SELECT_ATTRIBUTE_FST_SMBWORKORDERQTY1        = "attribute[" + ATTRIBUTE_FST_SMBWORKORDERQTY1  + "]";
	public static final String ATTRIBUTE_FST_SMBWORKORDERQTY2               = "fstSMBWorkOrderQty2";
	public static final String SELECT_ATTRIBUTE_FST_SMBWORKORDERQTY2        = "attribute[" + ATTRIBUTE_FST_SMBWORKORDERQTY2 + "]";
	public static final String ATTRIBUTE_FST_SMBWORKORDERQTY3               = "fstSMBWorkOrderQty3";
	public static final String SELECT_ATTRIBUTE_FST_SMBWORKORDERQTY3        = "attribute[" + ATTRIBUTE_FST_SMBWORKORDERQTY3  + "]";
	public static final String ATTRIBUTE_FST_SMBWORKORDERWEIGHT1            = "fstSMBWorkOrderWeight1";
	public static final String SELECT_ATTRIBUTE_FST_SMBWORKORDERWEIGHT1     = "attribute[" + ATTRIBUTE_FST_SMBWORKORDERWEIGHT1 + "]";
	public static final String ATTRIBUTE_FST_SMBWORKORDERWEIGHT2            = "fstSMBWorkOrderWeight2";
	public static final String SELECT_ATTRIBUTE_FST_SMBWORKORDERWEIGHT2     = "attribute[" + ATTRIBUTE_FST_SMBWORKORDERWEIGHT2 + "]";
	public static final String ATTRIBUTE_FST_SMBWORKORDERWEIGHT3            = "fstSMBWorkOrderWeight3";
	public static final String SELECT_ATTRIBUTE_FST_SMBWORKORDERWEIGHT3     = "attribute[" + ATTRIBUTE_FST_SMBWORKORDERWEIGHT3  + "]";
	public static final String ATTRIBUTE_FST_SMBWORKORDERNO                 = "fstSMBWorkOrderNo";
	public static final String SELECT_ATTRIBUTE_FST_SMBWORKORDERNO          = "attribute[" + ATTRIBUTE_FST_SMBWORKORDERNO  + "]";
	public static final String ATTRIBUTE_FST_SMBWORKDEPT                    = "fstSMBWorkDept";
	public static final String SELECT_ATTRIBUTE_FST_SMBWORKDEPT             = "attribute[" + ATTRIBUTE_FST_SMBWORKDEPT  + "]";
	public static final String ATTRIBUTE_FST_SMBWORKORDERPOR                = "fstSMBWorkOrderPOR";
	public static final String SELECT_ATTRIBUTE_FST_SMBWORKORDERPOR         = "attribute[" + ATTRIBUTE_FST_SMBWORKORDERPOR  + "]";
	public static final String ATTRIBUTE_FST_SMBWORKNAME                    = "fstSMBWorkName";
	public static final String SELECT_ATTRIBUTE_FST_SMBWORKNAME             = "attribute[" + ATTRIBUTE_FST_SMBWORKNAME   + "]";
	public static final String ATTRIBUTE_FST_SMBWORKORDERCPNO               = "fstSMBWorkOrderCpNo";
	public static final String SELECT_ATTRIBUTE_FST_SMBWORKORDERCPNO        = "attribute[" + ATTRIBUTE_FST_SMBWORKORDERCPNO  + "]";
	public static final String ATTRIBUTE_FST_SMBWORKDEPTTYPE                = "fstSMBWorkDeptType";
	public static final String SELECT_ATTRIBUTE_FST_SMBWORKDEPTTYPE         = "attribute[" + ATTRIBUTE_FST_SMBWORKDEPTTYPE  + "]";
	public static final String ATTRIBUTE_FST_DPNO                			= "fstDPNo";
	public static final String SELECT_ATTRIBUTE_FST_DPNO                    = "attribute[" + ATTRIBUTE_FST_DPNO  + "]";
	public static final String ATTRIBUTE_FST_ACTIVITYCODE         		 	= "fstActivityCode";
	public static final String SELECT_ATTRIBUTE_FST_ACTIVITYCODE            = "attribute[" + ATTRIBUTE_FST_ACTIVITYCODE  + "]";
	public static final String ATTRIBUTE_FST_ACTIVITYSTAGE       		  	= "fstActivityStage";
	public static final String SELECT_ATTRIBUTE_FST_ACTIVITYSTAGE           = "attribute[" + ATTRIBUTE_FST_ACTIVITYSTAGE  + "]";
	public static final String ATTRIBUTE_FST_SMBMFGCODE                		= "fstSMBMFGCode";
	public static final String SELECT_ATTRIBUTE_FST_SMBMFGCODE         		= "attribute[" + ATTRIBUTE_FST_SMBMFGCODE  + "]";
	public static final String ATTRIBUTE_FST_CPINPUTQTY                		= "fstCPInputQty";
	public static final String SELECT_ATTRIBUTE_FST_CPINPUTQTY         		= "attribute[" + ATTRIBUTE_FST_CPINPUTQTY  + "]";
	public static final String ATTRIBUTE_FST_SMBPROCESSINGACCOUNTCODE       = "fstSMBProcessingAccountCode";
	public static final String SELECT_ATTRIBUTE_FST_SMBPROCESSINGACCOUNTCODE= "attribute[" + ATTRIBUTE_FST_SMBPROCESSINGACCOUNTCODE  + "]";
	public static final String ATTRIBUTE_FST_PORDISCIPLINE       			= "fstPORDiscipline";
	public static final String SELECT_ATTRIBUTE_FST_PORDISCIPLINE			= "attribute[" + ATTRIBUTE_FST_PORDISCIPLINE  + "]";
	public static final String ATTRIBUTE_FST_PORRFQPOR       				= "fstPORRfqPor";
	public static final String SELECT_ATTRIBUTE_FST_PORRFQPOR				= "attribute[" + ATTRIBUTE_FST_PORRFQPOR  + "]";
	public static final String ATTRIBUTE_FST_PORORARRIM       				= "fstPORArrIm";
	public static final String SELECT_ATTRIBUTE_FST_PORORARRIM				= "attribute[" + ATTRIBUTE_FST_PORORARRIM  + "]";
	public static final String ATTRIBUTE_FST_PORORARRNO       				= "fstPORArrNo";
	public static final String SELECT_ATTRIBUTE_FST_PORORARRNO				= "attribute[" + ATTRIBUTE_FST_PORORARRNO  + "]";
	public static final String ATTRIBUTE_FST_PORORARRQTY       				= "fstPORArrQty";
	public static final String SELECT_ATTRIBUTE_FST_PORORARRQTY				= "attribute[" + ATTRIBUTE_FST_PORORARRQTY  + "]";
	public static final String ATTRIBUTE_FST_PORSURPLUSQTY     				= "fstPORSurplusQty";
	public static final String SELECT_ATTRIBUTE_FST_PORSURPLUSQTY			= "attribute[" + ATTRIBUTE_FST_PORSURPLUSQTY  + "]";
	public static final String ATTRIBUTE_FST_PORPRODUCTIONDUEDATE     		= "fstPORProductionDueDate";
	public static final String SELECT_ATTRIBUTE_FST_PORPRODUCTIONDUEDATE	= "attribute[" + ATTRIBUTE_FST_PORPRODUCTIONDUEDATE  + "]";
	public static final String ATTRIBUTE_FST_SMBPROJECTCOD     				= "fstSMBProjectCode";
	public static final String SELECT_ATTRIBUTE_FST_SMBPROJECTCOD			= "attribute[" + ATTRIBUTE_FST_SMBPROJECTCOD  + "]";
	public static final String ATTRIBUTE_FST_PORMATDSCADD     				= "fstPORMatDscAdd";
	public static final String SELECT_ATTRIBUTE_FST_PORMATDSCADD			= "attribute[" + ATTRIBUTE_FST_PORMATDSCADD  + "]";
	public static final String ATTRIBUTE_FST_SMBBOCADNCNO     				= "fstSMBBOCADNCNo";
	public static final String SELECT_ATTRIBUTE_FST_SMBBOCADNCNO			= "attribute[" + ATTRIBUTE_FST_SMBBOCADNCNO  + "]";
	public static final String ATTRIBUTE_FST_SMBBOCADID     				= "fstSMBBOCADID";
	public static final String SELECT_ATTRIBUTE_FST_SMBBOCADID				= "attribute[" + ATTRIBUTE_FST_SMBBOCADID  + "]";
	public static final String ATTRIBUTE_FST_SMBPDMSREFID     				= "fstSMBPDMSRefID";
	public static final String SELECT_ATTRIBUTE_FST_SMBPDMSREFID			= "attribute[" + ATTRIBUTE_FST_SMBPDMSREFID  + "]";
	public static final String ATTRIBUTE_FST_CADDISCIPLINE 					= "fstCADDISCIPLINE";
	public static final String SELECT_ATTRIBUTE_FST_CADDISCIPLINE			= "attribute[" + ATTRIBUTE_FST_CADDISCIPLINE  + "]";

	//add for SteelOutfitting
	public static final String ATTRIBUTE_FST_CADDISCIPLINE_DISPLAY 			= "fstCADDISCIPLINE_DISPLAY";
	public static final String SELECT_ATTRIBUTE_FST_CADDISCIPLINE_DISPLAY	= "attribute[" + ATTRIBUTE_FST_CADDISCIPLINE_DISPLAY  + "]";

	public static final String ATTRIBUTE_FST_CADREFNO 						= "fstCADREFNO";
	public static final String SELECT_ATTRIBUTE_FST_CADREFNO				= "attribute[" + ATTRIBUTE_FST_CADREFNO  + "]";

	public static final String ATTRIBUTE_FST_CADBLOCKNO 					= "fstCADBLOCKNO";
	public static final String SELECT_ATTRIBUTE_FST_CADBLOCKNO				= "attribute[" + ATTRIBUTE_FST_CADBLOCKNO  + "]";

	public static final String ATTRIBUTE_FST_CADCATBLOCKNO 					= "fstCADCATBLOCKNO";
	public static final String SELECT_ATTRIBUTE_FST_CADCATBLOCKNO			= "attribute[" + ATTRIBUTE_FST_CADCATBLOCKNO  + "]";

	public static final String ATTRIBUTE_FST_CADPJTCODE 					= "fstCADPJTCODE";
	public static final String SELECT_ATTRIBUTE_FST_CADPJTCODE				= "attribute[" + ATTRIBUTE_FST_CADPJTCODE  + "]";

	public static final String ATTRIBUTE_FST_CADWIDTH	 					= "fstCADWIDTH";
	public static final String SELECT_ATTRIBUTE_FST_CADWIDTH				= "attribute[" + ATTRIBUTE_FST_CADWIDTH  + "]";

	public static final String ATTRIBUTE_FST_CADLENGTH_AREA	 				= "fstCADLENGTH-AREA";
	public static final String SELECT_ATTRIBUTE_FST_CADLENGTH_AREA			= "attribute[" + ATTRIBUTE_FST_CADLENGTH_AREA  + "]";

	public static final String ATTRIBUTE_FST_CADDESCRIPTION	 				= "fstCADDESCRIPTION";
	public static final String SELECT_ATTRIBUTE_FST_CADDESCRIPTION			= "attribute[" + ATTRIBUTE_FST_CADDESCRIPTION  + "]";

	public static final String ATTRIBUTE_FST_CADMATERIAL	 				= "fstCADMATERIAL";
	public static final String SELECT_ATTRIBUTE_FST_CADMATERIAL				= "attribute[" + ATTRIBUTE_FST_CADMATERIAL  + "]";

	public static final String ATTRIBUTE_FST_CADUNIT		 				= "fstCADUNIT";
	public static final String SELECT_ATTRIBUTE_FST_CADUNIT					= "attribute[" + ATTRIBUTE_FST_CADUNIT  + "]";

	public static final String ATTRIBUTE_FST_CAD_UNIT_WEIGHT		 		= "fstCADWEIGHT-UNIT";
	public static final String SELECT_ATTRIBUTE_FST_CAD_UNIT_WEIGHT			= "attribute[" + ATTRIBUTE_FST_CAD_UNIT_WEIGHT  + "]";

	public static final String ATTRIBUTE_FST_CADWEIGHT				 		= "fstCADWEIGHT";
	public static final String SELECT_ATTRIBUTE_FST_CADWEIGHT				= "attribute[" + ATTRIBUTE_FST_CADWEIGHT  + "]";

	public static final String ATTRIBUTE_FST_QUANTITY				 		= "fstQuantity";
	public static final String SELECT_ATTRIBUTE_FST_QUANTITY				= "attribute[" + ATTRIBUTE_FST_QUANTITY  + "]";

	public static final String ATTRIBUTE_FST_SHOPDWGTYPE			 		= "fstShopDwgType";
	public static final String SELECT_ATTRIBUTE_FST_SHOPDWGTYPE				= "attribute[" + ATTRIBUTE_FST_SHOPDWGTYPE  + "]";

	public static final String ATTRIBUTE_FST_CADMCCSCODE			 		= "fstCADMCCSCODE";
	public static final String SELECT_ATTRIBUTE_FST_CADMCCSCODE				= "attribute[" + ATTRIBUTE_FST_CADMCCSCODE  + "]";

	public static final String ATTRIBUTE_FST_CADPLMCODE			 			= "fstCADPLMCODE";
	public static final String SELECT_ATTRIBUTE_FST_CADPLMCODE				= "attribute[" + ATTRIBUTE_FST_CADPLMCODE  + "]";

	public static final String ATTRIBUTE_FST_CADISSTEELOUTFITTING 			= "fstCADISSTEELOUTFITTING";
	public static final String SELECT_ATTRIBUTE_FST_CADISSTEELOUTFITTING	= "attribute[" + ATTRIBUTE_FST_CADISSTEELOUTFITTING  + "]";

	public static final String ATTRIBUTE_FST_SPECIFICATIONS 				= "fstSpecifications";
	public static final String SELECT_ATTRIBUTE_FST_SPECIFICATIONS			= "attribute[" + ATTRIBUTE_FST_SPECIFICATIONS  + "]";

	public static final String ATTRIBUTE_FST_EBOMQTYUNIT 					= "fstEBOMQtyUnit";
	public static final String SELECT_ATTRIBUTE_FST_EBOMQTYUNIT				= "attribute[" + ATTRIBUTE_FST_EBOMQTYUNIT  + "]";

	public static final String ATTRIBUTE_FST_PARENTQTYUNIT 					= "fstParentQtyUnit";
	public static final String SELECT_ATTRIBUTE_FST_PARENTQTYUNIT			= "attribute[" + ATTRIBUTE_FST_PARENTQTYUNIT  + "]";

	//end

	public static final String TYPE_FST_SMBSIZEARRANGEMENTNESTINGGROUP 	= "fstSMBSizeArrangementNestingGroup";
	public static final String TYPE_FST_SMBSTANDARDITEMNUMBER			= "fstSMBStandardItemNumber";
    public static final String TYPE_FST_CODE_DETAIL          			= "fstCodeDetail";
	public static final String TYPE_FST_MODELPART            		= "fstModelPart";
	public static final String TYPE_FST_SMBPORPART           		= "fstSMBPORPart";
	public static final String TYPE_FST_ISSUEPART            		= "fstIssuePart";
	public static final String TYPE_FST_SMBPROCESSINGRAWPART 		= "fstSMBProcessingRawPart";
	public static final String TYPE_FST_SMBPROCESSINGPART    		= "fstSMBProcessingPart";
	public static final String TYPE_FST_SMBREMNANTPART       		= "fstSMBRemnantPart";
	public static final String TYPE_FST_SMBSCRAPPART         		= "fstSMBScrapPart";
	public static final String TYPE_FST_SMBMTOREFERENCEPART  		= "fstSMBMTOReferencePart";
	public static final String TYPE_FST_ENGINEERINGDATA      		= "fstEngineeringData";
	public static final String TYPE_FST_VENDORDATA      		    = "fstVendorData";
    public static final String TYPE_FST_WP                        = "fstWP";

	public static final String TYPE_PROJECTSPACE             		= "Project Space";
	public static final String TYPE_FST_DETAILDP             		= "fstDetailDP";
	public static final String TYPE_FST_VDRL             		    = "fstVDRL";
	public static final String TYPE_FST_CORRESPONDENCE       		= "fstCorrespondence";
	public static final String TYPE_FST_SHOPDRAWING          		= "fstShopDrawing";
	public static final String TYPE_FST_SHOPDP               		= "fstShopDP";
	public static final String TYPE_FST_NONMODELPART		 		= "fstNonModelPart";
	public static final String TYPE_FSTPART		         			= "fstPart";
	public static final String TYPE_FSTASSEMBLYPART		        = "fstAssemblyPart";
	public static final String TYPE_FST_SMBSAWPIPEBENDINGMARGIN 	= "fstSMBSAWPipeBendingMargin";
	public static final String TYPE_FST_TAGNUMBER   				= "fstTagNumber";
	public static final String TYPE_FST_TAGNUMBERTEMP   			= "fstTagNumberTemp";
	public static final String TYPE_FST_SMBVENDORCATALOGUE   		= "fstSMBVendorCatalogue";
	public static final String TYPE_FST_FSTPARTKINDCLASSIFICATION 	= "fstPartKindClassification";
	public static final String TYPE_FST_SMBMATERIALCODE 			= "fstSMBMaterialCode";
	public static final String TYPE_FST_SMBMTOPART 					= "fstSMBMTOPart";
	public static final String TYPE_FST_SMBMTOBLOCK					= "fstSMBMTOBlock";
	public static final String TYPE_FST_SMBMTOLOT					= "fstSMBMTOLot";
	public static final String TYPE_FST_SMBMARKDRAWING				= "fstSMBMarkDrawing";
	public static final String TYPE_FST_SMBMATERIALCODEMAPPING		= "fstSMBMaterialCodeMapping";
	public static final String TYPE_FST_SMBMTOHEADER				= "fstSMBMTOHeader";
	public static final String TYPE_FST_SMBMBOMREFERENCEPART	    = "fstSMBMBOMReferencePart";
	public static final String TYPE_FST_CODEDETAIL	    			= "fstCodeDetail";
	public static final String TYPE_FST_PROJECTDIVISION	    		= "fstProjectDivision";
	public static final String TYPE_FST_SMBMCCSVENDORCATALOGUE		= "fstSMBMCCSVendorCatalogue";
	public static final String TYPE_FST_PORHEADER					= "fstPORHeader";
	public static final String TYPE_FST_POR							= "fstPOR";
	public static final String TYPE_FST_PURCHASEPOR 				= "fstPurchasePOR";
	public static final String TYPE_FST_PREPOR 						= "fstPrePOR";
	public static final String TYPE_FST_PROCESSPOR 					= "fstProcessPOR";
	public static final String TYPE_FST_OUTSOURCINGPOR 				= "fstOutSourcingPOR";
	public static final String TYPE_FST_ADMINPOR 					= "fstAdminPOR";
	public static final String TYPE_FST_RFQPOR 						= "fstRfqPOR";
	public static final String TYPE_FST_OFEPOR 						= "fstOfePOR";
	public static final String TYPE_FST_PARTKINDCLASSIFICATION		= "fstPartKindClassification";
	public static final String TYPE_FST_RFQMP						= "fstRFQMP";
	public static final String TYPE_FST_BULKMP						= "fstBulkMP";

	public static final String TYPE_FST_PORTYPE_PR1                 = "구매POR";
	public static final String TYPE_FST_PORTYPE_PR2                 = "전처리POR";
	public static final String TYPE_FST_PORTYPE_PR3                 = "가공POR";
	public static final String TYPE_FST_PORTYPE_PR4                 = "제작POR";
	public static final String TYPE_FST_PORTYPE_PR5                 = "행정POR";
	public static final String TYPE_FST_PORTYPE_PR6                 = "RFQPOR";
	public static final String TYPE_FST_PORTYPE_PR7                 = "OFEPOR";




	public static final String POLICY_FST_SMBMTOPARTPOLICY 			= "fstSMBMTOPartPolicy";
	public static final String POLICY_FST_SMBACCMTOPARTPOLICY 		= "fstSMBACCMTOPartPolicy";
	public static final String POLICY_FST_SMBEXISTS					= "fstSMBExists";
	public static final String POLICY_FST_SMBMTOREFERENCEPARTPOLICY	= "fstSMBMTOReferencePartPolicy";
	public static final String POLICY_FST_SMBMTOHEADERPOLICY		= "fstSMBMTOHeaderPolicy";
	public static final String POLICY_FST_STRMBOMPARTPOLICY        	= "fstSTRMBOMPartPolicy";
	public static final String POLICY_FST_SMBMBOMPARTACCPOLICY      = "fstSMBMBOMPartACCPolicy";
	public static final String POLICY_FST_PART      				= "fstPart";
	public static final String POLICY_FST_PORHEADER 				= "fstPORHeader";
	public static final String POLICY_FST_PURCHASEPOR 				= "fstPurchasePOR";
	public static final String POLICY_FST_PREPOR 				    = "fstPrePOR";
	public static final String POLICY_FST_PROCESSPOR 				= "fstProcessPOR";
	public static final String POLICY_FST_OUTSOURCINGPOR 			= "fstOutSourcingPOR";
	public static final String POLICY_FST_PACKINGPOR 				= "fstPackingPOR";
	public static final String POLICY_FST_SMBPORPART 				= "fstSMBPORPart";
	public static final String POLICY_FST_MODELPART 				= "fstModelPart";
	public static final String POLICY_FSTDATASHEETPOLICY			= "fstDataSheetPolicy";


	public static final String RELATIONSHIP_FST_CPPARTS                 					= "fstCPParts";
	public static final String RELATIONSHIP_FST_CPPORPARTS              					= "fstCPPORParts";
	public static final String RELATIONSHIP_FST_CPINPUTREMNANT          					= "fstCPInputRemnant";
	public static final String RELATIONSHIP_FST_MBOMPROCESSINGPART      					= "fstMBOMProcessingPart";
	public static final String RELATIONSHIP_FST_CPPERFOMED              					= "fstCPPerfomed";
	public static final String RELATIONSHIP_FST_CPPROCESSINGPART        					= "fstCPProcessingPart";
	public static final String RELATIONSHIP_FST_CPOUTPUTREMNANTS        					= "fstCPOutputRemnants";
	public static final String RELATIONSHIP_FST_REMNANTFROM             					= "fstRemnantFrom";
	public static final String RELATIONSHIP_FST_ORGMATERIAL             					= "fstORGMaterial";
	public static final String RELATIONSHIP_FST_RELATEDSCRAP            					= "fstRelatedScrap";
	public static final String RELATIONSHIP_FST_ORGPORPART              					= "fstORGPORPart";
	public static final String RELATIONSHIP_FST_SMBMTO                  					= "fstSMBMTO";
	public static final String RELATIONSHIP_FST_PORISSUETYPE            					= "fstPORIssueType";
	public static final String RELATIONSHIP_FST_PORISSUE                					= "fstPORIssue";
	public static final String RELATIONSHIP_FST_OUTPUTRAWMATERIAL       					= "fstOutputRawMaterial";
	public static final String RELATIONSHIP_FST_PORPARTRELATEDSCRAP     					= "fstPORPartRelatedScrap";
	public static final String RELATIONSHIP_FST_CPANDPROCESSINGRAWPART  					= "fstCPAndProcessingRawPart";
	public static final String RELATIONSHIP_FST_BLOCKSHOPDWG            					= "fstBlockShopDWG";
	public static final String RELATIONSHIP_FST_TAGGEDITEM   								= "fstTaggedItem";
	public static final String RELATIONSHIP_FST_TAGGEDITEMTEMP   							= "fstTaggedItemTemp";
	public static final String RELATIONSHIP_FST_SMBPROJECTSPACEANDMTOPART 					= "fstSMBProjectSpaceAndMTOPart";
	public static final String RELATIONSHIP_FST_SMBMTOHISTORY 								= "fstSMBMTOHistory";
	public static final String RELATIONSHIP_FST_SMBMTOHEADERANDMTOPART						= "fstSMBMTOHeaderAndMTOPart";
	public static final String RELATIONSHIP_FST_RELATEDMARKUPDRAWING						= "fstRelatedMarkupDrawing";
	public static final String RELATIONSHIP_FST_PROJECTSPACEANDSMBMATERIALCODEMAPPING 		= "fstProjectSpaceAndSMBMaterialCodeMapping";
	public static final String RELATIONSHIP_FST_SMBMATERIALCODEANDSMBMATERIALCODEMAPPING 	= "fstSMBMaterialCodeAndSMBMaterialCodeMapping";
	public static final String RELATIONSHIP_ESERVICE_NUMBER_GENERATOR 						= "eService Number Generator";
	public static final String RELATIONSHIP_SUBTASK  										= "Subtask";
	public static final String RELATIONSHIP_LATESTVERSION 									= "Latest Version";
	public static final String RELATIONSHIP_ACTIVEVERSION 									= "Active Version";
	public static final String RELATIONSHIP_PARTSPESIFICATION 								= "Part Specification";
	public static final String RELATIONSHIP_TASKDELIVERABLE 								= "Task Deliverable";
	public static final String RELATIONSHIP_FST_MBOM 										= "fstMBOM";
    public static final String RELATIONSHIP_FST_SMBPROJECTSPACEANDMBOMPART            	 	= "fstSMBProjectSpaceAndMBOMPart";
    public static final String RELATIONSHIP_FST_TASKDELIVERABLE                          	= "Task Deliverable";
    public static final String RELATIONSHIP_FST_MBOMREFERENCEPART 							= "fstMBOMReferencePart";
	public static final String RELATIONSHIP_FST_SCHEMATICPARENTCOMPONENT 					= "fstSchematicParentComponent";
	public static final String RELATIONSHIP_FST_PORHEADERTOPOR 								= "fstPORHeaderToPOR";
	public static final String RELATIONSHIP_FST_PARTKINDCLASSTOSMBPORPART					= "fstPartKindClassToSMBPORPart";
	public static final String RELATIONSHIP_FST_PORALLOCATIONTOBLOCK						= "fstPORAllocationToBlock";
	public static final String RELATIONSHIP_FST_RFQMPTOPORHEADER							= "fstRFQMPToPORHeader";
	public static final String RELATIONSHIP_FST_PORITEM										= "fstPORItem";
	public static final String RELATIONSHIP_FST_FABDWG										= "fstFabDwg";
	public static final String RELATIONSHIP_FSTDATASHEET										= "fstDataSheet";

	public static final String STATE_FST_ENGINEERINGDATA_RELEASE  	= "Release";
	public static final String STATE_FST_ENGINEERINGDATA_WORKING  	= "Working";
	public static final String STATE_FST_SCHEMATICPART_RELEASE   	= "Release";
	public static final String STATE_FST_SCHEMATICPART_WORKING   	= "Working";
	public static final String STATE_FST_SCHEMATICPART_OBSOLETE   	= "Obsolete";
	public static final String STATE_FST_SMBMTOHEADERPOLICY_CREATED = "Created";

    public static final String HEADER_SCHEMATIC_TAGNO = "fstCADTAGNO";
    public static final String HEADER_SCHEMATIC_LINE_SIZE = "fstCADLINE_SIZE";
    public static final String HEADER_SCHEMATIC_LINE_SPEC = "fstCADLINE_SPEC";
    public static final String HEADER_SCHEMATIC_INSULATION = "fstCADINSULATION";
    public static final String HEADER_SCHEMATIC_INSULPURPOSE = "fstCADINSULPURPOSE";
    public static final String HEADER_SCHEMATIC_PID_NO = "fstCADPID_NO";
    public static final String HEADER_SCHEMATIC_PID_NOREV = "fstCADPID_NOREV";
    public static final String HEADER_SCHEMATIC_PID_NOSTAGE = "fstCADPID_NOSTAGE";
    public static final String HEADER_SCHEMATIC_DRAWING_NAME = "fstCADDRAWING_NAME";
    public static final String HEADER_SCHEMATIC_SPECIALTYITEM = "fstCADSPECIALTYITEM";
    public static final String HEADER_SCHEMATIC_PARENT_TAG = "fstCADPARENT_TAG";
    public static final String HEADER_SCHEMATIC_SP_PIPERUNID = "fstCADSP_PIPERUNID";
    public static final String HEADER_SCHEMATIC_VALVE_DIA = "fstCADVALVE_DIA";
    public static final String HEADER_SCHEMATIC_NOMINALDIAMETER = "fstCADNOMINALDIAMETER";


	public static final String UPLOADTYPE_REPLASE  = "Replace";
	public static final String UPLOADTYPE_APPEND  = "Append";
	public static final String UPLOADKIND_DRAWING  = "Drawing";
	public static final String UPLOADKIND_DRAWINGANDPARTLIST  = "DrawingAndPartList";
	public static final String UPLOADKIND_PARTLIST  = "PartList";
	public static final String TARGET_STATE_REVISE  = "Revise";
	public static final String TARGET_STATE_RELEASE_REVISE = "Release_Revise";
	public static final String TARGET_STATE_VERSIONUP  = "Version Up";
	public static final String TARGET_STATE_CREATE  = "Create";

	public static final String EXCEL_ROW_COUNT   = "EXCEL_ROW_COUNT";
	public static final String EXCEL_LIST        = "EXCEL_LIST";
	public static final String SERVER_EXCEL_PATH = "EXCEL_FILE_PATH";

	public static String JFILE_CHOOSER_DEFAULT = PropUtil.getPropValue(FST_ENVIRONMENT_PROPERTIES, "FST.FileChooser.Default");
	public static final String FONT_KIND = "Sans-Serif";

    /**
     * 한글
     */
    public static final String LANGUAGE_KOR = "KOR";

    /**
     * 영문
     */
    public static final String LANGUAGE_ENG = "ENG";

    /**
     * 한자
     */
    public static final String LANGUAGE_CHN = "CHN";

    /**
     * 한글 금액 접두어
     */
    public static final String LANGUAGE_KOR_PRE = "금";

    /**
     * 영문 금액 접두어
     */
    public static final String LANGUAGE_ENG_PRE = "THE SUM OF KOREAN WON";

    /**
     * 한자 금액 접두어
     */
    public static final String LANGUAGE_CHN_PRE = "金";

    /**
      * 한글 금액 접미어
     */
    public static final String LANGUAGE_KOR_POST = "원정";

    /**
     * 영문 금액 접두어
     */
    public static final String LANGUAGE_ENG_POST = "ONLY.";

    /**
     * 한자 금액 접두어
     */
    public static final String LANGUAGE_CHN_POST = "";

	/**
	 * 알파벳 인지 검사 (a-z,A-Z 에 해당하면 true 리턴)
	 *
	 * @see #NUMERIC
	 * @see #ALPHABET_NUMERIC
	 */
	public static final String ALPHABET = "alpahbet";

	/**
	 *  알파벳 또는 숫자 검사 (a-z,A-Z,0-9 에 해당하면 true 리턴)
	 * @see #NUMERIC
	 * @see #ALPHABET
	 */
	public static final String ALPHABET_NUMERIC = "alphanumeric";
			/**
	*  사업자 번호 검사
	*/
	public static final String BUSINESS_NO = "businessno";

	/**
	*  법인등록 번호 검사
	*/
	public static final String CORPORATE_NO = "corporateno";

	/**
	*  날짜 검사
	*	유효한 날짜인지 검사한다
	*  예) 20021212 , 2001.2.18 , 1999-02-12 , 2000/12/12 -> true
	*		30000101 , 20001311, 20000231, 021111 -> false
	*
	*/
	public static final String DATE = "date";

		/**
	*  Dollar 검사
	*	예) 1,252.12 , 111,252.01 , 2,212,212.20 -> true
	*		2222 , 22.2222 ->false
	*/
	public static final String DOLLAR = "dollar";

	/**
	*  Email 검사
	*/
	public static final String EMAIL = "email";

	/**
	*  Float 검사
	*/
	public static final String FLOAT = "float";

	/**
	*  핸드폰번호  검사
	*  예) 016-712-5569 , 019-7121-5569, 01197145569 -> true
	*		013-854-2255 , 011-11111-123 -> false
	*/
	public static final String HAND_PHONE = "handphone";

	/**
	*  한글  검사
	*	모든 글자가 한글로만 되어있을때 true, null이거나 영문,숫자등이 포함되어있으면 false
	* @see #NOT_KOREAN
	* @see #PERFECT_KOREAN
	* @see #VALID_KOREAN
	*/
	public static final String KOREAN = "korean";

	/**
	*  한글포함 여부를 검사할 때 사용
	*	한글이 포함 되어 있지 않으면 true, null이거나 한글이 포함되어 있으면 false
	* @see #KOREAN
	* @see #PERFECT_KOREAN
	* @see #VALID_KOREAN
	*/
	public static final String NOT_KOREAN = "not_korean";

	/**
	 *  숫자  검사
	 *	숫자인지 검사한다.
	 */
	public static final String NUMERIC = "numeric";

	/**
	 *  한글이 완성형인지 검사
	 * @see #KOREAN
	 * @see #NOT_KOREAN
	 * @see #VALID_KOREAN
	 */
	public static final String PERFECT_KOREAN = "perfect_korean";

	/**
	 *  개인사업자번호  검사
	 */
	public static final String SOLEPROPRIETORSHIP_NO = "soleproprietorship_no";

	/**
	 *  주민등록번호 검사
	 */
	public static final String PERSONAL_NO = "psnno";

	/**
	 *  전화번호 검사
	 */
	public static final String TEL_NO = "telno";

	/**
	 *  시간 Format 검사
	 */
	public static final String TIME = "time";

	/**
	 *  한글의 정합성 검사
	 * @see #KOREAN
	 * @see #NOT_KOREAN
	 * @see #PERFECT_KOREAN
	 */
	public static final String VALID_KOREAN = "valid_korean";

	/**
	 *  원화 검사
	 */
	public static final String WON = "won";

	/**
	 * 우편번호 검사
	 */
	public static final String ZIP_CD = "zip_cd";

	/**
	 * Not Null 검사.
	 */
	public static final String NOT_NULL = "not_null";











	// Firstec

	public static final String CURRENT_PRELIMINARY				= "Preliminary";
	public static final String CURRENT_RELEASE					= "Release";
	public static final String CURRENT_EXISTS					= "Exists";

	public static final String TYPE_GENERIC_DOCUMENT      		= "Generic Document";
	public static final String TYPE_FSTDOCUMENT      				= "fstDocument";
	public static final String TYPE_CAD_DRAWING      			= "CAD Drawing";
	public static final String TYPE_PART		      			= "Part";
	public static final String TYPE_PART_FAMILY					= "Part Family";
	public static final String TYPE_FSTPARTSPACE				= "fstPartSpace";

	public static final String POLICY_FSTDOCUMENT				= "fstDocument";
	public static final String POLICY_STANDARD_PART				= "Standard Part";
	public static final String POLICY_FSTSTANDARDPART				= "fstStandardPart";
	public static final String POLICY_DEVELOPMENT_PART			= "Development Part";
	public static final String POLICY_EC_PART					= "EC Part";
	public static final String POLICY_DOCUMENT_RELEASE			= "Document Release";
	public static final String POLICY_CAD_DRAWING				= "CAD Drawing";

	public static final String RELATIONSHIP_PART_SPECIFICATION 		= "Part Specification";
	public static final String RELATIONSHIP_CLASSIFIED_ITEM			= "Classified Item";
	public static final String RELATIONSHIP_REFERENCE_DOCUMENT		= "Reference Document";
	public static final String RELATIONSHIP_EBOM					= "EBOM";
	public static final String RELATIONSHIP_FSTDELIVERYPRODUCT 		= "fstDeliveryProduct";
    public static final String RELATIONSHIP_FSTRELATEDUNITFACILITY 	= "fstRelatedUnitFacility";
    public static final String RELATIONSHIP_FSTRELATEDPROJECT 		= "fstRelatedProject";
    public static final String RELATIONSHIP_FSTRELATEDDOCUMENT 		= "fstRelatedDocument";

	public static final String ATTRIBUTE_UNIT_OF_MEASURE			= "Unit of Measure";
	public static final String ATTRIBUTE_UOM_TYPE					= "UOM Type";
	public static final String ATTRIBUTE_CHANGE_CONTROLLED			= "Change Controlled";
	public static final String ATTRIBUTE_RELEASE_PHASE				= "Release Phase";

	// CAD Drawing
	public static final String ATTRIBUTE_FSTDOCUMENTNAME			= "fstDocumentName";
	public static final String ATTRIBUTE_FSTNEEDPEERREVIEW			= "fstNeedPeerReview";
	public static final String ATTRIBUTE_FSTPLANDELIVERYDATE		= "fstPlanDeliveryDate";
	public static final String ATTRIBUTE_FSTACTUALDELIVERYDATE		= "fstActualDeliveryDate";
	public static final String ATTRIBUTE_FSTISCONFIGURATIONITEM		= "fstIsConfigurationItem";
	public static final String ATTRIBUTE_FSTRECOVERYPERIOD			= "fstRecoveryPeriod";
//	public static final String ATTRIBUTE_FSTCUSTOMERDOCREVISION		= "fstCustomerDocRevision";
	public static final String ATTRIBUTE_FSTCUSTOMERCOMPANY			= "fstCustomerCompany";
	public static final String ATTRIBUTE_FSTNEEDTORECLAIM			= "fstNeedToReclaim";
//	public static final String ATTRIBUTE_FSTCUSTOMERDOCNUMBER		= "fstCustomerDocNumber";
	public static final String ATTRIBUTE_FSTISDELIVERABLEDOCUMENT	= "fstIsDeliverableDocument";
	public static final String ATTRIBUTE_FSTSECURITYCLASS			= "fstSecurityClass";
	public static final String ATTRIBUTE_FSTBASELINE				= "fstBaseLine";
	public static final String ATTRIBUTE_FSTCONSERVATIONTERM		= "fstConservationTerm";
	public static final String ATTRIBUTE_FSTCONSERVATIONTERMDATE	= "fstConservationTermDate";
	public static final String ATTRIBUTE_FSTSTARTEFFECTIVITYDATE	= "fstStartEffectivityDate";
	public static final String ATTRIBUTE_FSTENDEFFECTIVITYDATE		= "fstEndEffectivityDate";
	public static final String ATTRIBUTE_FSTSTARTFACILITYUNITNUMBER	= "fstStartFacilityUnitNumber";
	public static final String ATTRIBUTE_FSTENDFACILITYUNITNUMBER	= "fstEndFacilityUnitNumber";
	public static final String ATTRIBUTE_FSTDRAWINGSIZE				= "fstDrawingSize";
	public static final String ATTRIBUTE_FSTNAMESERIALNO			= "fstNameSerialNo";
	public static final String ATTRIBUTE_FSTEQUIPMENTNUMBER			= "fstEquipmentNumber";
	public static final String ATTRIBUTE_FSTDOCUMENTRECEIPTNUMBER		= "fstDocumentReceiptNumber";

	// Part
	public static final String ATTRIBUTE_FSTDRAWINGNO 							= "fstDrawingNo";
	public static final String ATTRIBUTE_FSTDRAWINGNOOFREV 						= "fstDrawingNoOfRev";
	public static final String ATTRIBUTE_FSTDRAWINGNOOFREVDATE 					= "fstDrawingNoOfRevDate";
	public static final String ATTRIBUTE_FSTITEMSPECIFICATION 					= "fstItemSpecification";
	public static final String ATTRIBUTE_FSTITEMFULLNAME 						= "fstItemFullName";
	public static final String ATTRIBUTE_FSTITEMNAME 							= "fstItemName";
	public static final String ATTRIBUTE_FSTITEMENGNAME 						= "fstItemEngName";
	public static final String ATTRIBUTE_FSTITEMACCOUNT 						= "fstItemAccount";
	public static final String ATTRIBUTE_FSTITEMTYPE 							= "fstItemType";
	public static final String ATTRIBUTE_FSTPROCURETYPE 						= "fstProcureType";
	public static final String ATTRIBUTE_FSTISEXCLUSIVEITEM 					= "fstIsExclusiveItem";
	public static final String ATTRIBUTE_FSTISSINGLESUPPLY 						= "fstIsSingleSupply";
	public static final String ATTRIBUTE_FSTMANUFACTURINGSTRATEGY 				= "fstManufacturingStrategy";
	public static final String ATTRIBUTE_FSTLOTSIZE 							= "fstLotSize";
	public static final String ATTRIBUTE_FSTROUNDUPDATE 						= "fstRoundUpDate";
	public static final String ATTRIBUTE_FSTSEMIMANUFACTURESTOCKMETHOD 			= "fstSemiManufactureStockMethod";
	public static final String ATTRIBUTE_FSTSTOCKSTORAGE 						= "fstStockStorage";
	public static final String ATTRIBUTE_FSTRELEASEMETHOD 						= "fstReleaseMethod";
	public static final String ATTRIBUTE_FSTRELEASESTORAGE 						= "fstReleaseStorage";
	public static final String ATTRIBUTE_FSTRELEASEUNIT	 						= "fstReleaseUnit";
	public static final String ATTRIBUTE_FSTINVENTORYUNIT 						= "fstInventoryUnit";
	public static final String ATTRIBUTE_FSTINVENTORYSURVEYPERIOD 				= "fstInventorySurveyPeriod";
	public static final String ATTRIBUTE_FSTMANUFACTUREORDERUNIT 				= "fstManufactureOrderUnit";
	public static final String ATTRIBUTE_FSTMANUFACTUREORDERLT 					= "fstManufactureOrderLT";
	public static final String ATTRIBUTE_FSTPURCHASEORDER 						= "fstPurchaseOrder";
	public static final String ATTRIBUTE_FSTPURCHASEORDERLT 					= "fstPurchaseOrderLT";
	public static final String ATTRIBUTE_FSTPURCHASEGROUP 						= "fstPurchaseGroup";
	public static final String ATTRIBUTE_FSTFINALINSPECT 						= "fstFinalInspect";
	public static final String ATTRIBUTE_FSTPROCESSINSPECT 						= "fstProcessInspect";
	public static final String ATTRIBUTE_FSTINCOMEINSPECT 						= "fstIncomeInspect";
	public static final String ATTRIBUTE_FSTFORWARDINSPECT 						= "fstForwardInspect";
	public static final String ATTRIBUTE_FSTMILITARYDIVIDE 						= "fstMilitaryDivide";
	public static final String ATTRIBUTE_FSTNATIONINVENTORYNO 					= "fstNationInventoryNo";
	public static final String ATTRIBUTE_FSTPARTMANAGENO 						= "fstPartManageNo";
	public static final String ATTRIBUTE_FSTPRODUCTIONTYPE 						= "fstProductionType";
	public static final String ATTRIBUTE_FSTINTERGRATEDCOSTPARTTYPE 			= "fstIntergratedCostPartType";
	public static final String ATTRIBUTE_FSTDEFENSEARTICLESAPPOINTYN 			= "fstDefenseArticlesAppointYN";
	public static final String ATTRIBUTE_FSTDEFENSEARTICLESAPPOINTBASED 		= "fstDefenseArticlesAppointBased";
	public static final String ATTRIBUTE_FSTPURCHASECLASSIFICATION 				= "fstPurchaseClassification";
	public static final String ATTRIBUTE_FSTISPRESCRIPTION 						= "fstIsPrescription";
	public static final String ATTRIBUTE_FSTISESD 								= "fstIsESD";
	public static final String ATTRIBUTE_FSTISMSL 								= "fstIsMSL";
	public static final String ATTRIBUTE_FSTITEMSIGN 							= "fstItemSign";
	public static final String ATTRIBUTE_FSTITEMIDENTIFICATIONCODE 				= "fstItemIdentificationCode";
	public static final String ATTRIBUTE_FSTSTANDARDIZATIONTYPE 				= "fstStandardizationType";
	public static final String ATTRIBUTE_FSTDEFENSEDRAWINGTYPE 					= "fstDefenseDrawingType";
	public static final String ATTRIBUTE_FSTDEFENSEDRAWINGPARTNO 				= "fstDefenseDrawingPartNo";
	public static final String ATTRIBUTE_FSTCONFIGURATIONIDENTIFICATIONOWNER 	= "fstConfigurationIdentificationOwner";
	public static final String ATTRIBUTE_FSTSTANDARDNO 							= "fstStandardNo";
	public static final String ATTRIBUTE_FSTSTANDARDPARTNO 						= "fstStandardPartNo";
	public static final String ATTRIBUTE_FSTMANUFACTUREPARTNO 					= "fstManufacturePartNo";
	public static final String ATTRIBUTE_FSTMANUFACTUREITEMNAME 				= "fstManufactureItemName";
	public static final String ATTRIBUTE_FSTMANUFACTURETAXIDNO 					= "fstManufactureTaxIDNo";
	public static final String ATTRIBUTE_FSTMANUFACTURECORPORATENAME 			= "fstManufactureCorporateName";
	public static final String ATTRIBUTE_FSTRAWMATERIALSYMBOL 					= "fstRawMaterialSymbol";
	public static final String ATTRIBUTE_FSTRAWMATERIALSTANDARD 				= "fstRawMaterialStandard";
	public static final String ATTRIBUTE_FSTPRIMARYEQUIPMENT 					= "fstPrimaryEquipment";
	public static final String ATTRIBUTE_FSTASSEMBLYNAME 						= "fstAssemblyName";
	public static final String ATTRIBUTE_FSTWEIGHT 								= "fstWeight";
	public static final String ATTRIBUTE_FSTWEIGHTUNIT 							= "fstWeightUnit";
	public static final String ATTRIBUTE_FSTVOLUME 								= "fstVolume";
	public static final String ATTRIBUTE_FSTVOLUMEUNIT 							= "fstVolumeUnit";
	public static final String ATTRIBUTE_FSTMATERIALTYPE 						= "fstMaterialType";
	public static final String ATTRIBUTE_FSTUNIT 								= "fstUnit";
	public static final String ATTRIBUTE_FSTISPHANTOM 							= "fstIsPhantom";
	public static final String ATTRIBUTE_FSTISUNITOFFACILITIES 					= "fstIsUnitOfFacilities";
	public static final String ATTRIBUTE_FSTFACILITYUNITNUMBER 					= "fstFacilityUnitNumber";
	public static final String ATTRIBUTE_PARTFAMILYPREFIXPATTERN 				= "Part Family Prefix Pattern";
	public static final String ATTRIBUTE_FSTSTANDARDITEMCODE 					= "fstStandardItemCode";

	// BOM
	public static final String ATTRIBUTE_FIND_NUMBER 					= "Find Number";

    // Select Constants
	public static final String SELECT_ATTRIBUTE_UNIT_OF_MEASURE							= "attribute[" + ATTRIBUTE_UNIT_OF_MEASURE				+ "]";
	public static final String SELECT_ATTRIBUTE_UOM_TYPE			            		= "attribute[" + ATTRIBUTE_UOM_TYPE						+ "]";
	public static final String SELECT_ATTRIBUTE_CHANGE_CONTROLLED	            		= "attribute[" + ATTRIBUTE_CHANGE_CONTROLLED			+ "]";
	public static final String SELECT_ATTRIBUTE_RELEASE_PHASE		            		= "attribute[" + ATTRIBUTE_RELEASE_PHASE				+ "]";
	public static final String SELECT_ATTRIBUTE_FIND_NUMBER	            			= "attribute[" + ATTRIBUTE_FIND_NUMBER				+ "]";


	public static final String SELECT_ATTRIBUTE_FSTDOCUMENTNAME				    		= "attribute[" + ATTRIBUTE_FSTDOCUMENTNAME				+ "]";
	public static final String SELECT_ATTRIBUTE_FSTNEEDPEERREVIEW						= "attribute[" + ATTRIBUTE_FSTNEEDPEERREVIEW			+ "]";
	public static final String SELECT_ATTRIBUTE_FSTPLANDELIVERYDATE			 			= "attribute[" + ATTRIBUTE_FSTPLANDELIVERYDATE			+ "]";
	public static final String SELECT_ATTRIBUTE_FSTACTUALDELIVERYDATE					= "attribute[" + ATTRIBUTE_FSTACTUALDELIVERYDATE		+ "]";
	public static final String SELECT_ATTRIBUTE_FSTISCONFIGURATIONITEM					= "attribute[" + ATTRIBUTE_FSTISCONFIGURATIONITEM		+ "]";
	public static final String SELECT_ATTRIBUTE_FSTRECOVERYPERIOD						= "attribute[" + ATTRIBUTE_FSTRECOVERYPERIOD			+ "]";
	public static final String SELECT_ATTRIBUTE_FSTCUSTOMERDOCREVISION					= "attribute[" + ATTRIBUTE_FSTCUSTOMERDOCREVISION		+ "]";
	public static final String SELECT_ATTRIBUTE_FSTCUSTOMERCOMPANY						= "attribute[" + ATTRIBUTE_FSTCUSTOMERCOMPANY			+ "]";
	public static final String SELECT_ATTRIBUTE_FSTNEEDTORECLAIM						= "attribute[" + ATTRIBUTE_FSTNEEDTORECLAIM				+ "]";
	public static final String SELECT_ATTRIBUTE_FSTCUSTOMERDOCNUMBER					= "attribute[" + ATTRIBUTE_FSTCUSTOMERDOCNUMBER			+ "]";
	public static final String SELECT_ATTRIBUTE_FSTISDELIVERABLEDOCUMENT				= "attribute[" + ATTRIBUTE_FSTISDELIVERABLEDOCUMENT		+ "]";
	public static final String SELECT_ATTRIBUTE_FSTSECURITYCLASS						= "attribute[" + ATTRIBUTE_FSTSECURITYCLASS				+ "]";
	public static final String SELECT_ATTRIBUTE_FSTBASELINE					    		= "attribute[" + ATTRIBUTE_FSTBASELINE					+ "]";
	public static final String SELECT_ATTRIBUTE_FSTCONSERVATIONTERM			 			= "attribute[" + ATTRIBUTE_FSTCONSERVATIONTERM			+ "]";
	public static final String SELECT_ATTRIBUTE_FSTCONSERVATIONTERMDATE		 			= "attribute[" + ATTRIBUTE_FSTCONSERVATIONTERMDATE		+ "]";
	public static final String SELECT_ATTRIBUTE_FSTSTARTEFFECTIVITYDATE					= "attribute[" + ATTRIBUTE_FSTSTARTEFFECTIVITYDATE		+ "]";
	public static final String SELECT_ATTRIBUTE_FSTENDEFFECTIVITYDATE					= "attribute[" + ATTRIBUTE_FSTENDEFFECTIVITYDATE		+ "]";
	public static final String SELECT_ATTRIBUTE_FSTSTARTFACILITYUNITNUMBER				= "attribute[" + ATTRIBUTE_FSTSTARTFACILITYUNITNUMBER	+ "]";
	public static final String SELECT_ATTRIBUTE_FSTENDFACILITYUNITNUMBER				= "attribute[" + ATTRIBUTE_FSTENDFACILITYUNITNUMBER		+ "]";
	public static final String SELECT_ATTRIBUTE_FSTNAMESERIALNO							= "attribute[" + ATTRIBUTE_FSTNAMESERIALNO		+ "]";
	public static final String SELECT_ATTRIBUTE_FSTDRAWINGSIZE							= "attribute[" + ATTRIBUTE_FSTDRAWINGSIZE		+ "]";
	public static final String SELECT_ATTRIBUTE_FSTEQUIPMENTNUMBER						= "attribute[" + ATTRIBUTE_FSTEQUIPMENTNUMBER		+ "]";

	public static final String SELECT_ATTRIBUTE_FSTDRAWINGNO 							= "attribute[" + ATTRIBUTE_FSTDRAWINGNO 						+ "]";
	public static final String SELECT_ATTRIBUTE_FSTDRAWINGNOOFREV 						= "attribute[" + ATTRIBUTE_FSTDRAWINGNOOFREV 					+ "]";
	public static final String SELECT_ATTRIBUTE_FSTDRAWINGNOOFREVDATE 					= "attribute[" + ATTRIBUTE_FSTDRAWINGNOOFREVDATE 				+ "]";
	public static final String SELECT_ATTRIBUTE_FSTITEMSPECIFICATION 					= "attribute[" + ATTRIBUTE_FSTITEMSPECIFICATION 				+ "]";
	public static final String SELECT_ATTRIBUTE_FSTITEMFULLNAME 						= "attribute[" + ATTRIBUTE_FSTITEMFULLNAME 						+ "]";
	public static final String SELECT_ATTRIBUTE_FSTITEMNAME 							= "attribute[" + ATTRIBUTE_FSTITEMNAME 						+ "]";
	public static final String SELECT_ATTRIBUTE_FSTITEMENGNAME 							= "attribute[" + ATTRIBUTE_FSTITEMENGNAME 						+ "]";
	public static final String SELECT_ATTRIBUTE_FSTITEMACCOUNT 							= "attribute[" + ATTRIBUTE_FSTITEMACCOUNT 						+ "]";
	public static final String SELECT_ATTRIBUTE_FSTITEMTYPE 							= "attribute[" + ATTRIBUTE_FSTITEMTYPE 							+ "]";
	public static final String SELECT_ATTRIBUTE_FSTPROCURETYPE 							= "attribute[" + ATTRIBUTE_FSTPROCURETYPE 						+ "]";
	public static final String SELECT_ATTRIBUTE_FSTISEXCLUSIVEITEM 						= "attribute[" + ATTRIBUTE_FSTISEXCLUSIVEITEM 					+ "]";
	public static final String SELECT_ATTRIBUTE_FSTISSINGLESUPPLY 						= "attribute[" + ATTRIBUTE_FSTISSINGLESUPPLY 					+ "]";
	public static final String SELECT_ATTRIBUTE_FSTMANUFACTURINGSTRATEGY 				= "attribute[" + ATTRIBUTE_FSTMANUFACTURINGSTRATEGY 			+ "]";
	public static final String SELECT_ATTRIBUTE_FSTLOTSIZE 								= "attribute[" + ATTRIBUTE_FSTLOTSIZE 							+ "]";
	public static final String SELECT_ATTRIBUTE_FSTROUNDUPDATE 							= "attribute[" + ATTRIBUTE_FSTROUNDUPDATE 						+ "]";
	public static final String SELECT_ATTRIBUTE_FSTSEMIMANUFACTURESTOCKMETHOD 			= "attribute[" + ATTRIBUTE_FSTSEMIMANUFACTURESTOCKMETHOD 		+ "]";
	public static final String SELECT_ATTRIBUTE_FSTSTOCKSTORAGE 						= "attribute[" + ATTRIBUTE_FSTSTOCKSTORAGE 						+ "]";
	public static final String SELECT_ATTRIBUTE_FSTRELEASEMETHOD 						= "attribute[" + ATTRIBUTE_FSTRELEASEMETHOD 					+ "]";
	public static final String SELECT_ATTRIBUTE_FSTRELEASESTORAGE 						= "attribute[" + ATTRIBUTE_FSTRELEASESTORAGE 					+ "]";
	public static final String SELECT_ATTRIBUTE_FSTRELEASEUNIT	 						= "attribute[" + ATTRIBUTE_FSTRELEASEUNIT	 					+ "]";
	public static final String SELECT_ATTRIBUTE_FSTINVENTORYUNIT 						= "attribute[" + ATTRIBUTE_FSTINVENTORYUNIT 					+ "]";
	public static final String SELECT_ATTRIBUTE_FSTINVENTORYSURVEYPERIOD 				= "attribute[" + ATTRIBUTE_FSTINVENTORYSURVEYPERIOD 			+ "]";
	public static final String SELECT_ATTRIBUTE_FSTMANUFACTUREORDERUNIT 				= "attribute[" + ATTRIBUTE_FSTMANUFACTUREORDERUNIT 				+ "]";
	public static final String SELECT_ATTRIBUTE_FSTMANUFACTUREORDERLT 					= "attribute[" + ATTRIBUTE_FSTMANUFACTUREORDERLT 				+ "]";
	public static final String SELECT_ATTRIBUTE_FSTPURCHASEORDER 						= "attribute[" + ATTRIBUTE_FSTPURCHASEORDER 					+ "]";
	public static final String SELECT_ATTRIBUTE_FSTPURCHASEORDERLT 						= "attribute[" + ATTRIBUTE_FSTPURCHASEORDERLT 					+ "]";
	public static final String SELECT_ATTRIBUTE_FSTPURCHASEGROUP 						= "attribute[" + ATTRIBUTE_FSTPURCHASEGROUP 					+ "]";
	public static final String SELECT_ATTRIBUTE_FSTFINALINSPECT 						= "attribute[" + ATTRIBUTE_FSTFINALINSPECT 						+ "]";
	public static final String SELECT_ATTRIBUTE_FSTPROCESSINSPECT 						= "attribute[" + ATTRIBUTE_FSTPROCESSINSPECT 					+ "]";
	public static final String SELECT_ATTRIBUTE_FSTINCOMEINSPECT 						= "attribute[" + ATTRIBUTE_FSTINCOMEINSPECT 					+ "]";
	public static final String SELECT_ATTRIBUTE_FSTFORWARDINSPECT 						= "attribute[" + ATTRIBUTE_FSTFORWARDINSPECT 					+ "]";
	public static final String SELECT_ATTRIBUTE_FSTMILITARYDIVIDE 						= "attribute[" + ATTRIBUTE_FSTMILITARYDIVIDE 					+ "]";
	public static final String SELECT_ATTRIBUTE_FSTNATIONINVENTORYNO 					= "attribute[" + ATTRIBUTE_FSTNATIONINVENTORYNO 				+ "]";
	public static final String SELECT_ATTRIBUTE_FSTPARTMANAGENO 						= "attribute[" + ATTRIBUTE_FSTPARTMANAGENO 						+ "]";
	public static final String SELECT_ATTRIBUTE_FSTPRODUCTIONTYPE 						= "attribute[" + ATTRIBUTE_FSTPRODUCTIONTYPE 					+ "]";
	public static final String SELECT_ATTRIBUTE_FSTINTERGRATEDCOSTPARTTYPE 				= "attribute[" + ATTRIBUTE_FSTINTERGRATEDCOSTPARTTYPE 			+ "]";
	public static final String SELECT_ATTRIBUTE_FSTDEFENSEARTICLESAPPOINTYN 			= "attribute[" + ATTRIBUTE_FSTDEFENSEARTICLESAPPOINTYN 			+ "]";
	public static final String SELECT_ATTRIBUTE_FSTDEFENSEARTICLESAPPOINTBASED 			= "attribute[" + ATTRIBUTE_FSTDEFENSEARTICLESAPPOINTBASED 		+ "]";
	public static final String SELECT_ATTRIBUTE_FSTPURCHASECLASSIFICATION 				= "attribute[" + ATTRIBUTE_FSTPURCHASECLASSIFICATION 			+ "]";
	public static final String SELECT_ATTRIBUTE_FSTISPRESCRIPTION 						= "attribute[" + ATTRIBUTE_FSTISPRESCRIPTION 					+ "]";
	public static final String SELECT_ATTRIBUTE_FSTISESD 								= "attribute[" + ATTRIBUTE_FSTISESD 							+ "]";
	public static final String SELECT_ATTRIBUTE_FSTISMSL 								= "attribute[" + ATTRIBUTE_FSTISMSL 							+ "]";
	public static final String SELECT_ATTRIBUTE_FSTITEMSIGN 							= "attribute[" + ATTRIBUTE_FSTITEMSIGN 							+ "]";
	public static final String SELECT_ATTRIBUTE_FSTITEMIDENTIFICATIONCODE 				= "attribute[" + ATTRIBUTE_FSTITEMIDENTIFICATIONCODE 			+ "]";
	public static final String SELECT_ATTRIBUTE_FSTSTANDARDIZATIONTYPE 					= "attribute[" + ATTRIBUTE_FSTSTANDARDIZATIONTYPE 				+ "]";
	public static final String SELECT_ATTRIBUTE_FSTDEFENSEDRAWINGTYPE 					= "attribute[" + ATTRIBUTE_FSTDEFENSEDRAWINGTYPE 				+ "]";
	public static final String SELECT_ATTRIBUTE_FSTDEFENSEDRAWINGPARTNO 				= "attribute[" + ATTRIBUTE_FSTDEFENSEDRAWINGPARTNO 				+ "]";
	public static final String SELECT_ATTRIBUTE_FSTCONFIGURATIONIDENTIFICATIONOWNER 	= "attribute[" + ATTRIBUTE_FSTCONFIGURATIONIDENTIFICATIONOWNER 	+ "]";
	public static final String SELECT_ATTRIBUTE_FSTSTANDARDNO 							= "attribute[" + ATTRIBUTE_FSTSTANDARDNO 						+ "]";
	public static final String SELECT_ATTRIBUTE_FSTSTANDARDPARTNO 						= "attribute[" + ATTRIBUTE_FSTSTANDARDPARTNO 					+ "]";
	public static final String SELECT_ATTRIBUTE_FSTMANUFACTUREPARTNO 					= "attribute[" + ATTRIBUTE_FSTMANUFACTUREPARTNO 				+ "]";
	public static final String SELECT_ATTRIBUTE_FSTMANUFACTUREITEMNAME 					= "attribute[" + ATTRIBUTE_FSTMANUFACTUREITEMNAME 				+ "]";
	public static final String SELECT_ATTRIBUTE_FSTMANUFACTURETAXIDNO 					= "attribute[" + ATTRIBUTE_FSTMANUFACTURETAXIDNO 				+ "]";
	public static final String SELECT_ATTRIBUTE_FSTMANUFACTURECORPORATENAME 			= "attribute[" + ATTRIBUTE_FSTMANUFACTURECORPORATENAME 			+ "]";
	public static final String SELECT_ATTRIBUTE_FSTRAWMATERIALSYMBOL 					= "attribute[" + ATTRIBUTE_FSTRAWMATERIALSYMBOL 				+ "]";
	public static final String SELECT_ATTRIBUTE_FSTRAWMATERIALSTANDARD 					= "attribute[" + ATTRIBUTE_FSTRAWMATERIALSTANDARD 				+ "]";
	public static final String SELECT_ATTRIBUTE_FSTPRIMARYEQUIPMENT 					= "attribute[" + ATTRIBUTE_FSTPRIMARYEQUIPMENT 					+ "]";
	public static final String SELECT_ATTRIBUTE_FSTASSEMBLYNAME 						= "attribute[" + ATTRIBUTE_FSTASSEMBLYNAME 						+ "]";
	public static final String SELECT_ATTRIBUTE_FSTWEIGHT 								= "attribute[" + ATTRIBUTE_FSTWEIGHT 							+ "]";
	public static final String SELECT_ATTRIBUTE_FSTWEIGHTUNIT 							= "attribute[" + ATTRIBUTE_FSTWEIGHTUNIT 						+ "]";
	public static final String SELECT_ATTRIBUTE_FSTVOLUME 								= "attribute[" + ATTRIBUTE_FSTVOLUME 							+ "]";
	public static final String SELECT_ATTRIBUTE_FSTVOLUMEUNIT 							= "attribute[" + ATTRIBUTE_FSTVOLUMEUNIT 						+ "]";
	public static final String SELECT_ATTRIBUTE_FSTMATERIALTYPE 						= "attribute[" + ATTRIBUTE_FSTMATERIALTYPE 						+ "]";
	public static final String SELECT_ATTRIBUTE_FSTUNIT 								= "attribute[" + ATTRIBUTE_FSTUNIT 								+ "]";
	public static final String SELECT_ATTRIBUTE_FSTISPHANTOM 							= "attribute[" + ATTRIBUTE_FSTISPHANTOM 						+ "]";
	public static final String SELECT_ATTRIBUTE_FSTISUNITOFFACILITIES 					= "attribute[" + ATTRIBUTE_FSTISUNITOFFACILITIES 				+ "]";
	public static final String SELECT_ATTRIBUTE_FSTFACILITYUNITNUMBER 					= "attribute[" + ATTRIBUTE_FSTFACILITYUNITNUMBER 				+ "]";

	public static final String SELECT_ATTRIBUTE_PARTFAMILYPREFIXPATTERN 					= "attribute[" + ATTRIBUTE_PARTFAMILYPREFIXPATTERN 				+ "]";
	public static final String SELECT_ATTRIBUTE_FSTSTANDARDITEMCODE 					= "attribute[" + ATTRIBUTE_FSTSTANDARDITEMCODE 				+ "]";
	public static final String SELECT_ATTRIBUTE_FSTDOCUMENTRECEIPTNUMBER			= "attribute[" + ATTRIBUTE_FSTDOCUMENTRECEIPTNUMBER 				+ "]";

	public static final String ATTRIBUTE_FSTMANUFACTURERPARTNUMBAR				= "fstManufacturerPartNumbar";
	public static final String ATTRIBUTE_FSTMANUFACTURER 							= "fstManufacturer";
	public static final String SELECT_ATTRIBUTE_FSTMANUFACTURERPARTNUMBAR		= "attribute[" + ATTRIBUTE_FSTMANUFACTURERPARTNUMBAR 	+ "]";
	public static final String SELECT_ATTRIBUTE_FSTMANUFACTURER 					= "attribute[" + ATTRIBUTE_FSTMANUFACTURER 				+ "]";

	public static final String ATTRIBUTE_FSTEBOMQTY 								= "fstEBOMQty";
	public static final String SELECT_ATTRIBUTE_FSTEBOMQTY							= "attribute[" + ATTRIBUTE_FSTEBOMQTY 	+ "]";
	public static final String ATTRIBUTE_QUANTITY 									= "Quantity";
	public static final String SELECT_ATTRIBUTE_QUANTITY							= "attribute[" + ATTRIBUTE_QUANTITY 	+ "]";
	public static final String ATTRIBUTE_FSTPARENTQTY 								= "fstParentQty";
	public static final String SELECT_ATTRIBUTE_FSTPARENTQTY						= "attribute[" + ATTRIBUTE_FSTPARENTQTY 	+ "]";
	public static final String ATTRIBUTE_FSTSETQTY 									= "fstSetQty";
	public static final String SELECT_ATTRIBUTE_FSTSETQTY							= "attribute[" + ATTRIBUTE_FSTSETQTY 	+ "]";

	public static final String ATTRIBUTE_FSTDOCUMENTFAMILYCODE 					= "fstDocumentFamilyCode";
	public static final String SELECT_ATTRIBUTE_FSTDOCUMENTFAMILYCODE		= "attribute[" + ATTRIBUTE_FSTDOCUMENTFAMILYCODE  + "]";

	public static final String ENOVIA_PARENT        = "PARENT";
}
