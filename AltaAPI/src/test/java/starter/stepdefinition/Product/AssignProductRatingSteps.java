package starter.stepdefinition.Product;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.AssignProductRating;

public class AssignProductRatingSteps {

    @Steps
    AssignProductRating assignProductRating;

    @Given("i set API endpoint for assign product rating")
    public void SetApiEndpointAssignRating(){
        assignProductRating.SetApiEndpointAssignRating();
    }

    @When("i send request to assign product rating")
    public void SendRequestAssignRating(){
        assignProductRating.SendRequestAssignRating();
    }
}
