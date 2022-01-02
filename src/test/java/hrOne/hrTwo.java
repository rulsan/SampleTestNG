package hrOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class hrTwo {

    @Test
    public void rhBlock(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver96.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.orangehrm.com/hr-manager");
        System.out.println(driver.getTitle());
    }
}
