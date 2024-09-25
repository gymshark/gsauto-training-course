package session17waitsandsync.examples.kodi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaits {

  public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();

    // Open the website
    driver.get("http://the-internet.herokuapp.com/dynamic_loading");

    // Implicit wait of 10 seconds
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    // Verify header element and display its text
    WebElement header = driver.findElement(By.tagName("h3"));
    System.out.println("Display Header Name: " + header.getText());

    WebElement clickLink = driver.findElement(By.linkText("Example 1: Element on page that is hidden"));
    clickLink.click();

    WebElement clickButton = driver.findElement(By.id("start"));
    clickButton.click();

    // Reset the implicit wait to zero
    driver.manage().timeouts().implicitlyWait(Duration.ZERO);

    // Teardown
    driver.quit();
  }

}

