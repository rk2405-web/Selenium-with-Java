package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonClickExample {
    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open a demo login page
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Enter username
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("student");

        // Enter password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");

        // Locate and click the Submit button
        WebElement loginButton = driver.findElement(By.id("submit"));
        loginButton.click();

        // Wait for page to load (for demo only)
        Thread.sleep(2000);

        // Print confirmation
        System.out.println("Login button clicked successfully!");
        System.out.println("Current Page Title: " + driver.getTitle());

        // Close browser
        driver.quit();
    }
}

