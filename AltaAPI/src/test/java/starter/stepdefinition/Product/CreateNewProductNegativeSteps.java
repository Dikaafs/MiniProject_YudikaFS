package starter.stepdefinition.Product;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.CreateNewProductNegative;

public class CreateNewProductNegativeSteps {

    @Steps
    CreateNewProductNegative createNewProductNegative;

    @When("i send request to create new product with string input")
    public void SendRequestCreateProductWithStringInput(){
        createNewProductNegative.SendRequestCreateProductWithStringInput();
    }

    @Then("i receive status code 400 bad request")
    public void ReceiveStatusCode400(){
        createNewProductNegative.ReceiveStatusCode400();
    }
}
