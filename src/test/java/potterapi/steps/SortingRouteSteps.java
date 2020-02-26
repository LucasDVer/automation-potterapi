package potterapi.steps;

import io.cucumber.java8.En;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import potterapi.SortingHatAPI;

public class SortingRouteSteps implements En {

    private static final String BASE_POTTERAPI_URL = "https://www.potterapi.com/v1";
    private Response response;
    private String getAllCharactersInfo = BASE_POTTERAPI_URL + "/characters";
    private static final String POTTERAPI_KEY = "$2a$10$.FZSIO14hdGIY3KN6T.omueRT/cjt/DYqKSiB5Ef0XjHzZ4s7SIfW";

    public SortingRouteSteps() {
        super();
        Given("The user has access to the potterapi endpoint", () ->
                System.out.println("This action does not need extra authentication"));
        Given("The user has access to the potterapi endpoint using a key", () ->
                System.out.println("This action needs extra authentication"));
        When("The user performs a GET request for a random house", () -> {
            //response = RestAssured.given().get(getAnAleatoryHogwartsHouse);
            response = new SortingHatAPI().doGet();
        });


        Then("The response status should be {int}", (Integer statusCode) ->
                Assert.assertEquals("The status code is not the same", statusCode.intValue(),
                        response.getStatusCode())
        );
        When("The user performs a GET request for all characters", () ->
                response = RestAssured.given().formParam("key", POTTERAPI_KEY).get(getAllCharactersInfo));
    }
}
