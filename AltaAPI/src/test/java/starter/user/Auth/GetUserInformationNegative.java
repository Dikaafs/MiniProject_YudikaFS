package starter.user.Auth;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class GetUserInformationNegative {

    private static String url = "https://altashop-api.fly.dev/";

    @Step("i set API endpoint for get user information without token")
    public String SetApiEndpointGetUserInformationWithoutToken(){
        return url + "api/auth/info";
    }

    @Step("i send request to get user information without token")
    public void SendRequestGetUserInformationWithoutToken(){
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .get(SetApiEndpointGetUserInformationWithoutToken());
    }
}
