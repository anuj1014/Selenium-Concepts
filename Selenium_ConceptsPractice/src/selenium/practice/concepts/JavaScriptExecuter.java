package selenium.practice.concepts;

import java.util.concurrent.TimeUnit;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuter {

	
	private static final Object String = null;
	WebDriver driver= null;
	JavascriptExecutor js =null;
	
	public JavaScriptExecuter(WebDriver driver) throws InterruptedException{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		 this.driver=driver;
		 this.js=js;
		
	}

	public void alert(){
		js.executeScript("alert('Kya haal hai bhai..javascript executer seekh rha ke');");
		
		try{
			Thread.sleep(3000);
		}catch(Exception e) 
			{
			System.out.println("");
		}
		
		driver.switchTo().alert().accept();
	
	}
	
	
	public void pagerefresh(){
		js.executeScript("location.reload()");
	
	}
	
	public void getTitle(){
		String s =js.executeScript("return document.title;").toString();
		System.out.println(s);
		
	}
	
	//Argument Example
	public void	 argument(String a, String b, String c)	{
		js.executeScript("argument[0].click()", String);
	}
			
			
		
	
}
