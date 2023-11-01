package starter.stepdefinition.index;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.index.IndexNegative;

public class IndexNegativeSteps {

    @Steps
    IndexNegative indexNegative;

    @Given("i set invalid API endpoint for index")
    public void SetInvalidApiEndpointForIndex(){
        indexNegative.SetInvalidApiEndpointForIndex();
    }

    @When("i send request to get index with invalid API")
    public void SendRequestGetIndexWithInvalidAPI(){
        indexNegative.SendRequestGetIndexWithInvalidAPI();
    }

}
