package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONArray;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateNewProductNegative {

    private static String url = "https://altashop-api.fly.dev/";
    @Step("i set API endpoint for create new product")
    public String SetApiEndpointCreateNewProduct(){

        return url+"api/products";
    }
    @Step("i send request to create new product")
    public void SendRequestCreateProductWithStringInput(){
        JSONObject product = new JSONObject();
        JSONArray categories = new JSONArray();

        JSONObject data = new JSONObject();
        data.put("data", product);

        product.put("name", "Sony PS5");
        product.put("description", "play has no limits");
        product.put("price", "299");
        product.put("categories", categories);

        System.out.println(data.toString(4));

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(product.toString())
                .post(SetApiEndpointCreateNewProduct());
    }

    @Step("i receive status code 400 bad request")
    public void ReceiveStatusCode400(){
        restAssuredThat(response ->response.statusCode(400));
    }
}
