package session17waitsandsync.examples.Maria;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class waitStrategies {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Implicit wait
        WebElement example1 = driver.findElement(By.linkText("Example 1: Element on page that is hidden"));
        example1.click();
        WebElement startButton = driver.findElement(By.cssSelector("div[id='start']"));
        startButton.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));


        driver.quit();

        WebDriver driver2 = new ChromeDriver();

        driver2.get("https://the-internet.herokuapp.com/dynamic_loading");

        WebDriverWait wait = new WebDriverWait(driver2, Duration.ofSeconds(15), Duration.ofMillis(100));

        WebElement example2 = driver2.findElement(By.linkText("Example 2: Element rendered after the fact"));
        example2.click();

        WebElement start2 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[id='start']")));
        start2.click();

        WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
        System.out.println(text.getText());

        driver2.quit();

    }


}
