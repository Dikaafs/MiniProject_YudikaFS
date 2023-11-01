package starter.stepdefinition.Categories;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Categories.DeleteCategory;

public class DeleteCategorySteps {

    @Steps
    DeleteCategory deleteCategory;

    @Given("i set API endpoint for delete category by id")
    public void SetApiEndpointDeleteCategory(){
        deleteCategory.SetApiEndpointDeleteCategory();
    }

    @When("i send request to delete category data  with valid id")
    public void SendRequestDeleteCategory(){
        deleteCategory.SendRequestDeleteCategory();
    }
}
