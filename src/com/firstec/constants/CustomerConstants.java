package com.firstec.constants;

import com.matrixone.apps.domain.DomainConstants;
import com.matrixone.apps.domain.util.PropertyUtil;

public class CustomerConstants implements DomainConstants{
	
	/** A string constant with the value "&&" . */
    public static final String SYMB_AND = " && ";
    /** A string constant with the value "||". */
    public static final String SYMB_OR = " || ";
    /** A string constant with the value "==". */
    public static final String SYMB_EQUAL = " == ";
    /** A string constant with the value "!". */
    public static final String SYMB_NOT = "!";
    /** A string constant with the value "!=". */
    public static final String SYMB_NOT_EQUAL = " != ";
    /** A string constant with the value ">". */
    public static final String SYMB_GREATER_THAN = " > ";
    /** A string constant with the value "<". */
    public static final String SYMB_LESS_THAN = " < ";
    /** A string constant with the value ">=". */
    public static final String SYMB_GREATER_THAN_EQUAL = " >= ";
    /** A string constant with the value "<=". */
    public static final String SYMB_LESS_THAN_EQUAL = " <= ";
    /** A string constant with the value "~~". */
    public static final String SYMB_MATCH = " ~~ ";
    /** A string constant with the value "!~~". */
    public static final String SYMB_NOMATCH = " !~~ ";
    /** A string constant with the value "\"". */
    public static final String SYMB_DOUBLE_QUOTE = "\"";
    /** A string constant with the value "'". */
    public static final String SYMB_QUOTE = "'";
    /** A string constant with the value "*". */
    public static final String SYMB_WILD = "*";
    /** A string constant with the value "(". */
    public static final String SYMB_OPEN_PARAN = "(";
    /** A string constant with the value ")". */
    public static final String SYMB_CLOSE_PARAN = ")";
    /** A string constant with the value "~~". */
    public final static String SYMB_LIKE = " ~~ ";
    /** A string constant with the value "!~~". */
	public final static String SYMB_NOT_LIKE = " !~~ ";
    /** A string constant with the value "*". */
	public final static String SYMB_WHILD_CHAR = " * ";
	
	/** A string constant with the value PLM. */
    public static final String PLM = "PLM";
	    
    /*
     * Basic Constants
     */
    public static final String VAULT_ESERVIC_PRODUCTION  = PropertyUtil.getSchemaProperty("vault_eServiceProduction");

    /*
     * Type Constants
     */
    public static final String TYPE_FST_CUSTOMER           		= PropertyUtil.getSchemaProperty("type_fstCustomer");
    public static final String TYPE_FST_VENDOR             		= PropertyUtil.getSchemaProperty("type_fstVendor");
    public static final String TYPE_FST_ENGINEERINGCOMPANY 		= PropertyUtil.getSchemaProperty("type_fstEngineeringCompany");
    public static final String TYPE_FST_MANUFACTURER       		= PropertyUtil.getSchemaProperty("type_fstManufacturer");
    public static final String TYPE_FST_DESIGNCOMPANY      		= PropertyUtil.getSchemaProperty("type_fstDesignCompany");
    public static final String TYPE_FST_QMCOMPANY          		= PropertyUtil.getSchemaProperty("type_fstQMCompany");
    public static final String TYPE_FST_OUTSOURCINGCOMPANY 		= PropertyUtil.getSchemaProperty("type_fstOutsourcingCompany");
    public static final String TYPE_FST_CODE_MASTER        		= PropertyUtil.getSchemaProperty("type_fstCodeMaster");
    public static final String TYPE_FST_CODE_DETAIL        		= PropertyUtil.getSchemaProperty("type_fstCodeDetail");
    public static final String TYPE_FST_APPROVALLINE        	= PropertyUtil.getSchemaProperty("type_fstApprovalLine");
    public static final String TYPE_FST_APPROVALMANAGEMENT      = PropertyUtil.getSchemaProperty("type_fstApprovalManagement");
    public static final String TYPE_FST_PRODUCTINGSCHEDULE      = PropertyUtil.getSchemaProperty("type_fstProductingSchedule");
    public static final String TYPE_FST_PARTNERFIRMSMANAGEMENT  = PropertyUtil.getSchemaProperty("type_fstPartnerFirmsManagement");
    public static final String TYPE_FST_USERPROJECT        		= PropertyUtil.getSchemaProperty("type_fstUserProject");
    
