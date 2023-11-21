package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 2. Create the package ‘testsuite’ and create the
 * following classes inside the ‘testsuite’ package.
 * 1. LoginTest
 * 2. ForgotPasswordTest
 * 3. Write down the following test into ‘LoginTest’ class
 * 1. userSholdLoginSuccessfullyWithValidCredentials
 * Enter “Admin” username
 * Enter “admin123 password
 * Click on ‘LOGIN’ button
 * Verify the ‘Dashboard’ text is display
 */
public class LoginTest extends BaseTest {
    String baseURL = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseURL);
    }

    @Test
    public void userShouldLogInSuccessfullyWithValidCredentials() {
        // Find the username field and type the email address
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("Admin");
        // Find the password field and type the password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");
        // Find the Login button and click on it
        WebElement loginBtn = driver.findElement(By.xpath("//button[starts-with(@class, 'oxd-button')]"));
        loginBtn.click();
        String expectedText = "Dashboard";
        // Validate actual and expected text
        String actualText = driver.findElement(By.xpath("//h6")).getText();
        Assert.assertEquals(expectedText, actualText);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
