package starter.user.Orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONArray;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllOrder {
    private static String url = "https://altashop-api.fly.dev/";
    @Step("i set API endpoint for get all order")
    public String setApiEndpointGetAllOrder(){

        return url+ "api/orders";
    }

    @Step("i send request to get all order")
    public void sendRequestGetAllOrder(){
        String data = GenerateToken.generateToken();
        SerenityRest.given()
                .header("Authorization", "Bearer " + data)
                .get(setApiEndpointGetAllOrder());
    }
    @Step("i receive valid data get all oder")
    public void ReceiveValidDataGetAllOrder(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_All_Order_Response_Schema);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));

    }
}
