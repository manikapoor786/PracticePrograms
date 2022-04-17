package practice;

import org.openqa.selenium.By;

public class DropdownStatic extends UpdatedDropdown{
	
	public static void main(String[] args) {
		
		DropdownStatic ds= new DropdownStatic();
		ds.login();
		driver.findElement(By.id("divpaxinfo")).click();
		ds.Dropdown("divAdult", "hrefIncAdt", 2);
		ds.Dropdown("divChild", "hrefIncChd", 2);
		ds.Dropdown("divInfant", "hrefIncInf", 1);
		ds.exit();
		
		ds.login();
		ds.staticDropDown();
		ds.exit();
		
		ds.login();
		ds.dynamicDropDown();
		ds.exit();
		
	}

}
