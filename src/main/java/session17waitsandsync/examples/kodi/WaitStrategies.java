package session17waitsandsync.examples.kodi;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WaitStrategies {

  public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();

    // Open the website
    driver.get("http://the-internet.herokuapp.com/dynamic_loading");

    // Set up an implicit wait of 10 seconds
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    // Verify header element and display its text
    WebElement header = driver.findElement(By.tagName("h3"));
    System.out.println("Display Header Name: " + header.getText());

    // Navigate to "Example 1: Element on page that is hidden"
    WebElement clickLink = driver.findElement(By.linkText("Example 1: Element on page that is hidden"));
    clickLink.click();

    // find start button then click it
    WebElement startButton = driver.findElement(By.id("start"));
    startButton.click();

    // Reset the implicit wait to zero
    driver.manage().timeouts().implicitlyWait(Duration.ZERO);

    // Navigate back to main page
    driver.navigate().back();

    // Verify header element and display its text
    WebElement header2 = driver.findElement(By.tagName("h3"));
    System.out.println("Display Header Name 2: " + header2.getText());

    // Navigate to "Example 2: Element rendered after the Fact"
    WebElement clickLink2 = driver.findElement(By.linkText("Example 2: Element rendered after the fact"));
    clickLink2.click();

    // Set up an explicit wait of 20 seconds
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    // Wait for the start button to be clickable and then click it
    WebElement startButton2 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#start button")));
    startButton2.click();

    // Wait for the final text to be visible
    WebElement finishText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
    System.out.println("Finish: " + finishText.getText());

    // Teardown
    driver.quit();
  }

}


