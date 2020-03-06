package potterapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberOfHouse {

    @JsonProperty("_id")
    private String id;

    private String name;
}
