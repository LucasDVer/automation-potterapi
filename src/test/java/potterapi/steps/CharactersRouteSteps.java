package potterapi.steps;


import io.cucumber.java8.En;
import io.restassured.response.Response;
import org.junit.Assert;
import potterapi.CharactersAPI;
import potterapi.PotterAPIContext;
import potterapi.model.responses.CharactersResponseBody;

import java.util.Arrays;
import java.util.List;

public class CharactersRouteSteps implements En {

    private Response response;

    public CharactersRouteSteps(PotterAPIContext apiContext) {
        When("The user performs a GET request to the characters endpoint", () ->
                apiContext.setResponse(new CharactersAPI().doGetWithUser(apiContext.getUser())));

        And("The characters info should contain the expected structure", () -> {
            List<CharactersResponseBody> charactersResponseBodyList = Arrays.asList(apiContext.getResponse().as(CharactersResponseBody[].class));
            Assert.assertNotNull("Response it is not valid", charactersResponseBodyList);
            Assert.assertFalse("The API did not return any character", charactersResponseBodyList.isEmpty());
        });

    }
}
