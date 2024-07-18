package session17waitsandsync.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static session16webelementsandinteractions.examples.Locators.DATE_OF_BIRTH;

public class ExplicitWaits {

  public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(100));

    driver.get("https://demoqa.com/automation-practice-form");
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(DATE_OF_BIRTH));
    element.click();
  }
}