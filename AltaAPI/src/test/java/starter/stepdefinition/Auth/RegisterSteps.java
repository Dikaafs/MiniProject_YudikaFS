package starter.stepdefinition.Auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Auth.Register;

public class RegisterSteps {

    @Steps
    Register register;

    @Given("i set API endpoint for register")
    public void SetApiRegister(){
        register.SetApiRegister();
    }

    @When("i send request for register")
    public void SendRequestRegister(){
        register.SendRequestRegister();
    }

    @And("i receive valid data for new user")
    public void ReceiveValidDataNewUser(){
        register.ReceiveValidDataNewUser();
    }
}
