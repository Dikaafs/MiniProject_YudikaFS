package starter.stepdefinition.index;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.index.index;

public class indexSteps {

    @Steps
    index index;

    @Given("i set API endpoint for get index")
    public void SetApiEndpointForGetIndex(){
        index.SetApiEndpointForGetIndex();
    }

    @When("i send request to get index")
    public void SendRequestGetIndex(){
        index.SendRequestGetIndex();
    }

    @And("i receive valid data index")
    public void ReceiveValidIndex(){
        index.ReceiveValidIndex();
    }
}
