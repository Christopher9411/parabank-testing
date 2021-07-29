import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegisterMethod {
    private static WebDriver driver= Util.getDriver();




    public static void register() {

       WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[2]/a"))).click();
        WebElement firstname= driver.findElement(By.xpath("//*[contains(@id,'customer.firstName')]"));
        firstname.sendKeys("William");
        WebElement lastname= driver.findElement(By.xpath("//*[contains(@id,'customer.lastName')]"));
        lastname.sendKeys("Redmoor");
        WebElement adress = driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]"));
        adress.sendKeys("Monroe Road 20");
        WebElement City = driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]"));
        City.sendKeys("Michigan");
        WebElement State = driver.findElement(By.xpath("//*[@id=\"customer.address.state\"]"));
        State.sendKeys("DC");
        WebElement ZipCode = driver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]"));
        ZipCode.sendKeys("3040");
        WebElement PhoneNumber = driver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]"));
        PhoneNumber.sendKeys("01234567");
        WebElement SSN= driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]"));
        SSN.sendKeys("123456");
        WebElement username = driver.findElement(By.xpath("//*[@id=\"customer.username\"]"));
        username.sendKeys("Tester Joe");
         WebElement password = driver.findElement(By.xpath("//*[@id=\"customer.password\"]"));
         password.sendKeys("tonhal123");
          WebElement password_repeat = driver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]"));
          password_repeat.sendKeys("tonhal123");
          WebElement register_button = driver.findElement(By.xpath("//input[@class='button' and @value='Register']"));
          register_button.click();










    }
}