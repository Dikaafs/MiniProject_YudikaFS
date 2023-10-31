package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteProductById {

    private static String url = "https://altashop-api.fly.dev/";

    @Step("i set API endpoint for delete product by id")
    public String SetApiEndpointDeleteProductById(){
        return url + "api/products/85649";
    }

    @Step("i send request to delete data cart with valid id")
    public void sendRequestDeleteValidId(){
        SerenityRest.given().delete(SetApiEndpointDeleteProductById());
    }

    @Step("i receive status code 200 ok")
    public void ReceiveStatuscode200ok(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
