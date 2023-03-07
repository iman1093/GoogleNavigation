package locators;

import org.openqa.selenium.By;

public enum GoogleLocators {
    SEARCH_BAR_LOCATOR(By.name("q")),
    SEARCH_BUTTON_LOCATOR(By.xpath("(//input[@name='btnK'])[2]")),
    ABOUT_LOCATOR(By.id("result-stats"));
    private final By locator;

    GoogleLocators(By locator) {
        this.locator = locator;
    }

    public By by() {
        return this.locator;
    }
}
