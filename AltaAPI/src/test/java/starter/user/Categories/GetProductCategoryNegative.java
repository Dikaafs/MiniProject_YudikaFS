package starter.user.Categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetProductCategoryNegative {

    private static String url = "https://altashop-api.fly.dev/";

    @Step("i set API endpoint for get product category with non existent id")
    public String setApiEndpointGetProductCategoryNonExistentId(){
        return url + "api/categories/9999";
    }

    @Step("i send request to get product category with non existent id")
    public void SendRequestGetProductCategoryNonExistentId(){
        SerenityRest.given().get(setApiEndpointGetProductCategoryNonExistentId());
    }
}
