package session15locators.tasks.fatima;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {

    static WebDriver driver;

    static WebElement gsLogoIconLocator = driver.findElement(By.id("header-logo-select"));
    static WebElement searchCTALocator = driver.findElement(By.cssSelector(".search_search-trigger__U6dOW #search-searchTrigger-select"));
    static WebElement bagCTALocator = driver.findElement(By.cssSelector(".quick-add_quick-add__jnU9i #plp-quickAddActive-false-read"));

    public static String GS_LOGO = String.valueOf(gsLogoIconLocator);
    public static String SEARCH_CTA = String.valueOf(searchCTALocator);
    public static String BAG_CTA = String.valueOf(bagCTALocator);
}
