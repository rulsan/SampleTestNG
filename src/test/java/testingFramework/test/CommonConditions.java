package testingFramework.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import testingFramework.driver.DriverSingleton;

public class CommonConditions {

    protected WebDriver driver;
    protected static final String USER_NAME = "test-automation-user";
    protected static final String USER_PASSWORD = "password";
//    public static final String RESOURCES_PATH = "src\\test\\resources";

    @BeforeMethod()
    public void setUp(){
//        System.setProperty("webdriver.chrome.driver", RESOURCES_PATH + "chromedriver96.exe");
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void stopBrowser(){
        DriverSingleton.closeDriver();
    }
}
