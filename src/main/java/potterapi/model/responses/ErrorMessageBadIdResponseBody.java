package potterapi.model.responses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorMessageBadIdResponseBody {

    private String message;

    private String name;

    private String stringValue;

    private String kind;

    private String value;

    private String path;

}
