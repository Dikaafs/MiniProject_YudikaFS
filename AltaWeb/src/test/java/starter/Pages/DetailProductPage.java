package starter.Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetailProductPage extends PageObject {

    private By Ratings(){
        return By.xpath("/html/body/div/div/main/div/div/div/div/div/div/div");
    }
    private By ratingsbtn(){
        return By.xpath("/html/body/div/div/main/div/div/div/div/div/div/div/button[4]");
    }

    public void RatingsProduct(){
        $(Ratings()).isDisplayed();
    }
    public void ClickRatings(){
        $(ratingsbtn()).click();
    }
}
