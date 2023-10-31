package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetProductByIdNegative {

    private static String url = "https://altashop-api.fly.dev/";

    @Step("i set API endpoint for get product with valid id")
    public String setApiEndpointInvalidId(){
        return url + "api/products/8999";
    }

    @Step("i send request to get product with valid id")
    public void sendRequestInvalidId(){
        SerenityRest.given().get(setApiEndpointInvalidId());
    }
}
