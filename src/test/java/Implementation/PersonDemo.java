package Implementation;

public class PersonDemo {

    public static void main(String[] args) {


        // PersonBuilder instance
        Person.PersonBuilder builder = new Person.PersonBuilder();

        // builder builds the instance
        builder.name("Joe").surname("Bloggs").id(123).setOccupied(true);

        // Immutable Person object is initiated with build() method
        Person person = builder.build();

        System.out.println(person);
    }

}