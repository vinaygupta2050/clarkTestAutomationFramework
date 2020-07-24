package com.clark.pages;

import com.clark.util.ConfigLoader;
import com.clark.webdriverengine.WebDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author in-vinaykumar.gupta on 21/07/20
 * @project IntelliJ IDEA
 */
public class ClarkLandingPage {

    @FindBy(xpath="//*[@id='ember4']/div/div/div/main/header/nav/ul[1]/li[4]/a[text()='Angebote']")
    private WebElement tabDeal;

    //input[@name='btnK']
    @FindBy(xpath="//input[@value='Google Search']")
    private WebElement btnSearch;

    public ClarkLandingPage()
    {
        PageFactory.initElements(WebDriverFactory.getDriver(),this);
    }

    public ClarkLandingPage launchApp()
    {
        WebDriverFactory.getDriver().get(ConfigLoader.getAllProperties().get("serverUrl"));
        return this;
    }
    public DealsPage clickOnDealsTab()
    {
        tabDeal.click();
        return new DealsPage();
    }
}
