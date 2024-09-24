package session15locators.tasks.fatima;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDisplayPage {

  static WebDriver driver;

  public static String PDP_ADD_TO_WISHLIST_CTA = String.valueOf(driver.findElement(By.id("pdp-addToWishlist-add")));
  public static String PDP_ADD_TO_BAG_CTA = String.valueOf(driver.findElement(By.id("pdp-addToBag-submit")));
  public static String PDP_SIZE_XS = String.valueOf(driver.findElement(By.id("pdp-size-xs-select")));
  public static String PDP_SIZE_S = String.valueOf(driver.findElement(By.id("pdp-size-s-select")));
  public static String PDP_SIZE_M = String.valueOf(driver.findElement(By.id("pdp-size-m-select")));
  public static String PDP_SIZE_L = String.valueOf(driver.findElement(By.id("pdp-size-l-select")));
  public static String PDP_SIZE_XL = String.valueOf(driver.findElement(By.id("pdp-size-xl-select")));
  public static String PDP_SIZE_XXL = String.valueOf(driver.findElement(By.id("pdp-size-xxl-select")));

}

