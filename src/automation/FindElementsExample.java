package automation;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsExample {
    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open a webpage
        driver.get("https://www.google.com");

        // Wait a bit for page to load
        Thread.sleep(2000);

        // 1️⃣ Find multiple elements — all links on the page
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        // 2️⃣ Count total links
        int totalLinks = allLinks.size();
        System.out.println("Total links found: " + totalLinks);

        // 3️⃣ Print first few link texts for reference
        for (int i = 0; i < Math.min(5, totalLinks); i++) {
            System.out.println("Link " + (i + 1) + ": " + allLinks.get(i).getText());
        }

        // Close browser
        driver.quit();
    }
}
