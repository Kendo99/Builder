package Implementation.LombokBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder

public class PersonLombok {
    @Getter(lazy = true) private final Boolean isOverEighteen = checkEighteen();
    private String name;
    private String country;
    private Integer age;


    private Boolean checkEighteen() {
        // very complicated calculations
        return 18 <= this.age;
    }

}