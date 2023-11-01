package starter.stepdefinition.Categories;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Categories.CreateProductCategoriesNegative;

public class CreateProductCategoriesNegativeSteps {

    @Steps
    CreateProductCategoriesNegative createProductCategoriesNegative;

    @Given("i set invalid API endpoint for create new product")
    public void SetInvalidApiEndpointCreateNewProduct(){
        createProductCategoriesNegative.SetInvalidApiEndpointCreateNewProduct();
    }

    @When("i send request to create new product with invalid endpoint")
    public void SendRequestCreateNewProductWithInvalidEndpoint(){
        createProductCategoriesNegative.SendRequestCreateNewProductWithInvalidEndpoint();
    }
}
