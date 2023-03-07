package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public final class DriverFactory {
    private static WebDriver driver;

    /**
     * This function checks if the webdriver object is null and,
     * If so it creates only one instance of it.
     *
     * @param browserName is the name of browser you want to initialize a driver for.
     * @return object of the webdriver.
     */
    public static WebDriver getDriver(String browserName) {
        if (driver == null) {
            if (browserName.equalsIgnoreCase("chrome")) {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--lang=en-GB");
                driver = new ChromeDriver(options);
            } else if (browserName.equalsIgnoreCase("firefox")) {
                FirefoxOptions options = new FirefoxOptions();
                options.addArguments("--lang=en-GB");
                driver = new FirefoxDriver(options);
            } else if (browserName.equalsIgnoreCase("edge")) {
                EdgeOptions options = new EdgeOptions();
                options.addArguments("--lang=en-GB");
                driver = new EdgeDriver(options);
            }
        }
        return driver;
    }

}
