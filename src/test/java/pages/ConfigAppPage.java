package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import java.time.Duration;

public class ConfigAppPage extends BasePage {

    @FindBy(linkText = "Test Client AT Nominator")
    public WebElement testClient;

    @FindBy(id = "ygtvlabelel39")
    public WebElement awardSection;

    @FindBy(id = "ygtvlabelel40")
    public WebElement awardProggram;

    @FindBy(xpath = "//*[@id=\"yui-rec1\"]/td[4]/div/input")
    public WebElement serviceAwardProgram;

    @FindBy(linkText = "testclient5021 program")
    public WebElement clientProgram;

    public ConfigAppPage(WebDriver driver) {
        super(driver);
    }

    public ConfigAppPage selectClient() {
        testClient.click();
        return new ConfigAppPage(driver);
    }

    public ConfigAppPage openAwardProgram() {
        awardSection.click();
        awardProggram.click();
        return new ConfigAppPage(driver);
    }

    public ConfigAppPage swapAwardProgram() {


        new Actions(driver)
                .moveToElement(serviceAwardProgram)
                .pause(Duration.ofSeconds(1))
                .clickAndHold(serviceAwardProgram)
                .pause(Duration.ofSeconds(1))
                .moveByOffset(0, -30)
                .pause(Duration.ofSeconds(1))
                .release().perform();

        return new ConfigAppPage(driver);

    }


}
