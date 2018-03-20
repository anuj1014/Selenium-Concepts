/**
 * 
 */
package selenium.practice.concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * This class is used to handle different Browser
 *
 */
public class Cross_BrowserCompitability {

	 static WebDriver driver ;
	
	public static WebDriver Browser(String brow, String url){
		
		if(brow.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (brow.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (brow.equalsIgnoreCase("ie"))
		{
			driver = new InternetExplorerDriver();
			
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		driver.get(url);
		return driver;
	}
	
	public static void final_close(WebDriver driver){
		
		driver.close();
	}
	
		
}
	
	
	
	
	

