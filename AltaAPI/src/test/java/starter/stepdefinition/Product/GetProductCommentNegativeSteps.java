package starter.stepdefinition.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.GetProductCommentNegative;

public class GetProductCommentNegativeSteps {

    @Steps
    GetProductCommentNegative getProductCommentNegative;

    @Given("i set API endpoint for get product comment with invalid id")
    public void SetApiEndpointProductCommentInvalidId(){
        getProductCommentNegative.SetApiEndpointProductCommentInvalidId();
    }

    @When("i send request to get product comment with invalid id")
    public void SendRequestProductCommentInvalidId(){
        getProductCommentNegative.SendRequestProductCommentInvalidId();
    }

    @And("i receive empty data")
    public void ReceiveEmptyData(){
        getProductCommentNegative.ReceiveEmptyData();
    }
}
