package starter.Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class TransactionPage extends PageObject {

    private By datafooter(){
        return By.xpath("/html/body/div/div/main/div/div/div/div/div[2]");
    }
    private By rowButton(){
        return By.xpath("/html/body/div/div[1]/main/div/div/div/div/div[2]/div[1]/div/div/div/div[1]/div[2]/div");
    }
    private By SelectRowPage(){
        return By.xpath("/html/body/div/div[2]/div/div[3]");
    }
    private By newRowPerPage(){
        return By.xpath("/html/body/div/div[1]/main/div/div/div/div/div[2]/div[1]/div/div/div/div[1]/div[1]");
    }
    private By nextbutton(){
        return By.xpath("/html/body/div/div[1]/main/div/div/div/div/div[2]/div[4]/button/span/i");
    }
    private By onTheOtherPage(){
        return By.xpath("/html/body/div/div[1]/main/div/div/div/div/div[1]/table/tbody/tr[2]/td[1]");
    }

    public boolean validateOnTheTransactionPage(){
        return $(datafooter()).isDisplayed();
    }

    public void ClickRowButton(){
        $(rowButton()).click();
    }

    public void ClickRowPerPage(){
        $(SelectRowPage()).click();
    }

    public boolean validateRowPerPageIs15(){
        return $(newRowPerPage()).isDisplayed();
    }
    public void clickNextButton(){
        $(nextbutton()).click();
    }

    public boolean validateOntheOtherPage(){
        return $(onTheOtherPage()).isDisplayed();
    }
}
