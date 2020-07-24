package com.clark.steps;

import com.clark.util.ConfigLoader;
import com.clark.webdriverengine.WebDriverFactory;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestNGMethod;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 * @author in-vinaykumar.gupta on 23/07/20
 * @project IntelliJ IDEA
 */
public class Hooks {
    public static final Logger logger = LogManager.getLogger(Hooks.class);

    @Before
    public void initializeTest() throws MalformedURLException {
        WebDriverFactory.setDriver();

    }

    @After
    public void endTest(Scenario scenario) {
        if (scenario.isFailed()) {

            try {
                logger.info(scenario.getName() + " is Failed");
                File screenSot = ((TakesScreenshot) WebDriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
                FileHandler.copy(screenSot, new File(System.getProperty("user.dir") + "/screenshots/" + scenario.getName() + ".png"));
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();

            }
        }

        WebDriverFactory.getDriver().quit();
    }
}
