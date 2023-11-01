package starter.user.Auth;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class RegistNegative {

    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("i set API endpoint for register without hook")
    public String SetApiEndpointRegistWithoutHook() {
        return url + "auth/register";
    }

    @Step("i send request to register without hook")
    public void SendRequestRegisterWithoutHook() {
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .body(requestBody.toString())
                .post(SetApiEndpointRegistWithoutHook());
    }
}
