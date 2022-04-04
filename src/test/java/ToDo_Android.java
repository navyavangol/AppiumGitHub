import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

public class ToDo_Android extends TestBase {

    CreateTaskPage createtaskpage;
    TasksListPage taskslistpage;

    @Test
    public void test_add_task() throws MalformedURLException {
        Android_setup();

        //createtaskpage=new CreateTaskPage(driver);
        taskslistpage=new TasksListPage(driver);

        taskslistpage.clickAddTaskBtn();
        /*
        createtaskpage.enterTaskName("Finish Appium Course");
        createtaskpage.enterTaskDesc("Finishing my course");
        createtaskpage.clickSaveBtn();


        tearDown();*/

    }
}
