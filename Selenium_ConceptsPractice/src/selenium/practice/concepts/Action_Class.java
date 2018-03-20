/**
 * 
 */
package selenium.practice.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Anuj Chaudhary
 *
 */
public class Action_Class {
	
	
	By element = By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span");
	
	
	public void mousehover(WebDriver driver) throws InterruptedException{
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		Handling_PopUps.handlepopups(driver);
		WebElement e= driver.findElement(element);
		Actions action = new Actions(driver);
		action.moveToElement(e).build().perform();
		driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[5]/a/span")).click();
		
	}

}
