/**
 * 
 */
package selenium.practice.concepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * @author Anuj Chaudhary
 *
 */
public class Screenshots {
	
	
	public static void captureScreenshot(WebDriver driver, String name){
		
		TakesScreenshot t = (TakesScreenshot)driver;
		
		
		File scr = t.getScreenshotAs(OutputType.FILE);
		try {
			
			FileUtils.copyFile(scr, new File("C:/Users/Anuj Chaudhary/Desktop/Screenshot_"+name+".png"));
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
