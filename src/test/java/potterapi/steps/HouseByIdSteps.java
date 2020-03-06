package potterapi.steps;

import io.cucumber.java8.En;
import org.junit.Assert;
import potterapi.HousesListAPI;
import potterapi.PotterAPIContext;
import potterapi.model.HousesByIdResponseBody;

import java.util.Arrays;
import java.util.List;


public class HouseByIdSteps implements En {

    public HouseByIdSteps(PotterAPIContext apiContext) {
        When("The user performs a GET request to the houses endpoint using an {string}", (String id) ->
                apiContext.setResponse(new HousesListAPI().doGetWithUserAndId(apiContext.getUser(), id)));

        And("The house info should contain the expected structure", () -> {
            List<HousesByIdResponseBody> housesByIdResponseBody = Arrays.asList(apiContext.getResponse().as(HousesByIdResponseBody[].class));
            Assert.assertNotNull("Response it is not valid", housesByIdResponseBody);
            Assert.assertFalse("The API did not return any character", housesByIdResponseBody.isEmpty());
        });
    }
}
