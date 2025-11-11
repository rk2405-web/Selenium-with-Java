package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;

public class MiniProjectWeek3 {

    public static void main(String[] args) throws InterruptedException {

        // Step 1: Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or sentence: ");
        String input = sc.nextLine();

        // Step 2: Analyze string - count vowels
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) != -1) {
                vowelCount++;
            }
        }
        System.out.println("Total vowels in the input: " + vowelCount);
        sc.close();

        // Step 3: Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Step 4: Open demo form site
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        Thread.sleep(2000);

        // Step 5: Fill form fields
        WebElement textBox = driver.findElement(By.name("my-text"));
        textBox.sendKeys(input);

        WebElement passwordBox = driver.findElement(By.name("my-password"));
        passwordBox.sendKeys("Password123");

        WebElement textArea = driver.findElement(By.name("my-textarea"));
        textArea.sendKeys("This is a Selenium automation demo project.");

        // Step 6: Submit the form
        WebElement submitButton = driver.findElement(By.tagName("button"));
        submitButton.click();

        Thread.sleep(2000);

        // Step 7: Validate and print result
        String pageTitle = driver.getTitle();
        System.out.println("Form submitted! Page title is: " + pageTitle);

        // Close browser
        driver.quit();
        System.out.println("✅ Mini Project completed successfully!");
    }
}

