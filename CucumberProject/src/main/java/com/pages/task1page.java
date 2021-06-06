package com.pages;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.reusable;




public class task1page {

	//public WebDriver driver;
	reusable resuable;
	public WebDriver driver;

	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public task1page(WebDriver rdriver){
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
		resuable = new reusable();
		
	}

	@FindBy(xpath ="//input[@id='txtUsername']")
	@CacheLookup
	WebElement emailId;

	@FindBy(xpath ="//input[@id='txtPassword']")
	@CacheLookup
	WebElement password;

	@FindBy(xpath ="//input[@id='btnLogin']")
	@CacheLookup
	WebElement LoginBtn;

	@FindBy(xpath ="//a[@id='menu__Performance']")
	@CacheLookup
	WebElement menuOption;

	@FindBy(xpath ="//a[@id='menu_performance_ManageReviews']")
	@CacheLookup
	WebElement subMenuOption;

	@FindBy(xpath ="//a[@id='menu_performance_searchPerformancReview']")
	@CacheLookup
	WebElement selectMenuOption;

	@FindBy(xpath ="//*[@id='performanceReview360SearchForm_employeeName']")
	@CacheLookup
	WebElement EmpName;

	@FindBy(xpath ="//*[@id='performanceReview360SearchForm_jobTitleCode']")
	@CacheLookup
	WebElement selectJobtitle;

	@FindBy(xpath ="//*[@id='performanceReview360SearchForm_status']")
	@CacheLookup
	WebElement selectJobstatus;

	@FindBy(xpath ="//*[@id='performanceReview360SearchForm']/fieldset/ol/li[4]/img")
	@CacheLookup
	WebElement cal1;

	@FindBy(xpath ="//*[@id='ui-datepicker-div']/div/div/select[1]")
	@CacheLookup
	WebElement calmonth;

	@FindBy(xpath ="//*[@id='ui-datepicker-div']/div/div/select[2]")
	@CacheLookup
	WebElement calyear;

	@FindBy(xpath ="//*[@id='performanceReview360SearchForm']/fieldset/ol/li[5]/img")
	@CacheLookup
	WebElement cal2;
	
	@FindBy(xpath ="//*[@id='ui-datepicker-div']/div/div/select[1]")
	@CacheLookup
	WebElement calmonth1;

	@FindBy(xpath ="//*[@id='ui-datepicker-div']/div/div/select[2]")
	@CacheLookup
	WebElement calyear1;

	@FindBy(xpath ="//*[@id='btnSearch']")
	@CacheLookup
	WebElement Searchbtn;
	
	@FindBy(xpath ="//*[@id='btnReset']")
	@CacheLookup
	WebElement Resethbtn;
	
	@FindBy(xpath ="//a[text()='Evaluate']")
	@CacheLookup
	WebElement Evaluate;

	@FindBy(xpath ="//h1[text()='Evaluation by Supervisor']")
	@CacheLookup
	WebElement ScrollEle;
	
	@FindBy(xpath ="//input[@id='rating_58']")
	@CacheLookup
	WebElement rating1;
	
	@FindBy(xpath ="//textarea[@id='comment_58']")
	@CacheLookup
	WebElement comment1;
	
	@FindBy(xpath ="//input[@id='rating_59']")
	@CacheLookup
	WebElement rating2;
	
	@FindBy(xpath ="//textarea[@id='comment_59']")
	@CacheLookup
	WebElement comment2;
	
	@FindBy(xpath ="//input[@id='rating_60']")
	@CacheLookup
	WebElement rating3;
	
	@FindBy(xpath ="//textarea[@id='comment_60']")
	@CacheLookup
	WebElement comment3;
	
	@FindBy(xpath ="//input[@id='rating_61']")
	@CacheLookup
	WebElement rating4;
	
	@FindBy(xpath ="//textarea[@id='comment_61']")
	@CacheLookup
	WebElement comment4;
	
	@FindBy(xpath ="//input[@id='rating_62']")
	@CacheLookup
	WebElement rating5;
	
	@FindBy(xpath ="//textarea[@id='comment_62']")
	@CacheLookup
	WebElement comment5;
	
	@FindBy(xpath ="//textarea[@id='general_comment_1']")
	@CacheLookup
	WebElement Generalrating;
	
