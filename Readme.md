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
  Scenario: Get all close approach data for asteroid with valid query parameters
    Given I want to execute service "/cad.api"
    When I add query parameter key as "des" and value as "433"
    And I add query parameter key as "date-min" and value as "1900-01-01"
    And I add query parameter key as "date-max" and value as "2100-01-01"
    And I add query parameter key as "dist-max" and value as "0.2"
    And I submit the GET request
    Then I validate that response status code is 200
    And I validate response with json schema "cdaJsonSchema.json"
    And I validate that response contains total 5 records
    And I validate that response contains data with timestamp "1931-Jan-30 04:07"
    And I validate that response data with timestamp "1931-Jan-30 04:07" is present at position 0

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
