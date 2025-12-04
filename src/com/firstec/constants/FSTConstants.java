package com.firstec.constants;

import com.matrixone.apps.domain.DomainConstants;
import com.matrixone.apps.domain.util.PropertyUtil;

public class FSTConstants extends CustomerConstants {
    public FSTConstants() {
    }

    /*
	 * Text Constants
	 */
	/** A string constant with the value "|". */
	public static final String TEXT_DELIMETER              = "|";
	/** A string constant with the value "*". */
	public static final String TEXT_ASTERISK               = "*";
	/** A string constant with the value "_". */
	public static final String TEXT_UNDERBAR               = "_";
	/** A string constant with the value "-". */
	public static final String TEXT_BAR					   = "-";
	/** A string constant with the value " ". */
	public static final String TEXT_SPACE                  = " ";
	/** A string constant with the value "\n". */
	public static final String TEXT_ENTER                  = "\n";
	/** A string constant with the value ".value". */
	public static final String TEXT_VALUE                  = ".value";
	/** A string constant with the value "from". */
	public static final String TEXT_FROM				   = "from";
	/** A string constant with the value "to". */
	public static final String TEXT_TO					   = "to";
	/** A string constant with the value ".". */
	public static final String TEXT_DOT = ".";
	/** A string constant with the value "\n". */
	public static final String TEXT_NEXTLINE = "\n";
	/** A string constant with the value "=". */
	public static final String TEXT_SUBSTITUTION = "=";
	/** A string constant with the value "[". */
	public static final String TEXT_OPEN_SQUARE_BRACKET = "[";
	/** A string constant with the value "]". */
	public static final String TEXT_CLOSE_SQUARE_BRACKET = "]";

	/** A string constant with the value "" . */
	public static final String SYMB_EMPTY = "";
	/** A string constant with the value " " . */
	public static final String SYMB_SPACE = " ";
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
	/** A string constant with the value " matchlist ". */
	public static final String SYMB_MATCHLIST = " matchlist ";
	/** A string constant with the value " smatchlist " */
	public static final String SYMB_SMATCHLIST = " smatchlist ";

	/** A string constant with the value "type". */
	public static final String SYMB_TYPE = "type";
	/** A string constant with the value "attribute". */
	public static final String SYMB_ATTRIBUTE = "attribute";
	/** A string constant with the value "role_". */
	public static final String SYMB_ROLE = "role_";
	/** A string constant with the value "relationship_". */
	public static final String SYMB_RELATIONSHIP = "relationship";
	/** A string constant with the value "[". */
	public static final String SYMB_OPEN_BRACKET = "[";
	/** A string constant with the value "]". */
	public static final String SYMB_CLOSE_BRACKET = "]";
	/** A string constant with the value "to". */
	public static final String SYMB_TO = "to";
	/** A string constant with the value "from". */
	public static final String SYMB_FROM = "from";
	/** A string constant with the value ".". */
	public static final String SYMB_DOT = ".";
	/** A string constant with the value ",". */
	public static final String SYMB_DELIMITER = ",";
	/** A string constant with the value "_" . */
	public static final String SYMB_UNDERLINE = "_";
	/** A string constant with the value "|". */
	public static final String SYMB_VERTICAL_BAR = "|";
	/** A string constant with the value "value". */
	public static final String SYMB_VALUE = "value";
	/** A string constant with the value " 12:00:00 AM". */
	public static final String SYMB_START_TIME = " 12:00:00 AM";
	/** A string constant with the value " 11:59:59 PM". */
	public static final String SYMB_FINISH_TIME = " 11:59:59 PM";

	/** A string constant with the value "yes". */
	public static final String SYMB_YES = "yes";
	/** A string constant with the value "no". */
	public static final String SYMB_NO = "no";
	/** A string constant with the value "true". */
	public static final String TRUE = "true";
	/** A string constant with the value "false". */
	public static final String FALSE = "false";
	/** A string constant with the value "true". */
	public static final String SYMB_TRUE = "True";
	/** A string constant with the value "false". */
	public static final String SYMB_FALSE = "False";

	/** A string constant with the value "timeZone". */
	public static final String TIME_ZONE = "timeZone";
	/** A string constant with the value "languageStr". */
	public static final String LANGUAGE_STR = "languageStr";

	/** A string constant with the value "id". */
	public static final String SYMB_ID = "id";
	/** A string constant with the value "id[connection]". */
	public static final String SYMB_REL_ID = "id[connection]";
	/** A string constant with the value objectIDs. */
	public static final String OBJECT_IDS = "objectIDs";
	/** A string constant with the value objectList. */
	public static final String OBJECT_LIST = "objectList";
	/** A string constant with the value objectId. */
	public static final String OBJECT_ID = "objectId";
	/** A string constant with the value parent objectId. */
	public static final String PARENT_OBJECT_ID = "parentObjectId";
	/** A string constant with the value emxTableRowId. */
	public static final String TABLE_ROW_ID = "emxTableRowId";
	/** A string constant with the value paramList. */
	public static final String PARAM_LIST = "paramList";
	/** A string constant with the value "paramMap". */
	public static final String PARAM_MAP = "paramMap";
	/** A string constant with the value "columnMap". */
	public static final String COLUMN_MAP = "columnMap";
	/** A string constant with the value "settings". */
	public static final String SETTINGS_MAP = "settings";
	/** A string constant with the value "fieldMap". */
	public static final String FIELD_MAP = "fieldMap";
	/** A string constant with the value "requestMap". */
	public static final String REQUEST_MAP = "requestMap";
	/** A string constant with the value "RequestValuesMap". */
	public static final String REQUESTVALUES_MAP = "RequestValuesMap";
	/** A string constant with the value "RequestValuesMap". */
	public static final String IMAGEDATA = "ImageData";
	/** A string constant with the value "nbsp". */
	public static final String SYMB_NBSP = "&nbsp;";
	/** A string constant with the value "islast". */
	public static final String SYMB_ISLAST = "islast == true";
	/** A string constant with the value "islast is not". */
	public static final String SYMB_ISNOTLAST = "islast == false";

	// Form Constants
	/** A string constant with the value "Field Name". */
	public final static String FIELD_NAME = "Field Name";
	/** A string constant with the value "Field Value". */
	public final static String FIELD_VALUE = "Field Value";
	/** A string constant with the value "Field Type". */
	public final static String FIELD_TYPE = "Field Type";
	/** A string constant with the value "Admin Type". */
	public final static String ADMIN_TYPE = "Admin Type";
	/** A string constant with the value "Edit Link". */
	public final static String FIELD_EDIT_LINK = "Edit Link";
	/** A string constant with the value "Is From". */
	public final static String FIELD_ISFROM = "Is From";
	/** A string constant with the value "from.id". */
	public static final String FROM_ID = "from.id";
	/** A string constant with the value "from.name". */
	public static final String FROM_NAME = "from.name";
	/** A string constant with the value "from.owner". */
	public static final String FROM_OWNER = "from.owner";
	/** A string constant with the value "from.revision". */
	public static final String FROM_REVISION = "from.revision";
	/** A string constant with the value "to.id". */
	public static final String TO_ID = "to.id";
	/** A string constant with the value "to.name". */
	public static final String TO_NAME = "to.name";
	/** A string constant with the value "to.owner". */
	public static final String TO_OWNER = "to.owner";
	/** A string constant with the value "to.revision". */
	public static final String TO_REVISION = "to.revision";
	/** A string constant with the value "first.revision". */
	public static final String FIRST_REVISION = "first.revision";

	/*
     * WHERE
     */
	public static String RELATIONSHIP_PART_SPECIFICATION_TO_CADDRAWING_WHERE = "from["+RELATIONSHIP_PART_SPECIFICATION+"|to.type=='"+TYPE_CAD_DRAWING+"'].to.id";
	public static String RELATIONSHIP_PART_SPECIFICATION_TO_DRAWING_WHERE 	 = "from["+RELATIONSHIP_PART_SPECIFICATION+"].to.id";

    /*
     * Type Constants
     */
	public static final String TYPE_FSTSBOMROOT 				   = PropertyUtil.getSchemaProperty("type_fstSBOMRoot");
	public static final String TYPE_FSTSBOMSTRUCTURECODE 		   = PropertyUtil.getSchemaProperty("type_fstSBOMSTRUCTURECODE");
	public static final String TYPE_FSTSBOMSTRUCTURECODEGROUP 	   = PropertyUtil.getSchemaProperty("type_fstSBOMStructureCodeGroup");
	public static final String TYPE_FSTTAGBASECODEGROUP 		   = PropertyUtil.getSchemaProperty("type_fstTagBaseCodeGroup");
	public static final String TYPE_FSTTAGCLASSGROUP 			   = PropertyUtil.getSchemaProperty("type_fstTagClassGroup");
	public static final String TYPE_FSTLCITAGATTRIBUTEGROUP 	   = PropertyUtil.getSchemaProperty("type_fstLCITagAttributeGroup");
	public static final String TYPE_FSTTAGMASTER 				   = PropertyUtil.getSchemaProperty("type_fstTagMaster");
	public static final String TYPE_FSTTAGICSSMASTER 			   = PropertyUtil.getSchemaProperty("type_fstTagICSSMaster");
	public static final String TYPE_FSTSYSTEMGROUP 				   = PropertyUtil.getSchemaProperty("type_fstSystemGroup");
	public static final String TYPE_FSTSYSTEM 					   = PropertyUtil.getSchemaProperty("type_fstSystem");
	public static final String TYPE_FSTSUBSYSTEM 				   = PropertyUtil.getSchemaProperty("type_fstSubsystem");
	public static final String TYPE_FSTTAGIDENTIFIERGROUPCODE	   = PropertyUtil.getSchemaProperty("type_fstTagIdentifierGroupCode");
	public static final String TYPE_FSTTAGIDENTIFIERCODE		   = PropertyUtil.getSchemaProperty("type_fstTagIdentifierCode");
	public static final String TYPE_FSTTAGFUNCTIONALCLASSCODE	   = PropertyUtil.getSchemaProperty("type_fstTagFunctionalClassCode");
	public static final String TYPE_FSTTAGDISCIPLINECODE 		   = PropertyUtil.getSchemaProperty("type_fstTagDisciplineCode");
	public static final String TYPE_FSTAREAGROUPCODE 			   = PropertyUtil.getSchemaProperty("type_fstAreaGroupCode");
	public static final String TYPE_FSTAREACODE 				   = PropertyUtil.getSchemaProperty("type_fstAreaCode");
	public static final String TYPE_FSTTAGCOMMONCODEGROUP 		   = PropertyUtil.getSchemaProperty("type_fstTagCommonCodeGroup");
	public static final String TYPE_FSTTAGCOMMONCODE 			   = PropertyUtil.getSchemaProperty("type_fstTagCommonCode");
	public static final String TYPE_FSTTAGCLASS 				   = PropertyUtil.getSchemaProperty("type_fstTagClass");
	public static final String TYPE_FSTLCITAGATTRIBUTECLASS 	   = PropertyUtil.getSchemaProperty("type_fstLCITagAttributeClass");
	public static final String TYPE_FSTCOMPANYRFQNO 			   = PropertyUtil.getSchemaProperty("type_fstCompanyRFQNo");
	public static final String TYPE_FSTTAGNUMBERINGRULEUNIT 	   = PropertyUtil.getSchemaProperty("type_fstTagNumberingRuleUnit");
    public static final String TYPE_FSTLCITAGATTRIBUTERULE 		   = PropertyUtil.getSchemaProperty("type_fstLCITAGATTRIBUTERULE");
    public static final String TYPE_FSTLCITAGCOMMONATTRIBUTERULE   = PropertyUtil.getSchemaProperty("type_fstLCITagCommonAttributeRule");
    public static final String TYPE_FSTLCITAGSPECIFICATTRIBUTERULE = PropertyUtil.getSchemaProperty("type_fstLCITagSpecificAttributeRule");
    public static final String TYPE_FSTTAGNUMBER 				   = PropertyUtil.getSchemaProperty("type_fstTagNumber");
    public static final String TYPE_FSTTAGSEQNUMBERINGDUMMYOBJECT  = PropertyUtil.getSchemaProperty("type_fstTagSeqNumberingDummyObject");
    public static final String TYPE_FSTCODEDETAIL 				   = PropertyUtil.getSchemaProperty("type_fstCodeDetail");
    public static final String TYPE_FSTSCHEMATICPART 			   = PropertyUtil.getSchemaProperty("type_fstSchematicPart");
    public static final String TYPE_FSTMODELPART 				   = PropertyUtil.getSchemaProperty("type_fstModelPart");
    public static final String TYPE_FSTENGINEERINGDATA 			   = PropertyUtil.getSchemaProperty("type_fstEngineeringData");
	public static final String TYPE_FSTVENDORDATA 				   = PropertyUtil.getSchemaProperty("type_fstVendorData");
	public static final String TYPE_FSTDETAILDP 				   = PropertyUtil.getSchemaProperty("type_fstDetailDP");
	public static final String TYPE_FSTVDRL 					   = PropertyUtil.getSchemaProperty("type_fstVDRL");
	public static final String TYPE_FSTTAGICSSCATEGORY 			   = PropertyUtil.getSchemaProperty("type_fstTagICSSCategory");
	public static final String TYPE_FSTCODEMASTER 				   = PropertyUtil.getSchemaProperty("type_fstCodeMaster");
	public static final String TYPE_FSTPART 					   = PropertyUtil.getSchemaProperty("type_fstPart");
	public static final String TYPE_FST_PROJECT_SPACE 			   = PropertyUtil.getSchemaProperty("type_ProjectSpace");
	public static final String TYPE_FSTDOCUMENT 				   = PropertyUtil.getSchemaProperty("type_fstDocument");
	public static final String TYPE_FSTPARTSPACE 				   = PropertyUtil.getSchemaProperty("type_fstPartSpace");
	public static final String TYPE_FSTDISTRIBUTION				   = PropertyUtil.getSchemaProperty("type_fstDistribution");
	public static final String TYPE_FSTRECEIVE					   = PropertyUtil.getSchemaProperty("type_fstReceive");
	public static final String TYPE_WORKFLOWTASK 				   = PropertyUtil.getSchemaProperty("type_WorkflowTask");
	public static final String TYPE_FSTSTANDARDPART 				= PropertyUtil.getSchemaProperty("type_fstStandardPart");
	public static final String TYPE_FSTDOCUMENTTEMPLATE			= PropertyUtil.getSchemaProperty("type_fstDocumentTemplate");
	public static final String TYPE_FSTASSEMBLYPART				= PropertyUtil.getSchemaProperty("type_fstAssemblyPart");
	public static final String TYPE_FSTDATASHEET				= PropertyUtil.getSchemaProperty("type_fstDataSheet");
	public static final String TYPE_CHANGEORDER					= PropertyUtil.getSchemaProperty("type_ChangeOrder");
	public static final String TYPE_CHANGEREQUEST				= PropertyUtil.getSchemaProperty("type_ChangeRequest");
	public static final String TYPE_FSTTESTFLAW				= PropertyUtil.getSchemaProperty("type_fstTestFlaw");
	public static final String TYPE_FSTPEERREVIEW				= PropertyUtil.getSchemaProperty("type_fstPeerReview");
	public static final String TYPE_FSTPEERREVIEWRESULT		= PropertyUtil.getSchemaProperty("type_fstPeerReviewResult");

    /*
     * Policy Constants
     */
	public static final String POLICY_FSTSBOMROOT 					= PropertyUtil.getSchemaProperty("policy_fstSBOMRoot");
	public static final String POLICY_FSTTAGBASEINFOGROUP 			= PropertyUtil.getSchemaProperty("policy_fstTagBaseInfoGroup");
	public static final String POLICY_FSTTAGMASTER 					= PropertyUtil.getSchemaProperty("policy_fstTagMaster");
	public static final String POLICY_LIBRARIES 					= PropertyUtil.getSchemaProperty("policy_Libraries");
	public static final String POLICY_FSTSBOMCODE 					= PropertyUtil.getSchemaProperty("policy_fstSBOMCode");
	public static final String POLICY_FSTTAGCLASS 					= PropertyUtil.getSchemaProperty("policy_fstTagClass");
	public static final String POLICY_FSTTAGNUMBER 					= PropertyUtil.getSchemaProperty("policy_fstTagNumber");
	public static final String POLICY_FSTTAGSEQNUMBERINGDUMMYOBJECT = PropertyUtil.getSchemaProperty("policy_fstTagSeqNumberingDummyObject");
	public static final String POLICY_FSTLCITAGATTRIBUTERULE 		= PropertyUtil.getSchemaProperty("policy_fstLCITagAttributeRule");
	public static final String POLICY_FSTTAGICSSMASTER 				= PropertyUtil.getSchemaProperty("policy_fstTagICSSMaster");
	public static final String POLICY_FSTTAGICSSCATEGORY 			= PropertyUtil.getSchemaProperty("policy_fstTagICSSCategory");
	public static final String POLICY_CHANGEACTION 					= PropertyUtil.getSchemaProperty("policy_ChangeAction");
	public static final String POLICY_DOCUMENT_RELEASE				= PropertyUtil.getSchemaProperty("policy_Document");
	public static final String POLICY_FSTDISTRIBUTION				= PropertyUtil.getSchemaProperty("policy_fstDistribution");
	public static final String POLICY_FSTRECEIVE					= PropertyUtil.getSchemaProperty("policy_fstReceive");
	public static final String POLICY_WORKFLOWTASK 				= PropertyUtil.getSchemaProperty("policy_WorkflowTask");
	public static final String POLICY_FSTDOCUMENT				= PropertyUtil.getSchemaProperty("policy_fstDocument");
	public static final String POLICY_FSTDATASHEET			= PropertyUtil.getSchemaProperty("policy_fstDataSheetPolicy");
	public static final String POLICY_FSTSTANDARDPART		= PropertyUtil.getSchemaProperty("policy_fstStandardPart");
	public static final String POLICY_FSTTESTFLAWPOLICY		= PropertyUtil.getSchemaProperty("policy_fstTestFlawPolicy");
	public static final String POLICY_FSTPEERREVIEWPOLICY		= PropertyUtil.getSchemaProperty("policy_fstPeerReviewPolicy");
	public static final String POLICY_FSTPEERREVIEWRESULTPOLICY = PropertyUtil.getSchemaProperty("policy_fstPeerReviewResultPolicy");

    /*
     * State Constants
     */

