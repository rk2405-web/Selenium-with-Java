package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FindElementExample {
    public static void main(String[] args) {
    	
    	Logger.getLogger("org.openqa.selenium").setLevel(Level.SEVERE);

        // Create a new instance of Chrome browser
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open Google
        driver.get("https://www.google.com");

        // Locate the Google search bar using 'By.name'
        WebElement searchBox = driver.findElement(By.name("q"));

        // Enter text into the search bar
        searchBox.sendKeys("Selenium WebDriver tutorial");

        // Print confirmation message
        System.out.println("Text entered in the search box successfully.");

        // Close the browser
        driver.quit();
    }
}