    /*
     * Policy Constants
     */
    //public static final String POLICY_FST_SMBMATERIALCODEPOLICY  = PropertyUtil.getSchemaProperty("policy_fstSMBMaterialCodePolicy");
    public static final String POLICY_FST_APPROVALMANAGEMENT  		= PropertyUtil.getSchemaProperty("policy_fstApprovalManagement");
    public static final String POLICY_FST_PRODUCTINGSCHEDULE  		= PropertyUtil.getSchemaProperty("policy_fstProductingSchedule");
    public static final String POLICY_FST_STANDARDCODEMGMTPOLICY  	= PropertyUtil.getSchemaProperty("policy_fstStandardCodeMgmtPolicy");
    
    /*
     * State Constants
     */
	//public static final String STATE_SMBMATERIALCODEPOLICY_CREATE = PropertyUtil
	//		.getSchemaProperty("policy", POLICY_FST_SMBMATERIALCODEPOLICY, "state_Create");
	//public static final String STATE_SMBMATERIALCODEPOLICY_ACTIVATE= PropertyUtil
	//		.getSchemaProperty("policy", POLICY_FST_SMBMATERIALCODEPOLICY, "state_Activate");
	//public static final String STATE_SMBMATERIALCODEPOLICY_INACTIVATE = PropertyUtil
	//		.getSchemaProperty("policy", POLICY_FST_SMBMATERIALCODEPOLICY, "state_Inactivate");
	
    /*
     * Relationship Constants
     */
	public static final String RELATIONSHIP_FST_CUSTOMER           			  = PropertyUtil.getSchemaProperty("relationship_fstCustomer");
    public static final String RELATIONSHIP_FST_VENDOR             			  = PropertyUtil.getSchemaProperty("relationship_fstVendor");
    public static final String RELATIONSHIP_FST_ENGINEERINGCOMPANY 			  = PropertyUtil.getSchemaProperty("relationship_fstEngineeringCompany");
    public static final String RELATIONSHIP_FST_MANUFACTURER       			  = PropertyUtil.getSchemaProperty("relationship_fstManufacturer");
    public static final String RELATIONSHIP_FST_DESIGNCOMPANY      			  = PropertyUtil.getSchemaProperty("relationship_fstDesignCompany");
    public static final String RELATIONSHIP_FST_QMCOMPANY          		  	  = PropertyUtil.getSchemaProperty("relationship_fstQMCompany");
    public static final String RELATIONSHIP_FST_OUTSOURCINGCOMPANY 			  = PropertyUtil.getSchemaProperty("relationship_fstOutsourcingCompany");
    public static final String RELATIONSHIP_FST_CODEMASTERDETAIL   			  = PropertyUtil.getSchemaProperty("relationship_fstCodeMasterDetail");
    public static final String RELATIONSHIP_FST_APPROVALLINE_TO_ROUTETEMPLETE = PropertyUtil.getSchemaProperty("relationship_fstApprovalLineToRouteTemplate");
    public static final String RELATIONSHIP_FST_PERSONINCHARGE    			  = PropertyUtil.getSchemaProperty("relationship_fstPersonInCharge");
    public static final String RELATIONSHIP_FST_PARTNERFIRMSMANAGEMENT    	  = PropertyUtil.getSchemaProperty("relationship_fstPartnerFirmsManagement");
    public static final String RELATIONSHIP_FST_USERPROJECT        			  = PropertyUtil.getSchemaProperty("relationship_fstUserProject");
    
