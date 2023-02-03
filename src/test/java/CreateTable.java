import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateTable {

    public static void main (String[] Args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        //JavascriptExecutor jsx = (JavascriptExecutor) driver;
       // jsx.executeAsyncScript("window.scrollBy(0,450)","");

        WebElement elementPage = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
        elementPage.click();

        WebElement webTablesButton = driver.findElement(By.id("item-3"));
        webTablesButton.click();

        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.click();
        firstName.sendKeys("Buse");
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.click();
        lastName.sendKeys("Ozbaytekin");
        WebElement email = driver.findElement(By.id("userEmail"));
        email.click();
        email.sendKeys("buseozbaytekin@gmail.com");
        WebElement age = driver.findElement(By.id("age"));
        age.click();
        age.sendKeys("26");
        WebElement salary = driver.findElement(By.id("salary"));
        salary.click();
        salary.sendKeys("15000");
        WebElement department = driver.findElement(By.id("department"));
        department.click();
        department.sendKeys("QA Engineer");
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
    }
}
