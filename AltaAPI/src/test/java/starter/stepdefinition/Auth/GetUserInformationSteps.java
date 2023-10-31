package starter.stepdefinition.Auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.zh_cn.假如;
import net.thucydides.core.annotations.Steps;
import starter.user.Auth.GetUserInformation;

public class GetUserInformationSteps {

    @Steps
    GetUserInformation getUserInformation;

    @Given("i set API endpoint for get user information")
    public void setApiEnpointGetUserInformation(){
        getUserInformation.setApiEnpointGetUserInformation();
    }

    @When("i send request to get user information")
    public void sendRequestGetUserInformation(){
        getUserInformation.sendRequestGetUserInformation();
    }

    @And("i receive valid data the user")
    public void receiveValidDataUser(){
        getUserInformation.receiveValidDataUser();
    }
}
