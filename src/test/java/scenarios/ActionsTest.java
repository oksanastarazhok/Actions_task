package scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ConfigAppPage;
import pages.LoginPage;
import pages.IAFHomePage;

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
        LoginPage loginPage = new LoginPage(driver)
                .open()
                .sendCredentials("bhkb.jshcw@gqfozpkzgb.kbk", "password1")
                .iafLogin();
        IAFHomePage iafHomePage = new IAFHomePage(driver)
                .selectConfigApp();
        ConfigAppPage configAppPage = new ConfigAppPage(driver)
                .selectClient()
                .openAwardProgram()
                .swapAwardProgram();

    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
