package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    private By sortButton = By.xpath("//button[@class='dropdown-button__button']//*[name()='svg']");
    private By sortAscendingButton = By.xpath("//a[contains(text(),'En düşük fiyat')]");

    public void clickSortDropdown() {
        driver.findElement(sortButton).click();
    }

    public void sortAscending() {
        driver.findElement(sortAscendingButton).click();
    }




}