    /*
     * Attribute Constants
     */
    public static final String ATTRIBUTE_ORGANIZATION_ID            = PropertyUtil.getSchemaProperty("attribute_OrganizationID");
    public static final String ATTRIBUTE_ORGANIZATION_NAME          = PropertyUtil.getSchemaProperty("attribute_OrganizationName");
    public static final String ATTRIBUTE_COUNTRY                    = PropertyUtil.getSchemaProperty("attribute_Country");
    public static final String ATTRIBUTE_ORGANIZATION_PHONE_NUMBER  = PropertyUtil.getSchemaProperty("attribute_OrganizationPhoneNumber");
    public static final String ATTRIBUTE_ORGANIZATION_FAX_NUMBER    = PropertyUtil.getSchemaProperty("attribute_OrganizationFaxNumber");
    public static final String ATTRIBUTE_FST_WEB_SITE               = PropertyUtil.getSchemaProperty("attribute_WebSite");
    public static final String ATTRIBUTE_FST_PERSONINCHARGE         = PropertyUtil.getSchemaProperty("attribute_fstPersonInCharge");
    public static final String ATTRIBUTE_FST_EMAIL                  = PropertyUtil.getSchemaProperty("attribute_fstEmail");
    public static final String ATTRIBUTE_FST_FULLNAME               = PropertyUtil.getSchemaProperty("attribute_fstFullName");
    public static final String ATTRIBUTE_FST_ISSPOOLMANUFACTUREYN 	= PropertyUtil.getSchemaProperty("attribute_fstIsSpoolManufactureYN");
    public static final String ATTRIBUTE_FST_ISSPOOLPAINTINGYN    	= PropertyUtil.getSchemaProperty("attribute_fstIsSpoolPaintingYN");
    public static final String ATTRIBUTE_FST_ISSPOOLPLATINGYN     	= PropertyUtil.getSchemaProperty("attribute_fstIsSpoolPlatingYN");
    public static final String ATTRIBUTE_FST_CODE_NAME			  	= PropertyUtil.getSchemaProperty("attribute_fstCodeName");
    public static final String ATTRIBUTE_FST_CODE_ITEM1			  	= PropertyUtil.getSchemaProperty("attribute_fstCodeItem1");
    public static final String ATTRIBUTE_FST_CODE_ITEM2			  	= PropertyUtil.getSchemaProperty("attribute_fstCodeItem2");
    public static final String ATTRIBUTE_FST_CODE_ITEM3			  	= PropertyUtil.getSchemaProperty("attribute_fstCodeItem3");
    public static final String ATTRIBUTE_FST_CODE_ITEM4			  	= PropertyUtil.getSchemaProperty("attribute_fstCodeItem4");
    public static final String ATTRIBUTE_FST_CODE_ITEM5			  	= PropertyUtil.getSchemaProperty("attribute_fstCodeItem5");
    public static final String ATTRIBUTE_FST_CODE_ITEM6			  	= PropertyUtil.getSchemaProperty("attribute_fstCodeItem6");
    public static final String ATTRIBUTE_FST_CODE_ITEM7			  	= PropertyUtil.getSchemaProperty("attribute_fstCodeItem7");
    public static final String ATTRIBUTE_FST_CODE_ITEM8			    = PropertyUtil.getSchemaProperty("attribute_fstCodeItem8");
    public static final String ATTRIBUTE_FST_CODE_ITEM9			    = PropertyUtil.getSchemaProperty("attribute_fstCodeItem9");
    public static final String ATTRIBUTE_FST_CODE_ITEM10		    = PropertyUtil.getSchemaProperty("attribute_fstCodeItem10");
    public static final String ATTRIBUTE_FST_CODE_ITEM11		    = PropertyUtil.getSchemaProperty("attribute_fstCodeItem11");
    public static final String ATTRIBUTE_FST_CODE_REMARK		    = PropertyUtil.getSchemaProperty("attribute_fstCodeRemark");
    public static final String ATTRIBUTE_FST_REPRESENTATIVE_PROJECT = PropertyUtil.getSchemaProperty("attribute_fstRepresentativeProject");
    public static final String ATTRIBUTE_FST_DEPARTMENT_GROUP       = PropertyUtil.getSchemaProperty("attribute_fstDepartmentGroup");
    public static final String ATTRIBUTE_FST_ENGNAME                = PropertyUtil.getSchemaProperty("attribute_fstEngName");
    public static final String ATTRIBUTE_FST_TITLECODE 				= PropertyUtil.getSchemaProperty("attribute_fstTitleCode");
    public static final String ATTRIBUTE_FST_RESPONSIBILITY 		= PropertyUtil.getSchemaProperty("attribute_fstResponsibility");
    public static final String ATTRIBUTE_FST_RESPONSIBILITY_CODE	= PropertyUtil.getSchemaProperty("attribute_fstResponsibilityCode");
    public static final String ATTRIBUTE_FST_WORKPLACE				= PropertyUtil.getSchemaProperty("attribute_fstWorkplace");
    public static final String ATTRIBUTE_FST_WORKPLACE_CODE			= PropertyUtil.getSchemaProperty("attribute_fstWorkplaceCode");
    public static final String ATTRIBUTE_FST_JOB_PROMOTION_DATE     = PropertyUtil.getSchemaProperty("attribute_fstJobPromotionDate");
    public static final String ATTRIBUTE_FST_COMPANY_CLASSIFICATION = PropertyUtil.getSchemaProperty("attribute_fstCompanyClassification");
    