    public static final String STATE_SBOMROOT_DELETED 	   	 = PropertyUtil.getSchemaProperty("policy", POLICY_FSTSBOMROOT, "state_Deleted");
    public static final String STATE_SBOMROOT_COMPLETE 	   	 = PropertyUtil.getSchemaProperty("policy", POLICY_FSTSBOMROOT, "state_Complete");
    public static final String STATE_SBOMROOT_ACTIVE 	   	 = PropertyUtil.getSchemaProperty("policy", POLICY_FSTSBOMROOT, "state_Active");
    public static final String STATE_SBOMCODE_ACTIVE 	   	 = PropertyUtil.getSchemaProperty("policy", POLICY_FSTSBOMCODE, "state_Active");
    public static final String STATE_SBOMCODE_DELETED 	   	 = PropertyUtil.getSchemaProperty("policy", POLICY_FSTSBOMCODE, "state_Deleted");
    public static final String STATE_LIBRARIES_ACTIVE 	   	 = PropertyUtil.getSchemaProperty("policy", POLICY_LIBRARIES, "state_Active");
    public static final String STATE_TAGNUMBER_RESERVED    	 = PropertyUtil.getSchemaProperty("policy", POLICY_FSTTAGNUMBER, "state_Reserved");
    public static final String STATE_TAGNUMBER_OPERATIONAL 	 = PropertyUtil.getSchemaProperty("policy", POLICY_FSTTAGNUMBER, "state_Operational");
    public static final String STATE_TAGNUMBER_VOIDED 	   	 = PropertyUtil.getSchemaProperty("policy", POLICY_FSTTAGNUMBER, "state_Voided");
    public static final String STATE_TAGCLASS_DELETED 	     = PropertyUtil.getSchemaProperty("policy", POLICY_FSTTAGCLASS, "state_Deleted");
    public static final String STATE_TAGCLASS_EXISTS 	     = PropertyUtil.getSchemaProperty("policy", POLICY_FSTTAGCLASS, "state_Exists");
    public static final String STATE_TAGICSSCATEGORY_ACTIVE  = PropertyUtil.getSchemaProperty("policy", POLICY_FSTTAGICSSCATEGORY, "state_Active");
    public static final String STATE_TAGICSSCATEGORY_DELETED = PropertyUtil.getSchemaProperty("policy", POLICY_FSTTAGICSSCATEGORY, "state_Deleted");
    public static final String STATE_CHANGEACTION_PREPARE 	 = PropertyUtil.getSchemaProperty("policy", POLICY_CHANGEACTION, "state_Prepare");

    /*
     * Relationship Constants
     */
    public static final String RELATIONSHIP_PROJECT_SPACE						 		 = "Project Space";
    public static final String RELATIONSHIP_DEPARTMENT						 		 	 = "Department";
    public static final String RELATIONSHIP_IMPLEMENTED_ITEM						     = "Implemented Item";
	public static final String RELATIONSHIP_CHANGE_AFFECTED_ITEM 					 	 = "Change Affected Item";
	public static final String RELATIONSHIP_FSTPROJECTSPACETOSBOMROOT 					 = PropertyUtil.getSchemaProperty("relationship_fstProjectSpaceToSBOMRoot");
	public static final String RELATIONSHIP_FSTTAGBASEINFO 								 = PropertyUtil.getSchemaProperty("relationship_fstTagBaseInfo");
	public static final String RELATIONSHIP_FSTTAGMASTER 								 = PropertyUtil.getSchemaProperty("relationship_fstTagMaster");
	public static final String RELATIONSHIP_FSTSYSTEMGROUPS 							 = PropertyUtil.getSchemaProperty("relationship_fstSystemGroups");
	public static final String RELATIONSHIP_FSTSBOM 									 = PropertyUtil.getSchemaProperty("relationship_fstSBOM");
	public static final String RELATIONSHIP_FSTTAGBASECODE 								 = PropertyUtil.getSchemaProperty("relationship_fstTagBaseCode");
	public static final String RELATIONSHIP_FSTSBOMTAGCODES 							 = PropertyUtil.getSchemaProperty("relationship_fstSBOMTagCodes");
	public static final String RELATIONSHIP_FSTTAGIDENTIFIERTOFUNCTIONALCLASS 			 = PropertyUtil.getSchemaProperty("relationship_fstTagIdentifierToFunctionalClass");
	public static final String RELATIONSHIP_FSTTAGCLASSGROUPTOCLASS 					 = PropertyUtil.getSchemaProperty("relationship_fstTagClassGroupToClass");
	public static final String RELATIONSHIP_FSTINCLUDEDTAGFUNCTIONALCLASSES 			 = PropertyUtil.getSchemaProperty("relationship_fstIncludedTagFunctionalClasses");
	public static final String RELATIONSHIP_FSTTAGNUMBERINGRULETORULEUNIT 				 = PropertyUtil.getSchemaProperty("relationship_fstTagNumberingRuleToRuleUnit");
	public static final String RELATIONSHIP_FSTTAGNUMRULEUNITSBOMSTRUCTURECODEGROUPRANGE = PropertyUtil.getSchemaProperty("relationship_fstTagNumRuleUnitSBOMStructureCodeGroupRange");
	public static final String RELATIONSHIP_SUBCLASS 									 = PropertyUtil.getSchemaProperty("relationship_Subclass");
	public static final String RELATIONSHIP_FSTTAGNUMRULEUNITVALUELISTOFREFERENCE 		 = PropertyUtil.getSchemaProperty("relationship_fstTagNumRuleUnitValueListOfReference");
	public static final String RELATIONSHIP_FSTTAGNUMRULEUNITVALUEDERIVEDFROM 			 = PropertyUtil.getSchemaProperty("relationship_fstTagNumRuleUnitValueDerivedFrom");
    public static final String RELATIONSHIP_FSTLCIATTRIBUTERULES 						 = PropertyUtil.getSchemaProperty("relationship_fstLCIAttributeRules");
    public static final String RELATIONSHIP_FSTTAGCLASSTONUMBER 						 = PropertyUtil.getSchemaProperty("relationship_fstTagClassToNumber");
    public static final String RELATIONSHIP_FSTOLDTAGNUMBER 							 = PropertyUtil.getSchemaProperty("relationship_fstOldTagNumber");
    public static final String RELATIONSHIP_FSTTAGNUMBERUNIT 							 = PropertyUtil.getSchemaProperty("relationship_fstTagNumberUnit");
    public static final String RELATIONSHIP_FSTTAGNUMBERS 								 = PropertyUtil.getSchemaProperty("relationship_fstTagNumbers");
    public static final String RELATIONSHIP_FSTTAGNUMBERTOSYSTEM 						 = PropertyUtil.getSchemaProperty("relationship_fstTagNumberToSystem");
    public static final String RELATIONSHIP_FSTTAGNUMBERTOSUBSYSTEM 					 = PropertyUtil.getSchemaProperty("relationship_fstTagNumberToSubsystem");
    public static final String RELATIONSHIP_FSTTAGNUMBERTOPARENTTAG 					 = PropertyUtil.getSchemaProperty("relationship_fstTagNumberToParentTag");
    public static final String RELATIONSHIP_FSTTAGNUMBERTOIDENTIFIER 					 = PropertyUtil.getSchemaProperty("relationship_fstTagNumberToTagIdentifier");
    public static final String RELATIONSHIP_FSTTAGNUMBERTOTAGDISCIPLINE 				 = PropertyUtil.getSchemaProperty("relationship_fstTagNumberToTagDiscipline");
    public static final String RELATIONSHIP_FSTTAGNUMBERTOTAGAREA 						 = PropertyUtil.getSchemaProperty("relationship_fstTagNumberToTagArea");
    public static final String RELATIONSHIP_FSTTAGNUMBERTOTAGCOMMONCODE 				 = PropertyUtil.getSchemaProperty("relationship_fstTagNumberToTagCommonCode");
    public static final String RELATIONSHIP_FSTTAGNUMBERTOCPYRFQNO 						 = PropertyUtil.getSchemaProperty("relationship_fstTagNumberToCPYRFQNo");
    public static final String RELATIONSHIP_FSTTAGNUMBERTOFUNCCLASS 					 = PropertyUtil.getSchemaProperty("relationship_fstTagNumberToFuncClass");
    public static final String RELATIONSHIP_FSTRFQNOMAPPING 							 = PropertyUtil.getSchemaProperty("relationship_fstRFQNoMapping");
    public static final String RELATIONSHIP_FSTTAGNUMBERTOFSTRFQNO 						 = PropertyUtil.getSchemaProperty("relationship_fstTagNumberToFSTRFQNo");
    public static final String RELATIONSHIP_FSTTAGNUMBERTODETAILDP 						 = PropertyUtil.getSchemaProperty("relationship_fstTagNumberToDetailDP");
    public static final String RELATIONSHIP_FSTTAGNUMBERTOVDP 							 = PropertyUtil.getSchemaProperty("relationship_fstTagNumberToVDP");
    public static final String RELATIONSHIP_FSTLCITAGATTRREQUIREMENTS 					 = PropertyUtil.getSchemaProperty("relationship_fstLCITagAttrRequirements");
    public static final String RELATIONSHIP_FSTTAGGEDITEM 								 = PropertyUtil.getSchemaProperty("relationship_fstTaggedItem");
    public static final String RELATIONSHIP_FSTTAGNUMBERTODOCUMENT 						 = PropertyUtil.getSchemaProperty("relationship_fstTagNumberToDocument");
    public static final String RELATIONSHIP_FSTTAGICSSTOCATEGORY 						 = PropertyUtil.getSchemaProperty("relationship_fstTagICSSToCategory");
    public static final String RELATIONSHIP_FSTDELIVERYPRODUCT 						 	 = PropertyUtil.getSchemaProperty("relationship_fstDeliveryProduct");
    public static final String RELATIONSHIP_FSTRELATEDUNITFACILITY 						 = PropertyUtil.getSchemaProperty("relationship_fstRelatedUnitFacility");

    public static final String RELATIONSHIP_FSTDISTRIBUTIONANDCHANGEORDER				 = PropertyUtil.getSchemaProperty("relationship_fstDistributionAndChangeOrder");
    public static final String RELATIONSHIP_FSTDISTRIBUTIONANDDEPARTMENT				 = PropertyUtil.getSchemaProperty("relationship_fstDistributionAndDepartment");
    public static final String RELATIONSHIP_FSTDISTRIBUTIONANDPROJECTSPACE				 = PropertyUtil.getSchemaProperty("relationship_fstDistributionAndProjectSpace");
    public static final String RELATIONSHIP_FSTDISTRIBUTIONANDDOCUMENT					 = PropertyUtil.getSchemaProperty("relationship_fstDistributionAndDocument");

    public static final String RELATIONSHIP_FSTRELATEDPROJECT					 		 = PropertyUtil.getSchemaProperty("relationship_fstRelatedProject");
    public static final String RELATIONSHIP_FSTRELATEDDOCUMENT					 		 = PropertyUtil.getSchemaProperty("relationship_fstRelatedDocument");
    public static final String RELATIONSHIP_FSTDOCSENDINGCOMPANY					 	 = PropertyUtil.getSchemaProperty("relationship_fstDocSendingCompany");

    public static final String RELATIONSHIP_FSTRELATEDDOCUMENTTEMPLATE			 	 = PropertyUtil.getSchemaProperty("relationship_fstRelatedDocumentTemplate");
    public static final String RELATIONSHIP_FSTDATASHEET			 	 			= PropertyUtil.getSchemaProperty("relationship_fstDataSheet");

    public static final String RELATIONSHIP_FSTPROJECTTOTESTFLAW			 	 			= PropertyUtil.getSchemaProperty("relationship_fstProjectToTestFlaw");
    public static final String RELATIONSHIP_FSTPARTTOTESTFLAW		 	 			= PropertyUtil.getSchemaProperty("relationship_fstPartToTestFlaw");
    public static final String RELATIONSHIP_FSTPROJECTTOPEERREVIEW			 	 			= PropertyUtil.getSchemaProperty("relationship_fstProjectToPeerReview");
    public static final String RELATIONSHIP_FSTPARTTOPEERREVIEW		 	 			= PropertyUtil.getSchemaProperty("relationship_fstPartToPeerReview");

