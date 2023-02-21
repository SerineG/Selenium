package technostudyB7.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import technostudyB7.Utilities.UtilityClass;

import java.time.Duration;

public class Example3 extends UtilityClass{
    public static void main(String[] args) {
        driver.get("https://phptravels.net/");

        WebElement accountButton = driver.findElement(By.id("ACCOUNT"));
        accountButton.click();

        WebElement customerSignUpButton = driver.findElement(By.xpath("//a[text()='Customer Signup']"));
        customerSignUpButton.click();

        WebElement nameInput = driver.findElement(By.name("first_name"));
        nameInput.sendKeys("John");

        WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastName.sendKeys("Doe");

        WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys("6142859409");

        WebElement email = driver.findElement(By.cssSelector("input[placeholder='Email']"));
        email.sendKeys("gdgdgd@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("qwerty12345");

//        WebElement iAnNotARobotCheckBox = driver.findElement(By.id("recaptcha-anchor"));
//        iAnNotARobotCheckBox.click();

        WebElement cookiesButton = driver.findElement(By.id("cookie_stop"));
        cookiesButton.click();
        WebElement signUpButton = driver.findElement(By.id("button"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(signUpButton));
        signUpButton.click();

    }

    /** Navigate to https://www.phptravels.net
     * Click on Account button
     * Click on Customer Sign Up
     * Fill the form
     * Check the "I am not robot" check box
     * Click on Sign Up button
     * Check if the title is "Login - PHPTRAVELS"
     * Enter same login information that you used during registration and click login
     * Verify the welcome message contains the first name that you used during registration then close the browser
     *
     * Note: You can use any locator you want.
     * */
}
