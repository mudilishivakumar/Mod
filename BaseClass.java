package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;

    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();

        driver.get("https://www.dazn.com/en-IN/home");

        driver.manage().window().maximize();
Thread.sleep(6000);
        driver.manage().deleteAllCookies();


    }

    public void waits() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }
}