package PracticalTask;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class GoogleCloudPage {

    private WebDriver driver;
    private Wait wait;

    public GoogleCloudPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(5L))
                .pollingEvery(Duration.ofMillis(500L))
                .ignoring(NoSuchElementException.class);
    }

    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement searchBtn;

    @FindBy(xpath = "//b")
    private WebElement link;

    public void googleSearch(String searchRequest){
        searchBtn.click();
        searchBtn.sendKeys(searchRequest);
        searchBtn.sendKeys(Keys.ENTER);
    }

    public void clickLink(String linkText){
        wait.until(ExpectedConditions.textToBePresentInElement(link, linkText));
        driver.findElement(By.linkText(linkText)).click();
    }
    public void checkTitle(String title){
        wait.until(ExpectedConditions.titleContains(title));
    }
}
