package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomationExample {
    public static void main(String[] args) throws InterruptedException {

        // 1️⃣ Launch the browser
        WebDriver driver = new ChromeDriver();

        // 2️⃣ Maximize window
        driver.manage().window().maximize();

        // 3️⃣ Navigate to a sample login page
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // 4️⃣ Locate username & password fields and enter values
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("student");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Password123");

        // 5️⃣ Locate and click the Login button
        WebElement loginButton = driver.findElement(By.id("submit"));
        loginButton.click();

        // 6️⃣ Wait a moment for the next page (demo only)
        Thread.sleep(2000);

        // 7️⃣ Print the page title or success message
        System.out.println("Page Title after login: " + driver.getTitle());

        // Optional: verify login success by checking URL or element
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        // 8️⃣ Close browser
        driver.quit();
    }
}

