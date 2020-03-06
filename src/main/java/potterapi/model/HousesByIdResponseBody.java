package potterapi.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class HousesByIdResponseBody extends CommonHouseResponseBody {


    private List<MemberOfHouse> members;
}
