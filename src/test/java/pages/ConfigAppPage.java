package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ConfigAppPage extends BasePage {

    @FindBy(linkText = "Test Client AT Nominator")
    public WebElement testClient;

    @FindBy(id = "ygtvlabelel39")
    public WebElement awardSection;

    @FindBy(id = "ygtvlabelel40")
    public WebElement awardProggram;

    @FindBy(linkText = "Service Anniversaries")
    public WebElement serviceAwardProgram;

    @FindBy(linkText ="testclient5021 program" )
    public WebElement clientProgramm;

    public ConfigAppPage(WebDriver driver) {
        super(driver);
    }

    public ConfigAppPage selectClient() {
        testClient.click();
        return new ConfigAppPage(driver);
    }

    public ConfigAppPage openAwardProgram(){
        awardSection.click();
        awardProggram.click();
        return  new ConfigAppPage(driver);
    }

    public ConfigAppPage swapAwardProgram(){
        Actions builder = new Actions(driver);
        System.out.println("X coordinate: "+serviceAwardProgram.getLocation().getX()+"Y serviceAwardProgram: "+serviceAwardProgram.getLocation().getY());
        builder.moveByOffset(serviceAwardProgram.getLocation().getX() + 1,1).dragAndDrop(serviceAwardProgram,clientProgramm).perform();
        return new ConfigAppPage(driver);

    }



}
