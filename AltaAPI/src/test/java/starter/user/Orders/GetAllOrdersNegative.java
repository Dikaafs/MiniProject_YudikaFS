package starter.user.Orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllOrdersNegative {

    private static String url = "https://altashop-api.fly.dev/";
    @Step("i set API endpoint for get all order without login token")
    public String setApiEndpointGetAllOrderWithoutLoginToken(){

        return url+ "api/orders";
    }

    @Step("i send request to get all order without login token")
    public void SendRequestGetAllOrderWithoutLoginToken() {
        SerenityRest.given()
                .get(setApiEndpointGetAllOrderWithoutLoginToken());
    }

    @Step("i receive status code 401")
    public void ReceiveStatusCode401(){
        restAssuredThat(response ->response.statusCode(401));
    }
}


