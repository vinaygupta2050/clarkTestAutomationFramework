package com.clark.pages;

import com.clark.webdriverengine.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

/**
 * @author in-vinaykumar.gupta on 22/07/20
 * @project IntelliJ IDEA
 */
public class ContractsPage {
    @FindBy(xpath = "//span[text()='Empfehlung']/../../../button")
    private WebElement btnLockOffer;
    @FindBy(xpath = "//section[1]/div/div/div[1]/h1")
    private WebElement lblOfferHeading;
    @FindBy(xpath = "//input")
    private WebElement txtComment;
    @FindBy(xpath = "//div/button[1]")
    private WebElement btnBack;
    @FindBy(xpath = "//div/button[2]")
    private WebElement btnRequestQuote;
    @FindBy(xpath = "//h1[text()='Dein Angebot ist da!']")
    private WebElement lblOfferCreationMsg;
    @FindBy(xpath = "//span[text()='Zum Angebot']")
    private WebElement btnOffer;

    public ContractsPage() {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    public ContractsPage verifyContractsOfferMsg()
    {
        WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(lblOfferHeading));
        Assert.assertEquals(lblOfferHeading.getText().toString().contains("Deine Angebote zur\n" +
                "Pri\u00ADvat\u00ADhaft\u00ADpflicht"), true);
        return this;
    }

    public ContractsPage verifyNameOnHomePage(String firstName)
    {
        WebElement lblGreetMsgName = WebDriverFactory.getDriver().findElement(By.xpath("//header/h1/span[text()='Hallo "+firstName+",']"));
        WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(lblGreetMsgName));
        Assert.assertEquals(lblGreetMsgName.getText().contains(firstName), true);
        return this;
    }
    public AccountCreationPage selectRecommandedOffer()
    {
        btnLockOffer.click();
        return new AccountCreationPage();
    }

}
