package starter.stepdefinition.Categories;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Categories.GetProductCategoryNegative;

public class GetProductCategoryNegativeSteps {

    @Steps
    GetProductCategoryNegative getProductCategoryNegative;

    @Given("i set API endpoint for get product category with non existent id")
    public void setApiEndpointGetProductCategoryNonExistentId(){
        getProductCategoryNegative.setApiEndpointGetProductCategoryNonExistentId();
    }

    @When("i send request to get product category with non existent id")
    public void SendRequestGetProductCategoryNonExistentId(){
        getProductCategoryNegative.SendRequestGetProductCategoryNonExistentId();
    }
}
