package session17waitsandsync.examples.akshatha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {

  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("http://the-internet.herokuapp.com/dynamic_loading");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15), Duration.ofMillis(100));

    WebElement example2 = driver.findElement(Locators.EXAMPLE_2);
    example2.click();

    WebElement startButton = wait.until(ExpectedConditions.elementToBeClickable(Locators.START_BUTTON));
    startButton.click();

    WebElement finishText = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.FINISH_TEXT));
    finishText.getText();
    System.out.println(finishText);

    driver.quit();
  }
}
