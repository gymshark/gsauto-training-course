package session16webelementsandinteractions.examples.kodi;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Interactions {

  public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(100));
    Actions action = new Actions(driver);

    // Maximise browser
    driver.manage().window().maximize();

    // Launch form
    driver.get("https://demoqa.com/automation-practice-form");

    // Forename, surname, email
    driver.findElement(By.id("firstName")).sendKeys("Kodi-Lee");
    driver.findElement(By.id("lastName")).sendKeys("Johnson");
    driver.findElement(By.id("userEmail")).sendKeys("k.johnson@gymshark.com");

    // Gender
    driver.findElement(By.cssSelector("label[for='gender-radio-1']")).click();

    // Mobile number
    driver.findElement(By.id("userNumber")).sendKeys("1234567890");

    // DOB
    driver.findElement(By.id("dateOfBirthInput")).click();
    driver.findElement(By.cssSelector(".react-datepicker__year-select")).sendKeys("1989");
    driver.findElement(By.cssSelector(".react-datepicker__month-select")).sendKeys("January");
    driver.findElement(By.cssSelector(".react-datepicker__day--018")).click();

    // Subjects
    WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
    subjectsInput.sendKeys("Maths");
    subjectsInput.sendKeys("\n");
    subjectsInput.sendKeys("Physics");
    subjectsInput.sendKeys("\n");
    subjectsInput.sendKeys("Commerce");
    subjectsInput.sendKeys("\n");

    // Select hobbies
    WebElement option1 = driver.findElement(By.id("hobbies-checkbox-1"));
    action.moveToElement(option1).click();
    WebElement option3 = driver.findElement(By.id("hobbies-checkbox-3"));
    action.moveToElement(option3).click();

    //driver.findElement(By.cssSelector("input[id='hobbies-checkbox-3']")).click();
    //driver.findElement(By.id("hobbies-checkbox-1")).click();
    //driver.findElement(By.id("hobbies-checkbox-3")).click();

    // Upload picture
    WebElement uploadPicture = driver.findElement(By.id("uploadPicture"));
    uploadPicture.sendKeys("/Users/kodi-leejohnson/Desktop/test.png");

    // Enter address
    driver.findElement(By.id("currentAddress")).sendKeys("3 Central Boulevard, Birmingham, UK");

    // Scroll to bottom of page
    JavascriptExecutor scrollToBottom = (JavascriptExecutor) driver;
    scrollToBottom.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    // Submit form
    driver.findElement(By.id("submit")).click();

    // Verify that a submission confirmation appears and output title
    WebElement completeForm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("example-modal-sizes-title-lg")));
    System.out.println("Form completed: " + completeForm.getText());

    // Close form
    driver.findElement(By.id("closeLargeModal")).click();

    // Teardown
    driver.quit();

  }
}
