Feature:InsurancePurchaseDeals
  Under this modules Clark provide different deals on wide variety of insurance product where customer can purchase one as per needs.

  Scenario: Verify whether customer is able to purchase deals for different insurance products as per his choice
    Given I am on the landing page
    When I click on Angebote tab
    And I click on Privathaftpflicht
    When I click on Weiter
    And  "Wen möchtest du versichern?" question is displayed
    Then I should select answer as "Mich alleine"
    When "Trifft einer der aufgeführten Fälle auf dich zu?" question is displayed
    Then I should select answer as "Ich bin im öffentlichen Dienst beschäftigt"
    When "Möchtest du bei einem Schadensfall einen Teil selbst bezahlen?" question is displayed
    Then I should select answer as "Im Falle eines Schadens soll meine Geldbörse nicht belastet werden"
    When "Hast du noch weitere Informationen oder Anmerkungen für uns?" question is displayed
    Then I should be able to comment as "Car Bonet Damaged"
    And  I click on Angebot anfordern button
    Then "Dein Angebot ist da!" message should be displayed
    When I click on Zum Angebot button
    Then I should be navigate to Verträge screen where I verify the message on the screen
    And I click on Jetzt abschließen button of Empfehlung
    Then Deinen Fortschritt sichern screen is loaded
    When I enter random email
    And I enter password
    And I click on Jetzt registrieren
    Then Persönliche Angaben screen should be displayed
    When I select Anrede as "Herr"
    And I enter Vorname as "Testfname"
    And I enter Nachname as "Testlname"
    And I enter Geburtsdatum as "24.09.1992"
    And I enter Straße as "Savignyplatz"
    And I enter Haus as "101"
    And I enter PLZ as "60306"
    And I enter Ort as "Berlin"
    And I enter Telefonnummer as "015229320777"
    And I click on Weiter button
    Then I should be navigated to Zahlungsdaten screen
    When I enter valid IBAN number as "DE55500105174529223988"
    And I select check box for Lastschriftmandat
    And I click on Tarif bestellen
    Then I should be navigate to Angaben-Übersicht to verify my details
    When I click on Jetzt verbindlinch kaufen button
    Then I should be take to Bestellung abgeschlossen screen
    And  I click on Zurück zur Übersicht button
    And I close popup
    Then I should be landed to Verträge page with name present as "Testfname"



