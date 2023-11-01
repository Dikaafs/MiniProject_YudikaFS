package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class CreateCommentProduct {

    private static String url = "https://altashop-api.fly.dev/";
    @Step("i set API endpoint for add comment")
    public String setApiEndpointAddComment(){

        return url+"api/products/85520/comments";
    }

    @Step("i send request to add comment")
    public void sendRequestAddComment(){
        String data = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6ImFzaGVsIiwiRW1haWwiOiJhc2hlbEBnbWFpbC5jb20ifQ.VAXkw9nSrKrIr6t_HV0ZE1-vbujGbPwO3ycQrIQJvNU";

        JSONObject requestBody = new JSONObject();

        requestBody.put("Content","the games are great including Gran Turismo 7 but sadly GT4 is much better");

        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + data)
                .body(requestBody.toString())
                .post(setApiEndpointAddComment());
    }

    @Step("i receive data product with the added comment")
    public void receiveDataProductWithAddedComment(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Create_Comment_Product_Response_Schema);

        restAssuredThat(response -> response.body("'data'.'Content'", equalTo("the games are great including Gran Turismo 7 but sadly GT4 is much better")));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
