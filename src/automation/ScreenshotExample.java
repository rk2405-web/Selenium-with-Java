package automation;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotExample {
    public static void main(String[] args) throws IOException, InterruptedException {

        // 1️⃣ Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2️⃣ Navigate to a webpage
        driver.get("https://www.google.com");

        // 3️⃣ Wait a moment (optional)
        Thread.sleep(2000);

        // 4️⃣ Capture screenshot using TakesScreenshot interface
        TakesScreenshot screenshot = (TakesScreenshot) driver;

        // 5️⃣ Store screenshot as a File
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

        // 6️⃣ Define destination path (change folder if needed)
        File destFile = new File("C:\\selenium_screenshots\\google_homepage.png");

        // 7️⃣ Copy the file to destination
        FileHandler.copy(srcFile, destFile);

        System.out.println("✅ Screenshot captured successfully at: " + destFile.getAbsolutePath());

        // 8️⃣ Close browser
        driver.quit();
    }
}
