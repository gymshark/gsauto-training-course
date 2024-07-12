package session15locators.tasks.fatima;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDisplayPage {

    static WebDriver driver;

    static WebElement pdpAddToWishlistCTALocator = driver.findElement(By.id("pdp-addToWishlist-add"));
    static WebElement pdpAddToBagCTALocator = driver.findElement(By.id("pdp-addToBag-submit"));
    static WebElement pdpSizeXSLocator = driver.findElement(By.id("pdp-size-xs-select"));
    static WebElement pdpSizeSLocator = driver.findElement(By.id("pdp-size-s-select"));
    static WebElement pdpSizeMLocator = driver.findElement(By.id("pdp-size-m-select"));
    static WebElement pdpSizeLLocator = driver.findElement(By.id("pdp-size-l-select"));
    static WebElement pdpSizeXLLocator = driver.findElement(By.id("pdp-size-xl-select"));
    static WebElement pdpSizeXXLLocator = driver.findElement(By.id("pdp-size-xxl-select"));


    public static String PDP_ADD_TO_WISHLIST_CTA = String.valueOf(pdpAddToWishlistCTALocator);
    public static String PDP_ADD_TO_BAG_CTA = String.valueOf(pdpAddToBagCTALocator);
    public static String PDP_SIZE_XS = String.valueOf(pdpSizeXSLocator);
    public static String PDP_SIZE_S = String.valueOf(pdpSizeSLocator);
    public static String PDP_SIZE_M = String.valueOf(pdpSizeMLocator);
    public static String PDP_SIZE_L = String.valueOf(pdpSizeLLocator);
    public static String PDP_SIZE_XL = String.valueOf(pdpSizeXLLocator);
    public static String PDP_SIZE_XXL = String.valueOf(pdpSizeXXLLocator);

}

