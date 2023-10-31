package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllProductNegative {

    private static String url = "https://altashop-api.fly.dev/";
    @Step("i set invalid API  endpoint for get all product")
    public String setInvalidApiEndpoint(){

        return url+ "api/";
    }

    @Step("i send request to get all product With invalid endpoint")
    public void sendRequestWithInvalidEndpoint(){
        SerenityRest.given().get(setInvalidApiEndpoint());
    }

    @Step("i receive status code 404 not found")
    public void receiveStatusCode404(){
        restAssuredThat(response ->response.statusCode(404));
    }
}
