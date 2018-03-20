package selenium.practice.concepts;

import org.apache.log4j.Logger;

import mx4j.log.Log;

public class take_Log {
	
	
	private static Logger log = Logger.getLogger(Log.class.getName());
	
	public static void Start_testcase(String testcasename){
		
		log.info("****************************"+testcasename+"*************************************");
		log.info("----------------------------------------------------------------------------------");
		
	}
	
	
	public static void endtestcase(String testcasename){
		log.info("---------------------------------END"+testcasename+"***********************************");
	}
	
	public static void  initialize(String init)
	{
		log.info(init);
	}
	
	public static void error(String message){
		log.error(message);
	}
	
	  
	}
