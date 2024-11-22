package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class StepDefinitions {

    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);

    @Given("Go to LCW Website")
    public void goToLCWWebsite() {
        HomePage.goToHomePage();
    }

    @When("Click to reject cookies")
    public void clickToRejectCookies() {
        HomePage.clickRejectCookies();
    }

    @When("Click the category of men")
    public void clickTheCategoryOfMen() {
        HomePage.pickCategory();
    }

    @When("Click sort dropdown")
    public void clickSortDropdown() {
        HomePage.clickSortButton();
    }

    @When("Sort ascending")
    public void sortAscending() {
        HomePage.sortItemsAscending();
    }

    @When("Pick the first item")
    public void pickTheFirstItem() {
        HomePage.pickFirstItem();
    }

    @Then("Get the price of item")
    public void getThePriceOfItem() {
        HomePage.getPrice();
    }


}
