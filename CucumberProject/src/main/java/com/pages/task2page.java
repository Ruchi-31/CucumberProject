package com.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class task2page {

	public WebDriver ldriver;

	
	public task2page(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	
	}
	
	@FindBy(xpath ="//div[@id='app']//a[@title='Metro']")
	WebElement MetroMenu;
	
	@FindBy(xpath ="//input[@type='text']")
	WebElement MetroInput;
	
	@FindBy(xpath ="//li[2]//div[1]//div[1]//input[1]")
	@CacheLookup
	WebElement TicketInput;
	
	@FindBy(xpath ="//*[@id='app']/div/div[4]/div[1]/div/div/div[2]/div[1]/ul/li[3]/div/input")
	@CacheLookup
	WebElement cardInput;
	
	@FindBy(xpath ="//button[text()='Get Card Balance']")
	@CacheLookup
	WebElement ProceedBtn;
	
	@FindBy(xpath ="//div[@class='menuContainer']//p")
	@CacheLookup
	WebElement VerText;
	
	
	public void ClickMetroMenu() {
		WebDriverWait wait = new WebDriverWait(ldriver, 60);
		wait.until(ExpectedConditions.visibilityOf(MetroMenu));
		MetroMenu.click();
	}
	
	
	public void fillvalue(String name) throws InterruptedException {
		MetroInput.click();
		List<WebElement> allOptions = ldriver.findElements(By.xpath("//*[@class='_2uIb']"));
		for(int i = 0; i<=allOptions.size()-1; i++) {
		if(allOptions.get(i).getText().contains(name)) {
		MetroInput.sendKeys(name);
		allOptions.get(i).click();
		System.out.println("City Selcted");
		break;	
		}
		}
		
		TicketInput.click();
		TicketInput.sendKeys("Smart");
		TicketInput.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		TicketInput.sendKeys(Keys.TAB);
		WebDriverWait wait = new WebDriverWait(ldriver, 30);
		wait.until(ExpectedConditions.visibilityOf(cardInput));
		cardInput.click();
		cardInput.sendKeys("1234567890");
		ProceedBtn.click();

	}
	
	public void Verifypage() {
		ldriver.switchTo().frame(0);
		WebDriverWait wait = new WebDriverWait(ldriver, 30);
		wait.until(ExpectedConditions.visibilityOf(VerText));
		String popuptest = VerText.getText();
		if(popuptest.equalsIgnoreCase("To Login into your Paytm Web account"))
		{
			System.out.println("Verify Successfully");
		}else {
			System.out.println("Page not Found");
		}
	}
	
}
