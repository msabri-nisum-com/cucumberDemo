package com.nisum.cucumberDemo.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^there is a precondition$")
    public void there_is_a_precondition() {
        System.out.println("In Given");
    }

    @When("^action is performed$")
    public void action_is_performed() {
        System.out.println("In When");
    }

    @Then("^there is result$")
    public void there_is_result() {
        System.out.println("In Then");
    }
}
