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
public class FeedBackPopup {

    @FindBy(xpath = "//div/div[1]/h4[text()='Gefällt dir Clark']")
    private WebElement title;

    @FindBy(xpath = "//div/div[1]/h4[text()='Gefällt dir Clark']/../../../button")
    private WebElement btnClosePopup;

    public FeedBackPopup() {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    public FeedBackPopup verifyTittle() {
        WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(title));
        Assert.assertEquals(title.getText().toString(), "Gefällt dir Clark");
        return this;
    }

    public ContractsPage closePopup() {
        btnClosePopup.click();
        return new ContractsPage();
    }
}
