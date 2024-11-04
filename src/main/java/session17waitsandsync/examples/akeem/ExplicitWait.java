package session17waitsandsync.examples.akeem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class ExplicitWait {
    public static WebDriver driver = new ChromeDriver();
    static Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public static void main(String[] args) {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
        driver.manage().window().maximize();

        wait.until(visibilityOfElementLocated(By.cssSelector("a[href=\"/dynamic_loading/2\"]"))).click();
        wait.until(visibilityOfElementLocated(By.cssSelector("div[id='start'] button"))).click();
        wait.until(visibilityOfElementLocated(By.cssSelector("div[id='finish']")));

        driver.quit();
    }
}
