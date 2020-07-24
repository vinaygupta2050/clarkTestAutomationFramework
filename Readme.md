# Clark Test Automation Framework

This framework can  help you speed up your framework setup process as it consist of most of the feature required to test Rest Api.

## Getting Started

To get started clone project from github. 

Below are the api used to write this framework which will help you drive your test.
* Junit
* Selenium
* Cucumber
* Cucumber-html-report

Prerequisites

* JDK 1.8 or hire version should be installed.
* Maven should be installed.

The library which plays a major role in building this framework is Rest Assured.  REST Assured is a Java library that provides a domain-specific language (DSL) for writing powerful, maintainable tests for RESTful APIs.

Folder Structure:
```
├── logs
├── screenshots
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── clark
│   │   │           ├── pages
│   │   │           ├── util
│   │   │           └── webdriverengine
│   │   └── resources
│   └── test
│       └── java
│           └── com
│               └── clark
│                   ├── features
│                   ├── runner
│                   └── steps
└── target
    ├── classes
    │   └── com
    │       └── clark
    │           ├── pages
    │           ├── util
    │           └── webdriverengine
    ├── cucumber-report-html
    │   └── cucumber-html-reports
    │       ├── css
    │       ├── embeddings
    │       ├── fonts
    │       ├── images
    │       └── js

```

## Configuration

* Environment config files (*.properties) to target your service.

These two files should be placed in below directories
* [Environment config](https://github.com/vinaygupta2050/iceyeApiTestFramework/tree/master/src/main/resources)
* [JSON Schemas](https://github.com/vinaygupta2050/iceyeApiTestFramework/tree/master/src/test/resources)

### Target Environments
The framework is designed so that multiple environments along with their required vairables can be supported and multiple services for each environment can be defined with in folder [Environment config](https://github.com/vinaygupta2050/ApiTestAutomationFramework/tree/master/src/main/resources) 
```
serverUrl=https://staging.clark.de/de/app/contracts?cv=2
userName=admin
password=password
```

## Writing Test

### Feature
As we have used cucumber we can write our test in Gherkin language which plain english language. Test can be written in feature file and it can be stored in [features](https://github.com/vinaygupta2050/iceyeApiTestFramework/tree/master/src/test/java/com/iceye/test/features) directory. Below is the sample api test written in gherkin language
```
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

```
### Step definition
We can write step definition with respect to the feature in [steps](https://github.com/vinaygupta2050/iceyeApiTestFramework/tree/master/src/test/java/com/iceye/test/steps) directory.

## Running your Test
When you are ready to run your tests from the command line, below are a few examples of run commands (standard maven command line syntax):

* Right now we kept test environment as fixed. But in case if you want to pass test environment in maven command  you need to uncomment line number 16 in class [PropertyFileReader](https://github.com/vinaygupta2050/iceyeApiTestFramework/blob/master/src/main/java/com/iceye/utils/PropertyFileReader.java) . User below command to run your test on local machine
```
mvn clean verify 
or
newSetupRunTest.sh 
```

## Test Results

Once all the test are executed results can be generated in [target](https://github.com/vinaygupta2050/iceyeApiTestFramework/tree/master/target/cucumber-report-html/cucumber-html-reports)

![Dashboard](https://github.com/vinaygupta2050/iceyeApiTestFramework/blob/master/Images/TestExecutionReport.gif)

## Author

* **Vinaykumar Gupta** - [LinkedIn](https://in.linkedin.com/in/vinaygupta2050)