    public static final String ATTRIBUTE_FST_APPROVALTYPE 			= PropertyUtil.getSchemaProperty("attribute_fstApprovalType");
    public static final String ATTRIBUTE_FST_APPROVALSTATES 		= PropertyUtil.getSchemaProperty("attribute_fstApprovalStates");
    public static final String ATTRIBUTE_FST_APPROVALROUTEACTION 	= PropertyUtil.getSchemaProperty("attribute_fstApprovalRouteAction");
    public static final String ATTRIBUTE_FST_APPROVALAUTOSTART 		= PropertyUtil.getSchemaProperty("attribute_fstApprovalAutoStart");
    public static final String ATTRIBUTE_FST_APPROVALPARALLEL 		= PropertyUtil.getSchemaProperty("attribute_fstApprovalParallel");
    public static final String ATTRIBUTE_FST_APPROVALREQURIRED 		= PropertyUtil.getSchemaProperty("attribute_fstApprovalRequrired");
    public static final String ATTRIBUTE_FST_APPROVALUSE 			= PropertyUtil.getSchemaProperty("attribute_fstApprovalUse");
    public static final String ATTRIBUTE_FST_DEFAULTAPPROVAL 		= PropertyUtil.getSchemaProperty("attribute_fstDefaultApproval");
    public static final String ATTRIBUTE_FST_PREAPPROVAL 			= PropertyUtil.getSchemaProperty("attribute_fstPreapproval");
    public static final String ATTRIBUTE_FST_SELFAPPROVER 			= PropertyUtil.getSchemaProperty("attribute_fstSelfApprover");
    
    public static final String ATTRIBUTE_FST_CONSTRUCTIONCODE 		= PropertyUtil.getSchemaProperty("attribute_fstConstructionCode");
    public static final String ATTRIBUTE_FST_PRODUCTINGSCHEDULEREV 	= PropertyUtil.getSchemaProperty("attribute_fstProductingScheduleRev");
    public static final String ATTRIBUTE_FST_PRODUCTINGSCHEDULECODE = PropertyUtil.getSchemaProperty("attribute_fstProductingScheduleCode");
    public static final String ATTRIBUTE_FST_PRODUCTINGSCHEDULENAME = PropertyUtil.getSchemaProperty("attribute_fstProductingScheduleName");
    public static final String ATTRIBUTE_FST_DURATION 				= PropertyUtil.getSchemaProperty("attribute_fstDuration");
    public static final String ATTRIBUTE_FST_PLANSTARTDATE 			= PropertyUtil.getSchemaProperty("attribute_fstPlanStartDate");
    public static final String ATTRIBUTE_FST_PLANFINISHDATE 		= PropertyUtil.getSchemaProperty("attribute_fstPlanFinishDate");
    public static final String ATTRIBUTE_FST_FORECASTINGSTARTDATE 	= PropertyUtil.getSchemaProperty("attribute_fstForecastingStartDate");
    public static final String ATTRIBUTE_FST_FORECASTINGFINISHDATE 	= PropertyUtil.getSchemaProperty("attribute_fstForecastingFinishDate");
    public static final String ATTRIBUTE_FST_DISCIPLINE 			= PropertyUtil.getSchemaProperty("attribute_fstDiscipline");
    public static final String ATTRIBUTE_FST_WF 					= PropertyUtil.getSchemaProperty("attribute_fstWF");
    public static final String ATTRIBUTE_FST_CONSTRUCTIONITEMCODE 	= PropertyUtil.getSchemaProperty("attribute_fstConstructionItemCode");
    public static final String ATTRIBUTE_FST_MODULE 				= PropertyUtil.getSchemaProperty("attribute_fstModule");
    public static final String ATTRIBUTE_FST_LEVEL 					= PropertyUtil.getSchemaProperty("attribute_fstLevel");
    public static final String ATTRIBUTE_FST_BLOCK 					= PropertyUtil.getSchemaProperty("attribute_fstBlock");
    public static final String ATTRIBUTE_FST_WORKDEPT 				= PropertyUtil.getSchemaProperty("attribute_fstWorkDept");
    public static final String ATTRIBUTE_FST_ACTUALSTARTDATE 		= PropertyUtil.getSchemaProperty("attribute_fstActualStartDate");
    public static final String ATTRIBUTE_FST_ACTUALFINISHDATE 		= PropertyUtil.getSchemaProperty("attribute_fstActualFinishDate");
    public static final String ATTRIBUTE_FST_ACTUALPC 				= PropertyUtil.getSchemaProperty("attribute_fstActualPC");
    public static final String ATTRIBUTE_FST_STATUS 				= PropertyUtil.getSchemaProperty("attribute_fstStatus");
    public static final String ATTRIBUTE_FST_IFTARGETYN 			= PropertyUtil.getSchemaProperty("attribute_fstIFTargetYN");
    public static final String ATTRIBUTE_FST_CODEUSEYN 				= PropertyUtil.getSchemaProperty("attribute_fstCodeUseYN");
    public static final String ATTRIBUTE_FST_CODESTATE 				= PropertyUtil.getSchemaProperty("attribute_fstCodeState");
    public static final String ATTRIBUTE_FST_CODEMANAGEMENTSYSTEM 	= PropertyUtil.getSchemaProperty("attribute_fstCodeManagementSystem");
    public static final String ATTRIBUTE_FST_ISCOMPANY 				= PropertyUtil.getSchemaProperty("attribute_fstIsCompany");
    public static final String ATTRIBUTE_FST_ISVENDOR 				= PropertyUtil.getSchemaProperty("attribute_fstIsVendor");
    public static final String ATTRIBUTE_FST_ISENGINEERINGCOMPANY 	= PropertyUtil.getSchemaProperty("attribute_fstIsEngineeringCompany");
    public static final String ATTRIBUTE_FST_ISDESIGNPARTNERFIRMS 	= PropertyUtil.getSchemaProperty("attribute_fstIsDesignPartnerFirms");
    public static final String ATTRIBUTE_FST_ISQMPARTNERFIRMS 		= PropertyUtil.getSchemaProperty("attribute_fstIsQMPartnerFirms");
    public static final String ATTRIBUTE_FST_ISINSIDEPARTNERFIRMS 	= PropertyUtil.getSchemaProperty("attribute_fstIsInsidePartnerFirms");
    public static final String ATTRIBUTE_FST_ISOUTSIDEPARTNERFIRMS 	= PropertyUtil.getSchemaProperty("attribute_fstIsOutsidePartnerFirms");
    public static final String ATTRIBUTE_FST_ISCLASS 				= PropertyUtil.getSchemaProperty("attribute_fstIsClass");
    public static final String ATTRIBUTE_FST_ISMATERIALVENDOR 		= PropertyUtil.getSchemaProperty("attribute_fstIsMaterialVendor");
    public static final String ATTRIBUTE_FST_BSNSCODE 				= PropertyUtil.getSchemaProperty("attribute_fstBSNSCode");
    public static final String ATTRIBUTE_FST_PARTCODE 				= PropertyUtil.getSchemaProperty("attribute_fstPartCode");
    public static final String ATTRIBUTE_FST_DEPARTMENTCODE 		= PropertyUtil.getSchemaProperty("attribute_fstDepartmentCode");
    public static final String ATTRIBUTE_FST_PARENTCLASSCODE 		= PropertyUtil.getSchemaProperty("attribute_fstParentClassCode");
    public static final String ATTRIBUTE_FST_CLASSCODE 				= PropertyUtil.getSchemaProperty("attribute_fstClassCode");
    public static final String ATTRIBUTE_FST_ISUNITOFFACILITIES 	= PropertyUtil.getSchemaProperty("attribute_fstIsUnitOfFacilities");
    
