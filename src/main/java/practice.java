import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class practice extends PageBase{


    public practice(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id="fab")
    WebElement addtaskbtn;

    public void clickaddtaskbtn(){
        click(addtaskbtn);
    }
}
