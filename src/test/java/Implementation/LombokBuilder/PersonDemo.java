package Implementation.LombokBuilder;

import com.github.javafaker.Faker;

public class PersonDemo {

    public static void main(String[] args) {


        Faker faker = new Faker();

        String streetName = faker.address().streetName();
        //integer age = faker.address().buildingNumber();
        String city = faker.address().city();
        String country = faker.address().country();
        String firstName = faker.name().firstName();

        Person person = Person.builder()
                .name(firstName)
                .country("Poland")
                .age(25)
                .build();

        System.out.println(person);

        // OLD method using builder class
        //PersonX.PersonBuilder builder = new PersonX.PersonBuilder();
        //builder.age(22).country(country).name(firstName);
        //builder.age(22).country("Italy").name("Terry");
        //PersonX person = builder.build();
        //System.out.println(person);

        /*
        person.toBuilder()
                .country("Poland")
                .name("Peter")
                .build();
*/
        /*
        // PersonBuilder instance
        Person.PersonBuilder builder = new Person.PersonBuilder();

        // builder builds the instance
        builder.name("Joe").surname("Bloggs").id(123).setOccupied(true);

        // Immutable Person object is initiated with build() method
        Person person = builder.build();

        System.out.println(person);
    }
    */


    }
}
