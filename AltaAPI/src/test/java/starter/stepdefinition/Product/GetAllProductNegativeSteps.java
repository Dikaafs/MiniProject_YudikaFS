package starter.stepdefinition.Product;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.GetAllProductNegative;

public class GetAllProductNegativeSteps {

    @Steps
    GetAllProductNegative getAllProductNegative;


    @Given("i set invalid API  endpoint for get all product")
    public void setInvalidApiEnpoint(){
        getAllProductNegative.setInvalidApiEndpoint();
    }

    @When("i send request to get all product With invalid endpoint")
    public void sendRequestWithInvalidEndpoint(){
        getAllProductNegative.sendRequestWithInvalidEndpoint();
    }

    @Then("i receive status code 404 not found")
    public void receiveStatusCode404(){
        getAllProductNegative.receiveStatusCode404();
    }
}
