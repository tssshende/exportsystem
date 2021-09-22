package may21batch.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NTLoginPO {
	private WebElement username;
	private WebElement password;

	private WebDriver driver;

	public NTLoginPO() {
		System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver-93.exe");
		driver = new ChromeDriver();
		driver.get("https://nichethyself.com/tourism/home.html");
		username = driver.findElement(By.name("username"));
		password = driver.findElement(By.name("password"));

	}

	public void login(String userID, String passwd) {
		username.sendKeys(userID);
		password.sendKeys(passwd);
		password.submit();
	}

}
