package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //Click on Register tab
        clickOnElement(By.linkText("Register"));

        // This is from requirement
        String expectedMessage = "Register";

        // Find the Register element and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Register')]"));

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Register page", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //Click on Register tab
        clickOnElement(By.linkText("Register"));
        // Choosing Male radiobutton
        clickOnElement(By.xpath("//input[@type='radio' and @value='M']"));
        //Sending value to First name textbox
        sendTextToElement(By.xpath("//input[@id='FirstName']"), "Rajaram");
        //Sending value to Last name textbox
        sendTextToElement(By.xpath("//input[@id='LastName']"), "RamRavan");
        //Sending value to Date menu
        clickOnElement(By.xpath("//select[@name='DateOfBirthDay']/option[@value='19']"));
        //Sending value to Month menu
        clickOnElement(By.xpath("//select[@name='DateOfBirthMonth']/option[@value='9']"));
        //Sending value to Year menu
        clickOnElement(By.xpath("//select[@name='DateOfBirthYear']/option[@value='1990']"));
        //Sending value to email id
        sendTextToElement(By.xpath("//input[@id='Email']"), "Rajaram@gmail929.com");
        //Sending value to Password
        sendTextToElement(By.xpath("//input[@id='Password']"), "Ravanraja9123");
        //Sending value to confirm Password
        sendTextToElement(By.xpath("//input[@id='ConfirmPassword']"), "Ravanraja9123");
        //Clicking on Registered Button
        clickOnElement(By.xpath("//button[@id='register-button']"));

        //Expected Message
        String expectedMessage = "Your registration completed";
        // Find the Register element and get the text
        String actualMessage = getTextFromElement(By.xpath("//div[@class='result']"));

        // Validate actual and expected message
        Assert.assertEquals("Registration is not successfully", expectedMessage, actualMessage);

    }

    @After

    public void closeBrowser() {
        //to close all associated window where selenium is running test.
        driver.quit();
    }

}
