package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductCommentNegative  {
    private static String url = "https://altashop-api.fly.dev/";

    @Step("i set API endpoint for get product comment with invalid id")
    public String SetApiEndpointProductCommentInvalidId() {
        return url + "api/products/123/comments";
    }

    @Step("i send request to get product comment with invalid id")
    public void SendRequestProductCommentInvalidId() {
        SerenityRest.given().get(SetApiEndpointProductCommentInvalidId());
    }

    @Step("i receive empty data")
    public void ReceiveEmptyData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Product_Comment_Negative_Response_Schema);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
