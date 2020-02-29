package potterapi.steps;

import com.common.framework.api.APIContext;
import io.cucumber.java8.En;
import io.restassured.response.Response;
import org.junit.Assert;
import potterapi.HogwartsHouses;
import potterapi.SortingHatAPI;

public class SortingHatSteps implements En {

    private Response response;


    public SortingHatSteps(APIContext apiContext) {
        When("The user performs a GET request for a random house", () ->
               apiContext.setResponse(new SortingHatAPI().doGet()));
        And("The response should be one of the valid houses", () ->
            Assert.assertTrue(HogwartsHouses.isHouseInTheList(apiContext.getResponse().asString().replaceAll("\"",""))));
    }
}
