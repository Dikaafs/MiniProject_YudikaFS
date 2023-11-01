package starter.stepdefinition.Auth;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Auth.GetUserInformationNegative;

public class GetUserInformationNegativeSteps {

    @Steps
    GetUserInformationNegative getUserInformationNegative;

    @Given("i set API endpoint for get user information without token")
    public void SetApiEndpointGetUserInformationWithoutToken(){
        getUserInformationNegative.SetApiEndpointGetUserInformationWithoutToken();
    }

    @When("i send request to get user information without token")
    public void SendRequestGetUserInformationWithoutToken(){
        getUserInformationNegative.SendRequestGetUserInformationWithoutToken();
    }
}
