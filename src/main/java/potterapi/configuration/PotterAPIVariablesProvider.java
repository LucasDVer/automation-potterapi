package potterapi.configuration;

import com.common.framework.configuration.SystemVariablesProvider;
import com.common.framework.logger.Loggable;

public class PotterAPIVariablesProvider implements Loggable {

    private static final String PASSWORD_KEY = "password";

    public static String getPassword(){
        String keyValue = SystemVariablesProvider.getPropertyValue(PASSWORD_KEY);
        return keyValue == null ? PASSWORD_KEY : keyValue;

    }
}
