package potterapi;

import com.travelocity.framework.api.BaseAPI;
import com.travelocity.framework.utils.ConfigUtils;

public abstract class BasePotterAPI extends BaseAPI {

    private static final String BASE_POTTER_API_URL_PROPERTY = "potter.api.base.url";

    public BasePotterAPI(){
        super();
    }

    @Override
    protected void loadBaseUrl() {
        setBaseUrl(ConfigUtils.getPropertyFromFile(BASE_POTTER_API_URL_PROPERTY));
    }
}