    public static final String SELECT_ATTRIBUTE_ORGANIZATION_ID            	= "attribute[" + ATTRIBUTE_ORGANIZATION_ID + "]";
    public static final String SELECT_ATTRIBUTE_ORGANIZATION_NAME          	= "attribute[" + ATTRIBUTE_ORGANIZATION_NAME + "]";
    public static final String SELECT_ATTRIBUTE_COUNTRY                    	= "attribute[" + ATTRIBUTE_COUNTRY + "]";
    public static final String SELECT_ATTRIBUTE_ORGANIZATION_PHONE_NUMBER  	= "attribute[" + ATTRIBUTE_ORGANIZATION_PHONE_NUMBER + "]";
    public static final String SELECT_ATTRIBUTE_ORGANIZATION_FAX_NUMBER    	= "attribute[" + ATTRIBUTE_ORGANIZATION_FAX_NUMBER + "]";
    public static final String SELECT_ATTRIBUTE_FST_WEB_SITE               	= "attribute[" + ATTRIBUTE_FST_WEB_SITE + "]";
    public static final String SELECT_ATTRIBUTE_FST_PERSONINCHARGE         	= "attribute[" + ATTRIBUTE_FST_PERSONINCHARGE + "]";
    public static final String SELECT_ATTRIBUTE_FST_EMAIL                  	= "attribute[" + ATTRIBUTE_FST_EMAIL + "]";
    public static final String SELECT_ATTRIBUTE_FST_FULLNAME               	= "attribute[" + ATTRIBUTE_FST_FULLNAME + "]";
    public static final String SELECT_ATTRIBUTE_FST_ISSPOOLMANUFACTUREYN   	= "attribute[" + ATTRIBUTE_FST_ISSPOOLMANUFACTUREYN + "]";
    public static final String SELECT_ATTRIBUTE_FST_ISSPOOLPAINTINGYN      	= "attribute[" + ATTRIBUTE_FST_ISSPOOLPAINTINGYN + "]";
    public static final String SELECT_ATTRIBUTE_FST_ISSPOOLPLATINGYN       	= "attribute[" + ATTRIBUTE_FST_ISSPOOLPLATINGYN + "]";
    public static final String SELECT_ATTRIBUTE_FST_CODE_NAME		       	= "attribute[" + ATTRIBUTE_FST_CODE_NAME + "]";
    public static final String SELECT_ATTRIBUTE_FST_CODE_ITEM1			   	= "attribute[" + ATTRIBUTE_FST_CODE_ITEM1 + "]";
    public static final String SELECT_ATTRIBUTE_FST_CODE_ITEM2			   	= "attribute[" + ATTRIBUTE_FST_CODE_ITEM2 + "]";
    public static final String SELECT_ATTRIBUTE_FST_CODE_ITEM3			   	= "attribute[" + ATTRIBUTE_FST_CODE_ITEM3 + "]";
    public static final String SELECT_ATTRIBUTE_FST_CODE_ITEM4			   	= "attribute[" + ATTRIBUTE_FST_CODE_ITEM4 + "]";
    public static final String SELECT_ATTRIBUTE_FST_CODE_ITEM5			   	= "attribute[" + ATTRIBUTE_FST_CODE_ITEM5 + "]";
    public static final String SELECT_ATTRIBUTE_FST_CODE_ITEM6			   	= "attribute[" + ATTRIBUTE_FST_CODE_ITEM6 + "]";
    public static final String SELECT_ATTRIBUTE_FST_CODE_ITEM7			   	= "attribute[" + ATTRIBUTE_FST_CODE_ITEM7 + "]";
    public static final String SELECT_ATTRIBUTE_FST_CODE_ITEM8			   	= "attribute[" + ATTRIBUTE_FST_CODE_ITEM8 + "]";
    public static final String SELECT_ATTRIBUTE_FST_CODE_ITEM9			   	= "attribute[" + ATTRIBUTE_FST_CODE_ITEM9 + "]";
    public static final String SELECT_ATTRIBUTE_FST_CODE_ITEM10			   	= "attribute[" + ATTRIBUTE_FST_CODE_ITEM10 + "]";
    public static final String SELECT_ATTRIBUTE_FST_CODE_ITEM11			   	= "attribute[" + ATTRIBUTE_FST_CODE_ITEM11 + "]";
    public static final String SELECT_ATTRIBUTE_FST_CODE_REMARK			   	= "attribute[" + ATTRIBUTE_FST_CODE_REMARK + "]";
    public static final String SELECT_ATTRIBUTE_TITLE			           	= "attribute[" + ATTRIBUTE_TITLE + "]";
    public static final String SELECT_ATTRIBUTE_FST_REPRESENTATIVE_PROJECT 	= "attribute[" + ATTRIBUTE_FST_REPRESENTATIVE_PROJECT + "]";
    public static final String SELECT_ATTRIBUTE_FST_DEPARTMENT_GROUP       	= "attribute[" + ATTRIBUTE_FST_DEPARTMENT_GROUP + "]";
    public static final String SELECT_ATTRIBUTE_FST_ENGNAME  	           	= "attribute[" + ATTRIBUTE_FST_ENGNAME + "]";
    public static final String SELECT_ATTRIBUTE_FST_TITLECODE              	= "attribute[" + ATTRIBUTE_FST_TITLECODE + "]";
    public static final String SELECT_ATTRIBUTE_FST_RESPONSIBILITY         	= "attribute[" + ATTRIBUTE_FST_RESPONSIBILITY + "]";
    public static final String SELECT_ATTRIBUTE_FST_RESPONSIBILITY_CODE    	= "attribute[" + ATTRIBUTE_FST_RESPONSIBILITY_CODE + "]";
    public static final String SELECT_ATTRIBUTE_FST_WORKPLACE	           	= "attribute[" + ATTRIBUTE_FST_WORKPLACE + "]";
    public static final String SELECT_ATTRIBUTE_FST_WORKPLACE_CODE         	= "attribute[" + ATTRIBUTE_FST_WORKPLACE_CODE + "]";
    public static final String SELECT_ATTRIBUTE_FST_JOB_PROMOTION_DATE     	= "attribute[" + ATTRIBUTE_FST_JOB_PROMOTION_DATE + "]";
    public static final String SELECT_ATTRIBUTE_FST_COMPANY_CLASSIFICATION 	= "attribute[" + ATTRIBUTE_FST_COMPANY_CLASSIFICATION + "]";
    
