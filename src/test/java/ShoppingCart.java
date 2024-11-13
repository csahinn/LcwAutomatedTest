import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ShoppingCart {
    private WebDriver driver;
    private String baseUrl;

    @BeforeMethod
    public void setUp() throws Exception {
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.firefox.driver","C:\\webdrivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        baseUrl = "https://www.lcw.com";
    }

    @Test
    public void addCart() {
        driver.get(baseUrl);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

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
