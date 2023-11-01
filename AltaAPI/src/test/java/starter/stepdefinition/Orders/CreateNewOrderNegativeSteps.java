package starter.stepdefinition.Orders;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Orders.CreateNewOrderNegative;

public class CreateNewOrderNegativeSteps {

    @Steps
    CreateNewOrderNegative createNewOrderNegative;

    @Given("i set API endpoint for create new product without login token")
    public void setApiEndpointCreateNewProductWithoutLoginToken(){
        createNewOrderNegative.setApiEndpointCreateNewProductWithoutLoginToken();
    }

    @When("i send request to create new product without login token")
    public void SendRequestCreateNewProductWithoutLoginToken(){
        createNewOrderNegative.SendRequestCreateNewProductWithoutLoginToken();
    }
}
