package potterapi.steps;

import io.cucumber.java8.En;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

public class SortingRouteSteps implements En {

    private static final String BASE_POTTERAPI_URL = "https://www.potterapi.com/v1";
    private Response response;
    private String getAnAleatoryHogwartsHouse = BASE_POTTERAPI_URL + "/sortingHat";

    public SortingRouteSteps() {
        super();
        Given("The user has access to the potterapi endpoint", () ->
                System.out.println("This action does not need extra authentication"));
        When("The user performs a GET request for a random house", () ->
                response = RestAssured.given().get(getAnAleatoryHogwartsHouse)
        );
        Then("The response status should be {int}", (Integer statusCode) ->
                Assert.assertEquals("The status code is not the same", statusCode.intValue(),
                        response.getStatusCode())
        );
    }
}
