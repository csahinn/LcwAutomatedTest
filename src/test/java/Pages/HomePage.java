package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class HomePage {
    private WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public HomePage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);

    }

    private By rejectCookiesButton = By.xpath("//button[@id='cookieseal-banner-reject']");
    private By menCategory = By.xpath("//a[contains(@class,'menu-header-item__title')][normalize-space()='ERKEK']");

    public static void goToHomePage() {
    }

    public static void clickRejectCookies() {
    }

    public static void pickCategory() {
    }

    public static void clickSortButton() {
    }

    public static void sortItemsAscending() {
    }

    public static void pickFirstItem() {
    }

    public static void getPrice() {
    }

    public void rejectCookies() {
        
    }

    public void selectCategory() {
        driver.findElement(menCategory).click();
    }
}
