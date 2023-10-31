package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import starter.Pages.CartPage;
import starter.Pages.ProductPage;

public class CartSteps extends PageObject {

    @Steps
    CartPage cartPage;

    @Steps
    ProductPage productPage;


    @And("i click Buy button to add product to cart")
    public void ClickBuyButtonToAddProductToCart(){
        productPage.ClickBuyButton();
    }

    @And("i click cart logo")
    public void ClickCartLogo(){
        productPage.ClickCartButton();
    }

    @Then("i directed to cart page")
    public void DirectedToCartPage(){
        cartPage.ValidateOnTheCartPage();
    }
}
