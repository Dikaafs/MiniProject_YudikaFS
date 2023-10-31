package starter.stepdefinition.Categories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Categories.GetCategoryByID;

public class GetCategoryByIDSteps {

    @Steps
    GetCategoryByID getProductCategoryByIdSteps;

    @Given("i set API endpoint for GET product category by ID")
    public void SetApiEndpointGetCategoryByID(){
        getProductCategoryByIdSteps.SetApiEndpointGetCategoryByID();
    }

    @When("i send request to GET product category by ID")
    public void SendRequestGetCategoryByID(){
        getProductCategoryByIdSteps.SendRequestGeCategoryByID();
    }

    @And("i receive valid data product by ID")
    public void ReceiveDataCategorytByID(){
        getProductCategoryByIdSteps.ReceiveDataCategoryByID();
    }
}
