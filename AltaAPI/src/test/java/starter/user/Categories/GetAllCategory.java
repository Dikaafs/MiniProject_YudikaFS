package starter.user.Categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCategory {
    private static String url = "https://altashop-api.fly.dev/";
    @Step("i set API endpoint for get all category")
    public String SetApiEndpointGetAllCategory(){

        return url+ "api/categories";
    }

    @Step("i send request to get all category with valid endpoint")
    public void SendRequestGetAllCategoryValidEndpoint(){
        SerenityRest.given().get(SetApiEndpointGetAllCategory());
    }

    @Step("i receive valid list the category")
    public void ReceiveValidListTheCategory(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.Get_All_Category_Response_Schema);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
