package potterapi;

import com.common.framework.api.BaseAPI;
import com.common.framework.utils.ConfigUtils;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import potterapi.model.User;

public abstract class BasePotterAPI extends BaseAPI {

    private static final String BASE_POTTER_API_URL_PROPERTY = "potter.api.base.url";
    private static final String POTTERAPI_KEY_PARAM = "key";


    public BasePotterAPI() {
        super();
    }

    @Override
    protected void loadBaseUrl() {
        setBaseUrl(ConfigUtils.getPropertyFromFile(BASE_POTTER_API_URL_PROPERTY));
    }

    public Response doGetWithUser(User user) {
        return RestAssured.given().formParam(POTTERAPI_KEY_PARAM, user.getKey()).get(getBaseUrl() + getSpecificPath());
    }

    public Response doGetWithUserAndId(User user, String id) {
        return RestAssured.given().formParam(POTTERAPI_KEY_PARAM, user.getKey()).get(getBaseUrl() + getSpecificPath() + "/" + id);
    }
}
