package potterapi.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class HousesResponseBody extends CommonHouseResponseBody {

    private List<String> members;
}
