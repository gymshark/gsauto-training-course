package session16webelementsandinteractions.examples.SeleniumInteractions_M;

import org.openqa.selenium.By;

public class Locate {


        public static final By FORMS = By.linkText("Forms");
        public static final By PRACTICE_FORM = By.linkText("Practice Form");

        public static final By FIRST_NAME_TEXT = By.cssSelector("#firstName");

        public static final By LAST_NAME = By.cssSelector("input[id='lastName']");

        public static final By EMAIL = By.id("userEmail");

        public static final By GENDER_FEMALE = By.xpath("//*[@id=\"gender-radio-1\"]");

        public static final By MOBILE_NUM = By.cssSelector("input[id='userNumber']");


        public static final By SUBJECTS = By.cssSelector
                ("div[class='subjects-auto-complete__control css-yk16xz-control']");

}






