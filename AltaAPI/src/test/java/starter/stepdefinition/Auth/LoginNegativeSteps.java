package starter.stepdefinition.Auth;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Auth.LoginNegative;

public class LoginNegativeSteps {

    @Steps
    LoginNegative loginNegative;

    @Given("i set API endpoint for login with unregistered account")
    public void setApiEndpointLoginInvalidCredentials(){
        loginNegative.setApiEndpointLoginInvalidCredentials();
    }

    @When("i send request to login with invalid email {string} and invalid password{string}")
    public void SendRequestLoginInvalidCredentials(String email, String password){
        loginNegative.SendRequestLoginInvalidCredentials(email,password);
    }

    @Then("i receive status code 400")
    public void ReceiveStatusCode400(){
        loginNegative.ReceiveStatusCode400();
    }
}
