package CucumberTests.StepDefs;

import Implementation.Checkout;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

/**
 * Created by Jess on 19/06/2017.
 */
public class CheckOutSteps {

    int fruitPrice;
    Checkout checkout = new Checkout();

    @Given("^the price of a \"([^\"]*)\" is \"([^\"]*)\"$")
    public void thePriceOfAIs(String name, int price) throws Throwable {
        fruitPrice = price;
        System.out.println("Price is : " + fruitPrice );

    }

    @When("^I checkout quantity \"([^\"]*)\"$")
    public void iCheckoutQuantity(int itemCount) throws Throwable {

        System.out.println("Hello there!!!! ");
        checkout.add(itemCount, fruitPrice );

    }

    @Then("^the total price should be \"([^\"]*)\"$")
    public void theTotalPriceShouldBe(int total ) throws Throwable {
        assertEquals(total, checkout.total());
    }

    /*
    @Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
    public void thePriceOfAIsC(String name, int price) throws Throwable {
        bananaPrice = price;
        System.out.println("Price is : " + bananaPrice );
    }

    @When("^I checkout (\\d+) \"([^\"]*)\"$")
    public void iCheckout(int itemCount, String itemName) throws Throwable {


        System.out.println("Hello there!!!! ");
        checkout.add(itemCount, bananaPrice);

    }


    @Then("^the total price should be (\\d+)c$")
    public void theTotalPriceShouldBeC(int total) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //assertEquals(total, 0);
        assertEquals(total, checkout.total());


    }
**/


}
