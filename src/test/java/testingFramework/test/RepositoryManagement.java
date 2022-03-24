package testingFramework.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import testingFramework.driver.DriverSingleton;

public class RepositoryManagement {

    protected WebDriver driver;
    protected static final String USER_NAME = "test-automation-user";
    protected static final String USER_PASSWORD = "password";

    @BeforeMethod()
    public void setUp(){
        driver = DriverSingleton.getDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void stopBrowser(){
        DriverSingleton.closeDriver();
    }
}
