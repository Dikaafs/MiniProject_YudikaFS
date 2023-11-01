package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONArray;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import java.util.ArrayList;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class CreateNewProduct {

    private static String url = "https://altashop-api.fly.dev/";
    @Step("i set API endpoint for create new product")
    public String SetApiEndpointCreateNewProduct(){

        return url+"api/products";
    }

    @Step("i send request to create new product")
    public void SendRequestCreateNewProduct(){
        JSONObject product = new JSONObject();
        JSONArray categories = new JSONArray();

        JSONObject data = new JSONObject();
        data.put("data", product);

        product.put("name", "Parfume");
        product.put("description", "anti bau ketek");
        product.put("price", 100000);
        product.put("categories", categories);


        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(product.toString())
                .post(SetApiEndpointCreateNewProduct());
    }

    @Step("i receive valid data for new product")
    public void ReceiveValidDataNewProduct() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Create_New_Product_Response_Schema);

        restAssuredThat(response -> response.body("'data'.'Name'", equalTo("Parfume")));
        restAssuredThat(response -> response.body("'data'.'Description'", equalTo("anti bau ketek")));
        restAssuredThat(response -> response.body("'data'.'Price'", equalTo(100000)));
        restAssuredThat(response -> response.body("'data'.'Categories'", equalTo(new ArrayList())));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
