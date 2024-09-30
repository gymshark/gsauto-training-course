package session17waitsandsync.examples.akshatha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {

  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get("http://the-internet.herokuapp.com/dynamic_loading");
    WebElement example1 = driver.findElement(Locators.EXAMPLE_1);
    example1.click();

    WebElement startButton = driver.findElement(Locators.START_BUTTON);
    startButton.isDisplayed();

    driver.quit();
  }
}
