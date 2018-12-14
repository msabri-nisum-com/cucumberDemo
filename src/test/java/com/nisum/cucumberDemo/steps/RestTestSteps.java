package com.nisum.cucumberDemo.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class RestTestSteps {

    RestDefination service;

    @Given("^I have a REST Endpoint$")
    public void i_have_a_REST_Endpoint() throws Throwable {
        service = new RestDefination();
    }

    @When("^I call the rest endpoint$")
    public void i_call_the_rest_endpoint() throws Throwable {
        service.requestProducts();
    }

    @Then("^I should get the expected response$")
    public void i_should_get_the_expected_response() throws Throwable {
        service.validateProductsContents();
    }







}
