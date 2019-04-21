package com.ea;

/**
 * Created by Jess on 17/06/2017.
 */
public class ThisKeywordDemo {

    public static void main(String[] args) {

        Car c1 = new Car();
        //Car c2 = new Car();

        c1.model = "Ford";
        //c1.year = 1972;

        //c2.model = "Vauxhall";
        //c2.year = 1975;

        System.out.println(c1.year);
        //System.out.println(c2.getYear());

        //c1.setMake("BMW");
        // System.out.println(c1.getMake());

        //c1.setMake("Benz");
        //System.out.println(c1.getMake());


        System.out.println(c1.gear);
        System.out.println(c1.speed);

        Car c2 = new Car(10 , 1);
        System.out.println(c2.gear);
        System.out.println(c2.speed);

    }

}
