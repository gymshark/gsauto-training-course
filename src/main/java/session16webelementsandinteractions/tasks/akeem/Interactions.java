package session16webelementsandinteractions.tasks.akeem;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Interactions {
    public static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        openBrowser();
        enterRegistrationForm();
        closeBrowser();
    }

    public static void enterRegistrationForm() {
        driver.findElement(By.id("firstName")).sendKeys("Miles");
        driver.findElement(By.id("lastName")).sendKeys("Morales");
        driver.findElement(By.id("userEmail")).sendKeys("miles.morales@test.com");
        driver.findElement(By.cssSelector(".custom-control-label")).click();
        driver.findElement(By.id("userNumber")).sendKeys("16468143611");
        driver.findElement(By.id("dateOfBirthInput")).click();
        driver.findElement(By.cssSelector(".react-datepicker__year-select")).sendKeys("2002");
        driver.findElement(By.cssSelector(".react-datepicker__month-select")).sendKeys("December");
        driver.findElement(By.cssSelector(".react-datepicker__day--001")).click();

        WebElement subjects = driver.findElement(By.id("subjectsInput"));
        actions().moveToElement(subjects).sendKeys(subjects,"Science").perform();
        actions().sendKeys(Keys.ENTER).perform();

        driver.findElement(By.id("hobbies-checkbox-1")).click();
        driver.findElement(By.id("currentAddress")).sendKeys("151211 123rd Street Apt #12B, New York, NY 101880");

        WebElement submitBtn = driver.findElement(By.id("submit"));
        actions().moveToElement(submitBtn)
                .click()
                .perform();

        threadSleep();

        WebElement confirmationModal = driver.findElement(By.cssSelector(".modal-content"));
        confirmationModal.isDisplayed();
    }

    public static void openBrowser() {
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
    }

    public static void closeBrowser() {
        driver.quit();
    }

    public static Actions actions() {
        return new Actions(driver);
    }

    public static void threadSleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
