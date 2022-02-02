package PracticalTask;

import jdk.jshell.spi.ExecutionControl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;

public class PastebinPage {

    private WebDriver driver;
    private Wait wait;

    public PastebinPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new FluentWait<WebDriver>(driver);
    }

    @FindBy(id = "postform-text")
    private WebElement textArea;

    @FindBy(xpath = "//span[@id='select2-postform-format-container']/following::span")
    private WebElement SyntaxHighlightingCORNER;

    @FindBy(xpath = "//strong[text()='------ POPULAR LANGUAGES -------']/following::ul/li")
    private List<WebElement> SyntaxHighlightingDropdown;

    public void selectSyntaxHighlighting(String itemToBeSelected){
        SyntaxHighlightingCORNER.click();
        for (WebElement dropdownListElement : SyntaxHighlightingDropdown) {
            if (itemToBeSelected.equals(dropdownListElement.getText())){
                dropdownListElement.click();
                break;
            }
        }

    }

    @FindBy(xpath = "//span[@id='select2-postform-expiration-container']/following::span")
    private WebElement PasteExpirationCORNER;

    @FindBy(xpath = "//ul[@id='select2-postform-expiration-results']/li")
    private List<WebElement> pasteExpirationDropdown;

    public void selectPasteExpiration(String itemToBeSelected){
        PasteExpirationCORNER.click();
        for (WebElement dropdownListElement : pasteExpirationDropdown) {
            if (itemToBeSelected.equals(dropdownListElement.getText())){
                dropdownListElement.click();
                break;
            }
        }

    }

    @FindBy(id = "postform-name")
    private WebElement pasteName;

    @FindBy(xpath = "//button[text()='Create New Paste']")
    private WebElement createNewPasteBtn;

    @FindBy(xpath = "//span[@class='kw2']")
    private WebElement codeMarker;

    public void setTextArea(String text){
        textArea.sendKeys(text);
    }

    public void setPasteName(String text){
        pasteName.sendKeys(text);
    }

    public void checkMarkeredText(String text){
        wait.until(ExpectedConditions.textToBePresentInElement(codeMarker, text));
    }

    public void clickCreateNewPasteBtn(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", createNewPasteBtn);
        createNewPasteBtn.click();
    }

    public void checkTitle(String title){
        wait.until(ExpectedConditions.titleContains(title));
    }

    public void checkCode(String code){
        new ExecutionControl.NotImplementedException("It will be done soon!");
    }
}
