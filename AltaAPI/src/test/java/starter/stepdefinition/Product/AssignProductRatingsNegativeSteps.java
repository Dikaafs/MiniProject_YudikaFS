package starter.stepdefinition.Product;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.AssignProductRatingsNegative;

public class AssignProductRatingsNegativeSteps {

    @Steps
    AssignProductRatingsNegative assignProductRatingsNegative;

    @Given("i set API endpoint for assign product rating without token")
    public void setApiEndPointAssignProductRatingWithoutToken(){
        assignProductRatingsNegative.setApiEndPointAssignProductRatingWithoutToken();
    }

    @When("i send request to assign product rating without token")
    public void SendRequestAssignProductRatingWithoutToken(){
        assignProductRatingsNegative.SendRequestAssignProductRatingWithoutToken();
    }
}
