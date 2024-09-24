package session17waitsandsync.examples.fatima;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class implicitWait {

  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/dynamic_loading");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    //Implicit wait
    WebElement example1 = driver.findElement(By.linkText("Example 1: Element on page that is hidden"));
    example1.click();
    WebElement startButton = driver.findElement(By.id("start"));
    startButton.click();
    WebElement helloWorld = driver.findElement(By.id("finish"));
    System.out.println(helloWorld.getText());


  }

}
