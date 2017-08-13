package com.demo.bdd.steps;

import com.demo.bdd.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import static ch.lambdaj.Lambda.join;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import java.awt.AWTException;
import java.net.MalformedURLException;

public class EndUserSteps extends ScenarioSteps {

    DictionaryPage dictionaryPage;

    @Step
    public void type_in_search(String data) throws AWTException 
    {
      dictionaryPage.type_in_searchbox(data);
    }

    @Step
    public void home_page() 
    {
      dictionaryPage.home_page();
    }
    
    @Step
    public void is_search_data_displayed(String expecteddata) 
    {
      dictionaryPage.is_search_data_displayed(expecteddata);
    }
  
}