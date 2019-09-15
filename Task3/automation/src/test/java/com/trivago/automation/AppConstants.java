package com.trivago.automation;

/**
 * @author Abdalla
 * email  abdalla.gamal.abdalla@gmail.com
 * date 14-Sep-2019
 * description 
 *    ** Utility class to contains the constants and xpaths
 */
public class AppConstants {

	public static final String POSITIONS_URL = "https://company.trivago.com/open-positions/";
	public static final String DRIVER_PATH = "D:\\chromedriver_win32\\chromedriver.exe";
	public static final String JOB_TITLE = "//*[@id=\"content\"]/section[2]/div/div/div/h1";
	public static final String JOB_FAMILY = "//*[@id=\"job_family\"]";
	public static final String EXPERIENCE_LEVEL = "//*[@id=\"content\"]/section[3]/div/div/div[2]/p[2]/span";
	public static final String LOCATION = "//*[@id=\"content\"]/section[3]/div/div/div[2]/p[3]/span";
	public static final String LANGUAGE = "//*[@id=\"content\"]/section[3]/div/div/div[2]/p[4]/span";
	public static final String TEST_PAGE = "https://company.trivago.com/jobs/r0001914/";
	public static final String APPLY_BTN1 = "//*[@id='content']/section[3]/div/div/div[2]/button";
	public static final String APPLY_BTN2 = "//*[@id=\"content\"]/section[3]/div/div/div[4]/button";
	public static final String WHAT_YOU_DO = "//*[@id=\"content\"]/section[3]/div/div/div[3]/p[11]/span/span/span/span/b";
	public static final String WHAT_YOU_NEED = "//*[@id=\"content\"]/section[3]/div/div/div[3]/p[12]/span/span/span/span[2]/b";
	public static final String WHAT_WE_LOVE = "//*[@id=\"content\"]/section[3]/div/div/div[3]/p[14]/span/span/span/span/b";
	public static final String POSITIONS_TABLE = "//*[@id='list-jobs']/table[1]/tbody";
	public static final String POSITIONS_TABLE_ROW =   "//*[@id='list-jobs']/table[1]/tbody/tr";
}
