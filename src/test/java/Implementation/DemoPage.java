package Implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

@SuppressWarnings("WeakerAccess")

public class DemoPage extends BasePage {

    private final By windowSelector    = By.xpath("//a[contains(text(),'Follow On Twitter')]");
    private final By userNameSelector  = By.id("username_or_email");
    private final By passwordSelector  = By.id("password");
    private final By rememberSelector   = By.id("remember");

    private final By zipcodeSelector   = By.id("zipcode");

    public DemoPage(WebDriver driver) {
        super(driver);
    }

    public DemoPage navigateTo() {
        driver.navigate().to("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");



        assertEquals("Selenium Easy - Window Popup Modal Demo", driver.getTitle());

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return new DemoPage(driver);
    }

    //


    public void openModalWindow() {

        WebElement modalWindow = driver.findElement(windowSelector);

        // Store the current window handle

        String winHandleBefore = driver.getWindowHandle();
        System.out.println(winHandleBefore);

        // Perform the click operation that opens new window
        modalWindow.click();

        // Switch to new window opened
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
            System.out.println(winHandle);
        }

        // Perform the actions on new window


        // Switch back to original browser (first window)
        //driver.switchTo().window(winHandleBefore);




        //WebElement remember = driver.findElement(rememberSelector);
        //remember.click();



    }





    public void enterCredentials(String username, String password ) {

        WebElement remember = driver.findElement(rememberSelector);
        remember.click();

        WebElement user_Name = driver.findElement(userNameSelector);
        user_Name.sendKeys(username);

        //WebElement last_name = driver.findElement(lastNameSelector);
        //last_name.sendKeys(lastName);

    }
/*
    public void getData() {

        Task task = new TaskBuilder.TaskBuilder("test").setDescription("Hello").setSummary("Test").build();



        //Task task = new TaskBuilder(5).set("test).setDescription("Hello").setSummary("Test").build();
        System.out.println(task);
    }




    }

*/


}
