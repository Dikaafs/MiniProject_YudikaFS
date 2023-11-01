package starter.user.Categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class DeleteCategory {
    private static String url = "https://altashop-api.fly.dev/";

    @Step("i set API endpoint for delete category by id")
    public String SetApiEndpointDeleteCategory(){
        return url + "api/categories/2711";
    }

    @Step("i send request to delete category data  with valid id")
    public void SendRequestDeleteCategory(){
        SerenityRest.given().delete(SetApiEndpointDeleteCategory());
    }
}