	/*
     * Attribute Constants
     */
	public static final String ATTRIBUTE_TASKESTIMATEDSTARTDATE 				 = PropertyUtil.getSchemaProperty("attribute_TaskEstimatedStartDate");
	public static final String ATTRIBUTE_TASKESTIMATEDFINISHDATE 				 = PropertyUtil.getSchemaProperty("attribute_TaskEstimatedFinishDate");
	public static final String ATTRIBUTE_TASKESTIMATEDDURATION 					 = PropertyUtil.getSchemaProperty("attribute_TaskEstimatedDuration");
	public static final String ATTRIBUTE_TASKACTUALSTARTDATE 					 = PropertyUtil.getSchemaProperty("attribute_TaskActualStartDate");
	public static final String ATTRIBUTE_TASKACTUALFINISHDATE 					 = PropertyUtil.getSchemaProperty("attribute_TaskActualFinishDate");
	public static final String ATTRIBUTE_TASKACTUALDURATION 					 = PropertyUtil.getSchemaProperty("attribute_TaskActualDuration");
	public static final String ATTRIBUTE_FSTCODE 								 = PropertyUtil.getSchemaProperty("attribute_fstCode");
	public static final String ATTRIBUTE_FSTCODEVALUE 							 = PropertyUtil.getSchemaProperty("attribute_fstCodeValue");
	public static final String ATTRIBUTE_FSTORIGINATOR 							 = PropertyUtil.getSchemaProperty("attribute_Originator");
	public static final String ATTRIBUTE_FSTTAGCLASSNAME 						 = PropertyUtil.getSchemaProperty("attribute_fstTagClassName");
	public static final String ATTRIBUTE_FSTCPYTAGCLASSNAME 					 = PropertyUtil.getSchemaProperty("attribute_fstCPYTagClassName");
	public static final String ATTRIBUTE_FSTTAGCLASSRFQNOCATEGORY 				 = PropertyUtil.getSchemaProperty("attribute_fstTagClassRFQNoCategory");
	public static final String ATTRIBUTE_FSTTAGCLASSRFQNOMANDATORYYN 			 = PropertyUtil.getSchemaProperty("attribute_fstTagClassRFQNoMandatoryYN");
	public static final String ATTRIBUTE_FSTTAGCLASSDETAILDPMANDATORYYN 		 = PropertyUtil.getSchemaProperty("attribute_fstTagClassDetailDPMandatoryYN");
	public static final String ATTRIBUTE_FSTTAGCLASSVDPMANDATORYYN 				 = PropertyUtil.getSchemaProperty("attribute_fstTagClassVDPMandatoryYN");
	public static final String ATTRIBUTE_FSTLCITAGATTRCLASSNAME 				 = PropertyUtil.getSchemaProperty("attribute_fstLCITagAttrClassName");
	public static final String ATTRIBUTE_FSTTAGNUMRULEUNITNAME 					 = PropertyUtil.getSchemaProperty("attribute_fstTagNumRuleUnitName");
	public static final String ATTRIBUTE_FSTPCSTAGTYPE 							 = PropertyUtil.getSchemaProperty("attribute_fstPCSTagTypeCode");
	public static final String ATTRIBUTE_FSTSEQUENCEORDERLIST 					 = PropertyUtil.getSchemaProperty("attribute_fstSequenceOrderList");
	public static final String ATTRIBUTE_FSTSEQUENCEORDER 						 = PropertyUtil.getSchemaProperty("attribute_fstSequenceOrder");
	public static final String ATTRIBUTE_FSTTAGNUMRULEUNITCLASSIFYCATEGORY 		 = PropertyUtil.getSchemaProperty("attribute_fstTagNumRuleUnitClassifyCategory");
	public static final String ATTRIBUTE_FSTTAGNUMRULEUNITVALUECATEGORY 		 = PropertyUtil.getSchemaProperty("attribute_fstTagNumRuleUnitValueCategory");
	public static final String ATTRIBUTE_FSTTAGNUMRULEUNITVALUEFIXEDVALUE 		 = PropertyUtil.getSchemaProperty("attribute_fstTagNumRuleUnitValueFixedValue");
	public static final String ATTRIBUTE_FSTTAGNUMRULEUNITVALUELOV 				 = PropertyUtil.getSchemaProperty("attribute_fstTagNumRuleUnitValueLOV");
	public static final String ATTRIBUTE_FSTTAGNUMRULEUNITVALUELISTOFREFCATEGORY = PropertyUtil.getSchemaProperty("attribute_fstTagNumRuleUnitValueListOfRefCategory");
	public static final String ATTRIBUTE_FSTTAGNUMRULEUNITVALUEMIN 				 = PropertyUtil.getSchemaProperty("attribute_fstTagNumRuleUnitValueMin");
	public static final String ATTRIBUTE_FSTTAGNUMRULEUNITVALUEMAX 				 = PropertyUtil.getSchemaProperty("attribute_fstTagNumRuleUnitValueMax");
	public static final String ATTRIBUTE_FSTTAGNUMRULEUNITDIGITCATEGORY 		 = PropertyUtil.getSchemaProperty("attribute_fstTagNumRuleUnitDigitCategory");
	public static final String ATTRIBUTE_FSTTAGNUMRULEUNITDIGITFIXEDLENGTH 		 = PropertyUtil.getSchemaProperty("attribute_fstTagNumRuleUnitDigitFixedLength");
	public static final String ATTRIBUTE_FSTTAGNUMRULEUNITVARIABLEDIGITCATEGORY  = PropertyUtil.getSchemaProperty("attribute_fstTagNumRuleUnitVarableDigitCategory");
	public static final String ATTRIBUTE_FSTTAGNUMRULEUNITVARIABLEDIGITMINLENGTH = PropertyUtil.getSchemaProperty("attribute_fstTagNumRuleUnitVarableDigitMinLength");
	public static final String ATTRIBUTE_FSTTAGNUMRULEUNITVARIABLEDIGITMAXLENGTH = PropertyUtil.getSchemaProperty("attribute_fstTagNumRuleUnitVarableDigitMaxLength");
	public static final String ATTRIBUTE_FSTTAGNUMRULEUNITVARIABLEDIGITLENGTHLOV = PropertyUtil.getSchemaProperty("attribute_fstTagNumRuleUnitVarableDigitLengthLOV");
	public static final String ATTRIBUTE_FSTTAGNUMRULEUNITFORMATDISPLAY			 = PropertyUtil.getSchemaProperty("attribute_fstTagNumRuleUnitFormatDisplay");
	public static final String ATTRIBUTE_FSTTAGNUMRULEUNITVALUEFORMATCONSTRAINT  = PropertyUtil.getSchemaProperty("attribute_fstTagNumRuleUnitValueFormatConstraint");
	public static final String ATTRIBUTE_FSTTAGNUMRULEUNITSUFFIXMINSELECT 		 = PropertyUtil.getSchemaProperty("attribute_fstTagNumRuleUnitSuffixMinSelect");
	public static final String ATTRIBUTE_FSTTAGNUMRULEUNITSEQDEPENDENT 			 = PropertyUtil.getSchemaProperty("attribute_fstTagNumRuleUnitSeqDependent");
	public static final String ATTRIBUTE_FSTLCITAGATTRCLASSCATEGORY 			 = PropertyUtil.getSchemaProperty("attribute_fstLCITagAttrClassCategory");
	public static final String ATTRIBUTE_FSTTAGNODWGDISCIPLINE 					 = PropertyUtil.getSchemaProperty("attribute_fstTagNoDwgDiscipline");
	public static final String ATTRIBUTE_FSTOWNERDEPARMENT 						 = PropertyUtil.getSchemaProperty("attribute_fstOwnerDeparment");
	public static final String ATTRIBUTE_FSTOWNERPERSON 						 = PropertyUtil.getSchemaProperty("attribute_fstOwnerPerson");
	public static final String ATTRIBUTE_FSTPARTICIPANTDEPARTMENTS 				 = PropertyUtil.getSchemaProperty("attribute_fstParticipantDepartments");
	public static final String ATTRIBUTE_FSTTAGNOCHANGEREASON 					 = PropertyUtil.getSchemaProperty("attribute_fstTagNoChangeReason");
	public static final String ATTRIBUTE_FSTTAGNOCHANGEDEPARTMENT 				 = PropertyUtil.getSchemaProperty("attribute_fstTagNoChangeDepartment");
	public static final String ATTRIBUTE_FSTTAGNOCHANGEPERSON 					 = PropertyUtil.getSchemaProperty("attribute_fstTagNoChangePerson");
	public static final String ATTRIBUTE_FSTTAGNOCHANGEDATE 					 = PropertyUtil.getSchemaProperty("attribute_fstTagNoChangeDate");
	public static final String ATTRIBUTE_ORGANIZATION_ID 						 = PropertyUtil.getSchemaProperty("attribute_OrganizationID");
	public static final String ATTRIBUTE_FSTTAGNUMRULEUNITSEQUENCECATEGORY 		 = PropertyUtil.getSchemaProperty("attribute_fstTagNumRuleUnitSequenceCategory");
	public static final String ATTRIBUTE_FSTTAGNUMRULEUNITSUFFIXCATEGORY 		 = PropertyUtil.getSchemaProperty("attribute_fstTagNumRuleUnitSuffixCategory");
	public static final String ATTRIBUTE_FSTTAGNUMRULEUNITSUFFIXGROUPCATEGORY 	 = PropertyUtil.getSchemaProperty("attribute_fstTagNumRuleUnitSuffixGroupCategory");
	public static final String ATTRIBUTE_FSTTAGNUMBERUNITSTR 					 = PropertyUtil.getSchemaProperty("attribute_fstTagNumberUnitStr");
	public static final String ATTRIBUTE_FSTTAGNOVOIDREASON 					 = PropertyUtil.getSchemaProperty("attribute_fstTagNoVoidReason");
	public static final String ATTRIBUTE_FSTTAGNOUNVOIDREASON 					 = PropertyUtil.getSchemaProperty("attribute_fstTagNoUnVoidReason");
	public static final String ATTRIBUTE_FSTTAGNOFORCETAGGINGREASON 			 = PropertyUtil.getSchemaProperty("attribute_fstTagNoForceTaggingReason");
	public static final String ATTRIBUTE_FSTCODEUSEYN 							 = PropertyUtil.getSchemaProperty("attribute_fstCodeUseYN");
	public static final String ATTRIBUTE_FSTCODENAME 							 = PropertyUtil.getSchemaProperty("attribute_fstCodeName");
	public static final String ATTRIBUTE_FSTFILEFORM 							 = PropertyUtil.getSchemaProperty("attribute_fstFileForm");
	public static final String ATTRIBUTE_FSTVERSION 							 = PropertyUtil.getSchemaProperty("attribute_fstVersion");
	public static final String ATTRIBUTE_FSTSHEETNAME 							 = PropertyUtil.getSchemaProperty("attribute_fstSheetName");
	public static final String ATTRIBUTE_FSTHEADERCOLUMN 						 = PropertyUtil.getSchemaProperty("attribute_fstHeaderColumn");
	public static final String ATTRIBUTE_FSTDATACOLUMN 							 = PropertyUtil.getSchemaProperty("attribute_fstDataColumn");
	public static final String ATTRIBUTE_FSTLCITAGATTRCLASSDOCTYPES 			 = PropertyUtil.getSchemaProperty("attribute_fstLCITagAttrClassDocTypes");
	public static final String ATTRIBUTE_FSTLCITAGATTRCLASSIFYCATEGORY 			 = PropertyUtil.getSchemaProperty("attribute_fstLCITagAttrClassifyCategory");
	public static final String ATTRIBUTE_FSTLCITAGATTRBASICINFOCATEGORY 		 = PropertyUtil.getSchemaProperty("attribute_fstLCITagAttrBasicInfoCategory");
	public static final String ATTRIBUTE_FSTLCITAGATTRVALUETYPECONSTRAINT 		 = PropertyUtil.getSchemaProperty("attribute_fstLCITagAttrValueTypeConstraint");
	public static final String ATTRIBUTE_FSTLCITAGATTRBASICINFOVALUETYPE 		 = PropertyUtil.getSchemaProperty("attribute_fstLCITagAttrBasicInfoValueType");
	public static final String ATTRIBUTE_FSTLCITAGATTRENOVIAATTRIBUTENAME 		 = PropertyUtil.getSchemaProperty("attribute_fstLCITagAttrENOVIAAttributeName");
	public static final String ATTRIBUTE_FSTLCITAGATTRDISPLAYNAME 				 = PropertyUtil.getSchemaProperty("attribute_fstLCITagAttrDisplayName");
	public static final String ATTRIBUTE_FSTLCITAGCOLUMNORDER 					 = PropertyUtil.getSchemaProperty("attribute_fstLCITagColumnOrder");
	public static final String ATTRIBUTE_FSTLCITAGATTRDESCRIPTION 				 = PropertyUtil.getSchemaProperty("attribute_fstLCITagAttrDescription");
	public static final String ATTRIBUTE_FSTLCITAGATTRVALUEUOM 					 = PropertyUtil.getSchemaProperty("attribute_fstLCITagAttrValueUOM");
	public static final String ATTRIBUTE_FSTLCITAGATTRVALUEMAXLENGTH 			 = PropertyUtil.getSchemaProperty("attribute_fstLCITagAttrValueMaxLength");
	public static final String ATTRIBUTE_FSTLCITAGATTRFIXEDVALUE 				 = PropertyUtil.getSchemaProperty("attribute_fstLCITagAttrFixedValue");
	public static final String ATTRIBUTE_FSTLCITAGATTRUSERSELECTVALUELOV 		 = PropertyUtil.getSchemaProperty("attribute_fstLCITagAttrUserSelectValueLOV");
	public static final String ATTRIBUTE_FSTLCITAGATTRTAGNUMBERUNITNAME 		 = PropertyUtil.getSchemaProperty("attribute_fstLCITagAttrTagNumberUnitName");
	public static final String ATTRIBUTE_FSTLCITAGATTREBOMATTRIBUTENAME 		 = PropertyUtil.getSchemaProperty("attribute_fstLCITagAttrEBOMAttributeName");
	public static final String ATTRIBUTE_FSTLCITAGATTRRELATEDDOCUMENTTYPE 		 = PropertyUtil.getSchemaProperty("attribute_fstLCITagAttrRelatedDocumentType");
	public static final String ATTRIBUTE_FSTLCITAGATTRREQUIREMENTS 				 = PropertyUtil.getSchemaProperty("attribute_fstLCITagAttrRequirements");
	public static final String ATTRIBUTE_FSTLCITAGEXCELCOLUMNNAME 				 = PropertyUtil.getSchemaProperty("attribute_fstLCITagExcelColumnName");
	public static final String ATTRIBUTE_FSTIOTYPE 								 = PropertyUtil.getSchemaProperty("attribute_fstIOType");
	public static final String ATTRIBUTE_FSTICSSSYSTEM 							 = PropertyUtil.getSchemaProperty("attribute_fstICSSSystem");
	public static final String ATTRIBUTE_FSTDISCIPLINEFORECAST 					 = PropertyUtil.getSchemaProperty("attribute_fstDisciplineForecast");
	public static final String ATTRIBUTE_FSTICSSIOTYPE 							 = PropertyUtil.getSchemaProperty("attribute_fstICSSIOType");
	public static final String ATTRIBUTE_FSTICSSFREEZEDYN 						 = PropertyUtil.getSchemaProperty("attribute_fstICSSFreezedYN");
	public static final String ATTRIBUTE_FSTIOTYPECADATTRNAME 					 = PropertyUtil.getSchemaProperty("attribute_fstIOTypeCADAttrName");
	public static final String ATTRIBUTE_FSTICSSSYSTEMCADATTRNAME 				 = PropertyUtil.getSchemaProperty("attribute_fstICSSSystemCADAttrName");
	public static final String ATTRIBUTE_FSTLCITAGATTRDEFAULTVALUE 				 = PropertyUtil.getSchemaProperty("attribute_fstLCITagAttrDefaultValue");
	public static final String ATTRIBUTE_FSTTAGNUMRULEUNITSEQKEYSTR 			 = PropertyUtil.getSchemaProperty("attribute_fstTagNumRuleUnitSeqKeyStr");
	public static final String ATTRIBUTE_FSTICSSPREVEBOMATTR 					 = PropertyUtil.getSchemaProperty("attribute_fstICSSPrevEBOMAttr");
	public static final String ATTRIBUTE_FSTICSSCHANGEEBOMDETAIL 				 = PropertyUtil.getSchemaProperty("attribute_fstICSSChangeEBOMDetail");
	public static final String ATTRIBUTE_FSTICSSCHANGEEBOMDATE 					 = PropertyUtil.getSchemaProperty("attribute_fstICSSChangeEBOMDate");
	public static final String ATTRIBUTE_FSTLOGICALPHYSICAL 					 = PropertyUtil.getSchemaProperty("attribute_fstLogicalPhysical");
	public static final String ATTRIBUTE_FSTCADTAGNO 							 = PropertyUtil.getSchemaProperty("attribute_fstCADTAGNO");
	public static final String ATTRIBUTE_FSTCADINSULPURPOSE 					 = PropertyUtil.getSchemaProperty("attribute_fstCADINSULPURPOSE");
	public static final String ATTRIBUTE_FSTCADINSULTHICK 					 	 = PropertyUtil.getSchemaProperty("attribute_fstCADINSULTHICK");
	public static final String ATTRIBUTE_FSTCADHEAT_TRACING 					 = PropertyUtil.getSchemaProperty("attribute_fstCADHEAT_TRACING");
	public static final String ATTRIBUTE_FSTCADSERVICE_FROM 					 = PropertyUtil.getSchemaProperty("attribute_fstCADSERVICE_FROM");
	public static final String ATTRIBUTE_FSTCADSERVICE_TO 						 = PropertyUtil.getSchemaProperty("attribute_fstCADSERVICE_TO");
	public static final String ATTRIBUTE_FSTCADPID_NO 							 = PropertyUtil.getSchemaProperty("attribute_fstCADPID_NO");
	public static final String ATTRIBUTE_FSTCADPRESSURE_OPER_MAX 				 = PropertyUtil.getSchemaProperty("attribute_fstCADPRESSURE_OPER_MAX");
	public static final String ATTRIBUTE_FSTCADTEMP_OPER_MAX 					 = PropertyUtil.getSchemaProperty("attribute_fstCADTEMP_OPER_MAX");
	public static final String ATTRIBUTE_FSTCADPRESSURE_DESIGN_MAX 				 = PropertyUtil.getSchemaProperty("attribute_fstCADPRESSURE_DESIGN_MAX");
	public static final String ATTRIBUTE_FSTCADTEMP_DESIGN_MAX 					 = PropertyUtil.getSchemaProperty("attribute_fstCADTEMP_DESIGN_MAX");
	public static final String ATTRIBUTE_FSTCADTEST_PRESSURE 					 = PropertyUtil.getSchemaProperty("attribute_fstCADTEST_PRESSURE");
	public static final String ATTRIBUTE_FSTCADKBRTESTMEDIUM 					 = PropertyUtil.getSchemaProperty("attribute_fstCADKBRTESTMEDIUM");
	public static final String ATTRIBUTE_FSTCADSP_JOPERNORMPRESS 				 = PropertyUtil.getSchemaProperty("attribute_fstCADSP_JOPERNORMPRESS");
	public static final String ATTRIBUTE_FSTCADSP_JOPERNORMTEMP 				 = PropertyUtil.getSchemaProperty("attribute_fstCADSP_JOPERNORMTEMP");
	public static final String ATTRIBUTE_FSTCADPWHT 							 = PropertyUtil.getSchemaProperty("attribute_fstCADPWHT");
	public static final String ATTRIBUTE_FSTTAGNORULELESSYN 					 = PropertyUtil.getSchemaProperty("attribute_fstTagNoRulelessYN");
	public static final String ATTRIBUTE_FSTICSSCATEGORY 						 = PropertyUtil.getSchemaProperty("attribute_fstICSSCategory");
	public static final String ATTRIBUTE_FSTTAGREMARK 							 = PropertyUtil.getSchemaProperty("attribute_fstTagRemark");
	public static final String ATTRIBUTE_TITLE 									 = PropertyUtil.getSchemaProperty("attribute_Title");
	public static final String ATTRIBUTE_ORGANIZATIONNAME 						 = PropertyUtil.getSchemaProperty("attribute_OrganizationName");
   	public static final String ATTRIBUTE_CADTYPE 								 = PropertyUtil.getSchemaProperty("attribute_fstCADTYPE");
    public static final String ATTRIBUTE_FSTKORNAME 							 = PropertyUtil.getSchemaProperty("attribute_fstKorName");
    public static final String ATTRIBUTE_FSTENGNAME 							 = PropertyUtil.getSchemaProperty("attribute_fstEngName");
    public static final String ATTRIBUTE_EMAIL_ADDRESS 							 = PropertyUtil.getSchemaProperty("attribute_EmailAddress");
    public static final String ATTRIBUTE_FSTPRODUCTSTART 						 = PropertyUtil.getSchemaProperty("attribute_fstProductStart");
	public static final String ATTRIBUTE_FSTPRODUCTEND 							 = PropertyUtil.getSchemaProperty("attribute_fstProductEnd");
	public static final String ATTRIBUTE_FSTITEMSPECIFICATION 					 = PropertyUtil.getSchemaProperty("attribute_fstItemSpecification");
	public static final String ATTRIBUTE_FSTITEMFULLNAME 						 = PropertyUtil.getSchemaProperty("attribute_fstItemFullName");
	public static final String ATTRIBUTE_FSTITEMNAME 						 	 = PropertyUtil.getSchemaProperty("attribute_fstItemName");
	public static final String ATTRIBUTE_FSTITEMENGNAME 						 = PropertyUtil.getSchemaProperty("attribute_fstItemEngName");
	public static final String ATTRIBUTE_FSTITEMACCOUNT 						 = PropertyUtil.getSchemaProperty("attribute_fstItemAccount");
	public static final String ATTRIBUTE_FSTITEMTYPE 							 = PropertyUtil.getSchemaProperty("attribute_fstItemType");
	public static final String ATTRIBUTE_FSTPROCURETYPE 						 = PropertyUtil.getSchemaProperty("attribute_fstProcureType");
	public static final String ATTRIBUTE_FSTISEXCLUSIVEITEM 					 = PropertyUtil.getSchemaProperty("attribute_fstIsExclusiveItem");
	public static final String ATTRIBUTE_FSTISSINGLESUPPLY 						 = PropertyUtil.getSchemaProperty("attribute_fstIsSingleSupply");
	public static final String ATTRIBUTE_FSTMANUFACTURINGSTRATEGY  				 = PropertyUtil.getSchemaProperty("attribute_fstManufacturingStrategy ");
	public static final String ATTRIBUTE_FSTLOTSIZE 							 = PropertyUtil.getSchemaProperty("attribute_fstLotSize");
	public static final String ATTRIBUTE_FSTROUNDUPDATE 						 = PropertyUtil.getSchemaProperty("attribute_fstRoundUpDate");
	public static final String ATTRIBUTE_FSTSEMIMANUFACTURESTOCKMETHOD 			 = PropertyUtil.getSchemaProperty("attribute_fstSemiManufactureStockMethod");
	public static final String ATTRIBUTE_FSTSTOCKSTORAGE 						 = PropertyUtil.getSchemaProperty("attribute_fstStockStorage");
	public static final String ATTRIBUTE_FSTRELEASEMETHOD 						 = PropertyUtil.getSchemaProperty("attribute_fstReleaseMethod");
	public static final String ATTRIBUTE_FSTRELEASESTORAGE 						 = PropertyUtil.getSchemaProperty("attribute_fstReleaseStorage");
	public static final String ATTRIBUTE_FSTRELEASEUNIT 						 = PropertyUtil.getSchemaProperty("attribute_fstReleaseUnit");
	public static final String ATTRIBUTE_FSTINVENTORYUNIT 						 = PropertyUtil.getSchemaProperty("attribute_fstInventoryUnit");
	public static final String ATTRIBUTE_FSTINVENTORYSURVEYPERIOD 				 = PropertyUtil.getSchemaProperty("attribute_fstInventorySurveyPeriod");
	public static final String ATTRIBUTE_FSTMANUFACTUREORDERUNIT 				 = PropertyUtil.getSchemaProperty("attribute_fstManufactureOrderUnit");
	public static final String ATTRIBUTE_FSTMANUFACTUREORDERLT 					 = PropertyUtil.getSchemaProperty("attribute_fstManufactureOrderLT");
	public static final String ATTRIBUTE_FSTPURCHASEORDER 						 = PropertyUtil.getSchemaProperty("attribute_fstPurchaseOrder");
	public static final String ATTRIBUTE_FSTPURCHASEORDERLT 					 = PropertyUtil.getSchemaProperty("attribute_fstPurchaseOrderLT");
	public static final String ATTRIBUTE_FSTPURCHASEGROUP 						 = PropertyUtil.getSchemaProperty("attribute_fstPurchaseGroup");
	public static final String ATTRIBUTE_FSTFINALINSPECT 						 = PropertyUtil.getSchemaProperty("attribute_fstFinalInspect");
	public static final String ATTRIBUTE_FSTPROCESSINSPECT 						 = PropertyUtil.getSchemaProperty("attribute_fstProcessInspect");
	public static final String ATTRIBUTE_FSTINCOMEINSPECT 						 = PropertyUtil.getSchemaProperty("attribute_fstIncomeInspect");
	public static final String ATTRIBUTE_FSTFORWARDINSPECT 						 = PropertyUtil.getSchemaProperty("attribute_fstForwardInspect");
	public static final String ATTRIBUTE_FSTMILITARYDIVIDE 						 = PropertyUtil.getSchemaProperty("attribute_fstMilitaryDivide");
	public static final String ATTRIBUTE_FSTNATIONINVENTORYNO 					 = PropertyUtil.getSchemaProperty("attribute_fstNationInventoryNo");
	public static final String ATTRIBUTE_FSTPARTMANAGENO 						 = PropertyUtil.getSchemaProperty("attribute_fstPartManageNo");
	public static final String ATTRIBUTE_FSTPRODUCTIONTYPE 						 = PropertyUtil.getSchemaProperty("attribute_fstProductionType");
	public static final String ATTRIBUTE_FSTINTERGRATEDCOSTPARTTYPE 			 = PropertyUtil.getSchemaProperty("attribute_fstIntergratedCostPartType");
	public static final String ATTRIBUTE_FSTDEFENSEARTICLESAPPOINTYN 			 = PropertyUtil.getSchemaProperty("attribute_fstDefenseArticlesAppointYN");
	public static final String ATTRIBUTE_FSTDEFENSEARTICLESAPPOINTBASED 		 = PropertyUtil.getSchemaProperty("attribute_fstDefenseArticlesAppointBased");
	public static final String ATTRIBUTE_FSTPURCHASECLASSIFICATION 				 = PropertyUtil.getSchemaProperty("attribute_fstPurchaseClassification");
	public static final String ATTRIBUTE_FSTISPRESCRIPTION 						 = PropertyUtil.getSchemaProperty("attribute_fstIsPrescription");
	public static final String ATTRIBUTE_FSTISESD 							 	 = PropertyUtil.getSchemaProperty("attribute_fstIsESD");
	public static final String ATTRIBUTE_FSTISMSL 							 	 = PropertyUtil.getSchemaProperty("attribute_fstIsMSL");
	public static final String ATTRIBUTE_FSTITEMSIGN 							 = PropertyUtil.getSchemaProperty("attribute_fstItemSign");
	public static final String ATTRIBUTE_FSTITEMIDENTIFICATIONCODE 				 = PropertyUtil.getSchemaProperty("attribute_fstItemIdentificationCode");
	public static final String ATTRIBUTE_FSTSTANDARDIZATIONTYPE 				 = PropertyUtil.getSchemaProperty("attribute_fstStandardizationType");
	public static final String ATTRIBUTE_FSTDEFENSEDRAWINGTYPE 					 = PropertyUtil.getSchemaProperty("attribute_fstDefenseDrawingType");
	public static final String ATTRIBUTE_FSTDEFENSEDRAWINGPARTNO 				 = PropertyUtil.getSchemaProperty("attribute_fstDefenseDrawingPartNo");
	public static final String ATTRIBUTE_FSTDRAWINGNO 							 = PropertyUtil.getSchemaProperty("attribute_fstDrawingNo");
	public static final String ATTRIBUTE_FSTDRAWINGNOOFREV 						 = PropertyUtil.getSchemaProperty("attribute_fstDrawingNoOfRev");
	public static final String ATTRIBUTE_FSTDRAWINGNOOFREVDATE 					 = PropertyUtil.getSchemaProperty("attribute_fstDrawingNoOfRevDate");
	public static final String ATTRIBUTE_FSTCONFIGURATIONIDENTIFICATIONOWNER 	 = PropertyUtil.getSchemaProperty("attribute_fstConfigurationIdentificationOwner");
	public static final String ATTRIBUTE_FSTSTANDARDNO 							 = PropertyUtil.getSchemaProperty("attribute_fstStandardNo");
	public static final String ATTRIBUTE_FSTSTANDARDPARTNO 						 = PropertyUtil.getSchemaProperty("attribute_fstStandardPartNo");
	public static final String ATTRIBUTE_FSTMANUFACTUREPARTNO 					 = PropertyUtil.getSchemaProperty("attribute_fstManufacturePartNo");
	public static final String ATTRIBUTE_FSTMANUFACTUREITEMNAME 				 = PropertyUtil.getSchemaProperty("attribute_fstManufactureItemName");
	public static final String ATTRIBUTE_FSTMANUFACTURETAXIDNO 					 = PropertyUtil.getSchemaProperty("attribute_fstManufactureTaxIDNo");
	public static final String ATTRIBUTE_FSTMANUFACTURECORPORATENAME 			 = PropertyUtil.getSchemaProperty("attribute_fstManufactureCorporateName");
	public static final String ATTRIBUTE_FSTRAWMATERIALSYMBOL 					 = PropertyUtil.getSchemaProperty("attribute_fstRawMaterialSymbol");
	public static final String ATTRIBUTE_FSTRAWMATERIALSTANDARD 				 = PropertyUtil.getSchemaProperty("attribute_fstRawMaterialStandard");
	public static final String ATTRIBUTE_FSTPRIMARYEQUIPMENT 					 = PropertyUtil.getSchemaProperty("attribute_fstPrimaryEquipment");
	public static final String ATTRIBUTE_FSTASSEMBLYNAME 						 = PropertyUtil.getSchemaProperty("attribute_fstAssemblyName");
	public static final String ATTRIBUTE_FSTWEIGHT 							 	 = PropertyUtil.getSchemaProperty("attribute_fstWeight");
	public static final String ATTRIBUTE_FSTWEIGHTUNIT 							 = PropertyUtil.getSchemaProperty("attribute_fstWeightUnit");
	public static final String ATTRIBUTE_FSTVOLUME 							 	 = PropertyUtil.getSchemaProperty("attribute_fstVolume");
	public static final String ATTRIBUTE_FSTVOLUMEUNIT 							 = PropertyUtil.getSchemaProperty("attribute_fstVolumeUnit");
	public static final String ATTRIBUTE_FSTMATERIALTYPE 						 = PropertyUtil.getSchemaProperty("attribute_fstMaterialType");
	public static final String ATTRIBUTE_FSTUNIT 							 	 = PropertyUtil.getSchemaProperty("attribute_fstUnit");
	public static final String ATTRIBUTE_FSTISPHANTOM 							 = PropertyUtil.getSchemaProperty("attribute_fstIsPhantom");
	public static final String ATTRIBUTE_FSTUNIQUEPARTNUMBER					 = PropertyUtil.getSchemaProperty("attribute_fstUniquePartNumber");
	public static final String ATTRIBUTE_FSTDELIVERABLEITEMYN					 = PropertyUtil.getSchemaProperty("attribute_fstDeliverableItemYN");
	public static final String ATTRIBUTE_FSTCONFIGURATIONMANAGEYN					 = PropertyUtil.getSchemaProperty("attribute_fstConfigurationManageYN");
	public static final String ATTRIBUTE_FSTPRODUCTREQUIREDYN					 = PropertyUtil.getSchemaProperty("attribute_fstProductRequiredYN");


