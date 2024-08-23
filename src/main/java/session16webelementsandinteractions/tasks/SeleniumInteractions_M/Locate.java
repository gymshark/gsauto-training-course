package session16webelementsandinteractions.tasks.SeleniumInteractions_M;

import org.openqa.selenium.By;

public class Locate {


    public static final By FORMS = By.linkText("Forms");
    public static final By PRACTICE_FORM = By.linkText("Practice Form");

    public static final By FIRST_NAME_TEXT = By.cssSelector("#firstName");

    public static final By LAST_NAME = By.cssSelector("input[id='lastName']");

    public static final By EMAIL = By.id("userEmail");

    public static final By GENDER_FEMALE = By.cssSelector("input[value='Female']");

    public static final By MOBILE_NUM = By.cssSelector("input[id='userNumber']");
    public static final By HOBBIES_CHECKBOX3 = By.cssSelector("input[id='hobbies-checkbox-3']");

    public static final By UPLOAD_BUTTON = By.cssSelector("input[id='uploadPicture']");

    public static final By DOB_PICKER = By.cssSelector("input[id='dateOfBirthInput']");

    public static final By DATE = By.cssSelector("div[aria-label='Choose Tuesday, July 2nd, 2024']");
    public static final By SUBJECTS = By.xpath
            ("//*[@id=\"subjectsContainer\"]/div/div[1]");
    public static final By ADDRESS_TEXTAREA = By.cssSelector("textarea[id='currentAddress' and class='form-control']");

    public static final By SUBMIT_BTN = By.cssSelector("button[id='submit']");


}






