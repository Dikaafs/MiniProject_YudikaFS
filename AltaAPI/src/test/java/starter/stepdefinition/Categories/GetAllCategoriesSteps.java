package starter.stepdefinition.Categories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Categories.GetAllCategory;

public class GetAllCategoriesSteps {

    @Steps
    GetAllCategory getAllCategory;

    @Given("i set API endpoint for get all category")
    public void SetApiEndpointGetAllCategory(){
        getAllCategory.SetApiEndpointGetAllCategory();
    }

    @When("i send request to get all category with valid endpoint")
    public void SendRequestGetAllCategoryValidEndpoint(){
        getAllCategory.SendRequestGetAllCategoryValidEndpoint();
    }

    @And("i receive valid list the category")
    public void ReceiveValidListTheCategory(){
        getAllCategory.ReceiveValidListTheCategory();
    }
}
