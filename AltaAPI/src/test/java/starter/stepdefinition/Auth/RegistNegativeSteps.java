package starter.stepdefinition.Auth;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Auth.RegistNegative;

public class RegistNegativeSteps {

    @Steps
    RegistNegative registNegative;

    @Given("i set API endpoint for register without hook")
    public void SetApiEndpointRegistWithoutHook(){
        registNegative.SetApiEndpointRegistWithoutHook();
    }

    @When("i send request to register without hook")
    public void SendRequestRegisterWithoutHook(){
        registNegative.SendRequestRegisterWithoutHook();
    }
}
