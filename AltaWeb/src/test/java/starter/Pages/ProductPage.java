package starter.Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class ProductPage extends PageObject {

    private By SigninButton(){
        return By.xpath("/html/body/div/div/header/div/button[2]/span");
    }

    private By product(){
        return By.xpath("/html/body/div/div[1]/main/div/div/div[2]/div/div[23]");
    }
    private By CategoryButton(){
        return By.xpath("/html/body/div/div[1]/main/div/div/div[1]/div/div[1]/div[1]/div[1]");
    }
    private By DetailButton(){
        return By.xpath("/html/body/div/div/main/div/div/div[2]/div/div[6]/div/div[3]/div[2]/button[1]/span");
    }
    private By BuyButton(){
        return By.xpath("/html/body/div/div[1]/main/div/div/div[2]/div/div[3]/div/div[3]/div[2]/button[2]/span");
    }
    private By RazerProduct(){
        return By.xpath("/html/body/div/div/main/div/div/div[2]/div/div[7]/div/div[3]/div[2]/button[2]");
    }
    private By CartButton(){
        return By.xpath("/html/body/div/div[1]/header/div/button[1]");
    }
    private By ProfilButton(){
        return By.xpath("/html/body/div/div[1]/header/div/button[2]/span");
    }
    private By TransactionButton(){
        return By.xpath("/html/body/div/div[2]/div/div[1]/div[2]");
    }

    public void ClickSignInButton(){
        $(SigninButton()).click();
    }

    public boolean validateOnTheProductPage(){
        return $(product()).isDisplayed();
    }
    public void CategoryBtn(){
        $(CategoryButton()).click();
    }
    public void ClickDetailButton(){
        $(DetailButton()).click();
    }
    public void ClickBuyButton(){
        $(BuyButton()).click();
    }
    public void ClickCartButton(){
        $(CartButton()).click();
    }
    public void ClickBuyRazer(){
        $(RazerProduct()).click();
    }
    public void ClickProfilButton(){
        $(ProfilButton()).click();
    }
    public void ClickTransactionButton(){
        $(TransactionButton()).click();
    }
}



