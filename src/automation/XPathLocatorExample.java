package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocatorExample {
    public static void main(String[] args) throws InterruptedException {

        // Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open a demo login page
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Locate username field using XPath and enter text
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));
        usernameField.sendKeys("student");

        // Locate password field using XPath and enter text
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        passwordField.sendKeys("Password123");

        // Locate login button using XPath and click it
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='submit']"));
        loginButton.click();

        // Wait briefly for result to load
        Thread.sleep(2000);

        // Locate success message using XPath and print it
        WebElement successMsg = driver.findElement(By.xpath("//h1[contains(text(),'Logged In Successfully')]"));
        System.out.println("Login Message: " + successMsg.getText());

        // Print page title and current URL
        System.out.println("Page Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Close the browser
        driver.quit();
    }
}

