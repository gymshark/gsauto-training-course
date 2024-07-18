package session17waitsandsync.examples.fatima;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class explicitWait {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading");

        WebElement example2 = driver.findElement(By.linkText("Example 2: Element rendered after the fact"));
        example2.click();

        WebElement startButton = driver.findElement(By.id("start"));
        startButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(100));
        WebElement helloWorld = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
        System.out.println(helloWorld.getText());


    }
}
