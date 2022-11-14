package programme1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Project_1_ForEdgeBrowser {

    public static void main(String[] args) {
        // String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        //Create object for edge driver
        WebDriver driver = new EdgeDriver();

        //Launch the URL
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");

        //Maximize window
        driver.manage().window().maximize();

        //give implecit time to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //get the title of the page
        //String title = driver.getTitle();
        //System.out.println("The page title is :" + title);
        System.out.println("The page title is :" + driver.getTitle());

        //Get Current URL
        System.out.println("The Current URL is :" + driver.getCurrentUrl());

        //Get Page Source
        System.out.println("The Page source is :" + driver.getPageSource());

        //Find the Email field element and send the email
        WebElement enterEmail = driver.findElement(By.id("Email"));
        //Type email in to email field
        enterEmail.sendKeys("prime123@gmail.com");

        //Find Password field elements
        WebElement enterPassword = driver.findElement(By.name("Password"));
        //Enter the password
        enterPassword.sendKeys("Testing123");

        //Close the browser
        //driver.quit();
    }
}
