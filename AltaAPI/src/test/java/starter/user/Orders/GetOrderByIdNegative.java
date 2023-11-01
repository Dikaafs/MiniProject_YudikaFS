package starter.user.Orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;

public class GetOrderByIdNegative {
    private static String url = "https://altashop-api.fly.dev/";

    @Step("i set API endpoint for get order by invalid id")
    public String SetApiEndpointGetOrderByInvalidId(){
        return url  + "api/orders/999";
    }
    @Step("i send request to get order by invalid id")
    public void sendRequestGetOrderByInvalidId(){
        JSONObject requestBody = new JSONObject();
        String data = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6ImFzaGVsIiwiRW1haWwiOiJhc2hlbEBnbWFpbC5jb20ifQ.VAXkw9nSrKrIr6t_HV0ZE1-vbujGbPwO3ycQrIQJvNU";

        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + data)
                .body(requestBody.toString())
                .get(SetApiEndpointGetOrderByInvalidId());
    }
}
