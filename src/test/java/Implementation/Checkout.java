package Implementation;

/**
 * Created by Jess on 21/06/2017.
 */
public class Checkout {

    private int runningTotal = 0;

    public void add(int count, int price) {
        System.out.println("count is : " + count);
        System.out.println("price is :" + price);
        System.out.println("Hello there2!!! ");
        runningTotal += (count * price);


    }

    public int total() {
        System.out.println("Hello there!!! ");
        return runningTotal;
        // return 40;
    }


}


