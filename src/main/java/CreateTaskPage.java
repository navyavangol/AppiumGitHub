import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CreateTaskPage extends PageBase{

    public CreateTaskPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id="editTextTitre")
    WebElement taskTitleName;

    @AndroidFindBy(id="editTextNote")
    WebElement taskNoteDesc;

    @AndroidFindBy(id="action_save")
    WebElement saveBtn;

    public void enterTaskName(String taskName){
        clear(taskTitleName);
        sendText(taskTitleName,taskName);
    }

    public void enterTaskDesc(String taskDesc){
        clear(taskNoteDesc);
        sendText(taskNoteDesc,taskDesc);
    }

    public void clickSaveBtn(){
        click(saveBtn);
    }
}
