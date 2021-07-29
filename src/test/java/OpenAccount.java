import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OpenAccount {
    private static WebDriver driver = Util.getDriver();


    public static void CreateAccount() {
        WebElement Accountcreation = driver.findElement(By.xpath("//a[@href='/parabank/openaccount.htm']"));
        Accountcreation.click();
        WebElement confirmaccount = driver.findElement(By.cssSelector("#rightPanel > div > div > form > div > input"));
        confirmaccount.click();


    }

}
