package potterapi;

import com.common.framework.api.BaseAPI;
import com.common.framework.utils.ConfigUtils;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public abstract class BasePotterAPI extends BaseAPI {

    private static final String BASE_POTTER_API_URL_PROPERTY = "potter.api.base.url";
    private static final String POTTERAPI_KEY_PARAM = "key";
    private static final String POTTERAPI_KEY = "$2a$10$.FZSIO14hdGIY3KN6T.omueRT/cjt/DYqKSiB5Ef0XjHzZ4s7SIfW";


    public BasePotterAPI() {
        super();
    }

    @Override
    protected void loadBaseUrl() {
        setBaseUrl(ConfigUtils.getPropertyFromFile(BASE_POTTER_API_URL_PROPERTY));
    }

    public Response doGetWithKeyParam() {
        return RestAssured.given().formParam(POTTERAPI_KEY_PARAM, POTTERAPI_KEY).get(getBaseUrl() + getSpecificPath());
    }

    public Response doGetWithKeyParamAndId(String id) {
        return RestAssured.given().formParam(POTTERAPI_KEY_PARAM, POTTERAPI_KEY).get(getBaseUrl() + getSpecificPath() + "/" + id);
    }
}
