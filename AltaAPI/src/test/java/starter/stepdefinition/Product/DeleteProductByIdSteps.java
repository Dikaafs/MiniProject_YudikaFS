package starter.stepdefinition.Product;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.DeleteProductById;

public class DeleteProductByIdSteps {

    @Steps
    DeleteProductById deleteProductById;

    @Given("i set API endpoint for delete product by id")
    public void SetApiEndpointDeleteProductById(){
        deleteProductById.SetApiEndpointDeleteProductById();
    }

    @When("i send request to delete product data  with valid id")
    public void sendRequestDeleteValidId(){
        deleteProductById.sendRequestDeleteValidId();
    }

    @Then("i receive status code 200 ok")
    public void ReceiveStatuscode200ok(){
        deleteProductById.ReceiveStatuscode200ok();
    }
}
