package starter.user.Categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class DeleteCategoryNegative {
    private static String url = "https://altashop-api.fly.dev/";

    @Step("i set API endpoint for delete category with alphabet id")
    public String SetApiEndpointDeleteCategoryWithAlphabetId(){
        return url + "api/categories/A";
    }

    @Step("i send request to delete category with alphabet id")
    public void SendRequestDeleteCategoryWithAlphabetId(){
        SerenityRest.given().delete(SetApiEndpointDeleteCategoryWithAlphabetId());
    }
}
