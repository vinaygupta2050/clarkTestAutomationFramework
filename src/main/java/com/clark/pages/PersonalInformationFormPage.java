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
public class PersonalInformationFormPage {


    @FindBy(xpath = "//div[1]/h2[text()='Persönliche Angaben']")
    private WebElement title;

    @FindBy(xpath = "//span/input[@type='radio']/../../../span[text()='Herr']")
    private WebElement radio;

    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement txtFirstName;

    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement txtlastName;

    @FindBy(xpath = "//input[@name='birthdate']")
    private WebElement txtBirthDate;

    @FindBy(xpath = "//input[@name='street']")
    private WebElement txtStreet;

    @FindBy(xpath = "//input[@name='houseNumber']")
    private WebElement txtHouseNumber;

    @FindBy(xpath = "//input[@name='zipcode']")
    private WebElement txtZipCode;

    @FindBy(xpath = "//input[@name='city']")
    private WebElement txtCity;

    @FindBy(xpath = "//input[@name='phoneNumber']")
    private WebElement txtPhoneNumber;

    @FindBy(xpath = "//button[@type='submit']/span[2]/span[2]")
    private WebElement btnFurther;


    public PersonalInformationFormPage() {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    public PersonalInformationFormPage verifyTittle() {
        WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(title));
        Assert.assertEquals(title.getText().toString(), "Persönliche Angaben");
        return this;
    }

    public PersonalInformationFormPage setGenderAs(String genderInfo) {
        WebElement genderRadioButton = WebDriverFactory.getDriver().findElement(By.xpath("//span/input[@type='radio']/../../../span[text()='"+genderInfo+"']"));
        genderRadioButton.click();
        return this;
    }

    public PersonalInformationFormPage enterFirstName(String fname) {
        txtFirstName.sendKeys(fname);
        return this;
    }

    public PersonalInformationFormPage enterLastName(String lname) {
        txtlastName.sendKeys(lname);
        return this;
    }

    public PersonalInformationFormPage enterBirthDate(String birthDate) {
        txtBirthDate.sendKeys(birthDate);

        return this;
    }

    public PersonalInformationFormPage enterStreet(String street) {
        txtStreet.sendKeys(street);
        return this;
    }

    public PersonalInformationFormPage enterHouseNumber(String hNumber) {
        txtHouseNumber.sendKeys(hNumber);
        return this;
    }

    public PersonalInformationFormPage enterZipCode(String zipcode) {
        txtZipCode.sendKeys(zipcode);
        return this;
    }

    public PersonalInformationFormPage enterCity(String city) {
        txtCity.sendKeys(city);
        return this;
    }

    public PersonalInformationFormPage enterPhoneNumber(String phoneNumber) {
        txtPhoneNumber.sendKeys(phoneNumber);
        return this;
    }

    public PaymentesDetailsPage clickOnFurther() {
        btnFurther.click();
        return new PaymentesDetailsPage();
    }


}
