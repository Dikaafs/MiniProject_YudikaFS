package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllProduct {

    private static String url = "https://altashop-api.fly.dev/";
    @Step("i set API endpoint for get all product")
    public String setApiGetAllProduct(){

        return url  + "api/products";
    }

    @Step("i send request to get all product")
    public void sendRequestGetAllProduct(){

        SerenityRest.given().get(setApiGetAllProduct());
    }

    @Step("i receive status code 200 OK")
    public void receiveStatusCode200ok(){

        restAssuredThat(response ->response.statusCode(200));
    }
    @Step("i receive valid data for get all product")
    public void ReceiveValidDataGetAllProduct(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_All_Product_Response_Schema);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));

    }
}
