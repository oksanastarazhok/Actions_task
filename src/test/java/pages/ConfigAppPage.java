package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfigAppPage extends BasePage {

    private final String URL = "https://staging-sandbox0.corp.globoforce.com/iaf-config-app/manageAwardProgramsOpen?client=5021&menuid=6_1";
    @FindBy(name = "j_username")
    public WebElement usernameField;
    @FindBy(name = "j_password")
    public WebElement passwordField;

    public ConfigAppPage(WebDriver driver) {
        super(driver);
    }


    public static void main (String[] args){
        System.out.println("testPN");
    }

}
