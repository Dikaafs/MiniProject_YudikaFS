package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.ProductGetter;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class AssignProductRatingsNegative {
    protected String url = "https://altashop-api.fly.dev/api/";
    @Step("i set API endpoint for assign product rating without token")
    public String setApiEndPointAssignProductRatingWithoutToken() {

        return url + "products/85525/ratings";
    }

    @Step("i send request to assign product rating without token")
    public void SendRequestAssignProductRatingWithoutToken() {

        JSONObject requestBody = new JSONObject();

        requestBody.put("count",4);

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(setApiEndPointAssignProductRatingWithoutToken());
    }
}
