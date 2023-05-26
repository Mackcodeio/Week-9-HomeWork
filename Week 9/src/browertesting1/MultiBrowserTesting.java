package browertesting1;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class MultiBrowserTesting {

    static String browser = "edge";

    static WebDriver driver;

    static String url = "https://demo.nopcommerce.com/";

    static String expectedTitle = "nopCommerce demo store";
    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
        }else if(browser.equalsIgnoreCase("firefox")){
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);
        }else if(browser.equalsIgnoreCase("edge")){
            EdgeOptions options = new EdgeOptions();
            driver = new EdgeDriver();
        }else {
            System.out.println("Invalid Browser");
        }

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
        String actualTitle = driver.getTitle();
        System.out.println("Title of page is: "+actualTitle);

        Assert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
        driver.quit();
    }
}
