package base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import settings.GoogleSettings;

import static utils.DriverFactory.getDriver;

public class BaseTest {

    private final WebDriver driver = getDriver(GoogleSettings.browserName);

    @BeforeSuite
    public void setUp() {
        driver.get(GoogleSettings.homeUrl);
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
