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
 * @author in-vinaykumar.gupta on 21/07/20
 * @project IntelliJ IDEA
 */
public class PersonalLiabilityPage {


    @FindBy(xpath = "//*[@id='ember4']/div/div/div/main/div[2]/p")
    private WebElement lblDealPrivateLiability;
    @FindBy(xpath = "//button/span[text()='Weiter']")
    private WebElement btnFurther;
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

    public PersonalLiabilityPage() {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    public PersonalLiabilityPage verifyTittle() {
        WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(lblDealPrivateLiability));
        Assert.assertEquals(lblDealPrivateLiability.getText().toString(), "Pri\u00ADvat\u00ADhaft\u00ADpflicht");
        return this;
    }

    public PersonalLiabilityPage clickOnFurther() {
        btnFurther.click();
        return this;
    }

    public PersonalLiabilityPage verifyQuestion(String question) {
        WebElement lblQuestion = WebDriverFactory.getDriver().findElement(By.xpath("//h1[@id='headline' and text()='" + question + "']"));
        Assert.assertEquals(lblQuestion.getText().toString(), question);
        return this;
    }

    public PersonalLiabilityPage selectAnswer(String answer) {
        WebElement optionAnswer = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id='radioButtonsSingleSelect']/li/h2[text()='" + answer + "']/../div"));
        optionAnswer.click();
        return this;
    }

    public PersonalLiabilityPage enterComments(String comments) {
        txtComment.sendKeys(comments);
        return this;
    }

    public PersonalLiabilityPage clickOnBack() {
        btnBack.click();
        return this;
    }

    public PersonalLiabilityPage clickOnRequestQuote() {
        btnRequestQuote.click();
        return this;
    }

    public PersonalLiabilityPage verifyOfferCreationMsg(String msg) {
        Assert.assertEquals(lblOfferCreationMsg.getText(),msg);
        return this;
    }

    public ContractsPage clickOnOfferbutton() {
         btnOffer.click();
        return new ContractsPage();
    }

}