	public static final String ATTRIBUTE_FSTDOCUMENTNAME						 = PropertyUtil.getSchemaProperty("attribute_fstDocumentName");
	public static final String ATTRIBUTE_FSTCUSTOMERDOCNUMBER					 = PropertyUtil.getSchemaProperty("attribute_fstCustomerDocNumber");
	public static final String ATTRIBUTE_FSTCUSTOMERDOCREVISION				 	 = PropertyUtil.getSchemaProperty("attribute_fstCustomerDocRevision");
	public static final String ATTRIBUTE_FSTISDELIVERABLEDOCUMENT			 	 = PropertyUtil.getSchemaProperty("attribute_fstIsDeliverableDocument");
	public static final String ATTRIBUTE_FSTISCONFIGURATIONITEM				 	 = PropertyUtil.getSchemaProperty("attribute_fstIsConfigurationItem");
	public static final String ATTRIBUTE_FSTBASELINE							 = PropertyUtil.getSchemaProperty("attribute_fstBaseLine");
	public static final String ATTRIBUTE_FSTCONSERVATIONTERMDATE				 = PropertyUtil.getSchemaProperty("attribute_fstConservationTermDate");
	public static final String ATTRIBUTE_FSTCONSERVATIONTERM					 = PropertyUtil.getSchemaProperty("attribute_fstConservationTerm");
	public static final String ATTRIBUTE_FSTNEEDTORECLAIM					 	 = PropertyUtil.getSchemaProperty("attribute_fstNeedToReclaim");
	public static final String ATTRIBUTE_FSTRECOVERYPERIOD					 	 = PropertyUtil.getSchemaProperty("attribute_fstRecoveryPeriod");
	public static final String ATTRIBUTE_FSTRECOVERYFINISHDATE					 = PropertyUtil.getSchemaProperty("attribute_fstRecoveryFinishDate");
	public static final String ATTRIBUTE_FSTCUSTOMERCOMPANY					 	 = PropertyUtil.getSchemaProperty("attribute_fstCustomerCompany");
	public static final String ATTRIBUTE_FSTSECURITYCLASS						 = PropertyUtil.getSchemaProperty("attribute_fstSecurityClass");
	public static final String ATTRIBUTE_FSTNEEDPEERREVIEW					 	 = PropertyUtil.getSchemaProperty("attribute_fstNeedPeerReview");
	public static final String ATTRIBUTE_FSTPLANDELIVERYDATE					 = PropertyUtil.getSchemaProperty("attribute_fstPlanDeliveryDate");
	public static final String ATTRIBUTE_FSTACTUALDELIVERYDATE				 	 = PropertyUtil.getSchemaProperty("attribute_fstActualDeliveryDate");
	public static final String ATTRIBUTE_FSTSTARTFACILITYUNITNUMBER				 = PropertyUtil.getSchemaProperty("attribute_fstStartFacilityUnitNumber");
	public static final String ATTRIBUTE_FSTENDFACILITYUNITNUMBER				 = PropertyUtil.getSchemaProperty("attribute_fstEndFacilityUnitNumber");
	public static final String ATTRIBUTE_FSTFACILITYUNITNUMBER				 	 = PropertyUtil.getSchemaProperty("attribute_fstFacilityUnitNumber");
	public static final String ATTRIBUTE_FSTISRECOVERY						 	 = PropertyUtil.getSchemaProperty("attribute_fstIsRecovery");
	public static final String ATTRIBUTE_FSTNAMESERIALNO			 	 		 = PropertyUtil.getSchemaProperty("attribute_fstNameSerialNo");
	public static final String ATTRIBUTE_FSTDRAWINGSIZE			 	 		 	 = PropertyUtil.getSchemaProperty("attribute_fstDrawingSize");
	public static final String ATTRIBUTE_FSTAPPROVERBYCUSTOMER	 	 		 	 = PropertyUtil.getSchemaProperty("attribute_fstApproverbyCustomer");
	public static final String ATTRIBUTE_FSTRETRIEVEISCOMPLETE	 	 		 	 = PropertyUtil.getSchemaProperty("attribute_fstRetrieveIsComplete");
	public static final String ATTRIBUTE_FSTRETRIEVEREASON	 	 		 	 	 = PropertyUtil.getSchemaProperty("attribute_fstRetrieveReason");
	public static final String ATTRIBUTE_FSTEQUIPMENTABBREVIATION	 	 		 = PropertyUtil.getSchemaProperty("attribute_fstEquipmentAbbreviation");

	public static final String ATTRIBUTE_FSTDOCUMENTNUMBERSENDEDBY	 	 		 = PropertyUtil.getSchemaProperty("attribute_fstDocumentNumberSendedBy");
	public static final String ATTRIBUTE_FSTDOCUMENTNAMESENDEDBY	 	 	 	 = PropertyUtil.getSchemaProperty("attribute_fstDocumentNameSendedBy");
	public static final String ATTRIBUTE_FSTSENDCOMPANY	 	 		 	 	 	 = PropertyUtil.getSchemaProperty("attribute_fstSendCompany");
	public static final String ATTRIBUTE_FSTDATESENDEDBY	 	 		 	  	 = PropertyUtil.getSchemaProperty("attribute_fstDateSendedBy");
	public static final String ATTRIBUTE_FSTRECEIVEDEPARTMENT 		 	 	 	 = PropertyUtil.getSchemaProperty("attribute_fstReceiveDepartment");
	public static final String ATTRIBUTE_FSTDEFAULTAPPROVAL 		 	 	 	 = PropertyUtil.getSchemaProperty("attribute_fstDefaultApproval");

	public static final String ATTRIBUTE_REVIEW_COMMENTS_NEEDED				 = PropertyUtil.getSchemaProperty("attribute_ReviewCommentsNeeded");
	public static final String ATTRIBUTE_INSTRUCTIONS 							= PropertyUtil.getSchemaProperty("attribute_Instructions");

	public static final String ATTRIBUTE_FSTSTARTEFFECTIVITYDATE						= PropertyUtil.getSchemaProperty("attribute_fstStartEffectivityDate");
	public static final String ATTRIBUTE_FSTENDEFFECTIVITYDATE						= PropertyUtil.getSchemaProperty("attribute_fstEndEffectivityDate");
	public static final String ATTRIBUTE_FSTCUTOMERDOCNUMBER						= PropertyUtil.getSchemaProperty("attribute_fstCutomerDocNumber");
	public static final String ATTRIBUTE_FSTCUTOMERDOCREVISION						= PropertyUtil.getSchemaProperty("attribute_fstCutomerDocRevision");

	public static final String ATTRIBUTE_FSTAPPROVERPLACE						= PropertyUtil.getSchemaProperty("attribute_fstApproverPlace");
	public static final String ATTRIBUTE_FSTAPPROVERPLACEDETAIL					= PropertyUtil.getSchemaProperty("attribute_fstApproverPlaceDetail");
	public static final String ATTRIBUTE_FSTDESIGN								= PropertyUtil.getSchemaProperty("attribute_fstDesign");
	public static final String ATTRIBUTE_FSTDRAFTING							= PropertyUtil.getSchemaProperty("attribute_fstDrafting");
	public static final String ATTRIBUTE_FSTCHECKOFDRAWINGLEFT					= PropertyUtil.getSchemaProperty("attribute_fstCheckOfDrawingLeft");
	public static final String ATTRIBUTE_FSTCHECKOFDRAWINGRIGHTDOWN				= PropertyUtil.getSchemaProperty("attribute_fstCheckOfDrawingRightDown");
	public static final String ATTRIBUTE_FSTCHECKOFDRAWINGRIGHTCENTER			= PropertyUtil.getSchemaProperty("attribute_fstCheckOfDrawingRightCenter");
	public static final String ATTRIBUTE_FSTAPPROVAL							= PropertyUtil.getSchemaProperty("attribute_fstApproval");
	public static final String ATTRIBUTE_FSTORIGIN								= PropertyUtil.getSchemaProperty("attribute_fstOrigin");
	public static final String ATTRIBUTE_FSTOUTDRAWINGDATE						= PropertyUtil.getSchemaProperty("attribute_fstOutDrawingDate");
	public static final String ATTRIBUTE_FSTOUTDRAWINGNUMBER					= PropertyUtil.getSchemaProperty("attribute_fstOutDrawingNumber");
	public static final String ATTRIBUTE_FSTEXPIRYDATE							= PropertyUtil.getSchemaProperty("attribute_fstExpiryDate");
	public static final String ATTRIBUTE_FSTCONFIGURATIONREGULATEOWNER			= PropertyUtil.getSchemaProperty("attribute_fstConfigurationRegulateOwner");
	public static final String ATTRIBUTE_FSTOUTDRAWINGAPPROVEDDATE				= PropertyUtil.getSchemaProperty("attribute_fstOutDrawingApprovedDate");
	public static final String ATTRIBUTE_FSTINDIVIDUALRECEIPTNUMBER				= PropertyUtil.getSchemaProperty("attribute_fstIndividualReceiptNumber");
	public static final String ATTRIBUTE_FSTORIGINALSIZE						= PropertyUtil.getSchemaProperty("attribute_fstOriginalSize");
	public static final String ATTRIBUTE_FSTPRINTSIZE							= PropertyUtil.getSchemaProperty("attribute_fstPrintSize");
	public static final String ATTRIBUTE_FSTSTANDARDIZATIONTAGETYN				= PropertyUtil.getSchemaProperty("attribute_fstStandardizationTagetYN");
	public static final String ATTRIBUTE_FSTSTANDARDIZATIONCOMPLETEYN			= PropertyUtil.getSchemaProperty("attribute_fstStandardizationCompleteYN");

	public static final String ATTRIBUTE_FSTSTANDARDPARTMANAGENO				= PropertyUtil.getSchemaProperty("attribute_fstStandardPartManageNo");
	public static final String ATTRIBUTE_FSTSTANDARDNEEDYN						= PropertyUtil.getSchemaProperty("attribute_fstStandardNeedYN");
	public static final String ATTRIBUTE_FSTSTANDARDCOMPLETEYN					= PropertyUtil.getSchemaProperty("attribute_fstStandardCompleteYN");

	public static final String ATTRIBUTE_FSTDOCUMENTRECEIPTNUMBER				= PropertyUtil.getSchemaProperty("attribute_fstDocumentReceiptNumber");
	public static final String ATTRIBUTE_FSTDISTRIBUTIONNUMBER					= PropertyUtil.getSchemaProperty("attribute_fstDistributionNumber");

	public static final String ATTRIBUTE_FSTSTANDARDITEMCODE					= PropertyUtil.getSchemaProperty("attribute_fstStandardItemCode");
    public static final String ATTRIBUTE_FSTDISTRIBUTIONTYPE                    = PropertyUtil.getSchemaProperty("attribute_fstDistributionType");
    public static final String ATTRIBUTE_FSTPURCHASECONFIRMEDFLAG               = PropertyUtil.getSchemaProperty("attribute_fstPurchaseConfirmedFlag");
    public static final String ATTRIBUTE_FSTPURCHASECONFIRMEDDATE               = PropertyUtil.getSchemaProperty("attribute_fstPurchaseConfirmedDate");






