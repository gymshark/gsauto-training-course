package session17waitsandsync.examples.akeem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
        driver.manage().window().maximize();

        driver.findElement((By.cssSelector("a[href=\"/dynamic_loading/1\"]"))).click();
        driver.findElement((By.cssSelector("div[id='start'] button"))).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement((By.cssSelector("div[id='finish']"))).isDisplayed();

        driver.quit();
    }
}
