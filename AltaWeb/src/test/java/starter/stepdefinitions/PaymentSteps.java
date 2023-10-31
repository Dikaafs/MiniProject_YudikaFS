package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import starter.Pages.CartPage;
import starter.Pages.ProductPage;
import starter.Pages.TransactionPage;

public class PaymentSteps extends PageObject {

    @Steps
    CartPage cartPage;

    @Steps
    ProductPage productPage;

    @Steps
    TransactionPage transactionPage;

    @And("i click Buy button on another product to add to cart")
    public void ClickBuyButtonOnProductRazer(){
        productPage.ClickBuyRazer();
    }

    @And("i click Pay button")
    public void clickPayButton(){
        cartPage.ClickPayButton();
    }
    @Then("i directed to transaction page")
    public void DirectedToTransactionPage(){
        transactionPage.validateOnTheTransactionPage();
    }
}
