package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductComment {
    private static String url = "https://altashop-api.fly.dev/";

    @Step("i set API endpoint for get product comment")
    public String setApiEndpointGetProductComment() {
        return url + "api/products/85520/comments";
    }

    @Step("i send request to get product comment with valid id")
    public void SendRequestGetProductComment() {
        SerenityRest.given().get(setApiEndpointGetProductComment());
    }

    @Step("i receive valid product comment")
    public void ReceiveValidProductComment() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Product_Comment_Response_Schema);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
