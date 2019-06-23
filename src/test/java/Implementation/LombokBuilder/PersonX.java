package Implementation.LombokBuilder;


// using Lombok


//import java.util.Objects;

public class PersonX {

    private String name;
    private String country;
    private Integer age;

    private PersonX(PersonBuilder builder) {
        this.name = builder.name;
        this.country = builder.country;
        this.age = builder.age;
    }



    public static PersonBuilder newPerson() {
        return new PersonBuilder();
    }


    public static final class PersonBuilder {
        private String name;
        private String country;
        private Integer age;

        public PersonBuilder() {
        }

        public PersonX build() {
            return new PersonX(this);
        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder country(String country) {
            this.country = country;
            return this;
        }

        public PersonBuilder age(Integer age) {
            this.age = age;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                '}';
    }

    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(country, person.country) &&
                Objects.equals(age, person.age);

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, country, age);
    }

     */
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

