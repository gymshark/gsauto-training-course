package session16webelementsandinteractions.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static session16webelementsandinteractions.examples.Locators.FIRST_NAME;

public class WebElements {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement firstName = driver.findElement(FIRST_NAME);
        firstName.sendKeys("Daniel Williams");

    }
}
