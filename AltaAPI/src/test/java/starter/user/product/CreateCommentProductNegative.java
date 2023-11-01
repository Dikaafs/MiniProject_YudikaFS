package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateCommentProductNegative {

    private static String url = "https://altashop-api.fly.dev/";
    @Step("i set API endpoint for add comment without id")
    public String setApiEndpointAddCommentWithoutId(){

        return url+"api/products/comments";
    }

    @Step("i send request to add comment without id")
    public void SendRequestAddCommentWithoutId(){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6ImFzaGVsIiwiRW1haWwiOiJhc2hlbEBnbWFpbC5jb20ifQ.VAXkw9nSrKrIr6t_HV0ZE1-vbujGbPwO3ycQrIQJvNU";

        JSONObject requestBody = new JSONObject();

        requestBody.put("Content","the games are great including Gran Turismo 7 but sadly GT4 is much better");

        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(setApiEndpointAddCommentWithoutId());
    }

    @Step("i receive status code 405")
    public void ReceiveStatusCode405(){
        restAssuredThat(response ->response.statusCode(405));
    }

}
