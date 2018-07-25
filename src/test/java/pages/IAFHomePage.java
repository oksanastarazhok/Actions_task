package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IAFHomePage extends BasePage {

    @FindBy(css = ".drop")
    public WebElement otherAppLink;

    @FindBy(linkText = "Config")
    public WebElement config;

    public IAFHomePage(WebDriver driver) {
        super(driver);
    }


    public IAFHomePage selectConfigApp(){
        otherAppLink.click();
        config.click();
        return new IAFHomePage(driver);
    }
}
