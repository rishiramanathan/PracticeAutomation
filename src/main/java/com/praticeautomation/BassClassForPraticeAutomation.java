package com.praticeautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BassClassForPraticeAutomation {

	public static WebDriver driver;

	public static WebDriver browser(String type) {
		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\User\\eclipse-workspace\\PracticeAutomation\\driver\\chromedriver.exe");

			driver = new ChromeDriver();

		}
		return driver;

	}
///////////////////////////////////////////////////////////Click

	public static void geturl(String value) {
		driver.get(value);

	}

	public static void click(WebElement element) {

		element.click();

	}
//////////////////////////////////////////////////////////////Sendkeys
	public static void inputvalue(WebElement element, String value) {
		element.sendKeys(value);

	}

/////////////////////////////////////////////Dropdown
	
	public static void selectthedate(WebElement element, String value, String types) {

		Select select = new Select(element);

		if (types.equalsIgnoreCase("value")) {
			select.selectByValue(value);

		}
		else if(types.equalsIgnoreCase("text")) {
			select.selectByValue(value);
		}
		else if(types.equalsIgnoreCase("year")) {
			select.selectByValue(value);
		}

	}

}
