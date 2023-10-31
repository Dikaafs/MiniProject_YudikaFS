package starter.stepdefinition.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.GetProductRating;

public class GetProductRatingStep {

    @Steps
    GetProductRating getProductRating;

    @Given("i set API endpoint for get product rating")
    public void setApiEnpointGetProductRating(){
        getProductRating.setApiEnpointGetProductRating();
    }

    @When("i send request to get product rating")
    public void sendRequestGetProductRating(){
        getProductRating.sendRequestGetProductRating();
    }

    @Then("i receive status code 200")
    public void ReceiveStatusCode200(){
        getProductRating.ReceiveStatusCode200();
    }

    @And("i receive valid product rating")
    public void ReceiveValidProductRating(){
        getProductRating.ReceiveValidProductRating();
    }
}
