/**
 * 
 */
package practice.controller;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.practice.concepts.*;

/**
 * @author Anuj Chaudhary
 * This is used to call all the test cases
 *
 */
public class Controller {
	
	WebDriver driver;
	Logger logger =Logger.getLogger(Controller.class);
	
	
	@BeforeMethod
	public void browserinitialization(){
		PropertyConfigurator.configure("log4j.properties");
		WebDriver driver= Cross_BrowserCompitability.Browser("firefox", "https://www.google.com");
		logger.info("firefox opened");
		driver.findElement(By.id("gs_htif0")).sendKeys("Ramesh Kumar");
		
	      Screenshots.captureScreenshot(driver,"initialize");
	      logger.info("screenshot captured");
		take_Log.initialize("Driver Initialized");
		
		this.driver=driver;
		
		//For Alert Message
		//WebDriver driver= Cross_BrowserCompitability.Browser("firefox", "http://www.web-source.net/web_design_tips/alert_message_web_page_load.htm");
			
		Handling_PopUps.handlepopups(driver);
		//Handling_alerts.handlingalert(driver);
	}
	
	
	@Test(enabled =false)
	public void test() throws InterruptedException{
		
		take_Log.Start_testcase("capture_screenshot");
		Action_Class a = new Action_Class();
		a.mousehover(driver);
		Screenshots.captureScreenshot(driver,"afterhover");
		
		
	}
	
	
	@Test(enabled= false)
	public void excel_operation() throws IOException{
		System.out.println("enter to test");
		Handling_excel e = new Handling_excel("C:\\Users\\Anuj Chaudhary\\Desktop\\excel.xlsx", "LoginTest");
		e.getAllData();
		//throw new SkipException("Skipped excel input");
		
	}

	
	@Test(enabled=false)
	public void set_outputdata() throws IOException{
		
		String [][] data = {{ "Rambhul","pass1234"},
							{"Shyambhul","pass1234"}};
		
		Handling_excel e= new Handling_excel("C:\\Users\\Anuj Chaudhary\\Desktop\\excel.xlsx", "LoginTest");
		e.set_data();
		//throw new SkipException("Skipped excel output");
		}
		
	@Test(enabled=true)
	public void javascript_executor() throws InterruptedException{
		
		JavaScriptExecuter j = new JavaScriptExecuter(driver);
		j.alert();
		j.pagerefresh();
		j.getTitle();
		//j.argument("Ramesh", "Suresh", "Naresh");
	}

	/*@BeforeMethod
	public void close_Test(){
		Cross_BrowserCompitability.final_close(driver);
	}*/
	
	
	
	
}
