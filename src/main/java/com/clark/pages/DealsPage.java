package com.clark.pages;

import com.clark.webdriverengine.WebDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author in-vinaykumar.gupta on 21/07/20
 * @project IntelliJ IDEA
 */
public class DealsPage {

    @FindBy(xpath = "//div/p[@title='Privathaftpflicht']")
    private WebElement lblDealPrivateLiability;

    public DealsPage() {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    public PersonalLiabilityPage clickOnPrivateLiability() {
        lblDealPrivateLiability.click();
        return new PersonalLiabilityPage();
    }
}
