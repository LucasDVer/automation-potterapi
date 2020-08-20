package potterapi.configuration;

import com.common.framework.configuration.SystemVariablesProvider;

public class PotterAPIVariablesProvider {

    private static final String PASSWORD_KEY = "password";

    private PotterAPIVariablesProvider() {
    }

    public static String getPassword() {
        String keyValue = SystemVariablesProvider.getPropertyValue(PASSWORD_KEY);
        return keyValue == null ? PASSWORD_KEY : keyValue;

    }
}
