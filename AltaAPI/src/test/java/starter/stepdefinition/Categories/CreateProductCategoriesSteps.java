package starter.stepdefinition.Categories;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Categories.CreateProductCategories;

public class CreateProductCategoriesSteps {

    @Steps
    CreateProductCategories createProductCategories;

    @Given("i set API endpoint for create new product category")
    public void SetApiEndpointCreateProductCategory(){
        createProductCategories.SetApiEndpointCreateProductCategory();
    }

    @When("i send request to create new product category")
    public void SendRequestCreateProductCategory(){
        createProductCategories.SendRequestCreateProductCategory();
    }

    @Then("i receive valid data for new product category")
    public void ReceiveValidDataNewProductCategory(){
        createProductCategories.ReceiveValidDataNewProductCategory();
    }
}