	/*
     * Select Constants
     */
	public static final String SELECT_ATTRIBUTE_TASKESTIMATEDSTARTDATE 					= "attribute[" + ATTRIBUTE_TASKESTIMATEDSTARTDATE + "]";
	public static final String SELECT_ATTRIBUTE_TASKESTIMATEDFINISHDATE 				= "attribute[" + ATTRIBUTE_TASKESTIMATEDFINISHDATE + "]";
	public static final String SELECT_ATTRIBUTE_TASKESTIMATEDDURATION 					= "attribute[" + ATTRIBUTE_TASKESTIMATEDDURATION + "]";
	public static final String SELECT_ATTRIBUTE_TASKACTUALSTARTDATE 					= "attribute[" + ATTRIBUTE_TASKACTUALSTARTDATE + "]";
	public static final String SELECT_ATTRIBUTE_TASKACTUALFINISHDATE 					= "attribute[" + ATTRIBUTE_TASKACTUALFINISHDATE + "]";
	public static final String SELECT_ATTRIBUTE_TASKACTUALDURATION 						= "attribute[" + ATTRIBUTE_TASKACTUALDURATION + "]";
	public static final String SELECT_ATTRIBUTE_FSTCODE 								= "attribute[" + ATTRIBUTE_FSTCODE + "]";
	public static final String SELECT_ATTRIBUTE_FSTCODEVALUE 							= "attribute[" + ATTRIBUTE_FSTCODEVALUE + "]";
	public static final String SELECT_ATTRIBUTE_FSTORIGINATOR 							= "attribute[" + ATTRIBUTE_FSTORIGINATOR + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGCLASSNAME 						= "attribute[" + ATTRIBUTE_FSTTAGCLASSNAME + "]";
	public static final String SELECT_ATTRIBUTE_FSTCPYTAGCLASSNAME 						= "attribute[" + ATTRIBUTE_FSTCPYTAGCLASSNAME + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGCLASSRFQNOCATEGORY 				= "attribute[" + ATTRIBUTE_FSTTAGCLASSRFQNOCATEGORY + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGCLASSRFQNOMANDATORYYN 			= "attribute[" + ATTRIBUTE_FSTTAGCLASSRFQNOMANDATORYYN + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGCLASSDETAILDPMANDATORYYN 			= "attribute[" + ATTRIBUTE_FSTTAGCLASSDETAILDPMANDATORYYN + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGCLASSVDPMANDATORYYN 				= "attribute[" + ATTRIBUTE_FSTTAGCLASSVDPMANDATORYYN + "]";
	public static final String SELECT_ATTRIBUTE_FSTLCITAGATTRCLASSNAME 					= "attribute[" + ATTRIBUTE_FSTLCITAGATTRCLASSNAME + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNUMRULEUNITNAME 					= "attribute[" + ATTRIBUTE_FSTTAGNUMRULEUNITNAME + "]";
	public static final String SELECT_ATTRIBUTE_FSTPCSTAGTYPE 							= "attribute[" + ATTRIBUTE_FSTPCSTAGTYPE + "]";
	public static final String SELECT_ATTRIBUTE_FSTSEQUENCEORDERLIST 					= "attribute[" + ATTRIBUTE_FSTSEQUENCEORDERLIST + "]";
	public static final String SELECT_ATTRIBUTE_FSTSEQUENCEORDER 						= "attribute[" + ATTRIBUTE_FSTSEQUENCEORDER + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNUMRULEUNITCLASSIFYCATEGORY 		= "attribute[" + ATTRIBUTE_FSTTAGNUMRULEUNITCLASSIFYCATEGORY + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNUMRULEUNITVALUECATEGORY 			= "attribute[" + ATTRIBUTE_FSTTAGNUMRULEUNITVALUECATEGORY + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNUMRULEUNITVALUEFIXEDVALUE 		= "attribute[" + ATTRIBUTE_FSTTAGNUMRULEUNITVALUEFIXEDVALUE + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNUMRULEUNITVALUELOV 				= "attribute[" + ATTRIBUTE_FSTTAGNUMRULEUNITVALUELOV + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNUMRULEUNITVALUELISTOFREFCATEGORY = "attribute[" + ATTRIBUTE_FSTTAGNUMRULEUNITVALUELISTOFREFCATEGORY + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNUMRULEUNITVALUEMIN 				= "attribute[" + ATTRIBUTE_FSTTAGNUMRULEUNITVALUEMIN + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNUMRULEUNITVALUEMAX 				= "attribute[" + ATTRIBUTE_FSTTAGNUMRULEUNITVALUEMAX + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNUMRULEUNITDIGITCATEGORY 			= "attribute[" + ATTRIBUTE_FSTTAGNUMRULEUNITDIGITCATEGORY + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNUMRULEUNITDIGITFIXEDLENGTH 		= "attribute[" + ATTRIBUTE_FSTTAGNUMRULEUNITDIGITFIXEDLENGTH + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNUMRULEUNITVARIABLEDIGITCATEGORY  = "attribute[" + ATTRIBUTE_FSTTAGNUMRULEUNITVARIABLEDIGITCATEGORY + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNUMRULEUNITVARIABLEDIGITMINLENGTH = "attribute[" + ATTRIBUTE_FSTTAGNUMRULEUNITVARIABLEDIGITMINLENGTH + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNUMRULEUNITVARIABLEDIGITMAXLENGTH = "attribute[" + ATTRIBUTE_FSTTAGNUMRULEUNITVARIABLEDIGITMAXLENGTH + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNUMRULEUNITVARIABLEDIGITLENGTHLOV = "attribute[" + ATTRIBUTE_FSTTAGNUMRULEUNITVARIABLEDIGITLENGTHLOV + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNUMRULEUNITFORMATDISPLAY 			= "attribute[" + ATTRIBUTE_FSTTAGNUMRULEUNITFORMATDISPLAY + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNUMRULEUNITVALUEFORMATCONSTRAINT 	= "attribute[" + ATTRIBUTE_FSTTAGNUMRULEUNITVALUEFORMATCONSTRAINT + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNUMRULEUNITSUFFIXMINSELECT 		= "attribute[" + ATTRIBUTE_FSTTAGNUMRULEUNITSUFFIXMINSELECT + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNUMRULEUNITSEQDEPENDENT 			= "attribute[" + ATTRIBUTE_FSTTAGNUMRULEUNITSEQDEPENDENT + "]";
	public static final String SELECT_ATTRIBUTE_FSTLCITAGATTRCLASSCATEGORY 				= "attribute[" + ATTRIBUTE_FSTLCITAGATTRCLASSCATEGORY + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNODWGDISCIPLINE 					= "attribute[" + ATTRIBUTE_FSTTAGNODWGDISCIPLINE + "]";
	public static final String SELECT_ATTRIBUTE_FSTOWNERDEPARMENT 						= "attribute[" + ATTRIBUTE_FSTOWNERDEPARMENT + "]";
	public static final String SELECT_ATTRIBUTE_FSTOWNERPERSON 							= "attribute[" + ATTRIBUTE_FSTOWNERPERSON  + "]";
	public static final String SELECT_ATTRIBUTE_FSTPARTICIPANTDEPARTMENTS 				= "attribute[" + ATTRIBUTE_FSTPARTICIPANTDEPARTMENTS + "]";
	public static final String SELECT_ATTRIBUTE_ORGANIZATION_ID	 						= "attribute[" + ATTRIBUTE_ORGANIZATION_ID + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNUMRULEUNITSEQUENCECATEGORY 		= "attribute[" + ATTRIBUTE_FSTTAGNUMRULEUNITSEQUENCECATEGORY + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNUMRULEUNITSUFFIXCATEGORY 		= "attribute[" + ATTRIBUTE_FSTTAGNUMRULEUNITSUFFIXCATEGORY + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNUMRULEUNITSUFFIXGROUPCATEGORY 	= "attribute[" + ATTRIBUTE_FSTTAGNUMRULEUNITSUFFIXGROUPCATEGORY + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNUMBERUNITSTR 					= "attribute[" + ATTRIBUTE_FSTTAGNUMBERUNITSTR + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNOVOIDREASON 						= "attribute[" + ATTRIBUTE_FSTTAGNOVOIDREASON + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNOUNVOIDREASON 					= "attribute[" + ATTRIBUTE_FSTTAGNOUNVOIDREASON + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNOFORCETAGGINGREASON 				= "attribute[" + ATTRIBUTE_FSTTAGNOFORCETAGGINGREASON + "]";
	public static final String SELECT_ATTRIBUTE_FSTCODEUSEYN 							= "attribute[" + ATTRIBUTE_FSTCODEUSEYN + "]";
	public static final String SELECT_ATTRIBUTE_FSTCODENAME 							= "attribute[" + ATTRIBUTE_FSTCODENAME + "]";
	public static final String SELECT_ATTRIBUTE_FSTFILEFORM 							= "attribute[" + ATTRIBUTE_FSTFILEFORM + "]";
	public static final String SELECT_ATTRIBUTE_FSTVERSION 								= "attribute[" + ATTRIBUTE_FSTVERSION + "]";
	public static final String SELECT_ATTRIBUTE_FSTSHEETNAME 							= "attribute[" + ATTRIBUTE_FSTSHEETNAME + "]";
	public static final String SELECT_ATTRIBUTE_FSTHEADERCOLUMN 						= "attribute[" + ATTRIBUTE_FSTHEADERCOLUMN + "]";
	public static final String SELECT_ATTRIBUTE_FSTDATACOLUMN 							= "attribute[" + ATTRIBUTE_FSTDATACOLUMN + "]";
	public static final String SELECT_ATTRIBUTE_FSTLCITAGATTRCLASSDOCTYPES 				= "attribute[" + ATTRIBUTE_FSTLCITAGATTRCLASSDOCTYPES + "]";
	public static final String SELECT_ATTRIBUTE_FSTLCITAGATTRCLASSIFYCATEGORY 			= "attribute[" + ATTRIBUTE_FSTLCITAGATTRCLASSIFYCATEGORY + "]";
	public static final String SELECT_ATTRIBUTE_FSTLCITAGATTRBASICINFOCATEGORY 			= "attribute[" + ATTRIBUTE_FSTLCITAGATTRBASICINFOCATEGORY + "]";
	public static final String SELECT_ATTRIBUTE_FSTLCITAGATTRVALUETYPECONSTRAINT 		= "attribute[" + ATTRIBUTE_FSTLCITAGATTRVALUETYPECONSTRAINT + "]";
	public static final String SELECT_ATTRIBUTE_FSTLCITAGATTRBASICINFOVALUETYPE 		= "attribute[" + ATTRIBUTE_FSTLCITAGATTRBASICINFOVALUETYPE + "]";
	public static final String SELECT_ATTRIBUTE_FSTLCITAGATTRENOVIAATTRIBUTENAME 		= "attribute[" + ATTRIBUTE_FSTLCITAGATTRENOVIAATTRIBUTENAME + "]";
	public static final String SELECT_ATTRIBUTE_FSTLCITAGATTRDISPLAYNAME 				= "attribute[" + ATTRIBUTE_FSTLCITAGATTRDISPLAYNAME + "]";
	public static final String SELECT_ATTRIBUTE_FSTLCITAGCOLUMNORDER 					= "attribute[" + ATTRIBUTE_FSTLCITAGCOLUMNORDER + "]";
	public static final String SELECT_ATTRIBUTE_FSTLCITAGATTRDESCRIPTION 				= "attribute[" + ATTRIBUTE_FSTLCITAGATTRDESCRIPTION + "]";
	public static final String SELECT_ATTRIBUTE_FSTLCITAGATTRVALUEUOM 					= "attribute[" + ATTRIBUTE_FSTLCITAGATTRVALUEUOM + "]";
	public static final String SELECT_ATTRIBUTE_FSTLCITAGATTRVALUEMAXLENGTH 			= "attribute[" + ATTRIBUTE_FSTLCITAGATTRVALUEMAXLENGTH + "]";
	public static final String SELECT_ATTRIBUTE_FSTLCITAGATTRFIXEDVALUE 				= "attribute[" + ATTRIBUTE_FSTLCITAGATTRFIXEDVALUE + "]";
	public static final String SELECT_ATTRIBUTE_FSTLCITAGATTRUSERSELECTVALUELOV 		= "attribute[" + ATTRIBUTE_FSTLCITAGATTRUSERSELECTVALUELOV + "]";
	public static final String SELECT_ATTRIBUTE_FSTLCITAGATTRTAGNUMBERUNITNAME 			= "attribute[" + ATTRIBUTE_FSTLCITAGATTRTAGNUMBERUNITNAME + "]";
	public static final String SELECT_ATTRIBUTE_FSTLCITAGATTREBOMATTRIBUTENAME 			= "attribute[" + ATTRIBUTE_FSTLCITAGATTREBOMATTRIBUTENAME + "]";
	public static final String SELECT_ATTRIBUTE_FSTLCITAGATTRRELATEDDOCUMENTTYPE 		= "attribute[" + ATTRIBUTE_FSTLCITAGATTRRELATEDDOCUMENTTYPE + "]";
	public static final String SELECT_ATTRIBUTE_FSTLCITAGATTRREQUIREMENTS 				= "attribute[" + ATTRIBUTE_FSTLCITAGATTRREQUIREMENTS + "]";
	public static final String SELECT_ATTRIBUTE_FSTLCITAGEXCELCOLUMNNAME 				= "attribute[" + ATTRIBUTE_FSTLCITAGEXCELCOLUMNNAME + "]";
	public static final String SELECT_ATTRIBUTE_FSTIOTYPE 								= "attribute[" + ATTRIBUTE_FSTIOTYPE + "]";
	public static final String SELECT_ATTRIBUTE_FSTICSSSYSTEM 							= "attribute[" + ATTRIBUTE_FSTICSSSYSTEM + "]";
	public static final String SELECT_ATTRIBUTE_FSTDISCIPLINEFORECAST 					= "attribute[" + ATTRIBUTE_FSTDISCIPLINEFORECAST + "]";
	public static final String SELECT_ATTRIBUTE_FSTICSSIOTYPE 							= "attribute[" + ATTRIBUTE_FSTICSSIOTYPE + "]";
	public static final String SELECT_ATTRIBUTE_FSTICSSFREEZEDYN 						= "attribute[" + ATTRIBUTE_FSTICSSFREEZEDYN + "]";
	public static final String SELECT_ATTRIBUTE_FSTIOTYPECADATTRNAME 					= "attribute[" + ATTRIBUTE_FSTIOTYPECADATTRNAME + "]";
	public static final String SELECT_ATTRIBUTE_FSTICSSSYSTEMCADATTRNAME 				= "attribute[" + ATTRIBUTE_FSTICSSSYSTEMCADATTRNAME + "]";
	public static final String SELECT_ATTRIBUTE_FSTLCITAGATTRDEFAULTVALUE 				= "attribute[" + ATTRIBUTE_FSTLCITAGATTRDEFAULTVALUE + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNUMRULEUNITSEQKEYSTR 				= "attribute[" + ATTRIBUTE_FSTTAGNUMRULEUNITSEQKEYSTR + "]";
	public static final String SELECT_ATTRIBUTE_FSTICSSPREVEBOMATTR 					= "attribute[" + ATTRIBUTE_FSTICSSPREVEBOMATTR + "]";
	public static final String SELECT_ATTRIBUTE_FSTICSSCHANGEEBOMDETAIL 				= "attribute[" + ATTRIBUTE_FSTICSSCHANGEEBOMDETAIL + "]";
	public static final String SELECT_ATTRIBUTE_FSTICSSCHANGEEBOMDATE 					= "attribute[" + ATTRIBUTE_FSTICSSCHANGEEBOMDATE + "]";
	public static final String SELECT_ATTRIBUTE_FSTLOGICALPHYSICAL 						= "attribute[" + ATTRIBUTE_FSTLOGICALPHYSICAL + "]";
	public static final String SELECT_ATTRIBUTE_FSTCADTAGNO 							= "attribute[" + ATTRIBUTE_FSTCADTAGNO + "]";
	public static final String SELECT_ATTRIBUTE_FSTCADINSULPURPOSE 						= "attribute[" + ATTRIBUTE_FSTCADINSULPURPOSE + "]";
	public static final String SELECT_ATTRIBUTE_FSTCADINSULTHICK 						= "attribute[" + ATTRIBUTE_FSTCADINSULTHICK + "]";
	public static final String SELECT_ATTRIBUTE_FSTCADHEAT_TRACING 						= "attribute[" + ATTRIBUTE_FSTCADHEAT_TRACING + "]";
	public static final String SELECT_ATTRIBUTE_FSTCADSERVICE_FROM 						= "attribute[" + ATTRIBUTE_FSTCADSERVICE_FROM + "]";
	public static final String SELECT_ATTRIBUTE_FSTCADSERVICE_TO 						= "attribute[" + ATTRIBUTE_FSTCADSERVICE_TO + "]";
	public static final String SELECT_ATTRIBUTE_FSTCADPID_NO 							= "attribute[" + ATTRIBUTE_FSTCADPID_NO + "]";
	public static final String SELECT_ATTRIBUTE_FSTCADPRESSURE_OPER_MAX 				= "attribute[" + ATTRIBUTE_FSTCADPRESSURE_OPER_MAX + "]";
	public static final String SELECT_ATTRIBUTE_FSTCADTEMP_OPER_MAX 					= "attribute[" + ATTRIBUTE_FSTCADTEMP_OPER_MAX + "]";
	public static final String SELECT_ATTRIBUTE_FSTCADPRESSURE_DESIGN_MAX 				= "attribute[" + ATTRIBUTE_FSTCADPRESSURE_DESIGN_MAX + "]";
	public static final String SELECT_ATTRIBUTE_FSTCADTEMP_DESIGN_MAX 					= "attribute[" + ATTRIBUTE_FSTCADTEMP_DESIGN_MAX + "]";
	public static final String SELECT_ATTRIBUTE_FSTCADTEST_PRESSURE 					= "attribute[" + ATTRIBUTE_FSTCADTEST_PRESSURE + "]";
	public static final String SELECT_ATTRIBUTE_FSTCADKBRTESTMEDIUM 					= "attribute[" + ATTRIBUTE_FSTCADKBRTESTMEDIUM + "]";
	public static final String SELECT_ATTRIBUTE_FSTCADSP_JOPERNORMPRESS 				= "attribute[" + ATTRIBUTE_FSTCADSP_JOPERNORMPRESS + "]";
	public static final String SELECT_ATTRIBUTE_FSTCADSP_JOPERNORMTEMP 					= "attribute[" + ATTRIBUTE_FSTCADSP_JOPERNORMTEMP + "]";
	public static final String SELECT_ATTRIBUTE_FSTCADPWHT 								= "attribute[" + ATTRIBUTE_FSTCADPWHT + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGNORULELESSYN 						= "attribute[" + ATTRIBUTE_FSTTAGNORULELESSYN + "]";
	public static final String SELECT_ATTRIBUTE_FSTICSSCATEGORY 						= "attribute[" + ATTRIBUTE_FSTICSSCATEGORY + "]";
	public static final String SELECT_ATTRIBUTE_FSTTAGREMARK 							= "attribute[" + ATTRIBUTE_FSTTAGREMARK + "]";
	public static final String SELECT_TITLE    											= "attribute[" + ATTRIBUTE_TITLE + "]";
	public static final String SELECT_ORGANIZATIONNAME    								= "attribute[" + ATTRIBUTE_ORGANIZATIONNAME + "]";
	public static final String SELECT_ATTRIBUTE_CADTYPE 								= "attribute[" + ATTRIBUTE_CADTYPE + "]";
	public static final String SELECT_ATTRIBUTE_FSTKORNAME 								= "attribute[" + ATTRIBUTE_FSTKORNAME + "]";
	public static final String SELECT_ATTRIBUTE_FSTENGNAME 								= "attribute[" + ATTRIBUTE_FSTENGNAME + "]";
	public static final String SELECT_ATTRIBUTE_EMAIL_ADDRESS 							= "attribute[" + ATTRIBUTE_EMAIL_ADDRESS + "]";
	public static final String SELECT_ATTRIBUTE_FSTPRODUCTSTART 						= "attribute[" + ATTRIBUTE_FSTPRODUCTSTART + "]";
	public static final String SELECT_ATTRIBUTE_FSTPRODUCTEND 							= "attribute[" + ATTRIBUTE_FSTPRODUCTEND + "]";
	public static final String SELECT_ATTRIBUTE_FSTITEMSPECIFICATION 				 	= "attribute[" + ATTRIBUTE_FSTITEMSPECIFICATION + "]";
	public static final String SELECT_ATTRIBUTE_FSTITEMFULLNAME 					 	= "attribute[" + ATTRIBUTE_FSTITEMFULLNAME + "]";
	public static final String SELECT_ATTRIBUTE_FSTITEMNAME 					 		= "attribute[" + ATTRIBUTE_FSTITEMNAME + "]";
	public static final String SELECT_ATTRIBUTE_FSTITEMENGNAME 					 		= "attribute[" + ATTRIBUTE_FSTITEMENGNAME + "]";
	public static final String SELECT_ATTRIBUTE_FSTITEMACCOUNT 					 		= "attribute[" + ATTRIBUTE_FSTITEMACCOUNT + "]";
	public static final String SELECT_ATTRIBUTE_FSTITEMTYPE 						 	= "attribute[" + ATTRIBUTE_FSTITEMTYPE + "]";
	public static final String SELECT_ATTRIBUTE_FSTPROCURETYPE 					 		= "attribute[" + ATTRIBUTE_FSTPROCURETYPE + "]";
	public static final String SELECT_ATTRIBUTE_FSTISEXCLUSIVEITEM 				 		= "attribute[" + ATTRIBUTE_FSTISEXCLUSIVEITEM + "]";
	public static final String SELECT_ATTRIBUTE_FSTISSINGLESUPPLY 					 	= "attribute[" + ATTRIBUTE_FSTISSINGLESUPPLY + "]";
	public static final String SELECT_ATTRIBUTE_FSTMANUFACTURINGSTRATEGY  			 	= "attribute[" + ATTRIBUTE_FSTMANUFACTURINGSTRATEGY + "]";
	public static final String SELECT_ATTRIBUTE_FSTLOTSIZE 						 		= "attribute[" + ATTRIBUTE_FSTLOTSIZE + "]";
	public static final String SELECT_ATTRIBUTE_FSTROUNDUPDATE 					 		= "attribute[" + ATTRIBUTE_FSTROUNDUPDATE + "]";
	public static final String SELECT_ATTRIBUTE_FSTSEMIMANUFACTURESTOCKMETHOD 		 	= "attribute[" + ATTRIBUTE_FSTSEMIMANUFACTURESTOCKMETHOD + "]";
	public static final String SELECT_ATTRIBUTE_FSTSTOCKSTORAGE 					 	= "attribute[" + ATTRIBUTE_FSTSTOCKSTORAGE + "]";
	public static final String SELECT_ATTRIBUTE_FSTRELEASEMETHOD 					 	= "attribute[" + ATTRIBUTE_FSTRELEASEMETHOD + "]";
	public static final String SELECT_ATTRIBUTE_FSTRELEASESTORAGE 					 	= "attribute[" + ATTRIBUTE_FSTRELEASESTORAGE + "]";
	public static final String SELECT_ATTRIBUTE_FSTRELEASEUNIT 					 		= "attribute[" + ATTRIBUTE_FSTRELEASEUNIT + "]";
	public static final String SELECT_ATTRIBUTE_FSTINVENTORYUNIT 					 	= "attribute[" + ATTRIBUTE_FSTINVENTORYUNIT + "]";
	public static final String SELECT_ATTRIBUTE_FSTINVENTORYSURVEYPERIOD 			 	= "attribute[" + ATTRIBUTE_FSTINVENTORYSURVEYPERIOD + "]";
	public static final String SELECT_ATTRIBUTE_FSTMANUFACTUREORDERUNIT 			 	= "attribute[" + ATTRIBUTE_FSTMANUFACTUREORDERUNIT + "]";
	public static final String SELECT_ATTRIBUTE_FSTMANUFACTUREORDERLT 				 	= "attribute[" + ATTRIBUTE_FSTMANUFACTUREORDERLT + "]";
	public static final String SELECT_ATTRIBUTE_FSTPURCHASEORDER 					 	= "attribute[" + ATTRIBUTE_FSTPURCHASEORDER + "]";
	public static final String SELECT_ATTRIBUTE_FSTPURCHASEORDERLT 				 		= "attribute[" + ATTRIBUTE_FSTPURCHASEORDERLT + "]";
	public static final String SELECT_ATTRIBUTE_FSTPURCHASEGROUP 					 	= "attribute[" + ATTRIBUTE_FSTPURCHASEGROUP + "]";
	public static final String SELECT_ATTRIBUTE_FSTFINALINSPECT 					 	= "attribute[" + ATTRIBUTE_FSTFINALINSPECT + "]";
	public static final String SELECT_ATTRIBUTE_FSTPROCESSINSPECT 					 	= "attribute[" + ATTRIBUTE_FSTPROCESSINSPECT + "]";
	public static final String SELECT_ATTRIBUTE_FSTINCOMEINSPECT 					 	= "attribute[" + ATTRIBUTE_FSTINCOMEINSPECT + "]";
	public static final String SELECT_ATTRIBUTE_FSTFORWARDINSPECT 					 	= "attribute[" + ATTRIBUTE_FSTFORWARDINSPECT + "]";
	public static final String SELECT_ATTRIBUTE_FSTMILITARYDIVIDE 					 	= "attribute[" + ATTRIBUTE_FSTMILITARYDIVIDE + "]";
	public static final String SELECT_ATTRIBUTE_FSTNATIONINVENTORYNO 				 	= "attribute[" + ATTRIBUTE_FSTNATIONINVENTORYNO + "]";
	public static final String SELECT_ATTRIBUTE_FSTPARTMANAGENO 					    = "attribute[" + ATTRIBUTE_FSTPARTMANAGENO + "]";
	public static final String SELECT_ATTRIBUTE_FSTPRODUCTIONTYPE 					 	= "attribute[" + ATTRIBUTE_FSTPRODUCTIONTYPE + "]";
	public static final String SELECT_ATTRIBUTE_FSTINTERGRATEDCOSTPARTTYPE 		 		= "attribute[" + ATTRIBUTE_FSTINTERGRATEDCOSTPARTTYPE + "]";
	public static final String SELECT_ATTRIBUTE_FSTDEFENSEARTICLESAPPOINTYN 		 	= "attribute[" + ATTRIBUTE_FSTDEFENSEARTICLESAPPOINTYN + "]";
	public static final String SELECT_ATTRIBUTE_FSTDEFENSEARTICLESAPPOINTBASED 	 		= "attribute[" + ATTRIBUTE_FSTDEFENSEARTICLESAPPOINTBASED + "]";
	public static final String SELECT_ATTRIBUTE_FSTPURCHASECLASSIFICATION 			 	= "attribute[" + ATTRIBUTE_FSTPURCHASECLASSIFICATION + "]";
	public static final String SELECT_ATTRIBUTE_FSTISPRESCRIPTION 					 	= "attribute[" + ATTRIBUTE_FSTISPRESCRIPTION + "]";
	public static final String SELECT_ATTRIBUTE_FSTISESD 							 	= "attribute[" + ATTRIBUTE_FSTISESD + "]";
	public static final String SELECT_ATTRIBUTE_FSTISMSL 							 	= "attribute[" + ATTRIBUTE_FSTISMSL + "]";
	public static final String SELECT_ATTRIBUTE_FSTITEMSIGN 						 	= "attribute[" + ATTRIBUTE_FSTITEMSIGN + "]";
	public static final String SELECT_ATTRIBUTE_FSTITEMIDENTIFICATIONCODE 			 	= "attribute[" + ATTRIBUTE_FSTITEMIDENTIFICATIONCODE + "]";
	public static final String SELECT_ATTRIBUTE_FSTSTANDARDIZATIONTYPE 			 		= "attribute[" + ATTRIBUTE_FSTSTANDARDIZATIONTYPE + "]";
	public static final String SELECT_ATTRIBUTE_FSTDEFENSEDRAWINGTYPE 				 	= "attribute[" + ATTRIBUTE_FSTDEFENSEDRAWINGTYPE + "]";
	public static final String SELECT_ATTRIBUTE_FSTDEFENSEDRAWINGPARTNO 			 	= "attribute[" + ATTRIBUTE_FSTDEFENSEDRAWINGPARTNO + "]";
	public static final String SELECT_ATTRIBUTE_FSTDRAWINGNO 						 	= "attribute[" + ATTRIBUTE_FSTDRAWINGNO + "]";
	public static final String SELECT_ATTRIBUTE_FSTDRAWINGNOOFREV 					 	= "attribute[" + ATTRIBUTE_FSTDRAWINGNOOFREV + "]";
	public static final String SELECT_ATTRIBUTE_FSTDRAWINGNOOFREVDATE 				 	= "attribute[" + ATTRIBUTE_FSTDRAWINGNOOFREVDATE + "]";
	public static final String SELECT_ATTRIBUTE_FSTCONFIGURATIONIDENTIFICATIONOWNER 	= "attribute[" + ATTRIBUTE_FSTCONFIGURATIONIDENTIFICATIONOWNER + "]";
	public static final String SELECT_ATTRIBUTE_FSTSTANDARDNO 						 	= "attribute[" + ATTRIBUTE_FSTSTANDARDNO + "]";
	public static final String SELECT_ATTRIBUTE_FSTSTANDARDPARTNO 					 	= "attribute[" + ATTRIBUTE_FSTSTANDARDPARTNO + "]";
	public static final String SELECT_ATTRIBUTE_FSTMANUFACTUREPARTNO 				 	= "attribute[" + ATTRIBUTE_FSTMANUFACTUREPARTNO + "]";
	public static final String SELECT_ATTRIBUTE_FSTMANUFACTUREITEMNAME 			 		= "attribute[" + ATTRIBUTE_FSTMANUFACTUREITEMNAME + "]";
	public static final String SELECT_ATTRIBUTE_FSTMANUFACTURETAXIDNO 				 	= "attribute[" + ATTRIBUTE_FSTMANUFACTURETAXIDNO + "]";
	public static final String SELECT_ATTRIBUTE_FSTMANUFACTURECORPORATENAME 		 	= "attribute[" + ATTRIBUTE_FSTMANUFACTURECORPORATENAME + "]";
	public static final String SELECT_ATTRIBUTE_FSTRAWMATERIALSYMBOL 				 	= "attribute[" + ATTRIBUTE_FSTRAWMATERIALSYMBOL + "]";
	public static final String SELECT_ATTRIBUTE_FSTRAWMATERIALSTANDARD 			 		= "attribute[" + ATTRIBUTE_FSTRAWMATERIALSTANDARD + "]";
	public static final String SELECT_ATTRIBUTE_FSTPRIMARYEQUIPMENT 				 	= "attribute[" + ATTRIBUTE_FSTPRIMARYEQUIPMENT + "]";
	public static final String SELECT_ATTRIBUTE_FSTASSEMBLYNAME 					 	= "attribute[" + ATTRIBUTE_FSTASSEMBLYNAME + "]";
	public static final String SELECT_ATTRIBUTE_FSTWEIGHT 							 	= "attribute[" + ATTRIBUTE_FSTWEIGHT + "]";
	public static final String SELECT_ATTRIBUTE_FSTWEIGHTUNIT 						 	= "attribute[" + ATTRIBUTE_FSTWEIGHTUNIT + "]";
	public static final String SELECT_ATTRIBUTE_FSTVOLUME 							 	= "attribute[" + ATTRIBUTE_FSTVOLUME + "]";
	public static final String SELECT_ATTRIBUTE_FSTVOLUMEUNIT 						 	= "attribute[" + ATTRIBUTE_FSTVOLUMEUNIT + "]";
	public static final String SELECT_ATTRIBUTE_FSTMATERIALTYPE 					 	= "attribute[" + ATTRIBUTE_FSTMATERIALTYPE + "]";
	public static final String SELECT_ATTRIBUTE_FSTUNIT 							 	= "attribute[" + ATTRIBUTE_FSTUNIT + "]";
	public static final String SELECT_ATTRIBUTE_FSTISPHANTOM 						 	= "attribute[" + ATTRIBUTE_FSTISPHANTOM + "]";
	public static final String SELECT_ATTRIBUTE_START_EFFECTIVITY_DATE 					= "attribute[" + DomainConstants.ATTRIBUTE_START_EFFECTIVITY_DATE + "]";
	public static final String SELECT_ATTRIBUTE_END_EFFECTIVITY_DATE 					= "attribute[" + DomainConstants.ATTRIBUTE_END_EFFECTIVITY_DATE + "]";

