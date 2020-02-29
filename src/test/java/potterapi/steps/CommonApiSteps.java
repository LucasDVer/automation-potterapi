package potterapi.steps;

import com.common.framework.api.APIContext;
import io.cucumber.java8.En;
import io.restassured.response.Response;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import potterapi.CharactersAPI;

public class CommonApiSteps implements En {

    private Response response;

    public CommonApiSteps(APIContext apiContext) {
        super();
        Given("The user has access to the potterapi endpoint", () ->
                System.out.println("This action does not need extra authentication"));

        Given("The user has access to the potterapi endpoint using a key", () ->
                System.out.println("This action needs extra authentication"));

        Then("The response status should be {int}", (Integer statusCode) ->
                Assert.assertEquals("The status code is not the same", statusCode.intValue(),
                        apiContext.getResponse().getStatusCode())
        );
//characters
        When("The user performs a GET request for all characters", () ->
                response = new CharactersAPI().doGetWithKeyParam());

        Then("The response body should not be blank", () -> {
            Assert.assertTrue("asd", StringUtils.isNotBlank(apiContext.getResponse().asString()));
        });
//character
        When("The user performs a GET request for one character using an {string}", (String id) ->
                response = new CharactersAPI().doGetWithKeyParamAndId(id));
    }
}
