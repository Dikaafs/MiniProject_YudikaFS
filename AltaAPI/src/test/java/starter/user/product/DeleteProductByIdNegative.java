package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class DeleteProductByIdNegative {

    private static String url = "https://altashop-api.fly.dev/";

    @Step("i set API endpoint for delete product with invalid id")
    public String setApiEndpointDeleteProductInvalidId(){
        return url + "api/products/85649212";
    }

    @Step("i send request to delete product data  with invalid id")
    public void SendRequestDeleteProductInvalidId(){
        SerenityRest.given().delete(setApiEndpointDeleteProductInvalidId());
    }
}
