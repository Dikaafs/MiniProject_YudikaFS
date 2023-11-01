package starter.stepdefinition.Orders;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Orders.GetOrderByIdNegative;

public class GetOrderByIdNegativeSteps {

    @Steps
    GetOrderByIdNegative getOrderByIdNegative;

    @Given("i set API endpoint for get order by invalid id")
    public void SetApiEndpointGetOrderByInvalidId(){
        getOrderByIdNegative.SetApiEndpointGetOrderByInvalidId();
    }

    @When("i send request to get order by invalid id")
    public void SendRequestGetOrderByInvalidId(){
        getOrderByIdNegative.sendRequestGetOrderByInvalidId();
    }
}
