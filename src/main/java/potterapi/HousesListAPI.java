package potterapi;

import com.common.framework.utils.ConfigUtils;

public class HousesListAPI extends BasePotterAPI {

    private static final String HOUSES_URL_PROPERTY = "houses.url";

    public HousesListAPI() {
        super();
        loadSpecificPath();
    }

    @Override
    protected void loadSpecificPath() {
        setSpecificPath(ConfigUtils.getPropertyFromFile(HOUSES_URL_PROPERTY));
    }
}
