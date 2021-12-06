package com.testRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pageobjectModel.PageObjectModel;
import com.praticeautomation.BassClassForPraticeAutomation;

public class TestRunner extends BassClassForPraticeAutomation{
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver= browser("chrome");
		
		geturl("http://automationpractice.com/index.php");
		
		PageObjectModel pom=new PageObjectModel(driver);
		
		click(pom.getSign_in());
		
		inputvalue(pom.getEmailaddress(), "rishiramanathan@gmail.com");
		
		click(pom.clicktheaccount);
		
		Thread.sleep(3000);
		
		click(pom.title);
		
		inputvalue(pom.firstname, "Rishi ");
		
		inputvalue(pom.lastname, "Ramanathan");
		
		inputvalue(pom.getPassword(), "rishairamanathan");
		
		Thread.sleep(2000);
////////////////////////////////////////////////////////////Dropdown Values
		selectthedate(pom.getDate(),"3", "value");
		
		selectthedate(pom.getMonth(), "2","text");
		
		selectthedate(pom.getYear(), "1998", "year");
		
			
			
	
		
		
		
		
				
	}
	

}
