package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.WebBrowser;


public class DemoModal 
//this is class demo
{
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","lib\\chromedriver.exe");
	     WebDriver driver=WebBrowser.openBrowser("https://demoqa.com/modal-dialogs");
	     	     driver.findElement(By.id("showLargeModal")).click();
	     	     Thread.sleep(2000);
	     	     System.out.println(driver.findElement(By.id("example-modal-sizes-title-lg")).getText());
	     	    driver.findElement(By.id("closeLargeModal")).click();
	     
	}
}
	
	         
	

	    	
	     
