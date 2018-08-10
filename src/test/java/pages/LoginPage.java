package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    @FindBy(name = "j_username")
    public WebElement usernameField;
    @FindBy(name = "j_password")
    public WebElement passwordField;
    @FindBy(css = ".button")
    public WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //Method sends required URL
    public LoginPage open(String URL) {
        driver.get(URL);
        return new LoginPage(driver);
    }

    //Method sends credentials and performs login
    public LoginPage sendCredentials(String username, String password) {
        usernameField.clear();
        usernameField.sendKeys(username);
        passwordField.clear();
        passwordField.sendKeys(password);
        loginBtn.click();
        return new LoginPage(driver);
    }


}
