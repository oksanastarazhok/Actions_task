package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    public boolean isElementPresent(By by) {
        int i = driver.findElements(by).size();
        return i != 0;
    }
}
