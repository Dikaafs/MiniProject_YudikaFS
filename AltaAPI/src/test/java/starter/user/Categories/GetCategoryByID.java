package starter.user.Categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetCategoryByID {

    private static String url = "https://altashop-api.fly.dev/";

    @Step("i set API endpoint for get product with valid id")
    public String SetApiEndpointGetCategoryByID(){
        return url + "api/categories/29891";
    }

    @Step("i send request to get product with valid id")
    public void SendRequestGeCategoryByID(){
        SerenityRest.given().get(SetApiEndpointGetCategoryByID());
    }

    @Step("i receive valid data product by ID")
    public void ReceiveDataCategoryByID(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Category_By_ID_Response_Schema);

        restAssuredThat(response -> response.body("'data'.'ID'", equalTo(29891)));
        restAssuredThat(response -> response.body("'data'.'Name'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Description'", notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
