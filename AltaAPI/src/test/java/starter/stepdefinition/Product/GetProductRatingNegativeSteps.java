package starter.stepdefinition.Product;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.GetProductRatingNegative;

public class GetProductRatingNegativeSteps {

    @Steps
    GetProductRatingNegative getProductRatingNegative;

    @Given("i set API endpoint for get product rating deleted id")
    public void SetApiEndpointGetProductRatingDeletedId(){
        getProductRatingNegative.SetApiEndpointGetProductRatingDeletedId();
    }

    @When("i send request to get product rating deleted id")
    public void SendRequestGetProductRatingDeletedId(){
        getProductRatingNegative.SendRequestGetProductRatingDeletedId();
    }
}
