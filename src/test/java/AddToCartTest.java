import org.example.AddToCart;
import org.example.ExploringProducts;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddToCartTest {

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(60));
    Actions actions = new Actions(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Test
    public void AddToCartTest() throws InterruptedException {

        driver.manage().window().maximize();
        driver.get("https://butiqq.rz.dvtst.com/products?search=%D9%81%D8%B3%D8%AA%D8%A7%D9%86+%D8%B7%D9%88%D9%8A%D9%84+%D8%A8%D8%A7%D9%84%D8%AA%D9%86%D9%88%D8%B1%D8%A9");
        AddToCart addToCart = new AddToCart(driver);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 450);");
        Thread.sleep(1000);
        addToCart.getClickOnItem().click();
        addToCart.getAddToCart().click();
        Thread.sleep(1000);
        addToCart.getContinueProcess().click();
        Thread.sleep(1000);
        addToCart.getConfirmPayment().click();
        wait.until(ExpectedConditions.visibilityOf(addToCart.getGetEmail()));
     /*  addToCart.getGetEmail().sendKeys("tasneem169@gmail.com");
        addToCart.getGetPassword().sendKeys("P@ss332638");
        addToCart.getGetCity().click();
        addToCart.getChooseCity().click();
        addToCart.getGetCountry().click();
        addToCart.getChooseCounty().click();
        addToCart.getZipCode().sendKeys("225");
        addToCart.getGetAddress().sendKeys("xxxx");
*/

    }
}