	public static final String SELECT_ATTRIBUTE_FSTDOCUMENTNAME						    = "attribute[" + ATTRIBUTE_FSTDOCUMENTNAME				+ "]";
	public static final String SELECT_ATTRIBUTE_FSTCUSTOMERDOCNUMBER					= "attribute[" + ATTRIBUTE_FSTCUSTOMERDOCNUMBER			+ "]";
	public static final String SELECT_ATTRIBUTE_FSTCUSTOMERDOCREVISION				 	= "attribute[" + ATTRIBUTE_FSTCUSTOMERDOCREVISION		+ "]";
	public static final String SELECT_ATTRIBUTE_FSTISDELIVERABLEDOCUMENT			 	= "attribute[" + ATTRIBUTE_FSTISDELIVERABLEDOCUMENT 	+ "]";
	public static final String SELECT_ATTRIBUTE_FSTISCONFIGURATIONITEM				 	= "attribute[" + ATTRIBUTE_FSTISCONFIGURATIONITEM		+ "]";
	public static final String SELECT_ATTRIBUTE_FSTBASELINE							    = "attribute[" + ATTRIBUTE_FSTBASELINE					+ "]";
	public static final String SELECT_ATTRIBUTE_FSTCONSERVATIONTERMDATE				    = "attribute[" + ATTRIBUTE_FSTCONSERVATIONTERMDATE		+ "]";
	public static final String SELECT_ATTRIBUTE_FSTCONSERVATIONTERM					    = "attribute[" + ATTRIBUTE_FSTCONSERVATIONTERM			+ "]";
	public static final String SELECT_ATTRIBUTE_FSTNEEDTORECLAIM					 	= "attribute[" + ATTRIBUTE_FSTNEEDTORECLAIM		    	+ "]";
	public static final String SELECT_ATTRIBUTE_FSTRECOVERYPERIOD					 	= "attribute[" + ATTRIBUTE_FSTRECOVERYPERIOD			+ "]";
	public static final String SELECT_ATTRIBUTE_FSTRECOVERYFINISHDATE					= "attribute[" + ATTRIBUTE_FSTRECOVERYFINISHDATE			+ "]";
	public static final String SELECT_ATTRIBUTE_FSTCUSTOMERCOMPANY					 	= "attribute[" + ATTRIBUTE_FSTCUSTOMERCOMPANY			+ "]";
	public static final String SELECT_ATTRIBUTE_FSTSECURITYCLASS						= "attribute[" + ATTRIBUTE_FSTSECURITYCLASS		    	+ "]";
	public static final String SELECT_ATTRIBUTE_FSTNEEDPEERREVIEW					 	= "attribute[" + ATTRIBUTE_FSTNEEDPEERREVIEW			+ "]";
	public static final String SELECT_ATTRIBUTE_FSTPLANDELIVERYDATE					    = "attribute[" + ATTRIBUTE_FSTPLANDELIVERYDATE			+ "]";
	public static final String SELECT_ATTRIBUTE_FSTACTUALDELIVERYDATE				 	= "attribute[" + ATTRIBUTE_FSTACTUALDELIVERYDATE		+ "]";
	public static final String SELECT_ATTRIBUTE_FSTSTARTFACILITYUNITNUMBER				= "attribute[" + ATTRIBUTE_FSTSTARTFACILITYUNITNUMBER	+ "]";
	public static final String SELECT_ATTRIBUTE_FSTENDFACILITYUNITNUMBER				= "attribute[" + ATTRIBUTE_FSTENDFACILITYUNITNUMBER	    + "]";
	public static final String SELECT_ATTRIBUTE_FSTFACILITYUNITNUMBER					= "attribute[" + ATTRIBUTE_FSTFACILITYUNITNUMBER	    + "]";

	public static final String SELECT_ATTRIBUTE_FSTISRECOVERY							= "attribute[" + ATTRIBUTE_FSTISRECOVERY	    		+ "]";
	public static final String SELECT_ATTRIBUTE_FSTNAMESERIALNO							= "attribute[" + ATTRIBUTE_FSTNAMESERIALNO				+ "]";
	public static final String SELECT_ATTRIBUTE_FSTDRAWINGSIZE							= "attribute[" + ATTRIBUTE_FSTDRAWINGSIZE				+ "]";
	public static final String SELECT_ATTRIBUTE_FSTAPPROVERBYCUSTOMER					= "attribute[" + ATTRIBUTE_FSTAPPROVERBYCUSTOMER		+ "]";

	public static final String SELECT_ATTRIBUTE_FSTRETRIEVEISCOMPLETE					= "attribute[" + ATTRIBUTE_FSTRETRIEVEISCOMPLETE		+ "]";
	public static final String SELECT_ATTRIBUTE_FSTRETRIEVEREASON						= "attribute[" + ATTRIBUTE_FSTRETRIEVEREASON			+ "]";
	public static final String SELECT_ATTRIBUTE_FSTEQUIPMENTABBREVIATION				= "attribute[" + ATTRIBUTE_FSTEQUIPMENTABBREVIATION		+ "]";

	public static final String SELECT_ATTRIBUTE_FSTDOCUMENTNUMBERSENDEDBY				= "attribute[" + ATTRIBUTE_FSTDOCUMENTNUMBERSENDEDBY	+ "]";
	public static final String SELECT_ATTRIBUTE_FSTDOCUMENTNAMESENDEDBY					= "attribute[" + ATTRIBUTE_FSTDOCUMENTNAMESENDEDBY		+ "]";
	public static final String SELECT_ATTRIBUTE_FSTSENDCOMPANY	 	 					= "attribute[" + ATTRIBUTE_FSTSENDCOMPANY	 	 		+ "]";
	public static final String SELECT_ATTRIBUTE_FSTDATESENDEDBY	 						= "attribute[" + ATTRIBUTE_FSTDATESENDEDBY 	 			+ "]";
	public static final String SELECT_ATTRIBUTE_FSTRECEIVEDEPARTMENT					= "attribute[" + ATTRIBUTE_FSTRECEIVEDEPARTMENT			+ "]";

    public static final String SELECT_ATTRIBUTE_FSTDEFAULTAPPROVAL 						= "attribute[" + ATTRIBUTE_FSTDEFAULTAPPROVAL + "]";
    public static final String SELECT_ATTRIBUTE_REVIEW_COMMENTS_NEEDED 					= "attribute[" + ATTRIBUTE_REVIEW_COMMENTS_NEEDED + "]";
    public static final String SELECT_ATTRIBUTE_INSTRUCTIONS								= "attribute[" + ATTRIBUTE_INSTRUCTIONS + "]";
    public static final String SELECT_ATTRIBUTE_FSTUNIQUEPARTNUMBER					= "attribute[" + ATTRIBUTE_FSTUNIQUEPARTNUMBER + "]";

	public static final String SELECT_ATTRIBUTE_FSTAPPROVERPLACE					= "attribute[" + ATTRIBUTE_FSTAPPROVERPLACE					      + "]";
	public static final String SELECT_ATTRIBUTE_FSTAPPROVERPLACEDETAIL				= "attribute[" + ATTRIBUTE_FSTAPPROVERPLACEDETAIL				  + "]";
	public static final String SELECT_ATTRIBUTE_FSTDESIGN							= "attribute[" + ATTRIBUTE_FSTDESIGN							  + "]";
	public static final String SELECT_ATTRIBUTE_FSTDRAFTING							= "attribute[" + ATTRIBUTE_FSTDRAFTING						      + "]";
	public static final String SELECT_ATTRIBUTE_FSTCHECKOFDRAWINGLEFT				= "attribute[" + ATTRIBUTE_FSTCHECKOFDRAWINGLEFT				  + "]";
	public static final String SELECT_ATTRIBUTE_FSTCHECKOFDRAWINGRIGHTDOWN			= "attribute[" + ATTRIBUTE_FSTCHECKOFDRAWINGRIGHTDOWN			  + "]";
	public static final String SELECT_ATTRIBUTE_FSTCHECKOFDRAWINGRIGHTCENTER		= "attribute[" + ATTRIBUTE_FSTCHECKOFDRAWINGRIGHTCENTER		      + "]";
	public static final String SELECT_ATTRIBUTE_FSTAPPROVAL							= "attribute[" + ATTRIBUTE_FSTAPPROVAL						      + "]";
	public static final String SELECT_ATTRIBUTE_FSTORIGIN							= "attribute[" + ATTRIBUTE_FSTORIGIN							  + "]";
	public static final String SELECT_ATTRIBUTE_FSTOUTDRAWINGDATE					= "attribute[" + ATTRIBUTE_FSTOUTDRAWINGDATE					  + "]";
	public static final String SELECT_ATTRIBUTE_FSTOUTDRAWINGNUMBER					= "attribute[" + ATTRIBUTE_FSTOUTDRAWINGNUMBER				      + "]";
	public static final String SELECT_ATTRIBUTE_FSTEXPIRYDATE						= "attribute[" + ATTRIBUTE_FSTEXPIRYDATE						  + "]";
	public static final String SELECT_ATTRIBUTE_FSTCONFIGURATIONREGULATEOWNER		= "attribute[" + ATTRIBUTE_FSTCONFIGURATIONREGULATEOWNER		  + "]";
	public static final String SELECT_ATTRIBUTE_FSTOUTDRAWINGAPPROVEDDATE			= "attribute[" + ATTRIBUTE_FSTOUTDRAWINGAPPROVEDDATE			  + "]";
	public static final String SELECT_ATTRIBUTE_FSTINDIVIDUALRECEIPTNUMBER			= "attribute[" + ATTRIBUTE_FSTINDIVIDUALRECEIPTNUMBER			  + "]";
	public static final String SELECT_ATTRIBUTE_FSTORIGINALSIZE						= "attribute[" + ATTRIBUTE_FSTORIGINALSIZE					      + "]";
	public static final String SELECT_ATTRIBUTE_FSTPRINTSIZE						= "attribute[" + ATTRIBUTE_FSTPRINTSIZE						      + "]";
	public static final String SELECT_ATTRIBUTE_FSTSTANDARDIZATIONTAGETYN			= "attribute[" + ATTRIBUTE_FSTSTANDARDIZATIONTAGETYN			  + "]";
	public static final String SELECT_ATTRIBUTE_FSTSTANDARDIZATIONCOMPLETEYN		= "attribute[" + ATTRIBUTE_FSTSTANDARDIZATIONCOMPLETEYN		      + "]";

