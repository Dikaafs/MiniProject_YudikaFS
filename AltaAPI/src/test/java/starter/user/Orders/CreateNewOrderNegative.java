package starter.user.Orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONArray;
import org.json.JSONObject;
import starter.utils.GenerateToken;

public class CreateNewOrderNegative {

    private static String url = "https://altashop-api.fly.dev/";
    @Step("i set API endpoint for create new product without login token")
    public String setApiEndpointCreateNewProductWithoutLoginToken(){
        return url+"api/orders";
    }

    @Step("i send request to create new order")
    public void SendRequestCreateNewProductWithoutLoginToken() {
        JSONArray orderRequestBody = new JSONArray();
        JSONObject requestBody = new JSONObject();
        orderRequestBody.put(0, requestBody);

        requestBody.put("product_id",2);
        requestBody.put("quantity",1);

        System.out.println(orderRequestBody);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(orderRequestBody.toString())
                .post(setApiEndpointCreateNewProductWithoutLoginToken());
    }
}
