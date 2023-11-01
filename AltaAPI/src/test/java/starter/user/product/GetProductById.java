package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;


import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetProductById {
    private static String url = "https://altashop-api.fly.dev/";

    @Step("i set API endpoint for get product with valid id")
    public String SetApiEndpointGetProductValidId(){
        return url + "api/products/86287";
    }

    @Step("i send request to get product with valid id")
    public void SendRequestGetProductValidId()  {
        SerenityRest.given().get(SetApiEndpointGetProductValidId());
    }

    @Step("i receive valid data product by id")
    public void ReceiveValidDataProductById(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_Product_By_Id_Response_Schema);

        restAssuredThat(response -> response.body("'data'.'ID'", equalTo(86287)));
        restAssuredThat(response -> response.body("'data'.'Name'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Description'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Price'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Categories'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
