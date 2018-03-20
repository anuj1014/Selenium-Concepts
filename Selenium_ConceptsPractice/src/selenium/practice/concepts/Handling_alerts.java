/**
 * 
 */
package selenium.practice.concepts;

import org.openqa.selenium.WebDriver;

/**
 * @author Anuj Chaudhary
 *
 */
public class Handling_alerts {

	
	
		public static void handlingalert(WebDriver driver){
				
				if(isAlertPresent(driver))
				{
					driver.switchTo().alert();
					driver.switchTo().alert().accept();
					driver.switchTo().defaultContent();
				}
		
		}
	
	
	
		public static boolean isAlertPresent(WebDriver driver){
			try{
				driver.switchTo().alert();
				return true;
			}catch(Exception e){
				return false;
		
			}
		}
	
}
