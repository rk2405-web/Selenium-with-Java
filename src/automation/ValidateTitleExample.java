package automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateTitleExample {
    public static void main(String[] args) throws InterruptedException {

        // 1️⃣ Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2️⃣ Navigate to website
        driver.get("https://www.google.com");

        // 3️⃣ Expected and actual titles
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        // 4️⃣ Compare the titles
        System.out.println("Expected Title: " + expectedTitle);
        System.out.println("Actual Title: " + actualTitle);

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("✅ Test Passed: Title matches expected value.");
        } else {
            System.out.println("❌ Test Failed: Title does not match expected value.");
        }

        // 5️⃣ Wait for a few seconds to observe (optional)
        Thread.sleep(2000);

        // 6️⃣ Close the browser
        driver.quit();
    }
}

