package pageObjectModel.pages.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjectModel.pages.constants.ConfigData;
import pageObjectModel.pages.interfaces.IActionHelper;

import java.time.Duration;
import java.util.List;

public class ActionHelper implements IActionHelper {

    protected static WebDriver driver;
    WaitHelper waitHelper;

    public ActionHelper(WebDriver remoteDriver){
        driver = remoteDriver;
        waitHelper = new WaitHelper(driver);
    }

    public void sendKeysToElement(WebElement element, String textToSend) {
        waitHelper.waitForElementToBeClickable(element);
        element.sendKeys(textToSend);
    }

    public WebElement getElement(By elementSelector)
    {
        try
        {
            waitHelper.waitUntilElementExists(elementSelector);
            var element = driver.findElement(elementSelector);
            return element;
        }
        catch (Exception ex)
        {
            throw new RuntimeException(ex.getMessage());
        }
    }

    public List<WebElement> getElements(By elementsSelector)
    {
        try
        {
            waitHelper.waitUntilElementExists(elementsSelector);
            return driver.findElements(elementsSelector);
        }
        catch (Exception ex)
        {
            throw new RuntimeException(ex.getMessage());
        }
    }
}
