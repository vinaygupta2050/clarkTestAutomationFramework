package com.clark.pages;

import com.clark.webdriverengine.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
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
public class PaymentesDetailsPage {

    @FindBy(xpath = "//h1[text()='Zahlungsdaten']")
    private WebElement title;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement txtBankAccount;

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement checkBoxDebitMandate;

    @FindBy(xpath = "//button[text()='Tarif bestellen']")
    private WebElement btnOrderTariff;



    public PaymentesDetailsPage() {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    public PaymentesDetailsPage verifyTittle() {
        WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(title));
        Assert.assertEquals(title.getText().toString(), "Zahlungsdaten");
        return this;
    }

    public PaymentesDetailsPage entetBankDetials(String accouneNumber) {
        txtBankAccount.sendKeys(accouneNumber);
        return this;
    }

    public PaymentesDetailsPage selectCheckBoxAccountMandate() {
       //checkBoxDebitMandate.click();
        JavascriptExecutor executor = (JavascriptExecutor)WebDriverFactory.getDriver();
        executor.executeScript("arguments[0].click();", checkBoxDebitMandate);
        return this;
    }

    public InformationOverviewPage clickOnOrderTariff() {
        btnOrderTariff.click();
        return new InformationOverviewPage();
    }

}
