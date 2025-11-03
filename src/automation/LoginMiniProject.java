package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginMiniProject {
    public static void main(String[] args) throws InterruptedException {

        // 1️⃣ Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2️⃣ Navigate to demo login page
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // 3️⃣ Enter username
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("student");

        // 4️⃣ Enter password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Password123");

        // 5️⃣ Click Login button
        WebElement loginButton = driver.findElement(By.id("submit"));
        loginButton.click();

        // 6️⃣ Wait a few seconds for the page to load
        Thread.sleep(2000);

        // 7️⃣ Validate the page title after login
        String expectedTitle = "Logged In Successfully | Practice Test Automation";
        String actualTitle = driver.getTitle();

        System.out.println("Expected Title: " + expectedTitle);
        System.out.println("Actual Title: " + actualTitle);

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("✅ Test Passed: Login successful and title is correct.");
        } else {
            System.out.println("❌ Test Failed: Title did not match. Login might have failed.");
        }

        // 8️⃣ Optional: Print success message on the page
        WebElement successMsg = driver.findElement(By.xpath("//h1[contains(text(),'Logged In Successfully')]"));
        System.out.println("Message on page: " + successMsg.getText());

        // 9️⃣ Close the browser
        driver.quit();
    }
}

