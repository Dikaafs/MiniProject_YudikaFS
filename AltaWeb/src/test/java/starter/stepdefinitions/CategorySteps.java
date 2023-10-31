package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;
import starter.Pages.CategoryPage;
import starter.Pages.ProductPage;

public class CategorySteps extends PageObject {

    @Steps
    CategoryPage categoryPage;

    @Steps
    ProductPage productPage;

    @When("i click category feature")
    public void ClickCategoryFeature(){
        productPage.CategoryBtn();
    }

    @And("i select the category")
    public void SelectCategory(){
        categoryPage.ClickTheCategory();
    }

    @Then("i receive message {string}")
    public void ReceiveInformationMessage(String message){
      categoryPage.validateInformationMessage();
      categoryPage.validateEqualInformationMessage(message);
    }

}
