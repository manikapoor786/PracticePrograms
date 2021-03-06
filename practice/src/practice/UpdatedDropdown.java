package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdatedDropdown {

	static WebDriver driver;
	static UpdatedDropdown ud = new UpdatedDropdown();

	public void login() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manish.kapoor\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
	}

	public void exit() {
		driver.close();
	}

	public void selectState(String state) {
		int statesCount = driver.findElements(By.xpath("//div[@id='dropdownGroup1']/div/ul/li")).size();
		for (int i = 0; i <= statesCount; i++) {
			String stateName = driver.findElements(By.xpath("//div[@id='dropdownGroup1']/div/ul/li")).get(i).getText();
			if (stateName.contains(state)) {
				driver.findElements(By.xpath("//div[@id='dropdownGroup1']/div/ul/li")).get(i).click();
			}
		}
	}

	public void dynamicDropDown() {
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		ud.selectState("Mumbai");
		ud.selectState("Delhi");
	}

	public void staticDropDown() {
		Select dropdown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		dropdown.selectByValue("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
	}

	public void Dropdown(String persontype, String personid, int n) {
		for (int i = 0; i < n; i++) {
			driver.findElement(By.xpath("//div[@id='" + persontype + "']//span[@id='" + personid + "']")).click();
		}
	}

	public void suggestiveDropdown() throws InterruptedException {
		WebDriverWait wd = new WebDriverWait(driver, 5);
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("IND");
		wd.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@id='ui-id-1']"))));
		int nol = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li")).size();
		for (int i = 0; i < nol; i++) {
			String countryName = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li")).get(i).getText();
			if (countryName.contentEquals("India")) {
				driver.findElements(By.xpath("//ul[@id='ui-id-1']/li")).get(i).click();
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {

		UpdatedDropdown ds = new UpdatedDropdown();
		ds.login();
		ds.suggestiveDropdown();
		ds.exit();
	}

}
