package potterapi;

import com.common.framework.configuration.PropertiesProvider;

public class HousesListAPI extends BasePotterAPI {

    private static final String HOUSES_URL_PROPERTY = "houses.url";

    public HousesListAPI() {
        super();
    }

    @Override
    protected void loadSpecificPath() {
        setSpecificPath(PropertiesProvider.getPropertyValue(HOUSES_URL_PROPERTY));
    }
}
