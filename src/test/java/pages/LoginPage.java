package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    private final String URL = "https://staging-sandbox0.corp.globoforce.com/iaf-config-app/manageAwardProgramsOpen?client=5021&menuid=6_1";
    @FindBy(name = "j_username")
    public WebElement usernameField;
    @FindBy(name = "j_password")
    public WebElement passwordField;
    @FindBy(css = ".button")
    public WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public LoginPage open() {
        driver.get(URL);
        return new LoginPage(driver);
    }

    public LoginPage sendCredentials(String username, String password) {
        usernameField.clear();
        usernameField.sendKeys(username);
        passwordField.clear();
        passwordField.sendKeys(password);
        return new LoginPage(driver);
    }

    public LoginPage iafLogin() {
        loginBtn.click();
        return new LoginPage(driver);
    }


}
