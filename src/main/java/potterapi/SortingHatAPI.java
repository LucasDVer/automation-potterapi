package potterapi;

import com.common.framework.utils.ConfigUtils;

public class SortingHatAPI extends BasePotterAPI {

    private static final String SORTING_HAT_URL_PROPERTY = "sorting.hat.url";

    public SortingHatAPI() {
        super();
    }

    @Override
    protected void loadSpecificPath() {
        setSpecificPath(ConfigUtils.getPropertyFromFile(SORTING_HAT_URL_PROPERTY));
    }

}
