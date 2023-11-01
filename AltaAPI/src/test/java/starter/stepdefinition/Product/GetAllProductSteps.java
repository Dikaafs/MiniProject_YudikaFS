package starter.stepdefinition.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.GetAllProduct;

public class GetAllProductSteps {

    @Steps
    GetAllProduct getAllProduct;

    @Given("i set API endpoint for get all product")
    public void setApiGetAllProduct(){
        getAllProduct.setApiGetAllProduct();
    }

    @When("i send request to get all product")
    public void sendRequestGetAllProduct(){
        getAllProduct.sendRequestGetAllProduct();
    }

    @Then("i receive status code 200 OK")
    public void receiveStatusCode200ok(){
        getAllProduct.receiveStatusCode200ok();
    }

    @And("i receive valid data for get all product")
    public void ReceiveValidDataGetAllProduct(){
        getAllProduct.ReceiveValidDataGetAllProduct();
    }
}
