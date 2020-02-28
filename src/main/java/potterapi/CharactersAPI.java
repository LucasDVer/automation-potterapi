package potterapi;

import com.travelocity.framework.utils.ConfigUtils;

public class CharactersAPI extends BasePotterAPI {

    private static final String CHARACTERS_URL_PROPERTY = "characters.url";

    public CharactersAPI() {
        super();
        loadSpecificPath();
    }

    @Override
    protected void loadSpecificPath() {
        setSpecificPath(ConfigUtils.getPropertyFromFile(CHARACTERS_URL_PROPERTY));
    }
}
