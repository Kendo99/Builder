package Implementation;

import org.openqa.selenium.WebDriver;

@SuppressWarnings("WeakerAccess")

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

}
