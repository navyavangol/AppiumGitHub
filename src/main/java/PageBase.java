import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Element;

import java.time.Duration;

public class PageBase {

    AppiumDriver driver;
    public static final long WAIT=10;

    //constructor
    public PageBase(AppiumDriver appiumDriver){
        //pagefactory is from selenium and initelements means intialize the elements
        //AppiumFieldDecorator is a method that is responsible for collecting all the elements that has annotations
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
        driver=appiumDriver;
    }

    //methods
    public void waitForVisibility(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(WAIT));
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void clear(WebElement element){
        waitForVisibility(element);
        element.clear();
    }
    public void click(WebElement element){
        waitForVisibility(element);
        element.click();
    }

    public void sendText(WebElement element,String text){
        waitForVisibility(element);
        element.sendKeys(text);
    }

    public String getAttribute(WebElement element,String attribute){
        waitForVisibility(element);
        return element.getAttribute(attribute);
    }
}
