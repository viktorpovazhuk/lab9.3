package builder;

import lombok.*;

import java.util.List;

@Builder @ToString @Getter @Setter
public class User {
    private String firstName;
    private String lastName;
    @Singular(value="job")
    private List<String> occupations;
    private String Gender;
    private int age;
}
