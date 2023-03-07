package pages;

import org.openqa.selenium.WebDriver;
import settings.GoogleSettings;

import static locators.GoogleLocators.*;
import static utils.DriverFactory.getDriver;

public class GooglePage {

    private final WebDriver driver = getDriver(GoogleSettings.browserName);

    //Prevent instance
    private GooglePage() {

    }

    public static GooglePage getGooglePage() {
        return new GooglePage();
    }

    public GooglePage sendTextToSearchBar(String searchedWord) {
        driver.findElement(SEARCH_BAR_LOCATOR.by()).sendKeys(searchedWord);
        return this;
    }

    public GooglePage clickOnSearchButton() {
        driver.findElement(SEARCH_BUTTON_LOCATOR.by()).click();
        return this;
    }

    public String getAboutValue(){
        return driver.findElement(ABOUT_LOCATOR.by()).getText();
    }
}
