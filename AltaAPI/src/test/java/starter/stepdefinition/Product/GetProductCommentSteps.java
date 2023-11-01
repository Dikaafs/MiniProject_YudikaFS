package starter.stepdefinition.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.GetProductComment;

public class GetProductCommentSteps {

    @Steps
    GetProductComment getProductComment;

    @Given("i set API endpoint for get product comment")
    public void setApiEndpointGetProductComment(){
        getProductComment.setApiEndpointGetProductComment();
    }

    @When("i send request to get product comment with valid id")
    public void SendRequestGetProductComment(){
        getProductComment.SendRequestGetProductComment();
    }

    @And("i receive valid product comment")
    public void ReceiveValidProductComment(){
        getProductComment.ReceiveValidProductComment();
    }
}