	@FindBy(xpath ="//h1[text()='Finalization']")
	@CacheLookup
	WebElement ScrollFinal;
	
	@FindBy(xpath ="//textarea[@id='reviewEvaluation_hrAdminComments']")
	@CacheLookup
	WebElement FinalComment;
	
	@FindBy(xpath ="//input[@id='reviewEvaluation_finalRating']")
	@CacheLookup
	WebElement Finalrating;
	
	@FindBy(xpath ="//img[@class='ui-datepicker-trigger']")
	@CacheLookup
	WebElement cal;

	@FindBy(xpath ="//*[@id='ui-datepicker-div']/div/div/select[1]")
	@CacheLookup
	WebElement calmonth3;

	@FindBy(xpath ="//*[@id='ui-datepicker-div']/div/div/select[2]")
	@CacheLookup
	WebElement calyear3;
	
	@FindBy(xpath ="//*[@id='saveBtn']")
	@CacheLookup
	WebElement Savebtn;
	
	@FindBy(xpath ="//*[@id='ui-datepicker-div']/table/tbody")
	@CacheLookup
	WebElement calDate;
	
	@FindBy(xpath ="//*[@id='ui-datepicker-div']/table/tbody")
	@CacheLookup
	WebElement calDate1;
	
	@FindBy(xpath ="//*[@id='ui-datepicker-div']/table/tbody")
	@CacheLookup
	WebElement calDate2;
	
	@FindBy(xpath ="//*[@id='resultTable']/tbody/tr/td")
	@CacheLookup
	WebElement NoRecord;
	
	@FindBy(xpath ="//*[@id='divFormContainer']/div[2]")
	@CacheLookup
	WebElement sccessfultext;
	
	
	
	public void enterUserName() {
		emailId.sendKeys("Admin");
	}

	public void enterPassword() {
		password.sendKeys("admin123");
	}

	public void clickOnLogin() {
		LoginBtn.click();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void NevigateToManagerReview() {
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		Actions actions = new Actions(driver);
		actions.moveToElement(menuOption).perform();
		actions.moveToElement(subMenuOption).perform();
		selectMenuOption.click();
	}


	public void Searchfor() throws InterruptedException {  
		EmpName.sendKeys("Rebecca Harmony");  
		EmpName.sendKeys(Keys.ENTER);
		resuable.selectdropvalue(selectJobtitle, "QA Engineer");
		resuable.selectdropvalue(selectJobstatus, "All");
		cal1.click();
		resuable.selectdropvalue(calmonth, "Jun");
		resuable.selectdropvalue(calyear, "2019");
		resuable.selectDate(calDate,"4");
		resuable.WaitforElement(cal2, 20);
		cal2.click();
		resuable.selectdropvalue(calmonth1, "Jun");
		resuable.selectdropvalue(calyear1, "2021");
		resuable.selectDate(calDate1,"9");
		Searchbtn.click();
	}

	public void clickOnEvaluate() {
		
		Evaluate.click();
	}
	
	public void rating() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", ScrollEle);
        rating1.clear();
        rating1.sendKeys("3");
        comment1.clear();
        comment1.sendKeys("Ok");
        rating2.clear();
        rating2.sendKeys("4");
        comment2.clear();
        comment2.sendKeys("Good");
        rating3.clear();
        rating3.sendKeys("5");
        comment3.clear();
        comment3.sendKeys("Very Good");
        rating4.clear();
        rating4.sendKeys("3");
        comment4.clear();
        comment4.sendKeys("Ok");
        rating5.clear();
        rating5.sendKeys("4");
        comment5.clear();
        comment5.sendKeys("Good");
        Generalrating.clear();
        Generalrating.sendKeys("Good");
        js.executeScript("arguments[0].scrollIntoView();", ScrollFinal);
        Finalrating.clear();
        Finalrating.sendKeys("4");
        FinalComment.clear();
        FinalComment.sendKeys("Good");
        cal.click();
		resuable.selectdropvalue(calmonth3, "Jun");
		resuable.selectdropvalue(calyear3, "2021");
		resuable.selectDate(calDate2,"8");
		Savebtn.click();
		String sccess = sccessfultext.getText();
		if(sccess.contains("Successfully Saved"))
		{
			System.out.println("Comment save Successfully");
		}else{
			System.out.println("Error");
		}
		
	}

}
