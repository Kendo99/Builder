package CucumberTests.StepDefs;

import Implementation.Checkout;
import Implementation.ReceiptPage;
import Implementation.SignUpPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;


@SuppressWarnings("WeakerAccess")

/**
 * Created by Jess on 19/06/2017.
 */
public class CheckOutSteps {

    int fruitPrice;
    Checkout checkout = new Checkout();

    WebDriver driver;
    SignUpPage signUpPage;
    ReceiptPage receiptPage;

    @Before()
    public void setup()
    {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Kenha\\CucumberFramework\\CucumberFramework\\src\\test\\java\\resources\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();

    }


    @Given("^I enter a valid first name and last name$")
    public void i_enter_a_valid_first_name_and_last_name() throws Throwable {


        signUpPage = new SignUpPage(driver);
        signUpPage.navigateTo();

        signUpPage.enterName("Ken", "Harris");

    }

    @Given("^I enter a valid address$")
    public void i_enter_a_valid_address() throws Throwable {

        signUpPage.enterAddress("123 Street");
    }

    @Given("^I enter a valid zipcode$")
    public void i_enter_a_valid_zipcode() throws Throwable {

        signUpPage.enterZipCode("DY9 6UY");
    }

    @When("^I click on the sign up button$")
    public void i_click_on_the_sign_up_button() throws Throwable {

        receiptPage = new ReceiptPage(driver);

        receiptPage.formSubmit();

      }

    @Then("^I should see a successful receipt page$")
    public void i_should_see_a_successful_receipt_page() throws Throwable {

       assertEquals("Thank you!", receiptPage.confirmationHeader());

    }

    @After()
    public void TearDown() {
        driver.manage().deleteAllCookies();

        /**
        if (driver != null) {
            driver.close();
            driver.quit();
        }
        **/

    }

    /***
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


    @Given("^I enter a valid first name$")
    public void i_enter_a_valid_first_name() throws Throwable {

    }



    @Given("^I enter a valid email address$")
    public void i_enter_a_valid_email_address() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }



    @When("^I click on the submit button$")
    public void i_click_on_the_submit_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^the information should successfully be submitted via the contact us form$")
    public void the_information_should_successfully_be_submitted_via_the_contact_us_form() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I enter a valid last name$")
    public void i_enter_a_valid_last_name() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @And("^I enter comments$")
    public void i_enter_comments() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
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




    @After()
    public void TearDown() {
        driver.manage().deleteAllCookies();

        if (driver != null) {
            driver.close();
            driver.quit();
        }


    }
     **/


}
