package potterapi.constans;

public enum PotterAPIUsers {

    VALID_USER("$2a$10$.FZSIO14hdGIY3KN6T.omueRT/cjt/DYqKSiB5Ef0XjHzZ4s7SIfW"),
    INVALID("invalidKey"),
    UNAUTHORIZED("");

    PotterAPIUsers(String key){
        this.key = key;
    }

    private String key;

    public String getKey(){
        return key;
    }


}
