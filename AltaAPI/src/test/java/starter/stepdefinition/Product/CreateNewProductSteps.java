package starter.stepdefinition.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.CreateNewProduct;

public class CreateNewProductSteps {

    @Steps
    CreateNewProduct createNewProduct;

    @Given("i set API endpoint for create new product")
    public void SetApiEndpointCreateNewProduct(){
        createNewProduct.SetApiEndpointCreateNewProduct();
    }

    @When("i send request to create new product")
    public void SendRequestCreateNewProduct(){
        createNewProduct.SendRequestCreateNewProduct();
    }

    @And("i receive valid data for new product")
    public void ReceiveValidDataNewProduct(){
        createNewProduct.ReceiveValidDataNewProduct();
    }


}
