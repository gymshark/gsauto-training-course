package session16webelementsandinteractions.tasks.maryam;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class selenium_interactions {

  public static void main(String[] args) {

    // launch form
    WebDriver driver = new ChromeDriver();
    driver.get("https://demoqa.com/automation-practice-form");

    // Maximize the browser window
    driver.manage().window().maximize();

    // wait for form to be visible
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("practice-form-wrapper")));


    // name , lastname and email
    driver.findElement(By.id("firstName")).sendKeys("Maryam");
    driver.findElement(By.id("lastName")).sendKeys("Adnan");
    driver.findElement(By.id("userEmail")).sendKeys("maryam.adnan@gymshark.com");


    // gender
    driver.findElement(By.cssSelector("label[for='gender-radio-2']")).click();

    // mobile number
    driver.findElement(By.id("userNumber")).sendKeys("1234567890");

    // date of birth
    driver.findElement(By.id("dateOfBirthInput")).click();
    driver.findElement(By.cssSelector(".react-datepicker__year-select")).sendKeys("1989");
    driver.findElement(By.cssSelector(".react-datepicker__month-select")).sendKeys("February");
    driver.findElement(By.cssSelector(".react-datepicker__day--018")).click();

    // select subjects
    WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
    subjectsInput.sendKeys("Maths");
    subjectsInput.sendKeys("\n");
    subjectsInput.sendKeys("English");
    subjectsInput.sendKeys("\n");
    subjectsInput.sendKeys("History");

    // select hobbies
    WebElement hobbiesReading = driver.findElement(By.id("hobbies-checkbox-2"));
    hobbiesReading.isSelected();

    WebElement hobbiesSports = driver.findElement(By.id("hobbies-checkbox-1"));
    hobbiesSports.isSelected();

    // uploadPicture
    WebElement uploadPicture = driver.findElement(By.id("uploadPicture"));
    uploadPicture.sendKeys("/Users/maryamadnan/Desktop/test.jpg");

    //EnterAddress
    WebElement address = driver.findElement(By.id("currentAddress"));
    address.sendKeys("48 MAPLETON ROAD B90 4WE");

    // scroll to bottom of the page
    JavascriptExecutor scrollToBottom = (JavascriptExecutor) driver;
    scrollToBottom.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    // submit form

    driver.findElement(By.id("submit")).click();

    // validate
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-content")));

    // close the browser
    driver.quit();

  }

}
