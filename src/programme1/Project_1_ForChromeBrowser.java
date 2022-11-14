package programme1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Project_1_ForChromeBrowser {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        //Create Object
        WebDriver driver = new ChromeDriver();

        //Launch the URL
        driver.get(baseUrl);  //we can use direct method like driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");

        //Maximize Window
        driver.manage().window().maximize();

        //we give implicit time to driver for wait until few second
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println("The page title is :" + title);

        //Print Current URL
        System.out.println("The Current URL is :" + driver.getCurrentUrl());

        //Print the Page Source
        System.out.println("The page source is :" + driver.getPageSource());

        //Find the Email field element and send the email
        WebElement enterEmail = driver.findElement(By.id("Email"));
        //Type email in to email field
        enterEmail.sendKeys("naresh123@gmail.com");

        //Find Password field elements
        WebElement enterPassword = driver.findElement(By.name("Password"));
        //Enter the password
        enterPassword.sendKeys("Prime123");

        //Close the browser
        // driver.quit();
    }
}