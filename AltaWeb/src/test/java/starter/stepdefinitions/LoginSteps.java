package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;
import starter.Pages.LoginPage;
import starter.Pages.ProductPage;



public class LoginSteps extends PageObject{
    @Steps
    LoginPage loginPage;
    @Steps
    ProductPage productPage;


    @Given("i am on the product page")
    public void OnTheProductPage(){
        productPage.openUrl("https://alta-shop.vercel.app/");
       Assertions.assertTrue(productPage.validateOnTheProductPage());
    }

    @When("i click sign in button")
    public void ClickSignInButton(){
        productPage.ClickSignInButton();
    }

    @And("i input valid email")
    public void InputValidEmail(){
        loginPage.inputEmail("ashel@gmail.com");
    }

    @And("i input valid password")
    public void InputValidPassword(){
        loginPage.inputPassword("ashel14");
    }

    @And("i click login button")
    public void ClickLoginButton(){
        loginPage.ClickLoginButton();
    }

    @Then("i redirected to product page")
    public void directedToProductPage(){
        Assertions.assertTrue(productPage.validateOnTheProductPage());
    }

    // negative case unregistered email

    @And("i input unregistered email")
    public void InputUnregisteredEmail(){
        loginPage.inputEmail("gicheol@gmail.com");
    }

    @And("i input random password")
    public void InputRandomPassword(){
        loginPage.inputPassword("goodguy12");
    }

    @Then("error message is shown")
    public void ErrorMessage(){
        loginPage.ErrorMessageIsShown();
    }

    // negative case invalid password

    @And("i input invalid password")
    public void InvalidPassword(){
        loginPage.inputPassword("wrong14");
    }

}
