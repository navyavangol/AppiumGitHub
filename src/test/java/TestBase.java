import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class TestBase {
    public static AndroidDriver driver;

    public static void Android_setup() throws MalformedURLException {
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","9");
        caps.setCapability("deviceName","navya");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("app","C:\\Users\\itnav\\Downloads\\ToDo_v1.24.apk");
        driver=new AndroidDriver(new URL("http://localhost:4723/wd/hub"),caps);
    }

    public static void tearDown(){
        if(null!=driver){
            driver.quit();
        }
    }
}
