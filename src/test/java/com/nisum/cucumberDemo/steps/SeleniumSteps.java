package com.nisum.cucumberDemo.steps;

import cucumber.api.java.After;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumSteps {

    private WebDriver driver;


    @Given("^products get API is called via (.*)$")
    public void products_get_API_is_called_via_browser(String browser) throws Throwable {
        System.out.println("**************" + browser);
        if ("chrome".equals(browser)){
            System.setProperty("webdriver.chrome.driver", "/Users/svishwanath/Downloads/chromedriver");
            driver = new ChromeDriver();
        }
        else {
            driver = new SafariDriver();
        }

    }

    @When("^the API is invoked from browser$")
    public void the_API_is_invoked_from_browser() throws Throwable {
        driver.get("http://localhost:8282/products");
        Thread.sleep(1000);
    }

    @Then("^there should be valid response$")
    public void i_should_see_valid_response() throws Throwable {
        String pageContent = driver.getPageSource();
        pageContent.contains("T-shirt");
        pageContent.contains("Pants");
        closeBrowser();
    }

    public void closeBrowser() {
        driver.quit();
    }

}

