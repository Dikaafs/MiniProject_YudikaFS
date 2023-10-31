package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import starter.Pages.DetailProductPage;
import starter.Pages.ProductPage;

public class DetailProductSteps extends PageObject {

    @Steps
    DetailProductPage detailProductPage;
    @Steps
    ProductPage productPage;

    @When("i click detail button")
    public void ClickDetailButton(){
        productPage.ClickDetailButton();
    }

    @Then("i directed to detail product page")
    public void DirectedToDetailProductPage(){
        detailProductPage.RatingsProduct();
    }

    //Negative Case cannot add or remove the ratings

    @And("i click ratings")
    public void clickRatings(){
        detailProductPage.ClickRatings();
    }

    @And("the ratings cannot be clicked")
    public void CannotClicked(){
        detailProductPage.ClickRatings();
    }
}
