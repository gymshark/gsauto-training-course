package session15locators.tasks.fatima;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

  static WebDriver driver;

  public static String GS_LOGO = String.valueOf(driver.findElement(By.id("header-logo-select")));
  public static String SEARCH_CTA = String.valueOf(driver.findElement(By.cssSelector(".search_search-trigger__U6dOW #search-searchTrigger-select")));
  public static String BAG_CTA = String.valueOf(driver.findElement(By.cssSelector(".quick-add_quick-add__jnU9i #plp-quickAddActive-false-read")));
}
