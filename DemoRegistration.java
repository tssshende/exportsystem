package Test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","lib\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("http://demo.automationtesting.in/Register.html");
	   // driver.get("http://www.echoecho.com/htmlforms10.htm");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("aaa");
	     driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("baa");
	     driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("caa");
	     driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("daa");
	     driver.findElement(By.xpath("//input[@ng-model='CPassword']")).sendKeys("eaa");
	     driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
	     
	     
	   //button[@id='submitbtn']
	   //input[@ng-model='CPassword']
	     
	   
	   //driver.findElement(By.xpath(""//textarea[@ng-model='Adress']")).
	   
	     driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("daa.@gmail.com");
	     driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("999999");
	     driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
	     driver.findElement(By.xpath("//button[@id='Button1']")).click();
	   //button[@id='submitbtn'] 
	   //button[@id='Button1'] 
	   //  driver.findElement(By.xpath("//div[@id='msdd']")).
	   //input[@ng-model='Phone']
	   //input[@ng-model='radiovalue']
	     List<WebElement> radio=driver.findElements(By.xpath("//input[@value='Male'] "));
	     for(WebElement rd:radio)
	     {
	    	 if(rd.getAttribute("value").equalsIgnoreCase("Male"))
	    	 {
	    		 rd.click();
	    		 
	     
	          }


         }
	     List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
	     for(WebElement ch:checkboxes)
	     {
	    	 if(ch.getAttribute("value").equalsIgnoreCase("cricket"))
	    	 {
	    		 ch.click();
	    		 break;
	     
	          }


         }
	}


	}


