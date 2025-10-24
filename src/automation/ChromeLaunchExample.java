
package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChromeLaunchExample {
    public static void main(String[] args) {

    	Logger.getLogger("org.openqa.selenium").setLevel(Level.SEVERE);
        // Create a ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open a website
        driver.get("https://www.google.com");

        // Print the page title
        System.out.println("Page title is: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}

