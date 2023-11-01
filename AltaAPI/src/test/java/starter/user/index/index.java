package starter.user.index;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class index {
    private static String url = "https://altashop-api.fly.dev/";

    @Step("i set API endpoint for get index")
    public String SetApiEndpointForGetIndex() {
        return url + "api/hello";
    }

    @Step("i send request to get index")
    public void SendRequestGetIndex() {
        SerenityRest.given().get(SetApiEndpointForGetIndex());
    }

    @Step("i receive valid data index")
    public void ReceiveValidIndex() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Index_Response_Schema);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
