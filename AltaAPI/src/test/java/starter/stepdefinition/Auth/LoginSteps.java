package starter.stepdefinition.Auth;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Auth.Login;

public class LoginSteps {

    @Steps
    Login login;

    @Given("i set API endpoint for login")
    public void SetApiEndpointLogin(){
        login.SetApiEndpointLogin();
    }

    @When("i send request to login with valid email {string} and valid password {string}")
    public void SendLoginRequest(String email, String password){
        login.SendLoginRequest(email,password);
    }

    @Then("i receive valid data for login")
    public void ReceiveValidDataLogin(){
        login.ReceiveValidDataLogin();
    }
}
