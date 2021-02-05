package com.org.ashish.stepDefinitions;

import com.org.ashish.pages.LoginPage;
import com.org.ashish.utils.Constants;
import com.org.ashish.utils.Generic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps extends Generic {


    @When("User enter correct {string} and {string}")
    public void user_enter_correct_and(String username, String password) throws InterruptedException {

     click(LoginPage.LOGIN_LINK);
     Thread.sleep(5000);
     enterValue(username, LoginPage.USERNAME_TEXT_BOX);
     enterValue(password, LoginPage.PASSWORD_TEXT_BOX);
     click(LoginPage.LOGIN_BUTTON);
    }

    @Then("User should be able to login successfully")
    public void user_should_be_able_to_login_successfully() {
        //System.out.println("Logged IN");
    }


    @Then("User should be not able to login successfully")
    public void user_should_be_not_able_to_login_successfully() {
        //System.out.println("Not Logged IN");
    }

    @When("User enter incorrect {string} and {string}")
    public void user_enter_incorrect_and(String username, String password) throws InterruptedException {

        click(LoginPage.LOGIN_LINK);
        Thread.sleep(5000);
        enterValue(username, LoginPage.USERNAME_TEXT_BOX);
        enterValue(password, LoginPage.PASSWORD_TEXT_BOX);
        click(LoginPage.LOGIN_BUTTON);
    }

    @Given("Rahul shetty Application is launched")
    public void rahul_shetty_application_is_launched() throws InterruptedException {
       driver.get(Constants.URL);
       Thread.sleep(5000);
    }
}
