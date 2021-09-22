package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateById {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver","lib\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	     driver.manage().window().maximize();
	     
	     WebElement txtusername=driver.findElement(By.id("login1"));
	     txtusername.sendKeys("admin");
	     WebElement txtpassword=driver.findElement(By.id("password"));
	     txtpassword.sendKeys("admin");
	     driver.findElement(By.name("proceed")).click();
	}

}
