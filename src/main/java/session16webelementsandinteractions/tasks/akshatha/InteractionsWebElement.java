package session16webelementsandinteractions.tasks.akshatha;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InteractionsWebElement {

  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://demoqa.com/automation-practice-form");
    driver.manage().window().maximize();
    Actions action = new Actions(driver);

    WebElement firstName = driver.findElement(Locators.FIRST_NAME);
    firstName.sendKeys("Akshatha");

    WebElement lastName = driver.findElement(Locators.LAST_NAME);
    lastName.sendKeys("Shivananjappa");

    WebElement email = driver.findElement(Locators.EMAIL);
    email.sendKeys("akshatha.shivananjappa@gymshark.com");

    WebElement gender = driver.findElement(Locators.GENDER_FEMALE);
    action.moveToElement(gender).click().perform();

    WebElement dateOfBirth = driver.findElement(Locators.DATE_OF_BIRTH);
    action.moveToElement(dateOfBirth).click().perform();
    dateOfBirth.sendKeys(Keys.ENTER);

    WebElement mobileNumber = driver.findElement(Locators.MOBILE_NUMBER);
    action.moveToElement(mobileNumber).click().perform();
    mobileNumber.sendKeys("07777777777");

    WebElement subjects = driver.findElement(Locators.SUBJECTS_TEXTBOX);
    action.moveToElement(subjects).click().perform();
    subjects.sendKeys("History");

    WebElement hobbies1 = driver.findElement(Locators.HOBBIES_CHECKBOX_1);
    action.moveToElement(hobbies1).click().perform();
    WebElement hobbies2 = driver.findElement(Locators.HOBBIES_CHECKBOX_2);
    action.moveToElement(hobbies2).click().perform();

    WebElement uploadPicture = driver.findElement(Locators.PICTURES);
    action.moveToElement(uploadPicture).click().perform();

    WebElement addressTextBox = driver.findElement(Locators.ADDRESS_TEXTBOX);
    addressTextBox.sendKeys("Gymshark, Solihull");

    WebElement submit = driver.findElement(Locators.SUBMIT_BUTTON);
    submit.click();

    WebElement confirmationText = driver.findElement(Locators.CONFIRMATION_TEXT);
    driver.getWindowHandle();
    confirmationText.isDisplayed();

    driver.quit();

  }
}
