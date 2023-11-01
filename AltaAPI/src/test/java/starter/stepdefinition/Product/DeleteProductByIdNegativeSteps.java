package starter.stepdefinition.Product;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.DeleteProductByIdNegative;

public class DeleteProductByIdNegativeSteps {

    @Steps
    DeleteProductByIdNegative deleteProductByIdNegative;

    @Given("i set API endpoint for delete product with invalid id")
    public void setApiEndpointDeleteProductInvalidId(){
        deleteProductByIdNegative.setApiEndpointDeleteProductInvalidId();
    }

    @When("i send request to delete product data  with invalid id")
    public void SendRequestDeleteProductInvalidId(){
        deleteProductByIdNegative.SendRequestDeleteProductInvalidId();
    }
}
