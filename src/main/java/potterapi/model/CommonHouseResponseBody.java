package potterapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CommonHouseResponseBody {

    private String headOfHouse;

    private String houseGhost;

    private String mascot;

    private String school;

    private String founder;

    @JsonProperty("__v")
    private String v;

    private List<String> values;

    private String name;

    @JsonProperty("_id")
    private String id;

    private List<String> colors;


}
