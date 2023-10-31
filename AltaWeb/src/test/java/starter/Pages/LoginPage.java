package starter.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private By EmailField(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input");
    }

    private By PasswordField(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input");
    }

    private By LoginButton(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[3]/button/span");
    }

    private By button(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[1]");
    }

    private By ErrorMessage(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/div[1]/div/div[1]");
    }

    public boolean validateOnTheLoginPage(){
        return $(button()).isDisplayed();
    }
    @Step
    public void inputEmail(String email){
        $(EmailField()).type(email);
    }

    @Step
    public void inputPassword(String password){
        $(PasswordField()).type(password);
    }

    @Step
    public void ClickLoginButton(){
        $(LoginButton()).click();
    }

    @Step
    public void ErrorMessageIsShown(){
        $(ErrorMessage()).isDisplayed();
    }
}
