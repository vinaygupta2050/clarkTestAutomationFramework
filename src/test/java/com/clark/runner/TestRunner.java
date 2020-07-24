package com.clark.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * @author in-vinaykumar.gupta on 23/07/20
 * @project IntelliJ IDEA
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"/Users/in-vinaykumar.gupta/Downloads/Projects/clarkTestAutomationFramework/src/test/java/com/clark/features/DealsPurchaseFlow.feature"} , plugin = {"json:target/cucumber.json"},
        glue = "com.clark.steps")
public class TestRunner {

}
