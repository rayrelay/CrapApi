package cn.crap.utils;
public class Const {
//	public final static String SESSION_ADMIN = "sessionAdminName";
//	public final static String SESSION_IMGCODE_TIMES = "sessionImgCodeTryTimes";
//	public final static String SESSION_ADMIN_AUTH = "sessionAdminAuthor";
//	public final static String SESSION_ADMIN_ID = "sessionAdminId";
//	public final static String SESSION_ADMIN_TRUENAME = "sessionAdminTrueName";
//	public final static String SESSION_ADMIN_ROLEIDS = "sessionAdminRoleIds";
//	public final static String SESSION_IMG_CODE = "sessionImgCode";
//	public final static String SESSION_TEMP_PASSWORD = "sessionTempPassword";
	
	
	
	public static final String NULL = "_NULL";
	public final static String NULL_ID = "NULL"; //当新增数据时，前段传递的id=NULL
	public static final String NOT_NULL = "NOT_NULL";
	public static final String BLANK = "_BLANK"; 
	public static final String DEF_MODULEID = "defaultModuleId";
	public static final String SUPER = "super"; 
	public static final String MODULEID = "MODULEID"; 
	public static final String AUTH_USER = "USER";
	public static final String AUTH_MENU = "MENU";
	public static final String AUTH_SETTING = "SETTING";
	public static final String AUTH_COMMENT = "COMMENT";
	public static final String AUTH_ERROR = "ERROR_"+MODULEID;
	public static final String AUTH_DICTIONARY = "DICTIONARY_"+MODULEID;
	public static final String AUTH_INTERFACE = "INTERFACE_"+MODULEID;
	public static final String AUTH_MODULE = "MODULE_"+MODULEID;
	public static final String AUTH_ROLE = "ROLE";
	public static final String AUTH_LOG = "LOG";
	public static final String AUTH_SOURCE = "SOURCE";
	// 缓存
	public static int CACHE_USER_TIME = 60 *30;// 用户相关数据缓存30 分钟
	public static final String CACHE_USER= ":user";
	public static final String CACHE_AUTH = ":auth";
	public static final String CACHE_IMGCODE = ":imgCode";
	public static final String CACHE_IMGCODE_TIMES = ":imgCodeTimes";
	public static final String CACHE_TEMP_PWD = ":tempPwd";
	public static final String CACHE_SEARCH_WORDS = ":searchWords";
	
	//常量
	public static final String COOKIE_USERNAME = "cookieUserName";
	public static final String COOKIE_PASSWORD = "cookiePassword";
	public static final String COOKIE_TOKEN = "token";
	public static final String COOKIE_UUID = "uuid";
	public static final String COOKIE_REMBER_PWD = "cookieRemberPwd";
	public static final String MODULE = "MODULE";
	public static final String DIRECTORY = "DIRECTORY";
	public static final String SOURCE = "SOURCE";
	public static final String SEPARATOR = "SEPARATOR";
	
	//系统设置
	public static final String SETTING_SECRETKEY = "SECRETKEY";
	public final static String SETTING_VERIFICATIONCODE = "VERIFICATIONCODE";
	public final static String SETTING_VISITCODE = "VISITCODE";
	public final static String SETTING_DOMAIN = "DOMAIN";
	public static final String SETTING_COMMENTCODE = "COMMENTCODE";
	public static final String SETTING_LUCENE_DIR = "LUCENE_DIR";
	
	//SOLR
	public static final String SOLR_URL = "SOLR_URL";
	public static final String SOLR_QUEUESIZE  = "SOLR_QUEUESIZE";
	public static final String SOLR_THREADCOUNT = "SOLR_THREADCOUNT";
	public static final String SEARCH_TYPE = "SEARCH_TYPE";
}
