package potterapi.constants;

import potterapi.configuration.PotterAPIVariablesProvider;

public enum PotterAPIUsers {

    VALID_USER(PotterAPIVariablesProvider.getPassword()),
    INVALID("invalidKey"),
    UNAUTHORIZED("");

    private String key;

    PotterAPIUsers(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }


}
