package com.nisum.cucumberDemo.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SampleStepdefs {
    private int sum, opt1, opt2 = 0;

    @Given("^two numbers (.*) and (.*) are provided$")
    public void two_numbers_and_are_provided(int num1, int num2) throws Throwable {
        opt1 = num1;
        opt2 = num2;

    }

    @When("^the operand (.*) is passed$")
    public void the_is_the_operation(String arg1) {
        switch (arg1){
            case "add" : sum = (opt1+opt2);
                break;
            case "multiply" : sum = (opt1*opt2);
                break;
            case "subract" : sum = opt1-opt2;
                break;
        }
    }


    @Then("^expected result of (.*) is obtained$")
    public void expected_result_of_is_obtained(int result)  {
        Assert.assertEquals(result,sum);
    }

}
