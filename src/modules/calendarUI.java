package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manish.kapoor\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='departureCalendar']")).click();
		
		//System.out.println(monthYear);
//		String year= driver.findElement(By.xpath("//div[@class='DayPicker-Months']//div[@class='DayPicker-Caption']")).getText().split("")[1];
//		System.out.println(month +""+year);
//		List<String> ls= new ArrayList<String>();
//		ls.add(month);
//		ls.add(year);
		String monthYear= driver.findElement(By.xpath("//div[@class='DayPicker-Months']//div[@class='DayPicker-Caption']")).getText();
		while(!monthYear.contains("December 2022"))
			{
				driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span[@aria-label=\"Next Month\"]")).click();
				monthYear= driver.findElement(By.xpath("//div[@class='DayPicker-Months']//div[@class='DayPicker-Caption']")).getText();
			}
		System.out.println(monthYear);
		
		int dateCount= driver.findElements(By.xpath("//div[@class='DayPicker-Day']")).size();
		String text=driver.findElement(By.xpath("//div[@class='DayPicker-Day']")).getText();
		for(int i=1;i<dateCount;i++)
		{
			
			if(!text.equalsIgnoreCase("25"))
			{
				
				text=driver.findElement(By.xpath("//div[@class='DayPicker-Day']")).getText();
			}
		}
		driver.findElement(By.xpath("//div[@class='DayPicker-Day']")).click();
		
	}

}
