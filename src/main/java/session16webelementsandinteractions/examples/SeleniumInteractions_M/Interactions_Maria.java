package session16webelementsandinteractions.examples.SeleniumInteractions_M;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Interactions_Maria {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");


        driver.manage().window().maximize();

        WebElement hobbies3 = driver.findElement(Locate.HOBBIES_CHECKBOX3);
        Actions action2= new Actions(driver);

        action2.moveToElement(hobbies3).click().perform();



        WebElement firstName = driver.findElement(Locate.FIRST_NAME_TEXT);
        firstName.sendKeys("Maria");

        WebElement lastName = driver.findElement(Locate.LAST_NAME);
        lastName.sendKeys("Prabhakar");
        WebElement email = driver.findElement(Locate.EMAIL);
       email.sendKeys("maria.prabhakar@gymshark.com");

        WebElement gender_female = driver.findElement(Locate.GENDER_FEMALE);
        action2.moveToElement(gender_female).click().perform();
       WebElement mobileNumber = driver.findElement(Locate.MOBILE_NUM);
       mobileNumber.sendKeys("07567789048");

       WebElement dobPicker = driver.findElement(Locate.DOB_PICKER);
    action2.moveToElement(dobPicker).click().perform();
        WebElement date = driver.findElement(Locate.DATE);
date.click();
date.sendKeys(Keys.ENTER);

WebElement subjects = driver.findElement(Locate.SUBJECTS);
subjects.click();
subjects.sendKeys("Chemistry");




        WebElement upload_pic= driver.findElement(Locate.UPLOAD_BUTTON);
        action2.scrollToElement(upload_pic).click().perform();
        upload_pic.sendKeys(Keys.CANCEL);






        WebElement address_textarea = driver.findElement(Locate.ADDRESS_TEXTAREA);
        action2.scrollToElement(address_textarea).click().sendKeys("jgahdgjgad").perform();
//address_textarea.sendKeys("test");
    }

}
