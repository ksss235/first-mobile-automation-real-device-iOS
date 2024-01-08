import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class AccessCodeLocators {
    WebDriver driver;
    private By firstCodeTitle = By
            .xpath("//XCUIElementTypeStaticText[@name='Set a new code']");
    private By secondCodeTitle = By
            .xpath("//XCUIElementTypeStaticText[@name='Enter the access code again']");
    private By digit1 = By
            .xpath("//XCUIElementTypeStaticText[@name='1']");
    private By digit2 = By
            .xpath("//XCUIElementTypeStaticText[@name='2']");
    private By digit3 = By
            .xpath("//XCUIElementTypeStaticText[@name='3']");
    private By digit4 = By
            .xpath("//XCUIElementTypeStaticText[@name='4']");
    private By mainScreenLocator = By
            .xpath("//XCUIElementTypeButton[@name='Cancel']");
    public AccessCodeLocators(WebDriver driver){
        this.driver = driver;
    }
    public void numPadWaiter(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(firstCodeTitle));
    }
    private void digit1Click(){
        driver.findElement(digit1).click();
    }
    private void digit2Click(){
        driver.findElement(digit2).click();
    }
    private void digit3Click(){
        driver.findElement(digit3).click();
    }
    private void digit4Click(){
        driver.findElement(digit4).click();
    }
    public void accessCodeEntering(){
        digit1Click();
        digit2Click();
        digit3Click();
        digit4Click();
    }
    public void secondAccessPasswordWait(){
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(secondCodeTitle));
    }
    public void mainScreenWait(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(mainScreenLocator));
    }
}
