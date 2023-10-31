package starter.stepdefinition.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.GetProductById;

public class GetProductByIdSteps {

    @Steps
    GetProductById getProductById;

    @Given("i set API endpoint for get product with valid id")
    public void SetApiEndpointGetProductValidId(){
        getProductById.SetApiEndpointGetProductValidId();
    }

    @When("i send request to get product with valid id")
    public void SendRequestGetProductValidId(){
        getProductById.SendRequestGetProductValidId();
    }

    @And("i receive valid data product by id")
    public void ReceiveValidDataProductById(){
        getProductById.ReceiveValidDataProductById();
    }
}
