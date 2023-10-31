package starter.stepdefinition.Categories;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Categories.DeleteCategoryNegative;

public class DeleteCategoryNegativeSteps {

    @Steps
    DeleteCategoryNegative deleteCategoryNegative;

    @Given("i set API endpoint for delete category with alphabet id")
    public void SetApiEndpointDeleteCategoryWithAlphabetId(){
        deleteCategoryNegative.SetApiEndpointDeleteCategoryWithAlphabetId();
    }

    @When("i send request to delete category with alphabet id")
    public void SendRequestDeleteCategoryWithAlphabetId(){
        deleteCategoryNegative.SendRequestDeleteCategoryWithAlphabetId();
    }
}
