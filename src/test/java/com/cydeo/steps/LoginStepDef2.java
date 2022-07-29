package com.cydeo.steps;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef2 {
   @Given("I am on the login page")
    public void i_am_on_the_login_page() {
       Driver.getDriver().get("https://library2.cydeo.com/login.html\t\t\t");
    }
    @When("I enter username {string}")
    public void i_enter_username(String string) {

    }
    @When("I enter password {string}")
    public void i_enter_password(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("click the sign in button")
    public void click_the_sign_in_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
