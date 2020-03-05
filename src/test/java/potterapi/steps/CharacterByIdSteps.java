package potterapi.steps;

import io.cucumber.java8.En;
import io.restassured.response.Response;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import potterapi.CharactersAPI;
import potterapi.PotterAPIContext;
import potterapi.model.CharactersResponseBody;
import potterapi.model.ErrorMessageBadIdResponseBody;

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
        Then("The response error name should be CastError and contains the correct error message", () -> {
            ErrorMessageBadIdResponseBody errorMessageBadIdResponseBody = apiContext.getResponse()
                    .as(ErrorMessageBadIdResponseBody.class);
            Assert.assertEquals("The error name is not the same",
                    "CastError", errorMessageBadIdResponseBody.getName());
            Assert.assertTrue("The error message is no the same",
                    errorMessageBadIdResponseBody.getMessage().contains("Cast to ObjectId failed for value"));
        });
    }

}
