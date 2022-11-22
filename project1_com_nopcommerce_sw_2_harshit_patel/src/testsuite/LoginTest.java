package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {


    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        clickOnElement(By.linkText("Log in"));
        // This is from requirement
        String expectedMessage = "Welcome, Please Sign In!";

        // Find the welcome text element and get the text

        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));

        // Validate actual and expected message
        Assert.assertEquals("Text not verified. ", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        clickOnElement(By.linkText("Log in"));
        // Find the email field element and send the email
        sendTextToElement(By.id("Email"), "Rajaram@gmail929.com");

        // Find the password field element and send the password
        sendTextToElement(By.name("Password"), "Ravanraja9123");

        // Find the login button and click on it
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        String expectedMessage = "Log out";

        // Find the Log out text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//a[@class='ico-logout']"));

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);

    }

    @Test
    public void verifyTheErrorMessage() {
        clickOnElement(By.linkText("Log in"));
        // Find the email field element and send the email
        sendTextToElement(By.id("Email"), "invalid@gmail.com");

        // Find the password field element and send the password
        sendTextToElement(By.name("Password"), "invalid123");

        // Find the login button and click on it
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        // Find the welcome text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//div[contains(@class,'message-error')]"));

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);

    }

    @After

    public void closeBrowser() {
        //to close all associated window where selenium is running test.
        driver.quit();
    }

}
