package com.clark.pages;

import com.clark.util.Helper;
import com.clark.webdriverengine.WebDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

/**
 * @author in-vinaykumar.gupta on 22/07/20
 * @project IntelliJ IDEA
 */
public class AccountCreationPage {

    @FindBy(xpath = "//form/div[1]/h1[text()='Deinen Fortschritt sichern']")
    private WebElement lblTittle;
    @FindBy(xpath = "//input[@type='email']")
    private WebElement txtInputEmail;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement txtPassword;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnJoinNow;

    //input[@name='btnK']
    @FindBy(xpath = "//input[@value='Google Search']")
    private WebElement btnSearch;
    Helper util = new Helper();

    public AccountCreationPage() {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    public AccountCreationPage verifyTitle() {
        Assert.assertEquals(lblTittle.isDisplayed(), true);
        return this;
    }

    public AccountCreationPage entetEmail() {
        String email = util.generateRandomEmail();
        txtInputEmail.sendKeys(email);
        return this;
    }

    public AccountCreationPage enterPassword() {
        txtPassword.sendKeys("Password@123");
        return this;
    }

    public PersonalInformationFormPage clickOnJoinNow() {
        btnJoinNow.click();
        return new PersonalInformationFormPage();
    }
}
