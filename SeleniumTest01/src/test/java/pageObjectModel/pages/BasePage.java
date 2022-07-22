package pageObjectModel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjectModel.pages.constants.ConfigData;
import pageObjectModel.pages.helpers.ActionHelper;
import pageObjectModel.pages.helpers.WaitHelper;
import pageObjectModel.pages.helpers.WindowHelper;
import pageObjectModel.pages.interfaces.IActionHelper;
import pageObjectModel.pages.interfaces.IWaitHelper;
import pageObjectModel.pages.interfaces.IWindowHelper;


public class BasePage {
    WebDriver driver;
    IWaitHelper waitHelper ;
    IActionHelper actionHelper;
    IWindowHelper windowHelper;

    protected BasePage(WebDriver remoteDriver){
        driver = remoteDriver;
        waitHelper = new WaitHelper(driver);
        actionHelper = new ActionHelper(driver);
        windowHelper = new WindowHelper(driver);
    }
}
