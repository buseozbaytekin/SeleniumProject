package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;

public class AmazonPage {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By accept = By.id("sp-cc-accept");
    static By search = By.id("twotabsearchtextbox");
    static By searchButton = By.id("nav-search-submit-button");
    static By amazonRadioButton = By.xpath("//span[@class='a-size-base a-color-base'][contains(text(),'Amazon Tarafından Gönderilir')]");
    static By appleRadioButton = By.xpath("(//span[@class='a-size-base a-color-base'][normalize-space()='Apple'])[1]");
    static By firstProduct = By.xpath("//img[@alt='Apple AirPods (2.Nesil) ve Kablolu Şarj Kutusu']");
    static By addCartButton = By.id("id=\"add-to-cart-button\"");
    static By closeCart = By.id("attach-close_sideSheet-link");
    static By goToCart = By.id("nav-cart-count-container");
    static By checkCart = By.cssSelector(".a-truncate-cut");


    public AmazonPage (WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public static void homePage() {
        driver.get("https://www.amazon.com.tr");
    }

    public static void acceptCookies() {
        elementHelper.click(accept);
    }

    public static void searchButton() {
        elementHelper.click(search);
    }

    public static void productName() {
        elementHelper.sendKey(search,"airpods");
        elementHelper.click(searchButton);
    }

    public static void filterShippedByAmazon() {
        elementHelper.click(amazonRadioButton);
    }

    public static void filterAppleBrand() {
        elementHelper.click(appleRadioButton);
    }

    public static void firstProduct() {
        elementHelper.click(firstProduct);
    }

    public static void addToCart() {
        elementHelper.click(addCartButton);
        elementHelper.click(closeCart);
        elementHelper.click(goToCart);
    }

    public static void cartPage() {
        elementHelper.checkVisible(checkCart);
    }

    public void isAdded() {
    }

}
