package Implementation;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;

public class ReceiptPage extends BasePage {

    private final By headerSelector = By.tagName("h1");
    private final By signupSelector = By.id("signup");

    public ReceiptPage(WebDriver driver) {
        super(driver);
    }


    public String confirmationHeader()
    {

        WebElement HdrTitle = driver.findElement(headerSelector);
        return HdrTitle.getText();

    }

    public void formSubmit() {

        WebElement signup  = driver.findElement(signupSelector);
        signup.submit();

    }

}