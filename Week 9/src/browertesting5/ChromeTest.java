package browertesting5;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTest {
    static WebDriver driver;
    static String url = "https://courses.ultimateqa.com/users/sign_in";
    static String exectedTitle = "Sign In - Ultimate QA";

    public static void main(String[] args) {
        ChromeOptions ch = new ChromeOptions();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle = driver.getTitle();
        System.out.println("Title of page is: "+actualTitle);
        Assert.assertTrue(exectedTitle.equals(actualTitle));
        driver.quit();
    }
}
