import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RequestLoanMethod {
    private static WebDriver driver = Util.getDriver();




public static void loanapply(){
    WebElement requestloan = driver.findElement(By.xpath("//a[@href='/parabank/requestloan.htm']"));
    requestloan.click();
    WebElement request_amount= driver.findElement(By.xpath("//input[@id='amount']"));
    request_amount.sendKeys("200");
    WebElement downpayment= driver.findElement(By.xpath("//input[@id='downPayment']"));
    downpayment.sendKeys("30");
    WebElement apply_now = driver.findElement(By.xpath("//input[@class='button']"));
    apply_now.click();
   WebElement account_overview = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a"));
   account_overview.click();
   WebElement select_account = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/table/tbody/tr[1]/td[1]/a"));
   select_account.click();
   WebElement tableCells= driver.findElement(By.xpath("//td[contains(text(),'395.50')]"));
    String account_balance = tableCells.getText();
   Assertions.assertEquals("$395.50", account_balance);






}


}
