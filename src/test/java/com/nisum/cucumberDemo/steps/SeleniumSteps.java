package com.nisum.cucumberDemo.steps;

import cucumber.api.java.After;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumSteps {

    private final WebDriver driver = new ChromeDriver();


    @Given("^products GET API is available$")
    public void products_GET_API_is_available() throws Throwable {
        System.out.println("PRODUCT API is available");

    }

    @When("^the API is invoked from browser$")
    public void the_API_is_invoked_from_browser() throws Throwable {
        driver.get("http://localhost:8282/products");
        Thread.sleep(1000);
    }

    @Then("^I should see valid response$")
    public void i_should_see_valid_response() throws Throwable {
        String pageContent = driver.getPageSource();
        pageContent.contains("T-shirt");
        pageContent.contains("Pants");

    }


    @After()
    public void closeBrowser() {
        driver.quit();
    }




}

