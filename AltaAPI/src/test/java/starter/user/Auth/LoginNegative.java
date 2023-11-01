package starter.user.Auth;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class LoginNegative {
    private static String url = "https://altashop-api.fly.dev/api";

    @Step("i set API endpoint for login with unregistered account")
    public String setApiEndpointLoginInvalidCredentials(){
        return url+"/auth/login";
    }

    @Step("i send request to login with invalid email {string} and invalid password {string}")
    public void SendRequestLoginInvalidCredentials(String email, String password) {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", email);
        requestBody.put("password", password);

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(setApiEndpointLoginInvalidCredentials());
    }

    @Step("i receive status code 400")
    public void ReceiveStatusCode400(){
        restAssuredThat(response ->response.statusCode(400));
    }
}
