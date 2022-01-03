package hrOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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

    @Test
    public void newAssert(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver96.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.i.ua");
        System.out.println("My title: " + driver.getTitle());

        WebElement titleMail = driver.findElement(By.xpath("//a[@href='https://mail.i.ua/']"));
        String expectedTitleMail = "Почта";
        String actualTitleMail = titleMail.getText();
        Assert.assertEquals(expectedTitleMail, actualTitleMail);
    }
}
