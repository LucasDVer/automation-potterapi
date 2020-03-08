package potterapi;

import com.common.framework.api.APIContext;
import lombok.Getter;
import lombok.Setter;
import potterapi.model.User;

@Getter
@Setter
public class PotterAPIContext extends APIContext {

    private User user;

}