	public static final String SELECT_ATTRIBUTE_FSTSTANDARDPARTMANAGENO			= "attribute[" + ATTRIBUTE_FSTSTANDARDPARTMANAGENO		      + "]";
	public static final String SELECT_ATTRIBUTE_FSTSTANDARDNEEDYN					= "attribute[" + ATTRIBUTE_FSTSTANDARDNEEDYN		      + "]";
	public static final String SELECT_ATTRIBUTE_FSTSTANDARDCOMPLETEYN				= "attribute[" + ATTRIBUTE_FSTSTANDARDCOMPLETEYN		      + "]";

	public static final String SELECT_ATTRIBUTE_FSTSTARTEFFECTIVITYDATE				= "attribute[" + ATTRIBUTE_FSTSTARTEFFECTIVITYDATE		      + "]";
	public static final String SELECT_ATTRIBUTE_FSTENDEFFECTIVITYDATE				= "attribute[" + ATTRIBUTE_FSTENDEFFECTIVITYDATE		      + "]";
	public static final String SELECT_ATTRIBUTE_FSTCUTOMERDOCNUMBER					= "attribute[" + ATTRIBUTE_FSTCUTOMERDOCNUMBER		      + "]";
	public static final String SELECT_ATTRIBUTE_FSTCUTOMERDOCREVISION				= "attribute[" + ATTRIBUTE_FSTCUTOMERDOCREVISION		      + "]";

	public static final String SELECT_ATTRIBUTE_FSTDOCUMENTRECEIPTNUMBER			= "attribute[" + ATTRIBUTE_FSTDOCUMENTRECEIPTNUMBER		      + "]";
	public static final String SELECT_ATTRIBUTE_FSTDISTRIBUTIONNUMBER				= "attribute[" + ATTRIBUTE_FSTDISTRIBUTIONNUMBER		      + "]";

	public static final String SELECT_ATTRIBUTE_FSTDELIVERABLEITEMYN				= "attribute[" + ATTRIBUTE_FSTDELIVERABLEITEMYN		      + "]";
	public static final String SELECT_ATTRIBUTE_FSTCONFIGURATIONMANAGEYN			= "attribute[" + ATTRIBUTE_FSTCONFIGURATIONMANAGEYN		      + "]";
	public static final String SELECT_ATTRIBUTE_FSTSTANDARDITEMCODE					= "attribute[" + ATTRIBUTE_FSTSTANDARDITEMCODE		      + "]";
	public static final String SELECT_ATTRIBUTE_FSTPRODUCTREQUIREDYN				= "attribute[" + ATTRIBUTE_FSTPRODUCTREQUIREDYN		      + "]";

    public static final String SELECT_ATTRIBUTE_FSTDISTRIBUTIONTYPE                 = "attribute[" + ATTRIBUTE_FSTDISTRIBUTIONTYPE+ "]";
    public static final String SELECT_ATTRIBUTE_FSTPURCHASECONFIRMEDFLAG			= "attribute[" + ATTRIBUTE_FSTPURCHASECONFIRMEDFLAG+ "]";
    public static final String SELECT_ATTRIBUTE_FSTPURCHASECONFIRMEDDATE			= "attribute[" + ATTRIBUTE_FSTPURCHASECONFIRMEDDATE	      + "]";


	public static final String ATTRIBUTE_FSTEBOMQTY 								= PropertyUtil.getSchemaProperty("attribute_fstEBOMQty");
	public static final String SELECT_ATTRIBUTE_FSTEBOMQTY							= "attribute[" + ATTRIBUTE_FSTEBOMQTY 	+ "]";
	public static final String ATTRIBUTE_FSTEBOMQTYUNIT 							= PropertyUtil.getSchemaProperty("attribute_fstEBOMQtyUnit");
	public static final String SELECT_ATTRIBUTE_FSTEBOMQTYUNIT						= "attribute[" + ATTRIBUTE_FSTEBOMQTYUNIT 	+ "]";
	public static final String ATTRIBUTE_FSTPARENTQTY 								= PropertyUtil.getSchemaProperty("attribute_fstParentQty");
	public static final String SELECT_ATTRIBUTE_FSTPARENTQTY						= "attribute[" + ATTRIBUTE_FSTPARENTQTY 	+ "]";
	public static final String ATTRIBUTE_FSTPARENTQTYUNIT 							= PropertyUtil.getSchemaProperty("attribute_fstParentQtyUnit");
	public static final String SELECT_ATTRIBUTE_FSTPARENTQTYUNIT					= "attribute[" + ATTRIBUTE_FSTPARENTQTYUNIT 	+ "]";
	public static final String ATTRIBUTE_FSTSETQTY 									= PropertyUtil.getSchemaProperty("attribute_fstSetQty");
	public static final String SELECT_ATTRIBUTE_FSTSETQTY							= "attribute[" + ATTRIBUTE_FSTSETQTY 	+ "]";

	public static final String ATTRIBUTE_FSTTYPEGUBUN 								= PropertyUtil.getSchemaProperty("attribute_fstTypeGubun");
	public static final String SELECT_ATTRIBUTE_FSTTYPEGUBUN						= "attribute[" + ATTRIBUTE_FSTTYPEGUBUN 	+ "]";

	public static final String ATTRIBUTE_FSTPARTFAMILYCODE							= PropertyUtil.getSchemaProperty("attribute_fstPartFamilyCode");
	public static final String SELECT_ATTRIBUTE_FSTPARTFAMILYCODE					= "attribute[" + ATTRIBUTE_FSTPARTFAMILYCODE 	+ "]";

	public static final String ATTRIBUTE_FSTRPNNAME									= PropertyUtil.getSchemaProperty("attribute_fstRPNName");
	public static final String SELECT_ATTRIBUTE_FSTRPNNAME							= "attribute[" + ATTRIBUTE_FSTRPNNAME 	+ "]";

	public static final String ATTRIBUTE_FSTDOCUMENTFAMILYCODE						= PropertyUtil.getSchemaProperty("attribute_fstDocumentFamilyCode");
	public static final String SELECT_ATTRIBUTE_FSTDOCUMENTFAMILYCODE				= "attribute[" + ATTRIBUTE_FSTDOCUMENTFAMILYCODE 	+ "]";

	public static final String ATTRIBUTE_FSTSENDMTMSFLAG							= PropertyUtil.getSchemaProperty("attribute_fstSendMtmsFlag");
	public static final String SELECT_ATTRIBUTE_FSTSENDMTMSFLAG						= "attribute[" + ATTRIBUTE_FSTSENDMTMSFLAG 	+ "]";

	public static final String ATTRIBUTE_FST_SPECIFICATIONS 						= "fstSpecifications";
	public static final String SELECT_ATTRIBUTE_FST_SPECIFICATIONS					= "attribute[" + ATTRIBUTE_FST_SPECIFICATIONS  + "]";

	public static final String ATTRIBUTE_FST_EBOMQTYUNIT 							= "fstEBOMQtyUnit";
	public static final String SELECT_ATTRIBUTE_FST_EBOMQTYUNIT						= "attribute[" + ATTRIBUTE_FST_EBOMQTYUNIT  + "]";

	public static final String ATTRIBUTE_FST_PARENTQTYUNIT 							= "fstParentQtyUnit";
	public static final String SELECT_ATTRIBUTE_FST_PARENTQTYUNIT					= "attribute[" + ATTRIBUTE_FST_PARENTQTYUNIT  + "]";


	public static final String ATTRIBUTE_REQUESTEDCHANGE						= PropertyUtil.getSchemaProperty("attribute_RequestedChange");
	public static final String SELECT_ATTRIBUTE_REQUESTEDCHANGE					= "attribute[" + ATTRIBUTE_REQUESTEDCHANGE  + "]";

	public static final String ATTRIBUTE_FSTTESTGUBUN             = PropertyUtil.getSchemaProperty("attribute_fstTestGubun");
	public static final String ATTRIBUTE_FSTREQUESTDATE           = PropertyUtil.getSchemaProperty("attribute_fstRequestDate");
	public static final String ATTRIBUTE_FSTDEFECTORIGIN          = PropertyUtil.getSchemaProperty("attribute_fstDefectOrigin");
	public static final String ATTRIBUTE_FSTSEVERITY              = PropertyUtil.getSchemaProperty("attribute_fstSeverity");
	public static final String ATTRIBUTE_FSTACTIONOWNER           = PropertyUtil.getSchemaProperty("attribute_fstActionOwner");
	public static final String ATTRIBUTE_FSTACTIONDEPARTMENT      = PropertyUtil.getSchemaProperty("attribute_fstActionDepartment");
	public static final String ATTRIBUTE_FSTDEFECTDESCRIPTION     = PropertyUtil.getSchemaProperty("attribute_fstDefectDescription");
	public static final String ATTRIBUTE_FSTACTIONDESCRIPTION     = PropertyUtil.getSchemaProperty("attribute_fstActionDescription");
	public static final String ATTRIBUTE_FSTACTIONDURATIONDAY     = PropertyUtil.getSchemaProperty("attribute_fstActionDurationDay");
	public static final String ATTRIBUTE_FSTACTIONCOMPLETEDDATE   = PropertyUtil.getSchemaProperty("attribute_fstActionCompletedDate");
	public static final String ATTRIBUTE_FSTREQUESTDEPARTMENT     = PropertyUtil.getSchemaProperty("attribute_fstRequestDepartment");
	public static final String SELECT_ATTRIBUTE_FSTTESTGUBUN           = "attribute[" + ATTRIBUTE_FSTTESTGUBUN            + "]";
	public static final String SELECT_ATTRIBUTE_FSTREQUESTDATE         = "attribute[" + ATTRIBUTE_FSTREQUESTDATE          + "]";
	public static final String SELECT_ATTRIBUTE_FSTDEFECTORIGIN        = "attribute[" + ATTRIBUTE_FSTDEFECTORIGIN         + "]";
	public static final String SELECT_ATTRIBUTE_FSTSEVERITY            = "attribute[" + ATTRIBUTE_FSTSEVERITY             + "]";
	public static final String SELECT_ATTRIBUTE_FSTACTIONOWNER         = "attribute[" + ATTRIBUTE_FSTACTIONOWNER          + "]";
	public static final String SELECT_ATTRIBUTE_FSTACTIONDEPARTMENT    = "attribute[" + ATTRIBUTE_FSTACTIONDEPARTMENT     + "]";
	public static final String SELECT_ATTRIBUTE_FSTDEFECTDESCRIPTION   = "attribute[" + ATTRIBUTE_FSTDEFECTDESCRIPTION    + "]";
	public static final String SELECT_ATTRIBUTE_FSTACTIONDESCRIPTION   = "attribute[" + ATTRIBUTE_FSTACTIONDESCRIPTION    + "]";
	public static final String SELECT_ATTRIBUTE_FSTACTIONDURATIONDAY   = "attribute[" + ATTRIBUTE_FSTACTIONDURATIONDAY    + "]";
	public static final String SELECT_ATTRIBUTE_FSTACTIONCOMPLETEDDATE = "attribute[" + ATTRIBUTE_FSTACTIONCOMPLETEDDATE  + "]";
	public static final String SELECT_ATTRIBUTE_FSTREQUESTDEPARTMENT   = "attribute[" + ATTRIBUTE_FSTREQUESTDEPARTMENT    + "]";

    public static final String ATTRIBUTE_FSTREVIEWER                   = PropertyUtil.getSchemaProperty("attribute_fstReviewer");
    public static final String ATTRIBUTE_FSTPREREVIEWDEFECTTYPE        = PropertyUtil.getSchemaProperty("attribute_fstPreReviewDefectType");
    public static final String ATTRIBUTE_FSTPREREVIEWDEFECTDESCRIPTION = PropertyUtil.getSchemaProperty("attribute_fstPreReviewDefectDescription");
    public static final String ATTRIBUTE_FSTPREREVIEWLEADTIME          = PropertyUtil.getSchemaProperty("attribute_fstPreReviewLeadTime");
    public static final String ATTRIBUTE_FSTDEFECTTYPE                 = PropertyUtil.getSchemaProperty("attribute_fstDefectType");
    public static final String ATTRIBUTE_FSTREVIEWLEADTIME             = PropertyUtil.getSchemaProperty("attribute_fstReviewLeadTime");

	public static final String SELECT_ATTRIBUTE_FSTREVIEWER                   = "attribute[" + ATTRIBUTE_FSTREVIEWER                      + "]";
	public static final String SELECT_ATTRIBUTE_FSTPREREVIEWDEFECTTYPE        = "attribute[" + ATTRIBUTE_FSTPREREVIEWDEFECTTYPE           + "]";
	public static final String SELECT_ATTRIBUTE_FSTPREREVIEWDEFECTDESCRIPTION = "attribute[" + ATTRIBUTE_FSTPREREVIEWDEFECTDESCRIPTION    + "]";
	public static final String SELECT_ATTRIBUTE_FSTPREREVIEWLEADTIME          = "attribute[" + ATTRIBUTE_FSTPREREVIEWLEADTIME             + "]";
	public static final String SELECT_ATTRIBUTE_FSTDEFECTTYPE                 = "attribute[" + ATTRIBUTE_FSTDEFECTTYPE                    + "]";
	public static final String SELECT_ATTRIBUTE_FSTREVIEWLEADTIME             = "attribute[" + ATTRIBUTE_FSTREVIEWLEADTIME                + "]";

	/*
     * Tag Number Reference Related Constants
     */
	public static final String TAGNO_REF_OBJID_TAGMASTER = "TAGNO_REF_OBJID_TAGMASTER";
	public static final String TAGNO_REF_OBJID_TAGCLASS = "TAGNO_REF_OBJID_TAGCLASS";
	public static final String TAGNO_REF_OBJID_IDENTIFIERCODE = "TAGNO_REF_OBJID_IDENTIFIERCODE";
	public static final String TAGNO_REF_OBJID_COMMONCODE = "TAGNO_REF_OBJID_COMMONCODE";
	public static final String TAGNO_REF_OBJID_DISCIPLINECODE = "TAGNO_REF_OBJID_DISCIPLINECODE";
	public static final String TAGNO_REF_OBJID_SYSTEMCODE = "TAGNO_REF_OBJID_SYSTEMCODE";
	public static final String TAGNO_REF_OBJID_SUBSYSTEMCODE = "TAGNO_REF_OBJID_SUBSYSTEMCODE";
	public static final String TAGNO_REF_OBJID_AREACODE = "TAGNO_REF_OBJID_AREACODE";
	public static final String TAGNO_REF_OBJID_PARENTTAG = "TAGNO_REF_OBJID_PARENTTAG";
	public static final String TAGNO_REF_OBJID_DETAILDP = "TAGNO_REF_OBJID_DETAILDP";
	public static final String TAGNO_REF_OBJID_VDP = "TAGNO_REF_OBJID_VDP";
	public static final String TAGNO_REF_OBJID_RFQNO = "TAGNO_REF_OBJID_RFQNO";

    /*
     * etc String Constants
     */
	public static final String PARENT_OID = "parentOID";

	public static final String SBOMROOT_OBJECTNAME_SUFFIX = "_SBOMRoot";
	public static final String SBOMSTRUCTURECODEGROUP_OBJECTNAME_SUFFIX = "_SBOMStructureCodeGroup";
	public static final String TAGBASECODEGROUP_OBJECTNAME_SUFFIX = "_TagBaseCodeGroup";
	public static final String TAGCLASSGROUP_OBJECTNAME_SUFFIX = "_TagClassGroup";
	public static final String LCITAGATTRIBUTEGROUP_OBJECTNAME_SUFFIX = "_LCITagAttributeGroup";
	public static final String TAGMASTER_OBJECTNAME_SUFFIX = "_TagMaster";
	public static final String TAGICSSMASTER_OBJECTNAME_SUFFIX = "_TagICSSMaster";
	public static final String LCITAGATTRIBUTEGROUP_INTERFACE_COMMONGROUP_SUFFIX = "_CommonGroup";

	public static String getSBOMRootObjectName(String projectCode) { return projectCode + SBOMROOT_OBJECTNAME_SUFFIX; }
	public static String getSBOMStructureCodeGroupObjectName(String projectCode) { return projectCode + SBOMSTRUCTURECODEGROUP_OBJECTNAME_SUFFIX; }
	public static String getSBOMTagBaseCodeGroupObjectName(String projectCode) { return projectCode + TAGBASECODEGROUP_OBJECTNAME_SUFFIX; }
	public static String getSBOMTagClassGroupObjectName(String projectCode) { return projectCode + TAGCLASSGROUP_OBJECTNAME_SUFFIX; }
	public static String getSBOMLCITagAttributeGroupObjectName(String projectCode) { return projectCode + LCITAGATTRIBUTEGROUP_OBJECTNAME_SUFFIX; }
	public static String getSBOMTagMasterObjectName(String projectCode) { return projectCode + TAGMASTER_OBJECTNAME_SUFFIX; }
	public static String getSBOMTagICSSMasterObjectName(String projectCode) { return projectCode + TAGICSSMASTER_OBJECTNAME_SUFFIX; }
	public static String getSBOMStructureCodeObjectName(String projectCode, String code) { return projectCode + "_" + code; }
	public static String getSBOMCodeObjectNamePattern(String projectCode) { return projectCode + "_" + SYMB_WILD; }
	public static String getSBOMTagBaseCodeObjectNamePattern(String projectCode) { return projectCode + "_" + SYMB_WILD; }
	public static String getSBOMTagClassObjectNamePattern(String projectCode) { return projectCode + "_" + SYMB_WILD; }
	public static String getSBOMLCITagAttributeClassObjectNamePattern(String projectCode) { return projectCode + "_" + SYMB_WILD; }

