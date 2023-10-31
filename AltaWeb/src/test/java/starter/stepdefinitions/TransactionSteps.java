package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;
import starter.Pages.ProductPage;
import starter.Pages.TransactionPage;

public class TransactionSteps extends PageObject {

    @Steps
    ProductPage productPage;

    @Steps
    TransactionPage transactionPage;


    @And("i click row button")
    public void ClickRowButton(){
        transactionPage.ClickRowButton();
    }

    @And("i set the rows per page")
    public void setRowPerPage(){
        transactionPage.ClickRowPerPage();
    }

    @Then("the rows per page have been changed to 15 items on one page")
    public void RowsPerPageAlreadyChangedTo15(){
       Assertions.assertTrue(transactionPage.validateRowPerPageIs15());
    }

    @When("i click next button")
    public void ClickNextButton(){
        transactionPage.clickNextButton();
    }

    @Then("i directed to next page")
    public void ontheOtherPage(){
        Assertions.assertTrue(transactionPage.validateOntheOtherPage());
    }
}
