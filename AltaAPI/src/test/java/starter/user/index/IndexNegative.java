package starter.user.index;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class IndexNegative {
    private static String url = "https://altashop-api.fly.dev/";

    @Step("i set invalid API endpoint for index")
    public String SetInvalidApiEndpointForIndex() {
        return url + "api/helo";
    }

    @Step("i send request to get index with invalid API")
    public void SendRequestGetIndexWithInvalidAPI() {
        SerenityRest.given().get(SetInvalidApiEndpointForIndex());
    }

}
