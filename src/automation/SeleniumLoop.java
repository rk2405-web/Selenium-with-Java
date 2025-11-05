package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLoop {
    public static void main(String[] args) throws InterruptedException {
    
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String[] urls = {
            "https://www.google.com",
            "https://www.bing.com",
            "https://www.yahoo.com"
        };

        for (String site : urls) {
            driver.get(site);
            System.out.println("Opened: " + site);
            System.out.println("Title: " + driver.getTitle());
            Thread.sleep(2000);
        }

        driver.quit();
        System.out.println("Test completed successfully!");
    }
}