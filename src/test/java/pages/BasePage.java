package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {
    protected WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }

}
