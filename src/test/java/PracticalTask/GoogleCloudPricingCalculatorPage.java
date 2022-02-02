package PracticalTask;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class GoogleCloudPricingCalculatorPage {
    private WebDriver driver;
    private Wait wait;

    public GoogleCloudPricingCalculatorPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(5L))
                .pollingEvery(Duration.ofMillis(500L))
                .ignoring(NoSuchElementException.class);
    }

    @FindBy(id = "input_77")
    private WebElement quantity;

    public void setQuantity(String q){
        wait.until(ExpectedConditions.elementToBeClickable(quantity));
        quantity.click();
        quantity.sendKeys(q);
    }

}
