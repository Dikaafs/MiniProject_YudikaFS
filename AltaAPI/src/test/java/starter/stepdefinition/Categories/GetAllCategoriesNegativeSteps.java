package starter.stepdefinition.Categories;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Categories.GetAllCategoriesNegative;

public class GetAllCategoriesNegativeSteps {

    @Steps
    GetAllCategoriesNegative getAllCategoriesNegative;

    @Given("i set API endpoint for get all category with invalid endpoint")
    public void SetApiEndpointGetAllCategoryInvalidEndpoint(){
        getAllCategoriesNegative.SetApiEndpointGetAllCategoryInvalidEndpoint();
    }

    @When("i send request to get all category with invalid endpoint")
    public void SendRequestGetAllCategoryInvalidEndpoint(){
        getAllCategoriesNegative.SendRequestGetAllCategoryInvalidEndpoint();
    }

    @Then("i receive status code 404")
    public void ReceiveStatusCode404(){
        getAllCategoriesNegative.ReceiveStatusCode404();
    }
}
