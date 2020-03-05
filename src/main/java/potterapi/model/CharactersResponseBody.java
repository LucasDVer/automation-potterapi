package potterapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CharactersResponseBody {


    private String role;

    private String bloodStatus;

    private String school;

    private String alias;

    private String animagus;

    private String wand;

    private String species;

    private String deathEater;

    private String boggart;

    @JsonProperty("__v")
    private String version;

    private String dumbledoresArmy;

    private String name;

    private String ministryOfMagic;

    @JsonProperty("_id")
    private String id;

    private String patronus;

    private String orderOfThePhoenix;

    private String house;

}
