package session16webelementsandinteractions.tasks.fatima;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//3.	Verify that a submission confirmation appears.


public class InteractionsFatima {

  public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();

    driver.get("https://demoqa.com/automation-practice-form");

    WebElement firstName = driver.findElement(By.id("firstName"));
    firstName.sendKeys("Fatima");

    WebElement lastName = driver.findElement(By.cssSelector("#lastName"));
    lastName.sendKeys("Farah");

    WebElement email = driver.findElement(By.id("userEmail"));
    email.sendKeys("fatima.test@test.com");

    WebElement female = driver.findElement(By.cssSelector(".custom-control-input #gender-radio-2"));
    female.click();

    WebElement mobileNumber = driver.findElement(By.id("userNumber"));
    mobileNumber.sendKeys("0121333222");

    WebElement dateOfBirth = driver.findElement(By.id("dateOfBirthInput"));
    dateOfBirth.click();
    WebElement yearpicker1993 = driver.findElement(By.cssSelector(".react-datepicker__year-select 1993"));
    yearpicker1993.click();
    WebElement monthpickerSeptember = driver.findElement(By.cssSelector(".react-datepicker__month-select 9"));
    monthpickerSeptember.click();
    WebElement datePickerSeptember25 = driver.findElement(By.className("react-datepicker__day react-datepicker__day--025 " +
      "react-datepicker__day--weekend"));
    datePickerSeptember25.click();


    WebElement subjects = driver.findElement(By.id("subjectsContainer"));
    subjects.sendKeys("Hi");
    subjects.sendKeys("english");
    subjects.sendKeys("ma");

    WebElement sports = driver.findElement(By.id("hobbies-checkbox-1"));
    sports.click();
    WebElement reading = driver.findElement(By.id("hobbies-checkbox-2"));
    reading.click();
    WebElement music = driver.findElement(By.id("hobbies-checkbox-3"));
    music.click();

    WebElement choosePictureFile = driver.findElement(By.id("uploadPicture"));
    choosePictureFile.click();

    WebElement address = driver.findElement(By.id("currentAddress"));
    address.sendKeys("current test address. B99 666");

//        WebElement submitButton = driver.findElement(By.cssSelector(".btn btn-primary"));
//        submitButton.click();


  }
}