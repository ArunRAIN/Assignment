package com.demo.bdd.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


public class DictionaryPage extends PageObject 
{

    @FindBy(xpath="//li[@class='ng-scope desktop-only']//input[1]")
    private WebElementFacade searchTerms;

    
    public void type_in_searchbox(String data) throws AWTException
    {
    	
        searchTerms.type(data);
        waitABit(6000);
        searchTerms.sendKeys(Keys.DOWN);
        searchTerms.sendKeys(Keys.ENTER);
    	
    }
    
    public void home_page()
    {
    	   	getDriver().manage().window().maximize();
    	   	getDriver().get("https://www.healthdirect.gov.au/");
    }
    
    public void is_search_data_displayed(String expecteddata)
    {
    	List<WebElement> ele = getDriver().findElements(By.xpath("//div[@class='veyron-local-search-results-list']//h4"));
		int count=ele.size();  
    	for(int i=0;i<count;i++)
    	{
		   String text = ele.get(i).getText();
		   String actualtext = text.toLowerCase();
		   
		    if(actualtext.contains(expecteddata))
		   {
			   Assert.assertTrue(true);
		   }
		   else
		   {
			   Assert.assertTrue(false);
		   }
    	}	    	
    }
    
    
   
    
}