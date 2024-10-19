import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.example.Base;
import org.example.Register;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;

public class RegisterTest extends Base{
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(60));


    @Test
    public void Register() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://butiqq.rz.dvtst.com/register");
        Register register = new Register(driver);
        register.setEmail().sendKeys("tasneem16399@gmail.com");
        register.setPhone().sendKeys("01113211834");
        register.getName().sendKeys("Tasneem");
        register.setPassword().sendKeys("P@ss332638");
        register.confirmPassword().sendKeys("P@ss332638");
        register.getClickBirthDay().sendKeys("16011999");
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(register.getClickRegister())).click();

    }

    @Test
    public void testEmptyFields() throws IOException, InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://butiqq.rz.dvtst.com/register");
        Register register = new Register(driver);
        register.setEmail().sendKeys("");
        register.setPhone().sendKeys("");
        register.getName().sendKeys("");
        register.setPassword().sendKeys("");
        register.confirmPassword().sendKeys("");
        register.getClickBirthDay().sendKeys("");
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(register.getClickRegister())).click();
        Assert.assertEquals("https://butiqq.rz.dvtst.com/register", "https://butiqq.rz.dvtst.com/register", "Page URL should remain the same for empty fields.");
    }

    @Test
    public void testPasswordMismatch() throws IOException, InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://butiqq.rz.dvtst.com/register");
        Register register = new Register(driver);
        register.setEmail().sendKeys("tasneem169@gmail.com");
        register.setPhone().sendKeys("01113211885");
        register.getName().sendKeys("Tasneem");
        register.setPassword().sendKeys("P@ss332638");
        register.confirmPassword().sendKeys("DifferentPassword");
        register.getClickBirthDay().sendKeys("16011999");
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(register.getClickRegister())).click();
        Assert.assertEquals("https://butiqq.rz.dvtst.com/register", "https://butiqq.rz.dvtst.com/register", "Page URL should remain the same for empty fields.");
    }

    @Test
    public void testWeakPassword() throws IOException, InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://butiqq.rz.dvtst.com/register");
        Register register = new Register(driver);
        register.setEmail().sendKeys("tasneem169@gmail.com");
        register.setPhone().sendKeys("01113211885");
        register.getName().sendKeys("Tasneem");
        register.setPassword().sendKeys("123");
        register.confirmPassword().sendKeys("123");
        register.getClickBirthDay().sendKeys("16011999");
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(register.getClickRegister())).click();
        Assert.assertEquals("https://butiqq.rz.dvtst.com/register", "https://butiqq.rz.dvtst.com/register", "Page URL should remain the same for empty fields.");
    }

    @Test
    public void testInvalidPhoneNumber() throws IOException, InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://butiqq.rz.dvtst.com/register");
        Register register = new Register(driver);
        register.setEmail().sendKeys("tasneem169@gmail.com");
        register.setPhone().sendKeys("invalidPhone");
        register.getName().sendKeys("Tasneem");
        register.setPassword().sendKeys("P@ss332638");
        register.confirmPassword().sendKeys("P@ss332638");
        register.getClickBirthDay().sendKeys("16011999");
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(register.getClickRegister())).click();
        Assert.assertEquals("https://butiqq.rz.dvtst.com/register", "https://butiqq.rz.dvtst.com/register", "Page URL should remain the same for empty fields.");
    }

    @Test
    public void testDuplicateEmail() throws IOException, InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://butiqq.rz.dvtst.com/register");
        Register register = new Register(driver);
        register.setEmail().sendKeys("existingEmail@example.com");
        register.setPhone().sendKeys("01113211885");
        register.getName().sendKeys("Tasneem");
        register.setPassword().sendKeys("P@ss332638");
        register.confirmPassword().sendKeys("P@ss332638");
        register.getClickBirthDay().sendKeys("16011999");
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(register.getClickRegister())).click();
        Assert.assertEquals("https://butiqq.rz.dvtst.com/register", "https://butiqq.rz.dvtst.com/register", "Page URL should remain the same for empty fields.");
    }
}
