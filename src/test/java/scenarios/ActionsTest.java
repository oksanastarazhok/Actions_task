package scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ConfigAppPage;

import java.util.concurrent.TimeUnit;

public class ActionsTest {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void test() {
        ConfigAppPage configAppPage = new ConfigAppPage(driver)
        .open()
        .sendCredentials("bhkb.jshcw@gqfozpkzgb.kbk", "password1")
        .iafLogin();


    }
}
