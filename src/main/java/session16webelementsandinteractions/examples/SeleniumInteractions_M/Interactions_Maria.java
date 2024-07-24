package session16webelementsandinteractions.examples.SeleniumInteractions_M;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Interactions_Maria {


    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");


        driver.manage().window().maximize();
        WebElement firstName = driver.findElement(Locate.FIRST_NAME_TEXT);
        firstName.sendKeys("Maria");

        WebElement lastName = driver.findElement(Locate.LAST_NAME);
        lastName.sendKeys("Prabhakar");
        WebElement email = driver.findElement(Locate.EMAIL);
       email.sendKeys("maria.prabhakar@gymshark.com");

       WebElement mobileNumber = driver.findElement(Locate.MOBILE_NUM);
       mobileNumber.sendKeys("07567789048");


        WebElement gender_female = driver.findElement(Locate.GENDER_FEMALE);
       gender_female.click();

        WebElement subjects = driver.findElement(Locate.SUBJECTS);
        new Actions(driver).moveToElement(subjects).click();
       //new Actions(driver).scrollToElement(subjects).click(subjects);

 /*





       subjects.sendKeys("chem");
        WebElement subjectInput = driver.findElement(Locate.SUBJECTS_INPUT);
        subjectInput.click();
        WebElement hobbies_Sports = driver.findElement(Locate.HOBBIES_CHECKBOX1);
       hobbies_Sports.click();
        WebElement picture_Upload = driver.findElement(Locate.PICTURE_UPLOAD);
   picture_Upload.click();
        WebElement submit = driver.findElement(Locate.SUBMIT_BUTTON);
   submit.click();
*/

    }

}
