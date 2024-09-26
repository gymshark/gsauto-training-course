package session16webelementsandinteractions.tasks.akshatha;

import org.openqa.selenium.By;

public class Locators {

  public static final By FIRST_NAME = By.cssSelector("#firstName");
  public static final By LAST_NAME = By.cssSelector("#lastName");
  public static final By EMAIL = By.cssSelector("#userEmail");
  public static final By GENDER_FEMALE = By.cssSelector("#gender-radio-2");
  public static final By DATE_OF_BIRTH = By.cssSelector("#dateOfBirthInput");
  public static final By DATE_OF_BIRTH_MONTH = By.cssSelector(".react-datepicker__month-select");
  public static final By DATE_OF_BIRTH_YEAR = By.cssSelector(".react-datepicker__year-select");
  public static final By DATE_OF_BIRTH_DAY = By.cssSelector(".react-datepicker__day--012");
  public static final By SUBJECTS_TEXTBOX = By.id("subjectsContainer");
  public static final By HOBBIES_CHECKBOX_1 = By.cssSelector("#hobbies-checkbox-2");
  public static final By HOBBIES_CHECKBOX_2 = By.cssSelector("#hobbies-checkbox-3");
  public static final By PICTURES = By.cssSelector("#uploadPicture");
  public static final By ADDRESS_TEXTBOX = By.cssSelector("#currentAddress");
  public static final By SUBMIT_BUTTON = By.id("submit");
  public static final By CONFIRMATION_TEXT = By.id("");
}
