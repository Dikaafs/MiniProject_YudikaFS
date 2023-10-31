package starter.user.Auth;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.FileUtils;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;


public class Register {

    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("i set API endpoint for register")
    public String SetApiRegister() {
        return url + "auth/register";
    }

    @Step("i send request for register")
    public void SendRequestRegister() {
        JSONObject requestBody = FileUtils.getUser();

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(SetApiRegister());
    }

    @Step("i receive valid data for new user")
    public void ReceiveValidDataNewUser() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Register_Response_Schema);

        restAssuredThat(response -> response.body("'data'.'Email'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Fullname'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Password'", notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));

    }
}
