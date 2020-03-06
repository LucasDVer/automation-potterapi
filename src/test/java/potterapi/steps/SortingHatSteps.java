package potterapi.steps;

import io.cucumber.java8.En;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import potterapi.HogwartsHouses;
import potterapi.PotterAPIContext;
import potterapi.SortingHatAPI;

public class SortingHatSteps implements En {

    public SortingHatSteps(PotterAPIContext apiContext) {
        When("The user performs a GET request to the sorting hat endpoint", () ->
                apiContext.setResponse(new SortingHatAPI().doGet()));

        Then("The response body should not be blank", () ->
                Assert.assertTrue("The response is blank or empty", StringUtils.
                        isNotBlank(apiContext.getResponse().asString())));

        And("The response should be one of the valid houses", () ->
                Assert.assertTrue(HogwartsHouses.isHouseInTheList(apiContext.getResponse().asString().replaceAll("\"", ""))));
    }
}
