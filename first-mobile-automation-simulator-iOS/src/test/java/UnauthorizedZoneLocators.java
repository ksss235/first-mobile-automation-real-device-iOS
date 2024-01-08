import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class UnauthorizedZoneLocators {
    private WebDriver driver;
    private By someActionButton = By.xpath("//XCUIElementTypeStaticText[@name='Open a new card ']");
    public UnauthorizedZoneLocators(WebDriver driver) {
        this.driver = driver;
    }

    public void unauthorizedZoneWait() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(someActionButton));
    }

    public void unauthorizedActionClick() {
        driver.findElement(someActionButton).click();
    }
}
