package test;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.GooglePage;

import static org.testng.Assert.assertTrue;
import static pages.GooglePage.getGooglePage;

public class GoogleTest extends BaseTest {
    GooglePage googlePage = getGooglePage();

    @Test
    public void test() {

        String expectedResult = "About";
        String actualResult = googlePage
                .sendTextToSearchBar("Facebook")
                .clickOnSearchButton()
                .getAboutValue();
        System.out.println(actualResult);
        assertTrue(actualResult.contains(expectedResult), "Failed");
    }
}
