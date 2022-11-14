package programme1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Project_1_ForFirefoxBrowser {
    public static void main(String[] args) {
        // String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        //Set Driver Property
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //Launch the URL
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");

        //Maximize the window
        driver.manage().window().maximize();

        //Give the implicit time for page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the page title
        //String title = driver.getTitle();
        //System.out.println("The page title is :" + title);
        System.out.println("The page title is :" + driver.getTitle());

        //Get Current URL
        System.out.println("The Current URL is :" + driver.getCurrentUrl());

        //Get Page Source
        System.out.println("The Page source elements is :" + driver.getPageSource());

        //Find the Email field element and send the email
        WebElement enterEmail = driver.findElement(By.id("Email"));
        //Type email in to email field
        enterEmail.sendKeys("selenium123@gmail.com");

        //Find Password field elements
        WebElement enterPassword = driver.findElement(By.name("Password"));
        //Enter the password
        enterPassword.sendKeys("Javacode123");

        //Close the browser
        //driver.quit();
    }
}
