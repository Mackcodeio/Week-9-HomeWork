package browertesting5;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeTest {
    static WebDriver driver;
    static String url = "https://courses.ultimateqa.com/users/sign_in";
    static String expectedTitle = "Sign In - Ultimate QA";

    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle = driver.getTitle();
        System.out.println("Tile of page is : " + actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}
