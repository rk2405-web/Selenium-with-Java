package automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMultipleURLsExample {
    public static void main(String[] args) throws InterruptedException {

        // Create a Chrome browser instance
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Array of URLs to visit
        String[] urls = {
                "https://www.google.com",
                "https://www.bing.com",
                "https://www.yahoo.com",
                "https://www.duckduckgo.com"
        };

        // Loop through each URL
        for (String url : urls) {
            driver.get(url); // Open the website
            System.out.println("Opened: " + url);
            System.out.println("Page Title: " + driver.getTitle());
            Thread.sleep(2000); // Wait 2 seconds before opening next
        }

        // Close the browser
        driver.quit();

        System.out.println("\nAll URLs visited successfully!");
    }
}

