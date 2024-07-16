package session17waitsandsync.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static session16webelementsandinteractions.examples.Locators.DATE_OF_BIRTH;

public class ImplicitWait {

  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get("https://demoqa.com/automation-practice-form");

    WebElement element = driver.findElement(DATE_OF_BIRTH);
    element.click();
  }
}