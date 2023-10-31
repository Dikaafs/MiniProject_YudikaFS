package starter.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class CategoryPage extends PageObject {

   private By SelectCategory(){
       return By.xpath("/html/body/div/div[2]/div/div[2]/div/div");
   }
   private By InformationMessage(){
       return By.xpath("/html/body/div/div[1]/main/div/div/div[2]/div/div[1]");
   }
   @Step
   public void ClickTheCategory(){
       $(SelectCategory()).click();
   }
   @Step
   public boolean validateInformationMessage(){
   return $(InformationMessage()).isDisplayed();
   }

   @Step
    public boolean validateEqualInformationMessage(String message){
       return $(InformationMessage()).getText().equalsIgnoreCase(message);
   }
}
