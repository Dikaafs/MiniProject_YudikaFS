package starter.stepdefinition.Orders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Orders.GetOrderById;

public class GetOrderByIdSteps {

    @Steps
    GetOrderById getOrderById;

    @Given("i set API endpoint for get order by id")
    public void setApiEndpointGetOrderByID(){
        getOrderById.setApiEndpointGetOrderByID();
    }

    @When("i send request to get order by id")
    public void sendRequestGetOrderByID(){
        getOrderById.sendRequestGetOrderByID();
    }

    @And("i receive valid data for get order by id")
    public void receiveValidDataGetOrderByID(){
        getOrderById.receiveValidDataGetOrderByID();
    }
}
