package Implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

@SuppressWarnings("WeakerAccess")

public class SignUpPage extends BasePage {

    private final By firstNameSelector = By.id("firstname");
    private final By lastNameSelector  = By.id("lastname");
    private final By addressSelector   = By.id("address");
    private final By zipcodeSelector   = By.id("zipcode");

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public SignUpPage navigateTo() {
        driver.navigate().to("https://www.kimschiller.com/page-object-pattern-tutorial/");

        assertEquals("Sign up", driver.getTitle());

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return new SignUpPage(driver);
    }

    public void enterName(String firstName, String lastName ) {

        WebElement first_name = driver.findElement(firstNameSelector);
        first_name.sendKeys(firstName);

        WebElement last_name = driver.findElement(lastNameSelector);
        last_name.sendKeys(lastName);

    }

    public void enterAddress(String address) {

        WebElement fullAddress = driver.findElement(addressSelector);
        fullAddress.sendKeys(address);

    }

    public void enterZipCode(String zipCode) {

        WebElement postcode = driver.findElement(zipcodeSelector);
        postcode.sendKeys(zipCode);

    }



}
