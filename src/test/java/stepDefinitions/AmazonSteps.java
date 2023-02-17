package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AmazonPage;
import util.DriverFactory;

public class AmazonSteps {
    WebDriver driver = DriverFactory.getDriver();
    AmazonPage amazonPage = new AmazonPage(driver);
    @Given("User is on home page")
    public void userIsOnHomePage() {
        amazonPage.homePage();
    }

    @When("Click accept cookies")
    public void clickAcceptCookies() {
        amazonPage.acceptCookies();
    }

    @When("Click search button")
    public void clickSearchButton() {
        amazonPage.searchButton();
    }

    @When("Write product name")
    public void writeProductName() {
        amazonPage.productName();
        amazonPage.clickSubmitButton();
    }

    @When("Click shipped by amazon radio button")
    public void clickShippedByAmazonRadioButton() {
        amazonPage.filterShippedByAmazon();
    }

    @When("Click Apple radio button for filter")
    public void clickAppleRadioButton() {
        amazonPage.filterAppleBrand();
    }

    @When("Click first product")
    public void clickFirstProduct() {
        amazonPage.firstProduct();
    }

    @When("Add to cart")
    public void addToCart() {
        amazonPage.addToCart();
    }

    @When("Check cart page")
    public void checkCartPage() {
        amazonPage.cartPage();
    }

    @Then("The item should be added to the cart")
    public void theItemShouldBeAddedToTheCart() {
        amazonPage.isAdded();
    }
}
