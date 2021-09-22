package Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicMenus 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","lib\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("http://www.istqb.org");
	   // driver.get("http://www.echoecho.com/htmlforms10.htm");
	     driver.manage().window().maximize();
	     Actions builder =new Actions(driver);
	     WebElement menu =driver.findElement (By.linkText("Exams"));
	     builder.moveToElement(menu).perform();
	     List<WebElement> submenus= driver.findElements(By.cssSelector("div.mega-inner>ul>li>a"));
	    // div.navbar-collapse.collapse.navbar-right > ul > li.dropdown.open > ul > li:nth-child(2) > a
	     		for(WebElement sb : submenus)
	     		{
	     			if(sb.getText().trim().equals("Exam questions"))
	     			{
	     				sb.click();
	     			}
	     		}
	     		
	     			}
	
	     		}
	     		
	     
	     