    public static final String SELECT_ATTRIBUTE_FST_APPROVALTYPE 			= "attribute[" + ATTRIBUTE_FST_APPROVALTYPE + "]";
    public static final String SELECT_ATTRIBUTE_FST_APPROVALSTATES 			= "attribute[" + ATTRIBUTE_FST_APPROVALSTATES + "]";
    public static final String SELECT_ATTRIBUTE_FST_APPROVALROUTEACTION 	= "attribute[" + ATTRIBUTE_FST_APPROVALROUTEACTION + "]";
    public static final String SELECT_ATTRIBUTE_FST_APPROVALAUTOSTART 		= "attribute[" + ATTRIBUTE_FST_APPROVALAUTOSTART + "]";
    public static final String SELECT_ATTRIBUTE_FST_APPROVALPARALLEL 		= "attribute[" + ATTRIBUTE_FST_APPROVALPARALLEL + "]";
    public static final String SELECT_ATTRIBUTE_FST_APPROVALREQURIRED 		= "attribute[" + ATTRIBUTE_FST_APPROVALREQURIRED + "]";
    public static final String SELECT_ATTRIBUTE_FST_APPROVALUSE 			= "attribute[" + ATTRIBUTE_FST_APPROVALUSE + "]";
    public static final String SELECT_ATTRIBUTE_FST_DEFAULTAPPROVAL 		= "attribute[" + ATTRIBUTE_FST_DEFAULTAPPROVAL + "]";
    public static final String SELECT_ATTRIBUTE_FST_PREAPPROVAL 			= "attribute[" + ATTRIBUTE_FST_PREAPPROVAL + "]";
    public static final String SELECT_ATTRIBUTE_FST_SELFAPPROVER 			= "attribute[" + ATTRIBUTE_FST_SELFAPPROVER + "]";
    
