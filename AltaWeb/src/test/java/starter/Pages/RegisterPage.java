package starter.Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class RegisterPage extends PageObject {

    private By ButtonRegistFeature() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/div/a");
    }

    private By registTitle() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[1]");
    }

    private By inputFullName() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input");
    }

    private By inputEmail() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input");
    }

    private By inputPassword() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[3]/div/div[1]/div/input");
    }

    private By registButton() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[4]/button/span");
    }

    private By ErrorRequirement() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/div[1]/div/div[1]");
    }

    private By registeredFullName() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input");
    }

    private By registeredemail() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input");
    }
    private By registeredPassword(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[3]/div/div[1]/div/input");
    }

    public void clickRegistFeature() {
        $(ButtonRegistFeature()).click();
    }

    public boolean validateOnTheRegistPage() {
        return $(registTitle()).isDisplayed();
    }

    public void inputFullName(String fullname) {
        $(inputFullName()).type(fullname);
    }

    public void inputEmail(String email) {
        $(inputEmail()).type(email);
    }

    public void inputPassword(String password) {
        $(inputPassword()).type(password);
    }

    public void clickRegistButton() {
        $(registButton()).click();
    }

    public void doubleclickregistbtn() {
        $(registButton()).click();
        $(registButton()).click();
    }

    public boolean validateEqualErrorMessage(String message) {
        return $(ErrorRequirement()).getText().equalsIgnoreCase(message);
    }

    public boolean validateErrorMessageDisplayed() {
        return $(ErrorRequirement()).isDisplayed();
    }

    public void inputregisteredName(String registeredname) {
        $(registeredFullName()).type(registeredname);
    }

    public void inputregisteredemail(String registeredEmail) {
        $(registeredemail()).type(registeredEmail);
    }
    public void inputregisteredpassword(String registeredPassword){
        $(registeredPassword()).type(registeredPassword);
    }
}