	public static String SBOM_SYSTEM_UNFIXED = "UNFIXED";
	public static String SEQUENCE_PREFIX = "SEQUENCE_PREFIX";
	public static String SEQUENCE_DEPENDENTS_VALUE = "SEQUENCE_DEPENDENTS_VALUE";
	public static String SEQUENCE_MIN_VALUE = "SEQUENCE_MIN_VALUE";
	public static String SEQUENCE_MAX_VALUE = "SEQUENCE_MAX_VALUE";

	public static int TAG_NUM_CREATION_NORMAL = 1;
	public static int TAG_NUM_CREATION_INITIAL_BATCH = 2;
	public static int TAG_NUM_CREATION_FORCE_TAGGING = 3;
	public static int TAG_NUM_CREATION_USER_DEFINED = 4;

	public static String REV2 = "-";

	/*
	 * Attribute Range Related
	 */

	public static String SBOM_TAGNUMRULE_CLASSCAT_GENERAL = "General";
	public static String SBOM_TAGNUMRULE_CLASSCAT_SEPARATOR = "Separator";
	public static String SBOM_TAGNUMRULE_CLASSCAT_SYSTEM = "System";
	public static String SBOM_TAGNUMRULE_CLASSCAT_AREA = "Area";

	public static String SBOM_TAGNUMRULE_VALUECAT_FIXED = "Fixed";
	public static String SBOM_TAGNUMRULE_VALUECAT_FIXED_RANGEVALUE = SBOM_TAGNUMRULE_VALUECAT_FIXED;
	public static String SBOM_TAGNUMRULE_VALUECAT_DERIVED = "Derived";
	public static String SBOM_TAGNUMRULE_VALUECAT_DERIVED_RANGEVALUE = SBOM_TAGNUMRULE_VALUECAT_DERIVED;
	public static String SBOM_TAGNUMRULE_VALUECAT_LISTOFVALUE = "List Of Value";
	public static String SBOM_TAGNUMRULE_VALUECAT_LISTOFVALUE_RANGEVALUE = "ListOfValue";
	public static String SBOM_TAGNUMRULE_VALUECAT_LISTOFREFERENCE = "List Of Reference";
	public static String SBOM_TAGNUMRULE_VALUECAT_LISTOFREFERENCE_RANGEVALUE = "ListOfReference";
	public static String SBOM_TAGNUMRULE_VALUECAT_SEQUENCE = "Sequence";
	public static String SBOM_TAGNUMRULE_VALUECAT_SEQUENCE_RANGEVALUE = SBOM_TAGNUMRULE_VALUECAT_SEQUENCE;
	public static String SBOM_TAGNUMRULE_VALUECAT_SUFFIX = "Suffix";
	public static String SBOM_TAGNUMRULE_VALUECAT_SUFFIX_RANGEVALUE = SBOM_TAGNUMRULE_VALUECAT_SUFFIX;

	public static String SBOM_TAGNUMRULE_VALUEFORMAT_FIXED = "Fixed";
	public static String SBOM_TAGNUMRULE_VALUEFORMAT_ALPHA = "Alpha";
	public static String SBOM_TAGNUMRULE_VALUEFORMAT_NUMERIC = "Numeric";
	public static String SBOM_TAGNUMRULE_VALUEFORMAT_ALPHANUMERIC = "Alphanumeric";
	public static String SBOM_TAGNUMRULE_VALUEFORMAT_ALPHAORNUMERIC = "Alpha Or Numeric";

	public static String SBOM_TAGNUMRULE_REFCAT_IDENTIFIERCODE = "Tag Identifier Code";
	public static String SBOM_TAGNUMRULE_REFCAT_IDENTIFIERCODE_RANGEVALUE = "Identifier";
	public static String SBOM_TAGNUMRULE_REFCAT_DISCIPLINECODE = "Tag Discipline Code";
	public static String SBOM_TAGNUMRULE_REFCAT_DISCIPLINECODE_RANGEVALUE = "Discipline";
	public static String SBOM_TAGNUMRULE_REFCAT_COMMONCODE = "Tag Common Code";
	public static String SBOM_TAGNUMRULE_REFCAT_COMMONCODE_RANGEVALUE = "Common";
	public static String SBOM_TAGNUMRULE_REFCAT_SEQMINMAX = "Sequence - Min-Max";
	public static String SBOM_TAGNUMRULE_REFCAT_SEQMINMAX_RANGEVALUE = "MinMax";
	public static String SBOM_TAGNUMRULE_REFCAT_SEQRANGEGROUP = "Sequence - Range Group";
	public static String SBOM_TAGNUMRULE_REFCAT_SEQRANGEGROUP_RANGEVALUE = "RangeGroup";
	public static String SBOM_TAGNUMRULE_REFCAT_SUFFIXABC = "Suffix - ABC";
	public static String SBOM_TAGNUMRULE_REFCAT_SUFFIXABC_RANGEVALUE = "ABC";
	public static String SBOM_TAGNUMRULE_REFCAT_SUFFIX123 = "Suffix - 123";
	public static String SBOM_TAGNUMRULE_REFCAT_SUFFIX123_RANGEVALUE = "123";
	public static String SBOM_TAGNUMRULE_REFCAT_SUFFIXLOV = "Suffix - List Of Value";
	public static String SBOM_TAGNUMRULE_REFCAT_SUFFIXLOV_RANGEVALUE = "ListOfValue";
	public static String SBOM_TAGNUMRULE_REFCAT_SUFFIXRANGEGROUP = "Suffix - Range Group";
	public static String SBOM_TAGNUMRULE_REFCAT_SUFFIXRANGEGROUP_RANGEVALUE = "RangeGroup";

	public static String SBOM_TAGNUMRULE_DIGITCAT_FIXED = "Fixed";
	public static String SBOM_TAGNUMRULE_DIGITCAT_FIXED_RANGEVALUE = SBOM_TAGNUMRULE_DIGITCAT_FIXED;
	public static String SBOM_TAGNUMRULE_DIGITCAT_OPTIONALFIXED = "Optional Fixed";
	public static String SBOM_TAGNUMRULE_DIGITCAT_OPTIONALFIXED_RANGEVALUE = "OptionalFixed";
	public static String SBOM_TAGNUMRULE_DIGITCAT_VARIABLE = "Variable";
	public static String SBOM_TAGNUMRULE_DIGITCAT_VARIABLE_RANGEVALUE = SBOM_TAGNUMRULE_DIGITCAT_VARIABLE;
	public static String SBOM_TAGNUMRULE_DIGITCAT_OPTIONALVARIABLE = "Optional Variable";
	public static String SBOM_TAGNUMRULE_DIGITCAT_OPTIONALVARIABLE_RANGEVALUE = "OptionalVariable";
	public static String SBOM_TAGNUMRULE_DIGITCAT_DERIVED = "Derived";
	public static String SBOM_TAGNUMRULE_DIGITCAT_DERIVED_RANGEVALUE = SBOM_TAGNUMRULE_DIGITCAT_DERIVED;

	public static String SBOM_TAGNUMRULE_VARDIGITCAT_MINMAX = "Min-Max";
	public static String SBOM_TAGNUMRULE_VARDIGITCAT_MINMAX_RANGEVALUE = "MinMax";
	public static String SBOM_TAGNUMRULE_VARDIGITCAT_INCMINMAX = "Incremental Min-Max";
	public static String SBOM_TAGNUMRULE_VARDIGITCAT_INCMINMAX_RANGEVALUE = "IncrementalMinMax";
	public static String SBOM_TAGNUMRULE_VARDIGITCAT_LISTLOV = "List Of Value";
	public static String SBOM_TAGNUMRULE_VARDIGITCAT_LISTLOV_RANGEVALUE = "ListOfValue";

	public static String SBOM_TAGNUMRULE_SUFFIXGROUPCAT_LOV = "LOV";
	public static String SBOM_TAGNUMRULE_SUFFIXGROUPCAT_LOV_RANGEVALUE = "ListOfValue";

	public static String SBOM_TAGATTRCLASS_CAT_FUNCTIONAL_ABBR = "F";
	public static String SBOM_TAGATTRCLASS_CAT_PHYSICAL_ABBR = "P";
	public static String SBOM_TAGATTRCLASS_CAT_BOTH = "Functional/Physical";
	public static String SBOM_TAGATTRCLASS_CAT_BOTH_ABBR = "F/P";
	public static String SBOM_TAGATTRCLASS_CAT_FUNCTIONAL_RANGEVALUE = "Functional";
	public static String SBOM_TAGATTRCLASS_CAT_PHYSICAL_RANGEVALUE = "Physical";
	public static String SBOM_TAGATTRCLASS_CAT_BOTH_RANGEVALUE = "FunctionalAndPhysical";

	public static String SBOM_TAGATTR_CLASSCAT_BASIC = "Tag Basic Info";
	public static String SBOM_TAGATTR_CLASSCAT_FIXED = "Fixed Value";
	public static String SBOM_TAGATTR_CLASSCAT_LOV = "User Select(LOV)";
	public static String SBOM_TAGATTR_CLASSCAT_USERINPUT = "User Input";
	public static String SBOM_TAGATTR_CLASSCAT_TAGNUMUNIT = "Tag Number Unit";
	public static String SBOM_TAGATTR_CLASSCAT_CAD = "CAD Attribute";
	public static String SBOM_TAGATTR_CLASSCAT_DOC = "Related Document";
	public static String SBOM_TAGATTR_CLASSCAT_CPY = "COMPANY Input";
	public static String SBOM_TAGATTR_CLASSCAT_BASIC_RANGEVALUE = "BasicInfo";
	public static String SBOM_TAGATTR_CLASSCAT_FIXED_RANGEVALUE = "Fixed";
	public static String SBOM_TAGATTR_CLASSCAT_LOV_RANGEVALUE = "UserSelect";
	public static String SBOM_TAGATTR_CLASSCAT_USERINPUT_RANGEVALUE = "UserDefine";
	public static String SBOM_TAGATTR_CLASSCAT_TAGNUMUNIT_RANGEVALUE = "DerivedFromTagNumber";
	public static String SBOM_TAGATTR_CLASSCAT_CAD_RANGEVALUE = "DerivedFromEBOM";
	public static String SBOM_TAGATTR_CLASSCAT_DOC_RANGEVALUE = "DerivedFromDoc";
	public static String SBOM_TAGATTR_CLASSCAT_CPY_RANGEVALUE = "CompanyInput";

	public static String SBOM_TAGATTR_TYPECON_ALPHA = "Alphabet Only";
	public static String SBOM_TAGATTR_TYPECON_ALPHA_RANGEVALUE = "AlphabetOnly";
	public static String SBOM_TAGATTR_TYPECON_NUMERIC = "Numeric Only";
	public static String SBOM_TAGATTR_TYPECON_NUMERIC_RANGEVALUE = "NumericOnly";
	public static String SBOM_TAGATTR_TYPECON_TAGNO = "Tag Number";
	public static String SBOM_TAGATTR_TYPECON_TAGNO_RANGEVALUE = "TagNumber";

	public static String convertAttrRangeValueFromExcelData(String attributeExcelData)
	{
		if (SBOM_TAGNUMRULE_REFCAT_IDENTIFIERCODE.equalsIgnoreCase(attributeExcelData)) return SBOM_TAGNUMRULE_REFCAT_IDENTIFIERCODE_RANGEVALUE;
		else if (SBOM_TAGNUMRULE_REFCAT_DISCIPLINECODE.equalsIgnoreCase(attributeExcelData)) return SBOM_TAGNUMRULE_REFCAT_DISCIPLINECODE_RANGEVALUE;
		else if (SBOM_TAGNUMRULE_REFCAT_COMMONCODE.equalsIgnoreCase(attributeExcelData)) return SBOM_TAGNUMRULE_REFCAT_COMMONCODE_RANGEVALUE;
		else if (SBOM_TAGNUMRULE_REFCAT_SEQMINMAX.equalsIgnoreCase(attributeExcelData)) return SBOM_TAGNUMRULE_REFCAT_SEQMINMAX_RANGEVALUE;
		else if (SBOM_TAGNUMRULE_REFCAT_SEQRANGEGROUP.equalsIgnoreCase(attributeExcelData)) return SBOM_TAGNUMRULE_REFCAT_SEQRANGEGROUP_RANGEVALUE;
		else if (SBOM_TAGNUMRULE_REFCAT_SUFFIXABC.equalsIgnoreCase(attributeExcelData)) return  SBOM_TAGNUMRULE_REFCAT_SUFFIXABC_RANGEVALUE;
		else if (SBOM_TAGNUMRULE_REFCAT_SUFFIX123.equalsIgnoreCase(attributeExcelData)) return SBOM_TAGNUMRULE_REFCAT_SUFFIX123_RANGEVALUE;
		else if (SBOM_TAGNUMRULE_REFCAT_SUFFIXLOV.equalsIgnoreCase(attributeExcelData)) return SBOM_TAGNUMRULE_REFCAT_SUFFIXLOV_RANGEVALUE;
		else if (SBOM_TAGNUMRULE_REFCAT_SUFFIXRANGEGROUP.equalsIgnoreCase(attributeExcelData)) return SBOM_TAGNUMRULE_REFCAT_SUFFIXRANGEGROUP_RANGEVALUE;

		else if (SBOM_TAGNUMRULE_VARDIGITCAT_MINMAX.equalsIgnoreCase(attributeExcelData)) return SBOM_TAGNUMRULE_VARDIGITCAT_MINMAX_RANGEVALUE;
		else if (SBOM_TAGNUMRULE_VARDIGITCAT_INCMINMAX.equalsIgnoreCase(attributeExcelData)) return SBOM_TAGNUMRULE_VARDIGITCAT_INCMINMAX_RANGEVALUE;

		else if (SBOM_TAGNUMRULE_SUFFIXGROUPCAT_LOV.equalsIgnoreCase(attributeExcelData)) return SBOM_TAGNUMRULE_SUFFIXGROUPCAT_LOV_RANGEVALUE;

		else if (SBOM_TAGATTRCLASS_CAT_FUNCTIONAL_ABBR.equalsIgnoreCase(attributeExcelData)) return SBOM_TAGATTRCLASS_CAT_FUNCTIONAL_RANGEVALUE;
		else if (SBOM_TAGATTRCLASS_CAT_PHYSICAL_ABBR.equalsIgnoreCase(attributeExcelData)) return SBOM_TAGATTRCLASS_CAT_PHYSICAL_RANGEVALUE;
		else if (SBOM_TAGATTRCLASS_CAT_BOTH.equalsIgnoreCase(attributeExcelData)) return SBOM_TAGATTRCLASS_CAT_BOTH_RANGEVALUE;
		else if (SBOM_TAGATTRCLASS_CAT_BOTH_ABBR.equalsIgnoreCase(attributeExcelData)) return SBOM_TAGATTRCLASS_CAT_BOTH_RANGEVALUE;

		else if (SBOM_TAGATTR_CLASSCAT_BASIC.equalsIgnoreCase(attributeExcelData)) return SBOM_TAGATTR_CLASSCAT_BASIC_RANGEVALUE;
		else if (SBOM_TAGATTR_CLASSCAT_FIXED.equalsIgnoreCase(attributeExcelData)) return SBOM_TAGATTR_CLASSCAT_FIXED_RANGEVALUE;
		else if (SBOM_TAGATTR_CLASSCAT_LOV.equalsIgnoreCase(attributeExcelData)) return SBOM_TAGATTR_CLASSCAT_LOV_RANGEVALUE;
		else if (SBOM_TAGATTR_CLASSCAT_USERINPUT.equalsIgnoreCase(attributeExcelData)) return SBOM_TAGATTR_CLASSCAT_USERINPUT_RANGEVALUE;
		else if (SBOM_TAGATTR_CLASSCAT_TAGNUMUNIT.equalsIgnoreCase(attributeExcelData)) return SBOM_TAGATTR_CLASSCAT_TAGNUMUNIT_RANGEVALUE;
		else if (SBOM_TAGATTR_CLASSCAT_CAD.equalsIgnoreCase(attributeExcelData)) return SBOM_TAGATTR_CLASSCAT_CAD_RANGEVALUE;
		else if (SBOM_TAGATTR_CLASSCAT_DOC.equalsIgnoreCase(attributeExcelData)) return SBOM_TAGATTR_CLASSCAT_DOC_RANGEVALUE;
		else if (SBOM_TAGATTR_CLASSCAT_CPY.equalsIgnoreCase(attributeExcelData)) return SBOM_TAGATTR_CLASSCAT_CPY_RANGEVALUE;

		return attributeExcelData.replaceAll("\\p{Space}", "");
	}

	public static String convertAttrRangeValueToExcelData(String attrRangeValue)
	{
		if (SBOM_TAGNUMRULE_VALUECAT_LISTOFVALUE_RANGEVALUE.equalsIgnoreCase(attrRangeValue)) return SBOM_TAGNUMRULE_VALUECAT_LISTOFVALUE;
		else if (SBOM_TAGNUMRULE_VALUECAT_LISTOFREFERENCE_RANGEVALUE.equalsIgnoreCase(attrRangeValue)) return SBOM_TAGNUMRULE_VALUECAT_LISTOFREFERENCE;
		else if (SBOM_TAGATTR_TYPECON_ALPHA_RANGEVALUE.equalsIgnoreCase(attrRangeValue)) return SBOM_TAGATTR_TYPECON_ALPHA;
		else if (SBOM_TAGATTR_TYPECON_NUMERIC_RANGEVALUE.equalsIgnoreCase(attrRangeValue)) return SBOM_TAGATTR_TYPECON_NUMERIC;
		else if (SBOM_TAGATTR_TYPECON_TAGNO_RANGEVALUE.equalsIgnoreCase(attrRangeValue)) return SBOM_TAGATTR_TYPECON_TAGNO;
		else return attrRangeValue;
	}

	/*
	 * Attribute Ranges
	 */

	public static String SBOM_TAGCLASS_RFQ_CAT_CPY = "CPYRFQ";
	public static String SBOM_TAGCLASS_RFQ_CAT_FST = "FSTRFQ";
	public static String SBOM_TAGCLASS_RFQ_CAT_NA = "NA";
	public static String SBOM_ATTR_RANGE_Y = "Y";
	public static String SBOM_ATTR_RANGE_N = "N";

	/*
	 * Role
	 */
    public static final String ROLE_FSTTAGMASTERMANAGER           = PropertyUtil.getSchemaProperty("role_fstTagMasterManager");
	public static final String ROLE_FSTTAGICSSMASTERMANAGER       = PropertyUtil.getSchemaProperty("role_fstTagICSSMasterManager");
	public static final String ROLE_FSTCOMMISSIONINGDESIGNMANAGER = PropertyUtil.getSchemaProperty("role_fstCommissioningDesignManager");
	public static final String ROLE_FSTLCITAGDATAMANAGER          = PropertyUtil.getSchemaProperty("role_fstLCITagDataManager");

	/*
	upload
	 */
	public static final String DND_FILE_UPLOAD_PATH = "C:/apache-tomee-plus-1.7.2/upload";
}