    public static final String SELECT_ATTRIBUTE_FST_CONSTRUCTIONCODE 		= "attribute[" + ATTRIBUTE_FST_CONSTRUCTIONCODE + "]";
    public static final String SELECT_ATTRIBUTE_FST_PRODUCTINGSCHEDULEREV 	= "attribute[" + ATTRIBUTE_FST_PRODUCTINGSCHEDULEREV + "]";
    public static final String SELECT_ATTRIBUTE_FST_PRODUCTINGSCHEDULECODE 	= "attribute[" + ATTRIBUTE_FST_PRODUCTINGSCHEDULECODE + "]";
    public static final String SELECT_ATTRIBUTE_FST_PRODUCTINGSCHEDULENAME 	= "attribute[" + ATTRIBUTE_FST_PRODUCTINGSCHEDULENAME + "]";
    public static final String SELECT_ATTRIBUTE_FST_DURATION 				= "attribute[" + ATTRIBUTE_FST_DURATION + "]";
    public static final String SELECT_ATTRIBUTE_FST_PLANSTARTDATE 			= "attribute[" + ATTRIBUTE_FST_PLANSTARTDATE + "]";
    public static final String SELECT_ATTRIBUTE_FST_PLANFINISHDATE 			= "attribute[" + ATTRIBUTE_FST_PLANFINISHDATE + "]";
    public static final String SELECT_ATTRIBUTE_FST_FORECASTINGSTARTDATE 	= "attribute[" + ATTRIBUTE_FST_FORECASTINGSTARTDATE + "]";
    public static final String SELECT_ATTRIBUTE_FST_FORECASTINGFINISHDATE 	= "attribute[" + ATTRIBUTE_FST_FORECASTINGFINISHDATE + "]";
    public static final String SELECT_ATTRIBUTE_FST_DISCIPLINE 				= "attribute[" + ATTRIBUTE_FST_DISCIPLINE + "]";
    public static final String SELECT_ATTRIBUTE_FST_WF 						= "attribute[" + ATTRIBUTE_FST_WF + "]";
    public static final String SELECT_ATTRIBUTE_FST_CONSTRUCTIONITEMCODE 	= "attribute[" + ATTRIBUTE_FST_CONSTRUCTIONITEMCODE + "]";
    public static final String SELECT_ATTRIBUTE_FST_MODULE 					= "attribute[" + ATTRIBUTE_FST_MODULE + "]";
    public static final String SELECT_ATTRIBUTE_FST_LEVEL 					= "attribute[" + ATTRIBUTE_FST_LEVEL + "]";
    public static final String SELECT_ATTRIBUTE_FST_BLOCK 					= "attribute[" + ATTRIBUTE_FST_BLOCK + "]";
    public static final String SELECT_ATTRIBUTE_FST_WORKDEPT 				= "attribute[" + ATTRIBUTE_FST_WORKDEPT + "]";
    public static final String SELECT_ATTRIBUTE_FST_ACTUALSTARTDATE 		= "attribute[" + ATTRIBUTE_FST_ACTUALSTARTDATE + "]";
    public static final String SELECT_ATTRIBUTE_FST_ACTUALFINISHDATE 		= "attribute[" + ATTRIBUTE_FST_ACTUALFINISHDATE + "]";
    public static final String SELECT_ATTRIBUTE_FST_ACTUALPC 				= "attribute[" + ATTRIBUTE_FST_ACTUALPC + "]";
    public static final String SELECT_ATTRIBUTE_FST_STATUS 					= "attribute[" + ATTRIBUTE_FST_STATUS + "]";
    public static final String SELECT_ATTRIBUTE_FST_IFTARGETYN 				= "attribute[" + ATTRIBUTE_FST_IFTARGETYN + "]";
    public static final String SELECT_ATTRIBUTE_FST_CODEUSEYN 				= "attribute[" + ATTRIBUTE_FST_CODEUSEYN + "]";
    public static final String SELECT_ATTRIBUTE_FST_CODESTATE 				= "attribute[" + ATTRIBUTE_FST_CODESTATE + "]";
    public static final String SELECT_ATTRIBUTE_FST_CODEMANAGEMENTSYSTEM 	= "attribute[" + ATTRIBUTE_FST_CODEMANAGEMENTSYSTEM + "]";
    public static final String SELECT_ATTRIBUTE_FST_ISCOMPANY 				= "attribute[" + ATTRIBUTE_FST_ISCOMPANY + "]";
    public static final String SELECT_ATTRIBUTE_FST_ISVENDOR 				= "attribute[" + ATTRIBUTE_FST_ISVENDOR + "]";
    public static final String SELECT_ATTRIBUTE_FST_ISENGINEERINGCOMPANY 	= "attribute[" + ATTRIBUTE_FST_ISENGINEERINGCOMPANY + "]";
    public static final String SELECT_ATTRIBUTE_FST_ISDESIGNPARTNERFIRMS 	= "attribute[" + ATTRIBUTE_FST_ISDESIGNPARTNERFIRMS + "]";
    public static final String SELECT_ATTRIBUTE_FST_ISQMPARTNERFIRMS 		= "attribute[" + ATTRIBUTE_FST_ISQMPARTNERFIRMS + "]";
    public static final String SELECT_ATTRIBUTE_FST_ISINSIDEPARTNERFIRMS 	= "attribute[" + ATTRIBUTE_FST_ISINSIDEPARTNERFIRMS + "]";
    public static final String SELECT_ATTRIBUTE_FST_ISOUTSIDEPARTNERFIRMS 	= "attribute[" + ATTRIBUTE_FST_ISOUTSIDEPARTNERFIRMS + "]";
    public static final String SELECT_ATTRIBUTE_FST_ISCLASS 				= "attribute[" + ATTRIBUTE_FST_ISCLASS + "]";
    public static final String SELECT_ATTRIBUTE_FST_ISMATERIALVENDOR 		= "attribute[" + ATTRIBUTE_FST_ISMATERIALVENDOR + "]";
    public static final String SELECT_ATTRIBUTE_FST_BSNSCODE 				= "attribute[" + ATTRIBUTE_FST_BSNSCODE + "]";
    public static final String SELECT_ATTRIBUTE_FST_PARTCODE 				= "attribute[" + ATTRIBUTE_FST_PARTCODE + "]";
    public static final String SELECT_ATTRIBUTE_FST_DEPARTMENTCODE 			= "attribute[" + ATTRIBUTE_FST_DEPARTMENTCODE + "]";
    public static final String SELECT_ATTRIBUTE_FST_PARENTCLASSCODE 		= "attribute[" + ATTRIBUTE_FST_PARENTCLASSCODE + "]";
    public static final String SELECT_ATTRIBUTE_FST_CLASSCODE 				= "attribute[" + ATTRIBUTE_FST_CLASSCODE + "]";
    public static final String SELECT_ATTRIBUTE_FST_ISUNITOFFACILITIES 		= "attribute[" + ATTRIBUTE_FST_ISUNITOFFACILITIES + "]";
}
