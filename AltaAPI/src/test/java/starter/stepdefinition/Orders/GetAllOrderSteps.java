package starter.stepdefinition.Orders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Orders.GetAllOrder;

public class GetAllOrderSteps {

    @Steps
    GetAllOrder getAllOrder;

    @Given("i set API endpoint for get all order")
    public void setApiEndpointGetAllOrder(){
        getAllOrder.setApiEndpointGetAllOrder();
    }

    @When("i send request to get all order")
    public void sendRequestGetAllOrder(){
        getAllOrder.sendRequestGetAllOrder();
    }

    @And("i receive valid data get all oder")
    public void ReceiveValidDataGetAllOrder(){
        getAllOrder.ReceiveValidDataGetAllOrder();
    }
}
