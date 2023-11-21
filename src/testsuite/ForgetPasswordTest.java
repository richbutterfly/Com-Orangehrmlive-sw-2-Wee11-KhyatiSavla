package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * 4. Write down the following test into
 * ‘ForgotPasswordTest’ class
 * 1. userShouldNavigateToForgotPasswordPageSuccessfully
 * click on the ‘Forgot your password’ link
 * Verify the text ‘Reset Password’
 */
public class ForgetPasswordTest extends BaseTest {

    String baseURL = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseURL);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        // Find the Forgot your password link and click on it
        driver.findElement(By.xpath("//p[text() ='Forgot your password? ']")).click();
        String expectedMessage = "Reset Password";
        String actualMessage = driver.findElement(By.xpath("//h6[text() = 'Reset Password']")).getText();
        // Validate expected and actual message
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
