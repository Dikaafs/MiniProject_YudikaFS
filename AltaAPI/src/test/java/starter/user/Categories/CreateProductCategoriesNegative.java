package starter.user.Categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class CreateProductCategoriesNegative {

    private static String url = "https://altashop-api.fly.dev/";
    @Step("i set invalid API endpoint for create new product")
    public String SetInvalidApiEndpointCreateNewProduct() {

        return url + "api/category";
    }

    @Step("i send request to create new product with invalid endpoint")
    public void SendRequestCreateNewProductWithInvalidEndpoint(){
        JSONObject category = new JSONObject();
        JSONObject data = new JSONObject();
        data.put("data", category);

        category.put("name", "mouse");
        category.put("description", "for gaming purposes");


        System.out.println(data.toString(4));

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(category.toString())
                .post(SetInvalidApiEndpointCreateNewProduct());
    }
}
