package Implementation.LombokBuilder;


// using Lombok

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(exclude = "id")
@EqualsAndHashCode(exclude = "id")

// Builder class


@Builder

public class Person {
    @Getter(lazy = true) private final Boolean isOverEighteen = checkEighteen();
    @Getter(lazy = true) private final int agePerson = this.age;
    @Getter(lazy = true) private final String FirstName = this.name;

    //@Getter(lazy = true) private final int fullname = personDetails();
    private Integer id;
    private String name;
    private String country;
    private Integer age;


    private Boolean checkEighteen() {
        // very complicated calculations
        return 18 <= this.age;
    }

/*
    private int agePerson() {
        return this.age;
    }

    public String fullname() {
        return this.name;
    }
*/

}
/*
public class Person {

    private String name;
    private String country;
    private Integer age;

    private Person(Builder builder) {
        this.name = builder.name;
        this.country = builder.country;
        this.age = builder.age;
    }

    public static Builder newPerson() {
        return new Builder();
    }


    public static final class Builder {
        private String name;
        private String country;
        private Integer age;

        private Builder() {
        }

        public Person build() {
            return new Person(this);
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }
    }

}
/*

Creating a normal POJO class object

public class Person {
    private String name;
    private String address;
    private Integer age;

    public Person(String name, String address, Integer age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    }
 */

