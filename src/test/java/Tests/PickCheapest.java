package Tests;

import Pages.HomePage;
import Pages.ProductPage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PickCheapest {
    private WebDriver driver;
    private String baseUrl;
    private HomePage homePage;
    private ProductPage productPage;

    @BeforeMethod
    public void setUp() throws Exception {
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.firefox.driver","C:\\webdrivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

        baseUrl = "https://www.lcw.com";

        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);

    }

    @Test
    public void getProduct() {
        driver.get(baseUrl);
        letsWaitALittleBit();
        //Reject the cookies automatically.
        homePage.rejectCookies();
        letsWaitALittleBit();
        //Click the navbar item.
        homePage.selectCategory();
        letsWaitALittleBit();

        //Click to the Sort dropdown.
        //WebElement sortButton = driver.findElement(By.xpath("//button[@class='dropdown-button__button']//*[name()='svg']"));
        productPage.clickSortDropdown();
        letsWaitALittleBit();
        //Click to sort ascending.
        productPage.sortAscending();
        letsWaitALittleBit();

        //Sort items ascending.
        /*WebElement sortAscending = driver.findElement(By.xpath("//a[contains(text(),'En düşük fiyat')]"));
        sortAscending.click();
        letsWaitALittleBit(); */

        //Scroll down and pick the first item.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement firstItem = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[6]/div/div[2]/div[1]"));
        js.executeScript("arguments[0].scrollIntoView(true)",firstItem);
        firstItem.click();
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

        WebElement itemName = driver.findElement(By.xpath("//h1[@class='product-title']"));
        WebElement itemPrice = driver.findElement(By.xpath("//span[@class='advanced-price']"));
        System.out.println("Ürün Adı: "+itemName.getText()+"\nÜrün Fiyatı: "+itemPrice.getText());
        letsWaitALittleBitMore();
    }

    @AfterMethod
    public void tearDown() throws Exception{
        if(driver != null) {
            driver.quit();
        }
    }

    void letsWaitALittleBit() {
        try {
            Thread.sleep(3000); // Wait for reloading...
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void letsWaitALittleBitMore() {
        try {
            Thread.sleep(10000); // Wait for reloading...
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

