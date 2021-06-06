package com.qa.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class reusable {
	
	public WebDriver driver;
	 
	 public void selectdropvalue(WebElement ele,String value) {
		  Select dropdown = new Select(ele);
		  
		  List<WebElement> alloption = dropdown.getOptions();
		  
		  for(WebElement option : alloption) {
			  if(option.getText().equals(value)) {
				  option.click();
				  break;
			  }
		  }
	  }
	 
	 public void selectDate(WebElement ele,String value) {
			List<WebElement> columns=ele.findElements(By.tagName("td"));

			for (WebElement cell: columns){
				if (cell.getText().equals(value)){
					cell.findElement(By.linkText(value)).click();
					break;
				}
			}
	  }
	 
	 public void WaitforElement(WebElement element,long timeOutInSeconds) {
			WebDriverWait wait=new WebDriverWait(driver,timeOutInSeconds);
			wait.until(ExpectedConditions.visibilityOf(element));
				
		}
}
