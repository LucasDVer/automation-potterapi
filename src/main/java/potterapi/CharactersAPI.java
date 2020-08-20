package potterapi;

import com.common.framework.configuration.PropertiesProvider;

public class CharactersAPI extends BasePotterAPI {

    private static final String CHARACTERS_URL_PROPERTY = "characters.url";

    public CharactersAPI() {
        super();
    }

    @Override
    protected void loadSpecificPath() {
        setSpecificPath(PropertiesProvider.getPropertyValue(CHARACTERS_URL_PROPERTY));
    }
}
