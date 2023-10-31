package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.ProductGetter;
public class AssignProductRating {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("i set API endpoint for assign product rating")
    public String SetApiEndpointAssignRating() {
        int productId = ProductGetter.getProductID();

        return url + "products/" + productId + "/ratings";
    }

    @Step("i send request to assign product rating")
    public void SendRequestAssignRating() {
        String token = GenerateToken.generateToken();

        JSONObject requestBody = new JSONObject();

        requestBody.put("count",4);

        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(SetApiEndpointAssignRating());
    }
}
