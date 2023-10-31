package starter.stepdefinition.Categories;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Categories.CreateNewProductCategory;

public class CreateProductCategorySteps {

    @Steps
    CreateNewProductCategory createProductCategory;

    @Given("i set API endpoint for create new product category")
    public void SetApiEndpointCreateProductCategory(){
        createProductCategory.SetApiEndpointCreateProductCategory();
    }

    @When("i send request to create new product category")
    public void SendRequestCreateProductCategory(){
        createProductCategory.SendRequestCreateProductCategory();
    }

    @Then("i receive valid data for new product category")
    public void ReceiveValidDataNewProductCategory(){
        createProductCategory.ReceiveValidDataNewProductCategory();
    }
}
