package potterapi.steps;


import io.cucumber.java8.En;
import org.junit.Assert;
import potterapi.HousesListAPI;
import potterapi.PotterAPIContext;
import potterapi.model.HousesResponseBody;

import java.util.Arrays;
import java.util.List;

public class HousesListSteps implements En {

    public HousesListSteps(PotterAPIContext apiContext) {
        When("The user performs a GET request to the houses endpoint", () ->
                apiContext.setResponse(new HousesListAPI().doGetWithUser(apiContext.getUser())));
        And("The houses info should contain the expected structure", () -> {
            List<HousesResponseBody> housesResponseBodies = Arrays.asList(apiContext.getResponse().as(HousesResponseBody[].class));
            Assert.assertNotNull("Response it is not valid", housesResponseBodies);
            Assert.assertFalse("The API did not return any character", housesResponseBodies.isEmpty());
        });

    }
}
