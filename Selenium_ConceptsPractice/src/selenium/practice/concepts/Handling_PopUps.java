/**
 * 
 */
package selenium.practice.concepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

/**
 * @author Anuj Chaudhary
 *
 */
public class Handling_PopUps {
	
	WebDriver driver;

	public static void handlepopups(WebDriver driver){
		
		
		String parentWindowHandler = driver.getWindowHandle();//store parent window	
		String subWindowHandle;
		
		Set<String> handles = driver.getWindowHandles(); //Stores all windows handlers
		
		Iterator<String> iterator = handles.iterator();
		
		while(iterator.hasNext()){
			
			subWindowHandle = iterator.next();
			
			if(subWindowHandle.equalsIgnoreCase(parentWindowHandler))
				continue;
			else
				driver.switchTo().window(subWindowHandle).close();
			
			}
		driver.switchTo().window(parentWindowHandler);//switch back to  parent window
		
		}
		
		
		
		
		
	}
	
	
	

