package browertesting2;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTest {

    static WebDriver driver;
    static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    static String expectedTitle = "OrangeHRM";
    public static void main(String[] args) {
        ChromeOptions ch = new ChromeOptions();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        String actualTitle = driver.getTitle();
        System.out.println("Title of Page is: "+actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}
