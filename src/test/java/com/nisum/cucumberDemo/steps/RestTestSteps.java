package com.nisum.cucumberDemo.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class RestTestSteps {

    RestDefination service;

    @Given("^a REST Endpoint is available$")
    public void i_have_a_REST_Endpoint() throws Throwable {
        service = new RestDefination();
    }

    @When("^the rest endpoint is called$")
    public void i_call_the_rest_endpoint() throws Throwable {
        service.requestProducts();
    }

    @Then("^expected response is obtained$")
    public void i_should_get_the_expected_response() throws Throwable {
        service.validateProductsContents();
    }







}
