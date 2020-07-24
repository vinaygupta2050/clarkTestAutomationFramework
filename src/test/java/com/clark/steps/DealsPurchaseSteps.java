package com.clark.steps;

import com.clark.pages.*;
import com.clark.webdriverengine.WebDriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hu.De;

/**
 * @author in-vinaykumar.gupta on 23/07/20
 * @project IntelliJ IDEA
 */
public class DealsPurchaseSteps {


    ClarkLandingPage clarkApp = new ClarkLandingPage();
    DealsPage dealsPage;
    PersonalLiabilityPage personalLiabilityPage;
    ContractsPage contractsPage;
    AccountCreationPage accountCreationPage;
    PersonalInformationFormPage personalInformationFormPage;
    PaymentesDetailsPage paymentesDetailsPage;
    InformationOverviewPage informationOverviewPage;
    OrderStatusPage orderStatusPage;
    FeedBackPopup feedBackPopup;


    @Given("I am on the landing page")
    public void i_am_on_the_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        clarkApp.launchApp();
    }

    @When("I click on Angebote tab")
    public void i_click_on_Angebote_tab() {
        // Write code here that turns the phrase above into concrete actions
       dealsPage = clarkApp.clickOnDealsTab();
    }


    @And("I click on Privathaftpflicht")
    public void i_click_on_Privathaftpflicht() {
        personalLiabilityPage = dealsPage.clickOnPrivateLiability();
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("Privathaftpflicht should be displayed")
    public void privathaftpflicht_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        personalLiabilityPage.verifyTittle();
    }

    @When("I click on Weiter")
    public void i_click_on_Weiter() {
        // Write code here that turns the phrase above into concrete actions
        personalLiabilityPage.clickOnFurther();
    }

    @When("{string} question is displayed")
    public void question_is_displayed(String question) {
        // Write code here that turns the phrase above into concrete actions
        personalLiabilityPage.verifyQuestion(question);
    }

    @Then("I should select answer as {string}")
    public void i_should_select_answer_as(String answer) {
        // Write code here that turns the phrase above into concrete actions
        personalLiabilityPage.selectAnswer(answer);
    }

    @Then("I should be able to comment as {string}")
    public void i_should_be_able_to_comment_as(String comment) {
        // Write code here that turns the phrase above into concrete actions
        personalLiabilityPage.enterComments(comment);
    }

    @Then("I click on Angebot anfordern button")
    public void i_click_on_Angebot_anfordern_button() {
        // Write code here that turns the phrase above into concrete actions
        personalLiabilityPage.clickOnRequestQuote();
    }

    @Then("{string} message should be displayed")
    public void message_should_be_displayed(String msg) {
        // Write code here that turns the phrase above into concrete actions
       personalLiabilityPage.verifyOfferCreationMsg(msg);
    }

    @When("I click on Zum Angebot button")
    public void i_click_on_Zum_Angebot_button() {
        // Write code here that turns the phrase above into concrete actions
       contractsPage =personalLiabilityPage.clickOnOfferbutton();
    }

    @Then("I should be navigate to Verträge screen where I verify the message on the screen")
    public void i_should_be_navigate_to_Verträge_screen_where_I_verify_the_message_on_the_screen() {
        // Write code here that turns the phrase above into concrete actions
        contractsPage.verifyContractsOfferMsg();
    }

    @Then("I click on Jetzt abschließen button of Empfehlung")
    public void i_click_on_Jetzt_abschließen_button_of_Empfehlung() {
        // Write code here that turns the phrase above into concrete actions
        accountCreationPage = contractsPage.selectRecommandedOffer();
    }

    @Then("Deinen Fortschritt sichern screen is loaded")
    public void Deinen_Fortschritt_sichern_screen_is_loaded() {
        // Write code here that turns the phrase above into concrete actions
        accountCreationPage.verifyTitle();
    }

    @When("I enter random email")
    public void i_enter_random_email() {
        // Write code here that turns the phrase above into concrete actions
        accountCreationPage.entetEmail();
    }

    @When("I enter password")
    public void i_enter_password() {
        // Write code here that turns the phrase above into concrete actions
        accountCreationPage.enterPassword();
    }

    @When("I click on Jetzt registrieren")
    public void i_click_on_Jetzt_registrieren() {
        // Write code here that turns the phrase above into concrete actions
        personalInformationFormPage = accountCreationPage.clickOnJoinNow();
    }

    @Then("Persönliche Angaben screen should be displayed")
    public void persönliche_Angaben_screen_should_be_displayed() {
        personalInformationFormPage.verifyTittle();
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I select Anrede as {string}")
    public void i_select_Anrede_as(String gender) {
        // Write code here that turns the phrase above into concrete actions
        personalInformationFormPage.setGenderAs(gender);
    }

    @When("I enter Vorname as {string}")
    public void i_enter_Vorname_as(String fname) {
        // Write code here that turns the phrase above into concrete actions
        personalInformationFormPage.enterFirstName(fname);
    }

    @When("I enter Geburtsdatum as {string}")
    public void i_enter_Geburtsdatum_as(String bdate) {
        // Write code here that turns the phrase above into concrete actions
        personalInformationFormPage.enterBirthDate(bdate);
    }

    @When("I enter Nachname as {string}")
    public void i_enter_Nachname_as(String lname) {
        // Write code here that turns the phrase above into concrete actions
        personalInformationFormPage.enterLastName(lname);
    }

    @When("I enter Straße as {string}")
    public void i_enter_Straße_as(String street) {
        // Write code here that turns the phrase above into concrete actions
        personalInformationFormPage.enterStreet(street);
    }

    @When("I enter PLZ as {string}")
    public void i_enter_PLZ_as(String pcode) {
        // Write code here that turns the phrase above into concrete actions
        personalInformationFormPage.enterZipCode(pcode);
    }

    @When("I enter Haus as {string}")
    public void i_enter_Haus_as(String hnumber) {
        // Write code here that turns the phrase above into concrete actions
        personalInformationFormPage.enterHouseNumber(hnumber);
    }

    @When("I enter Ort as {string}")
    public void i_enter_Ort_as(String place) {
        // Write code here that turns the phrase above into concrete actions
        personalInformationFormPage.enterCity(place);
    }

    @When("I enter Telefonnummer as {string}")
    public void i_enter_Telefonnummer_as_(String phoneNumber) {
        // Write code here that turns the phrase above into concrete actions
        personalInformationFormPage.enterPhoneNumber(phoneNumber);
    }

    @When("I click on Weiter button")
    public void i_click_on_Weiter_button() {
        // Write code here that turns the phrase above into concrete actions
        paymentesDetailsPage = personalInformationFormPage.clickOnFurther();
    }

    @Then("I should be navigated to Zahlungsdaten screen")
    public void i_should_be_navigated_to_Zahlungsdaten_screen() {
        paymentesDetailsPage.verifyTittle();
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I enter valid IBAN number as {string}")
    public void i_enter_valid_IBAN_number_as(String bankDetails) {
        // Write code here that turns the phrase above into concrete actions
        paymentesDetailsPage.entetBankDetials(bankDetails);
    }

    @When("I select check box for Lastschriftmandat")
    public void i_select_check_box_for_Lastschriftmandat() {
        // Write code here that turns the phrase above into concrete actions
        paymentesDetailsPage.selectCheckBoxAccountMandate();
    }

    @When("I click on Tarif bestellen")
    public void i_click_on_Tarif_bestellen() {
        // Write code here that turns the phrase above into concrete actions
       informationOverviewPage= paymentesDetailsPage.clickOnOrderTariff();
    }

    @Then("I should be navigate to Angaben-Übersicht to verify my details")
    public void i_should_be_navigate_to_Angaben_Übersicht_to_verify_my_details() {
        // Write code here that turns the phrase above into concrete actions
        informationOverviewPage.verifyTittle();
    }

    @When("I click on Jetzt verbindlinch kaufen button")
    public void i_click_on_Jetzt_verbindlinch_kaufen_button() {
        // Write code here that turns the phrase above into concrete actions
        orderStatusPage=informationOverviewPage.clickOnBuyNow();
    }

    @Then("I should be take to Bestellung abgeschlossen screen")
    public void i_should_be_take_to_Bestellung_abgeschlossen_screen() {
        // Write code here that turns the phrase above into concrete actions
        feedBackPopup = orderStatusPage.clickOnBackToOverview();
    }

    @Then("I click on Zurück zur Übersicht button")
    public void i_click_on_Zurück_zur_Übersicht_button() {
        // Write code here that turns the phrase above into concrete actions
        feedBackPopup.verifyTittle();
    }

    @Then("I close popup")
    public void i_close_popup() {
        // Write code here that turns the phrase above into concrete actions
        contractsPage =feedBackPopup.closePopup();
    }

    @Then("I should be landed to Verträge page with name present as {string}")
    public void i_should_be_landed_to_Verträge_page_with_name_present_as(String fname) {
        // Write code here that turns the phrase above into concrete actions
        contractsPage.verifyNameOnHomePage(fname);
    }



}
