package Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import util.WebBrowser;
import util.WebBrowser1;

public class DragandDrop 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","lib\\chromedriver.exe");
	     WebDriver driver=WebBrowser.openBrowser("https://jqueryui.com/droppable/");

	     driver.switchTo().frame(0);
	     //("http://www.istqb.org");
	   // driver.get("http://www.echoecho.com/htmlforms10.htm");
	     WebElement source=driver.findElement(By.id("draggable"));
	     WebElement target=driver.findElement(By.id("droppable"));
	     //driver.manage().window().maximize();
	     Actions builder =new Actions(driver);
	     //WebElement menu =driver.findElement (By.linkText("Exams"));
	     builder.dragAndDrop(source,target).perform();
	     //List<WebElement> submenus= driver.findElements(By.cssSelector("div.mega-inner>ul>li>a"));
	    // div.navbar-collapse.collapse.navbar-right > ul > li.dropdown.open > ul > li:nth-child(2) > a
	     		//for(WebElement sb : submenus)
	     		//{
	     			if(target.getText().equals("Dropped"))
	     			{
	     				System.out.println("Success");
	     			}
	     		}
	     		
	     			}
	
	     		
	     		
	     
	     
