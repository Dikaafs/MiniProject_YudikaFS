package starter.stepdefinition.Orders;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Orders.GetAllOrdersNegative;

public class GetAllOrdersNegativeSteps {

    @Steps
    GetAllOrdersNegative getAllOrdersNegative;

    @Given("i set API endpoint for get all order without login token")
    public void setApiEndpointGetAllOrderWithoutLoginToken(){
        getAllOrdersNegative.setApiEndpointGetAllOrderWithoutLoginToken();
    }

    @When("i send request to get all order without login token")
    public void SendRequestGetAllOrderWithoutLoginToken(){
        getAllOrdersNegative.SendRequestGetAllOrderWithoutLoginToken();
    }

    @Then("i receive status code 401")
    public void ReceiveStatusCode401(){
        getAllOrdersNegative.ReceiveStatusCode401();
    }
}
