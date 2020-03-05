package potterapi;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import static org.apache.commons.lang3.StringUtils.EMPTY;

@Getter
@Setter
public class User {

    private String key;

    public User(String key){
        this.key = (StringUtils.isBlank(key)) ? EMPTY : key;
    }

    public User(){
        this.key = EMPTY;
    }
}
