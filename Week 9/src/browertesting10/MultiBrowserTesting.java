package browertesting10;

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
    static String brower = "Chrome";
    static WebDriver driver;
    static String url ="https://www.freelancer.co.uk/login";

    static String expectedTitle ="Login to Hire Freelancers & Find Work | Freelancer";
    public static void main(String[] args) {
        if (brower.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
        } else if (brower.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);
        } else if (brower.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            driver = new EdgeDriver(options);
        } else {
            System.out.println("Invalid Brower");
        }

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String actuaTitle = driver.getTitle();
        System.out.println("Title of page is: "+actuaTitle);
        Assert.assertTrue(expectedTitle.equalsIgnoreCase(actuaTitle));
        driver.quit();
    }
}
