package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ActionMouse {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\manish.kapoor\\\\Downloads\\\\chromedriver_win32 (3)\\\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath("//div[@id='nav-al-your-account']//span[text()='Memberships & Subscriptions']"))).build().perform();
		String text= driver.findElement(By.xpath("//div[@id='nav-al-your-account']//span[text()='Memberships & Subscriptions']")).getText();
		Assert.assertEquals(text, "Memberships & Subscriptions");
	}

}
