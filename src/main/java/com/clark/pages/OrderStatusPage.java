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
public class OrderStatusPage {
    @FindBy(xpath = "//section/div/header/h1[text()='Bestellung abgeschlossen']")
    private WebElement successMsg;

    @FindBy(xpath = "//button[text()='Zurück zur Übersicht']")
    private WebElement btnBackToOverview;

    public OrderStatusPage() {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    public OrderStatusPage verifyTittle() {
        WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(successMsg));
        Assert.assertEquals(successMsg.getText().toString(), "Bestellung abgeschlossen");
        return this;
    }

    public FeedBackPopup clickOnBackToOverview() {
        btnBackToOverview.click();
        return new FeedBackPopup();
    }

}
