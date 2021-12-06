package com.pageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel {

	WebDriver driver;
	
	public PageObjectModel(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}
	
/////////////////////////////////////////////////Sign_in
	
	@FindBy(xpath = "//a[@class='login']")
	private WebElement sign_in;

        public WebElement getSign_in() {
		return sign_in;
	}
	
////////////////////////////////////////////////Email address
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private  WebElement emailaddress;


	public WebElement getEmailaddress() {
		return emailaddress;
	}
	
/////////////////////////////////////////////////Click the create on account
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	public WebElement clicktheaccount;

	public WebElement getClicktheaccount() {
		return clicktheaccount;
	}
/////////////////////////////////////////////////Title
	
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	public WebElement title;

	public WebElement getTitle() {
		return title;
	}
///////////////////////////////////////////////Firstname
	
	@FindBy(xpath = "(//input[@type=\"text\"])[2]")
	public WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}
////////////////////////////////////////////////Lastname
	
	@FindBy(xpath = "(//input[@type=\"text\"])[3]")
	public WebElement lastname;

	public WebElement getLastname() {
		return lastname;
		
   }
////////////////////////////////////////////////Password
	
    @FindBy(xpath ="//input[@type='password']")
     private WebElement Password;

	public WebElement getPassword() {
		return Password;
	}
/////////////////////////////////////////////////////date
	
	@FindBy(xpath = "//select[@id='days']")
	public WebElement date;

	public WebElement getDate() {
		return date;
	}
	@FindBy(xpath = "//select[@id='months']")
	public WebElement month;

	public WebElement getMonth() {
		return month;
	}
	@FindBy(xpath = "//select[@id='years']")
	public WebElement year;

	public WebElement getYear() {
		return year;
	}

}
