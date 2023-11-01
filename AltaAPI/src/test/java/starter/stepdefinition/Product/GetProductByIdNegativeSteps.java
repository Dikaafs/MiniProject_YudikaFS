package starter.stepdefinition.Product;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.GetProductByIdNegative;

public class GetProductByIdNegativeSteps {

    @Steps
    GetProductByIdNegative getProductByIdNegative;

    @Given("i set API endpoint for get product with invalid id")
    public void setApiEndpointInvalidId(){
        getProductByIdNegative.setApiEndpointInvalidId();
    }

    @When("i send request to get product with invalid id")
    public void sendRequestInvalidId(){
        getProductByIdNegative.sendRequestInvalidId();
    }
}
