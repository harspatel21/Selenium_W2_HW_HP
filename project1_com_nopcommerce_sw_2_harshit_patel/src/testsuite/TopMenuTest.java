package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        clickOnElement(By.linkText("Computers"));

        // This is from requirement
        String expectedMessage = "Computers";

        // Find the Computer element and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Computers')]"));

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Computers page", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        clickOnElement(By.linkText("Electronics"));

        // This is from requirement
        String expectedMessage = "Electronics";

        // Find the Electronics element and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Electronics')]"));

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Electronics page", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfull() {
        clickOnElement(By.linkText("Apparel"));

        // This is from requirement
        String expectedMessage = "Apparel";

        // Find the Apparel element and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Apparel')]"));

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Apparel page", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull() {
        clickOnElement(By.linkText("Digital downloads"));

        // This is from requirement
        String expectedMessage = "Digital downloads";

        // Find the Digital downloads element and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Digital downloads page", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        clickOnElement(By.linkText("Books"));

        // This is from requirement
        String expectedMessage = "Books";

        // Find the Books element and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Books')]"));

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Books page", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        clickOnElement(By.linkText("Jewelry"));

        // This is from requirement
        String expectedMessage = "Jewelry";

        // Find the Jewelry element and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Jewelry')]"));

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Jewelry page", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        clickOnElement(By.linkText("Gift Cards"));

        // This is from requirement
        String expectedMessage = "Gift Cards";

        // Find the Gift Cards element and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Gift Cards page", expectedMessage, actualMessage);
    }

    @After

    public void closeBrowser() {
        //to close all associated window where selenium is running test.
        driver.quit();
    }

}
