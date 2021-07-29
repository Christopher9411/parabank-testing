import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.sql.Driver;
import java.util.List;


public class CheckAccountBalanceMethod {
    private static WebDriver driver = Util.getDriver();
    private static Object WebElement;
    private static Object List;


    public static void balance() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement account_overview = driver.findElement(By.xpath("//a[@href='/parabank/overview.htm']"));
        account_overview.click();
        WebElement account_balance =driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/table/tbody/tr[5]/td[2]/b"));
        String value = account_balance.getText();
        Assertions.assertEquals("$1025.50", value);

    }


}



