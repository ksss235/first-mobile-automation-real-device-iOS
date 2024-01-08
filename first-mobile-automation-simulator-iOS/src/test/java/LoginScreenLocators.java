import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class LoginScreenLocators {
    private WebDriver driver;
    private By phoneField = By
            .xpath("//XCUIElementTypeTextField[@value='+7 (_ _ _) _ _ _  _ _  _ _']");
    private By continueButton = By
            .xpath("//XCUIElementTypeStaticText[@name='Continue']");
    private By passwordField = By
            .xpath("//XCUIElementTypeSecureTextField[@value='Enter password']");
    private By doneKeyboardButton = By
            .xpath("//XCUIElementTypeButton[@name='Done']");
    public LoginScreenLocators(WebDriver driver){
        this.driver = driver;
    }
    public void loginScreenWait(){
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(phoneField));
    }
    private void setPhoneField(String phone){
        driver.findElement(phoneField).sendKeys(phone);
    }
    private void doneKeyboardButtonClick(){
        driver.findElement(doneKeyboardButton).click();
    }
    private void continueButtonClick(){
        driver.findElement(continueButton).click();
    }
    public void passwordFieldWait(){
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(passwordField));
    }
    public void passwordFieldClick(){
        driver.findElement(passwordField).click();
    }
    private void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void loginProcess(String phone, String password) {
        setPhoneField(phone);
        doneKeyboardButtonClick();
        continueButtonClick();
        passwordFieldWait();
        passwordFieldClick();
        setPasswordField(password);
        doneKeyboardButtonClick();
        continueButtonClick();
    }
}
