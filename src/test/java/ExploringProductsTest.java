import org.example.Base;
import org.example.ExploringProducts;
import org.example.Register;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;


public class ExploringProductsTest {

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(60));
    Actions actions = new Actions(driver);

    @Test
    public void ExploringProducts() throws InterruptedException {

        driver.manage().window().maximize();
        driver.get("https://butiqq.rz.dvtst.com/");
        ExploringProducts products = new ExploringProducts(driver);
        actions.moveToElement(products.hoverButton()).perform();
        products.getClickOnItem().click();
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 450);");
        Thread.sleep(1000);
        products.getSelectItems().click();
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
        Thread.sleep(1000);
        products.getSearch().sendKeys("فستان طويل بالتنورة");
        Thread.sleep(1000);
        products.getClickOnSearch().click();


    }
}
