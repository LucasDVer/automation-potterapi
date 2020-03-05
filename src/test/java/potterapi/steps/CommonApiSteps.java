package potterapi.steps;

import io.cucumber.java8.En;
import org.junit.Assert;
import potterapi.PotterAPIContext;
import potterapi.User;
import potterapi.constans.PotterAPIUsers;

public class CommonApiSteps implements En {

    public CommonApiSteps(PotterAPIContext apiContext) {
        super();
        Given("The user has access to the sorting hat endpoint", () ->
                System.out.println("This action does not need extra authentication"));

        Given("The user has access to the potter api endpoints", () -> {
            User user = new User(PotterAPIUsers.VALID_USER.getKey());
            apiContext.setUser(user);
        });

        Given("The user does not have access to the potter api endpoints", () -> {
            User user = new User(PotterAPIUsers.UNAUTHORIZED.getKey());
            apiContext.setUser(user);
        });

        Given("The user has an invalid key for the potter api endpoints", () -> {
            User user = new User(PotterAPIUsers.INVALID.getKey());
            apiContext.setUser(user);
        });

        Then("The response status should be {int}", (Integer statusCode) ->
                Assert.assertEquals("The status code is not the same", statusCode.intValue(),
                        apiContext.getResponse().getStatusCode()));

    }
}
