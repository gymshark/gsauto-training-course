package session16webelementsandinteractions.examples;

import org.openqa.selenium.By;

public class Locators {
    public static final By FIRST_NAME = By.cssSelector("#firstName");
    private static final By LAST_NAME = By.id("lastName");
    private static final By EMAIL = By.xpath("//*[@id=\"userEmail\"]");
}
