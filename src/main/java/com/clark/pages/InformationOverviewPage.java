package com.clark.pages;

import com.clark.webdriverengine.WebDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

/**
 * @author in-vinaykumar.gupta on 23/07/20
 * @project IntelliJ IDEA
 */
public class InformationOverviewPage {

    @FindBy(xpath = "//section/header/h1[text()='Angaben-Übersicht']")
    private WebElement title;

    @FindBy(xpath = "//button[text()='Jetzt verbindlich kaufen']")
    private WebElement btnBuyNow;

    public InformationOverviewPage() {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    public InformationOverviewPage verifyTittle() {
        WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(title));
        Assert.assertEquals(title.getText().toString(), "Angaben-Übersicht");
        return this;
    }

    public OrderStatusPage clickOnBuyNow() {
        btnBuyNow.click();
        return new OrderStatusPage();
    }
}
