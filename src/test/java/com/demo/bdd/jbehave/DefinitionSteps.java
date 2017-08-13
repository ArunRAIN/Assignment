package com.demo.bdd.jbehave;

import net.thucydides.core.annotations.Steps;

import java.awt.AWTException;
import java.net.MalformedURLException;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.demo.bdd.steps.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("User on test page")
    public void thecalculatorappisopen() 
    {
    	endUser.home_page();
    }
    
    @When("User search for a keyword '$data'")
    public void Usersearchforakeyword(String data) throws AWTException
    {
    	endUser.type_in_search(data);
    }
    
    @Then("User verify if the search results displayed are for '$data'")
    public void Usercanabletotheresultsdisplayed(String data) throws AWTException
    {
    	endUser.is_search_data_displayed(data);
    }
    

    
}
