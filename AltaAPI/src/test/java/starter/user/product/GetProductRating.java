package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetProductRating {

    private static String url = "https://altashop-api.fly.dev/";

    @Step("i set API endpoint for get product rating")
    public String setApiEnpointGetProductRating() {
        return url + "api/products/85520/ratings";
    }

    @Step("i send request to get product with valid id")
    public void sendRequestGetProductRating() {
        SerenityRest.given().get(setApiEnpointGetProductRating());
    }

    @Step("i receive status code 200")
    public void ReceiveStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("i receive valid product rating")
    public void ReceiveValidProductRating() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Product_Rating_Response_Schema);


        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
