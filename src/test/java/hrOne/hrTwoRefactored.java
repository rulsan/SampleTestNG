package hrOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hrTwoRefactored {

    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver96.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.i.ua");
    }

    @Test
    public void rhBlock(){
        System.out.println(driver.getTitle());
    }

    @Test
    public void newAssert(){
        System.out.println("My title: " + driver.getTitle());

        WebElement titleMail = driver.findElement(By.xpath("//a[@href='https://mail.i.ua/']"));
        String expectedTitleMail = "Почта";
        String actualTitleMail = titleMail.getText();
        Assert.assertEquals(actualTitleMail, expectedTitleMail);
    }

    @Test
    public void login(){
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("rulsan");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@value='Войти']")).click();

        WebElement sTitle = driver.findElement(By.xpath("//div[@class='content clear']"));
        String expTitle = "Неверный логин или пароль";
        String actTitle = sTitle.getText();
        Assert.assertEquals(actTitle, expTitle);
    }
}
