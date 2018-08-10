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

    @Test(description = "Swaps Award items")
    public void test() {
        LoginPage loginPage = new LoginPage(driver)
                .open("https://staging-sandbox0.corp.globoforce.com/iaf-config-app/manageAwardProgramsOpen?client=5021&menuid=6_1")
                .sendCredentials("bhkb.jshcw@gqfozpkzgb.kbk", "password1");
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
