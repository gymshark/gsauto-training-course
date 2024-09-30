package session17waitsandsync.examples.maryam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WaitStrategies {

  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();

    // open the website
    driver.get("http://the-internet.herokuapp.com/dynamic_loading");
    // setup an implicit wait for 10 seconds
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    // verify the page header

    WebElement header = driver.findElement(By.tagName("h3"));
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    System.out.println("Display header name: " + header.getText());

    // navigate to example 1
    WebElement examplelink1 = driver.findElement(By.linkText("Example 1: Element on page that is hidden"));
    examplelink1.click();

    // add implicit wait of 10 seconds
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    // click the start button

    WebElement StartButton = driver.findElement(By.cssSelector("#start button"));
    StartButton.click();
    // Explicit wait for the hidden element to be visible and have text
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement hiddenElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
    // printing the text
    String hiddenText = hiddenElement.getText();
    System.out.println("Hidden Element Text: " + hiddenText);

    // Reset the implicit wait to zero

    driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

    // navigate back to main page
    driver.navigate().back();

    //verify the header
    WebElement header2 = driver.findElement(By.tagName("h3"));
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    System.out.println("Display header name: " + header2.getText());

    // navigate to second link
    WebElement examplelink2 = driver.findElement(By.linkText("Example 2: Element rendered after the fact"));
    examplelink2.click();

    WebElement startbutton2 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#start button")));
    startbutton2.click();

    WebElement finalText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
    System.out.println("Hidden element text 2 " + finalText.getText());

    driver.quit();


  }
}
