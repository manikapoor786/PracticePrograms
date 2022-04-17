package practice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Greencart {
	
	static WebDriver driver;
	String price;
	
	public void getPrice(String [] itemsNeeded) throws InterruptedException
	{
		
		int numProducts= driver.findElements(By.xpath("//div[@class='products']//h4")).size();
		
		for(int i=0;i<numProducts;i++)
		{
			String productName= driver.findElements(By.xpath("//div[@class='products']//h4")).get(i).getText().split("-")[0].trim();
			List<String> itemsNeededList= Arrays.asList(itemsNeeded);
			int k=0;
			if(itemsNeededList.contains(productName))
			{
				k++;
				for(int j=0;j<3;j++)
				{
					driver.findElements(By.xpath("//div[@class='products']//a[@class='increment']")).get(i).click();
				}
				
				Thread.sleep(2000L);
				
				driver.findElements(By.xpath("//div[@class='products']//button")).get(i).click();
				price= driver.findElements(By.xpath("//div[@class='products']//p")).get(i).getText();
				
				System.out.println(price);
				
				if(k==itemsNeededList.size())
				break;
			}
			 
		}
	}
	
	public void placeOrder(String promoCode)
	{
		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.xpath("//div[@class='promoWrapper']/input[@class='promoCode']")).sendKeys(promoCode);
		driver.findElement(By.xpath("//div[@class='promoWrapper']/button[@class='promoBtn']")).click();
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\manish.kapoor\\\\Downloads\\\\chromedriver_win32 (3)\\\\chromedriver.exe");
		driver= new ChromeDriver();
		//WebDriverWait wd= new WebDriverWait(driver, 15);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Greencart gc= new Greencart();
		//String[] itemsNeeded= {"Apple","Corn","Cucumber"};
		String itemsNeeded[]= {"Walnuts","Almonds"};
		gc.getPrice(itemsNeeded);
		gc.placeOrder("rahulshettyacademy");
		driver.close();
	}
}
