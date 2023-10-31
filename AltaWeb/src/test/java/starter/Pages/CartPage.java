package starter.Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CartPage extends PageObject {

    private By OnTheCartPage(){
        return By.xpath("/html/body/div/div[1]/main/div/div/div[1]/div/div[1]/div[2]/span");
    }
    private By PayButton(){
        return By.xpath("/html/body/div/div/main/div/div/div[2]/button");
    }


    public boolean ValidateOnTheCartPage(){
        return $(OnTheCartPage()).isDisplayed();
    }
    public void ClickPayButton(){
        $(PayButton()).click();
    }
}
