package starter.user.Categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCategoriesNegative {
    private static String url = "https://altashop-api.fly.dev/";
    @Step("i set API endpoint for get all category with invalid endpoint")
    public String SetApiEndpointGetAllCategoryInvalidEndpoint(){

        return url+ "api/";
    }

    @Step("i send request to get all category with invalid endpoint")
    public void SendRequestGetAllCategoryInvalidEndpoint(){
        SerenityRest.given().get(SetApiEndpointGetAllCategoryInvalidEndpoint());
    }

    @Step("i receive status code 404")
    public void ReceiveStatusCode404(){
        restAssuredThat(response ->response.statusCode(404));
    }
}
