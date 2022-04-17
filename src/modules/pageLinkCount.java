package modules;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageLinkCount {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manish.kapoor\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		int count= driver.findElements(By.xpath("//a")).size();
		System.out.println("Links count in the page is "+count);
		
		WebElement footer= driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		int footerlinkcount= footer.findElements(By.tagName("a")).size();
		System.out.println(footerlinkcount);
		
		WebElement footercolumn1= footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int footercolumnlinkcount= footercolumn1.findElements(By.tagName("a")).size();
		System.out.println(footercolumnlinkcount);
		
			for(int i=1;i<footercolumnlinkcount;i++) 
			{
				footercolumn1.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				Thread.sleep(5000L);
			}
				Set<String> ls= driver.getWindowHandles();
				Iterator<String> its= ls.iterator();
				
				while(its.hasNext())
				{
						driver.switchTo().window(its.next());
						System.out.println(driver.getTitle());
						//driver.close();
				}
				
				
			
			
		driver.close();
	}

}
