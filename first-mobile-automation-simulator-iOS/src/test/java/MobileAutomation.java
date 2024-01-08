import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
public class MobileAutomation {
    private IOSDriver driver;

    @Before
    public void setCapatibilities() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:deviceName", "iPhone 15");
        capabilities.setCapability("appium:platformName", "iOS");
        capabilities.setCapability("appium:platformVersion", "17.2");
        capabilities.setCapability("appium:udid", "076064C3-90D3-4849-ABFC-8AB9210D980F");
        capabilities.setCapability("appium:automationName", "xcuitest");
        capabilities.setCapability("appium:xcodeOrgId", "N8WXG988VJ");
        capabilities.setCapability("appium:xcodeSigningId", "Apple Developer");
        capabilities.setCapability("appium:updatedWDABundleId", "my.setting.WebDriverAgentRunner");
        capabilities.setCapability("appium:usePreinstalledWDA", false);
        capabilities.setCapability("appium:wdaLaunchTimeout", 120000);
        capabilities.setCapability("appium:showXcodeLog", true);
        capabilities.setCapability("appium:bundleId", "kz.bcc.starbankingtest");
        capabilities.setCapability("appium:newCommandTimeout", 3600);
        capabilities.setCapability("appium:connectHardwareKeyboard", true);

        driver = new IOSDriver(new URL("http://127.0.0.1:4723"), capabilities);
    }

    @Test
    public void SimulatorLoginTest() {
        UnauthorizedZoneLocators unauthorizedZoneLocators = new UnauthorizedZoneLocators(driver);
        unauthorizedZoneLocators.unauthorizedZoneWait();
        unauthorizedZoneLocators.unauthorizedActionClick();

        LoginScreenLocators loginScreenLocators = new LoginScreenLocators(driver);
        loginScreenLocators.loginScreenWait();

        GitIgnorePassword gitIgnorePassword = new GitIgnorePassword();
        loginScreenLocators.loginProcess(gitIgnorePassword.phoneNumber, gitIgnorePassword.password);

        AccessCodeLocators accessPasswordLocators = new AccessCodeLocators(driver);
        accessPasswordLocators.numPadWaiter();
        accessPasswordLocators.accessCodeEntering();
        accessPasswordLocators.secondAccessPasswordWait();
        accessPasswordLocators.accessCodeEntering();
        accessPasswordLocators.mainScreenWait();
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
