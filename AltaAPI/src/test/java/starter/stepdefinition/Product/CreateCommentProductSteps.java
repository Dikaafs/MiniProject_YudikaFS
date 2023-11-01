package starter.stepdefinition.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.CreateCommentProduct;

public class CreateCommentProductSteps {

    @Steps
    CreateCommentProduct createCommentProduct;

    @Given("i set API endpoint for add comment")
    public void setApiEndpointAddComment(){
        createCommentProduct.setApiEndpointAddComment();
    }

    @When("i send request to add comment")
    public void sendRequestAddComment(){
        createCommentProduct.sendRequestAddComment();
    }

    @And("i receive data product with the added comment")
    public void receiveDataProductWithAddedComment(){
        createCommentProduct.receiveDataProductWithAddedComment();
    }
}
