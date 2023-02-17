package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;

public class AmazonPage {
    private WebDriver driver;
    private ElementHelper elementHelper;
    WebDriverWait wait;

    static By accept = By.id("sp-cc-accept");
    static By searchTextBox = By.id("twotabsearchtextbox");
    static By searchButton = By.id("nav-search-submit-button");
    static By amazonRadioButton = By.id("p_n_fulfilled_by_amazon/21345978031");
    static By appleRadioButton = By.xpath("(//span[@class='a-size-base a-color-base'][normalize-space()='Apple'])[1]");
    static By firstProduct = By.xpath("//img[@alt='Apple AirPods (2.Nesil) ve Kablolu Şarj Kutusu']");
    static By addCartButton = By.id("add-to-cart-button");
    static By closeCart = By.id("attach-close_sideSheet-link");
    static By goToCart = By.id("nav-cart-count-container");
    static By checkCart = By.cssSelector(".a-truncate-cut");


    public AmazonPage (WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void homePage() {
        driver.get("https://www.amazon.com.tr");
    }

    public void acceptCookies() {
        elementHelper.click(accept);
    }

    public void searchButton() {
        elementHelper.click(searchTextBox);
    }

    public void productName() {
        elementHelper.sendKey(searchTextBox,"airpods");
    }
    public void clickSubmitButton() {
        elementHelper.click(searchButton);
    }
    public void filterShippedByAmazon() {
        elementHelper.click(amazonRadioButton);
    }

    public void filterAppleBrand() {
        elementHelper.click(appleRadioButton);
    }

    public void firstProduct() {
        elementHelper.click(firstProduct);
    }

    public void addToCart() {
        elementHelper.click(addCartButton);
        elementHelper.click(closeCart);
        elementHelper.click(goToCart);
    }

    public void cartPage() {
        elementHelper.checkVisible(checkCart);
    }

    public void isAdded() {
    }


}
