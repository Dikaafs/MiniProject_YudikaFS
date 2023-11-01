package starter.stepdefinition.Product;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.CreateCommentProductNegative;

public class CreateCommentProductNegativeSteps {

    @Steps
    CreateCommentProductNegative createCommentProductNegative;

    @Given("i set API endpoint for add comment without id")
    public void setApiEndpointAddCommentWithoutId(){
        createCommentProductNegative.setApiEndpointAddCommentWithoutId();
    }

    @When("i send request to add comment without id")
    public void SendRequestAddCommentWithoutId(){
        createCommentProductNegative.SendRequestAddCommentWithoutId();
    }

    @Then("i receive status code 405")
    public void ReceiveStatusCode405(){
        createCommentProductNegative.ReceiveStatusCode405();
    }
}
