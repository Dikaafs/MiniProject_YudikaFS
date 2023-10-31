package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetProductRatingNegative {

    private static String url = "https://altashop-api.fly.dev/";

    @Step("i set API endpoint for get product rating deleted id")
    public String SetApiEndpointGetProductRatingDeletedId() {
        return url + "api/products/85522/ratings";
    }

    @Step("i send request to get product with valid id")
    public void SendRequestGetProductRatingDeletedId() {
        SerenityRest.given().get(SetApiEndpointGetProductRatingDeletedId());
    }
}
