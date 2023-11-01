package starter.user.Auth;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.FileUtils;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetUserInformation {
    private static String url = "https://altashop-api.fly.dev/";

    @Step ("i set API endpoint for get user information")
    public String setApiEnpointGetUserInformation(){
        return url + "api/auth/info";
    }

    @Step("i send request to get product with valid id")
    public void sendRequestGetUserInformation(){

        JSONObject requestBody = FileUtils.getUser();

        String data = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6ImFzaGVsIiwiRW1haWwiOiJhc2hlbEBnbWFpbC5jb20ifQ.VAXkw9nSrKrIr6t_HV0ZE1-vbujGbPwO3ycQrIQJvNU";

        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + data)
                .body(requestBody.toString())
                .get(setApiEnpointGetUserInformation());
    }

    @Step("i receive valid data the user")
    public void receiveValidDataUser() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_User_Information_Response_Schema);

        restAssuredThat(response -> response.body("'data'.'Email'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Fullname'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Password'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}


