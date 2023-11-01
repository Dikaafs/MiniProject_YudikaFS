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

public class CreateNewOrder {
    private static String url = "https://altashop-api.fly.dev/";
    @Step("i set API endpoint to create new order")
    public String setApiEndpointCreateNewOrder(){

        return url+"api/orders";
    }

    @Step("i send request to create new order")
    public void SendRequestCreateNewOrder() {
            JSONArray orderRequestBody = new JSONArray();
            JSONObject requestBody = new JSONObject();
            orderRequestBody.put(0, requestBody);

            requestBody.put("product_id",85537);
            requestBody.put("quantity",1);


        String data = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6ImFzaGVsIiwiRW1haWwiOiJhc2hlbEBnbWFpbC5jb20ifQ.VAXkw9nSrKrIr6t_HV0ZE1-vbujGbPwO3ycQrIQJvNU";

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + data)
                .body(orderRequestBody.toString())
                .post(setApiEndpointCreateNewOrder());
    }

    @Step("i receive valid data for new product")
    public void ReceiveNewOrderData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Create_New_Order_Response_Schema);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
