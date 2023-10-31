package starter.stepdefinition.Orders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Orders.CreateNewOrder;

public class CreateNewOrderSteps {

    @Steps
    CreateNewOrder createNewOrder;

    @Given("i set API endpoint to create new order")
    public void setApiEndpointCreateNewOrder(){
        createNewOrder.setApiEndpointCreateNewOrder();
    }

    @When("i send request to create new order")
    public void SendRequestCreateNewOrder(){
        createNewOrder.SendRequestCreateNewOrder();
    }

    @And("i receive new order data")
    public void ReceiveNewOrderData(){
        createNewOrder.ReceiveNewOrderData();
    }
}
