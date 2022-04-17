package modules;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollusingJS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<>();

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\manish.kapoor\\\\Downloads\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		Integer int1 = driver.findElements(By.xpath("//div[@class='tableFixHead']//table//tbody//tr/td[4]")).size();
		
		for(int i=1;i<=int1;i++)
		{
			//int sum=0;
			//ArrayList<String> al= new ArrayList<>();
			String text= driver.findElement(By.xpath("//div[@class='tableFixHead']//table//tbody//tr["+(i)+"]/td[4]")).getText();
			al.add(text);
			
			//sum= sum + al;
		}
		System.out.println(al);
		driver.close();
		
	}

}
