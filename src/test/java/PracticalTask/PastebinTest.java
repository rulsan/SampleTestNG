package PracticalTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//        Bring It On
//        При выполнении задания необходимо использовать возможности Selenium WebDriver, юнит-тест фреймворка и концепцию Page Object. Автоматизировать следующий сценарий:
//
//        Открыть https://pastebin.com  или аналогичный сервис в любом браузере
//        Создать New Paste со следующими деталями:
//        * Код:
//        git config --global user.name  "New Sheriff in Town"
//        git reset $(git commit-tree HEAD^{tree} -m "Legacy code")
//        git push origin master --force
//
//        * Syntax Highlighting: "Bash"
//        * Paste Expiration: "10 Minutes"
//        * Paste Name / Title: "how to gain dominance among developers"
//
//        3. Сохранить paste и проверить следующее:
//        * Заголовок страницы браузера соответствует Paste Name / Title
//        * Синтаксис подвечен для bash
//        * Проверить что код соответствует введенному в пункте 2

public class PastebinTest {
    public static WebDriver driver;
    public static PastebinPage pastebinPage;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver96.exe");
        driver = new ChromeDriver();
        pastebinPage = new PastebinPage(driver);
        driver.manage().window().maximize();
        driver.get("https://pastebin.com/");
    }

    @Test
    public void createNewPaste(){
        String code = "git config --global user.name  \"New Sheriff in Town\"\n" +
                      "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                      "git push origin master --force";
        String name = "how to gain dominance among developers";

        pastebinPage.setTextArea(code);
        pastebinPage.selectSyntaxHighlighting("Bash");
        pastebinPage.selectPasteExpiration("10 Minutes");
        pastebinPage.setPasteName(name);
        pastebinPage.clickCreateNewPasteBtn();
        pastebinPage.checkTitle(name);
        pastebinPage.checkMarkeredText("git config");
        pastebinPage.checkMarkeredText("git reset");
        pastebinPage.checkMarkeredText("git push");
        pastebinPage.checkCode(code);
    }

    @AfterTest
    public void quit(){
        driver.quit();
    }

}
