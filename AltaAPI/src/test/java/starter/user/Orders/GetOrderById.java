package starter.user.Orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetOrderById {

    private static String url = "https://altashop-api.fly.dev/";

    @Step("i set API endpoint for get order by id")
    public String setApiEndpointGetOrderByID(){
        return url + "api/orders/12422";
    }

    @Step("i send request to get order by id")
    public void sendRequestGetOrderByID(){
        JSONObject requestBody = new JSONObject();
        String data = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6ImFzaGVsIiwiRW1haWwiOiJhc2hlbEBnbWFpbC5jb20ifQ.VAXkw9nSrKrIr6t_HV0ZE1-vbujGbPwO3ycQrIQJvNU";

        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + data)
                .body(requestBody.toString())
                .get(setApiEndpointGetOrderByID());
    }

    @Step("i receive valid data for get order by id")
    public void receiveValidDataGetOrderByID(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Order_By_Id_Response_Schema);

        restAssuredThat(response -> response.body("'data'.'ID'", equalTo(12422)));
        restAssuredThat(response -> response.body("'data'.'User'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Product'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Quantity'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
