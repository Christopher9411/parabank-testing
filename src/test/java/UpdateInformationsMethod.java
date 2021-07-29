import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class UpdateInformationsMethod {
    private static WebDriver driver = Util.getDriver();



public static void SetProfile(){
    WebElement updateinfo = driver.findElement(By.xpath("//a[@href='/parabank/updateprofile.htm']"));
    updateinfo.click();
    WebElement firstname = driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]"));
    firstname.sendKeys("William");
    WebElement lastname = driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]"));
    lastname.sendKeys("Anderson");
    WebElement address = driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]"));
    address.sendKeys("Michigan Street 20");
    WebElement City = driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]"));
    City.sendKeys("Geogetown");
    WebElement State = driver.findElement(By.xpath("//*[@id=\"customer.address.state\"]"));
    State.sendKeys("DC");
    WebElement Zipcode= driver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]"));
    Zipcode.sendKeys("1020");
    WebElement PhoneNumber = driver.findElement(By.xpath("//*[@id='customer.phoneNumber']"));
    PhoneNumber.clear();
    PhoneNumber.sendKeys("435332422432342");
    WebElement update_profile = driver.findElement(By.xpath("//*[@type='submit']"));
    update_profile.click();
    WebDriverWait wait = new WebDriverWait(driver,30);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#rightPanel > div > div > h1")));
    WebElement Confirmation = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/p"));
    Assertions.assertEquals("Your updated address and phone number have been added to the system.", Confirmation.getText() );

}


}
