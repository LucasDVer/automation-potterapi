package potterapi;

import com.common.framework.utils.ConfigUtils;

public class CharactersAPI extends BasePotterAPI {

    private static final String CHARACTERS_URL_PROPERTY = "characters.url";

    public CharactersAPI() {
        super();
    }

    @Override
    protected void loadSpecificPath() {
        setSpecificPath(ConfigUtils.getPropertyFromFile(CHARACTERS_URL_PROPERTY));
    }
}
