package starter.user.Categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class CreateProductCategories {
    private static String url = "https://altashop-api.fly.dev/";
    @Step("i set API endpoint for create new product category")
    public String SetApiEndpointCreateProductCategory() {

        return url + "api/categories";
    }

    @Step("i send request to create new product category")
    public void SendRequestCreateProductCategory(){
        JSONObject category = new JSONObject();
        JSONObject data = new JSONObject();
        data.put("data", category);

        category.put("name", "gaming");
        category.put("description", "for gaming purposes");


        System.out.println(data.toString(4));

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(category.toString())
                .post(SetApiEndpointCreateProductCategory());
    }

    @Step("i receive valid data for new product category")
    public void ReceiveValidDataNewProductCategory(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Create_Product_Category_Response_Schema);

        restAssuredThat(response -> response.body("'data'.'Name'", equalTo("gaming")));
        restAssuredThat(response -> response.body("'data'.'Description'", equalTo("for gaming purposes")));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
