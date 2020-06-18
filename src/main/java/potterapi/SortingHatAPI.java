package potterapi;

import com.common.framework.configuration.PropertiesProvider;

public class SortingHatAPI extends BasePotterAPI {

    private static final String SORTING_HAT_URL_PROPERTY = "sorting.hat.url";

    public SortingHatAPI() {
        super();
    }

    @Override
    protected void loadSpecificPath() {
        setSpecificPath(PropertiesProvider.getPropertyValue(SORTING_HAT_URL_PROPERTY));
    }

}
