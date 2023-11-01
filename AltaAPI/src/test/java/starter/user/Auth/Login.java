package starter.user.Auth;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class Login {

    private static String url = "https://altashop-api.fly.dev/api";

    @Step("i set API endpoint for login")
    public String SetApiEndpointLogin(){
        return url+"/auth/login";
    }

    @Step("i send request to login with valid username {string} and valid password {string}")
    public void SendLoginRequest(String email, String password) {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", email);
        requestBody.put("password", password);


        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(SetApiEndpointLogin());
    }

    @Step("I receive valid data for login")
    public void ReceiveValidDataLogin() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Login_Response_Schema);

        restAssuredThat(response -> response.body("'data'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
