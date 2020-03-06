package potterapi.steps;

import io.cucumber.java8.En;
import io.restassured.response.Response;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import potterapi.CharactersAPI;
import potterapi.PotterAPIContext;
import potterapi.model.CharactersResponseBody;

public class CharacterByIdSteps implements En {

    private Response response;

    public CharacterByIdSteps(PotterAPIContext apiContext) {
        When("The user performs a GET request to the characters endpoint using an {string}", (String id) -> {
            response = new CharactersAPI().doGetWithUserAndId(apiContext.getUser(), id);
            apiContext.setResponse(response);
        });

        When("The character info should contain the expected structure", () -> {
            CharactersResponseBody characterResponseBody = apiContext.getResponse().as(CharactersResponseBody.class);
            Assert.assertNotNull("Response it is not valid", characterResponseBody);
            Assert.assertTrue("Character Name should not be empty", StringUtils.
                    isNotBlank(characterResponseBody.getName()));
        });
    }

}
