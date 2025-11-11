package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationExample {
    public static void main(String[] args) throws InterruptedException {

        // Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 1️⃣ Open first website
        driver.get("https://www.google.com");
        System.out.println("Opened Google");
        Thread.sleep(2000);

        // 2️⃣ Navigate to another website
        driver.navigate().to("https://www.bing.com");
        System.out.println("Navigated to Bing");
        Thread.sleep(2000);

        // 3️⃣ Go back to previous page
        driver.navigate().back();
        System.out.println("Navigated back to Google");
        Thread.sleep(2000);

        // 4️⃣ Move forward to next page again
        driver.navigate().forward();
        System.out.println("Navigated forward to Bing");
        Thread.sleep(2000);

        // 5️⃣ Refresh the page
        driver.navigate().refresh();
        System.out.println("Page refreshed");
        Thread.sleep(2000);

        // Close browser
        driver.quit();
        System.out.println("Test completed successfully!");
    }
}

