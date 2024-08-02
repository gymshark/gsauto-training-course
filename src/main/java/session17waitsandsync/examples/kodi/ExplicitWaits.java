package session17waitsandsync.examples.kodi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaits {

  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new ChromeDriver();

    driver.get("https://the-internet.herokuapp.com/dynamic_loading");

    // Verify header element and display its text
    WebElement header = driver.findElement(By.tagName("h3"));
    System.out.println("Display Header Name: " + header.getText());

    // Navigate to "Example 2: Element rendered after the Fact"
    WebElement clickLink = driver.findElement(By.linkText("Example 2: Element rendered after the fact"));
    clickLink.click();

    // Set up an explicit wait
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    // Wait for the start button to be clickable and click it
    WebElement startButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#start button")));
    startButton.click();

    // Wait for the final text to be visible
    WebElement finishText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
    System.out.println("Finish: " + finishText.getText());

    // Teardown
    driver.quit();
  }

}
