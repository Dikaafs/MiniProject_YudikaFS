package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;
import starter.Pages.LoginPage;
import starter.Pages.RegisterPage;

public class RegisterSteps extends PageObject {

    @Steps
    RegisterPage registerPage;

    @Steps
    LoginPage loginPage;

    @Given("i am on the login page")
    public void OnTheLoginPage (){
        loginPage.openUrl("https://alta-shop.vercel.app/auth/login");
        Assertions.assertTrue(loginPage.validateOnTheLoginPage());
    }

    @When("i click register feature")
    public void ClickRegistFeature(){
        registerPage.clickRegistFeature();
    }

    @And("i directed to register page")
    public void directedToRegistPage(){
        registerPage.validateOnTheRegistPage();
    }

    @And("i input full name")
    public void InputFullName(){
        registerPage.inputFullName("marlo aja");
    }

    @And("i input email")
    public void InputEmail(){
        registerPage.inputEmail("marli44@gmail.com");
    }

    @And("i input password")
    public void InputPassword(){
        registerPage.inputPassword("marloi23");
    }

    @And("i click regist button")
    public void ClickregistButton(){
        registerPage.clickRegistButton();
    }

    @Then("i directed to login page")
    public void DirectedToLoginPage(){
        Assertions.assertTrue(loginPage.validateOnTheLoginPage());
    }

    //Negative case invalid email credentials
    @And("i input invalid email credentials")
    public void InvalidEmailCredentials(){
        registerPage.inputEmail("409");
    }

    //Negative case empty field
    @And("i am not input field full name")
    public void notInputFieldName(){
        registerPage.inputFullName("");
    }

    @And("i double click regist button")
    public void doubleclickregistbtn(){
        registerPage.doubleclickregistbtn();
    }
    @Then("error message {string} is displayed")
    public void ErrorMessageDisplayed(String message){
        Assertions.assertTrue(registerPage.validateErrorMessageDisplayed());
        Assertions.assertTrue(registerPage.validateEqualErrorMessage(message));
    }

    //Regist with registered accounts
    @And("i input registered full name")
    public void registeredfullname(){
        registerPage.inputregisteredName("John wik wik");
    }
    @And("i input registered email")
    public void registeredEmail(){
        registerPage.inputregisteredemail("ashel@gmail.com");
    }

    @And("i input registered password")
    public void registeredPassword(){
        registerPage.inputregisteredpassword("ashel14");
    }
}

