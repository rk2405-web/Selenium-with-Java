package automation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickLinksExample {
    public static void main(String[] args) throws InterruptedException {

        // Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open the demo site
        driver.get("https://www.practiceselenium.com/"); // sample site with multiple links
        Thread.sleep(2000);

        // Find all links on the page
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total links found: " + allLinks.size());

        // Loop through the first few links and click each one
        for (int i = 0; i < Math.min(5, allLinks.size()); i++) {
            WebElement link = allLinks.get(i);
            String linkText = link.getText();

            // Skip empty links (some links have no visible text)
            if (linkText.isEmpty()) {
                continue;
            }

            System.out.println("Clicking link: " + linkText);
            link.click();

            Thread.sleep(2000); // wait to load the page

            System.out.println("Page title after click: " + driver.getTitle());

            // Navigate back to main page to click next link
            driver.navigate().back();
            Thread.sleep(2000);

            // Re-fetch links after navigation (important!)
            allLinks = driver.findElements(By.tagName("a"));
        }

        // Close browser
        driver.quit();
        System.out.println("✅ Test completed successfully!");
    }
}

