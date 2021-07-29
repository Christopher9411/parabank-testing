import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TransactionsearchMethod {

    private static WebDriver driver = Util.getDriver();


        public static void TransactionSearch(){
            WebElement findtransaction = driver.findElement(By.xpath("//a[@href='/parabank/findtrans.htm']"));
            findtransaction.click();
            Select dropdownlist = new Select(driver.findElement(By.xpath("//*[contains(@id,'accountId')]")));
            dropdownlist.selectByValue("14010");
            WebElement transaction_searchbar= driver.findElement(By.xpath("//*[@id=\"criteria.transactionId\"]"));
            transaction_searchbar.click();
            transaction_searchbar.sendKeys(" 15142");
            WebElement search_for_transaction = driver.findElement(By.cssSelector("form.ng-valid > div:nth-child(5) > button"));
            search_for_transaction.click();
            //*[@id="transactionTable"]/tbody/tr/td[2]/a
            WebElement transaction_details = driver.findElement(By.xpath("//a[@class='ng-binding']"));
            transaction_details.click();
            String transaction_information = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/table")).getText();
            WebElement Account_overview = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a"));
            Account_overview.click();
            WebElement recent_transaction = driver.findElement(By.xpath("//*[@id=\"accountTable\"]/tbody/tr[1]/td[1]/a"));
            recent_transaction.click();
            WebElement transaction= driver.findElement(By.xpath("//*[@id=\"transactionTable\"]/tbody/tr[1]/td[2]/a"));
            transaction.click();
            WebElement transaction_detail2 = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/table/tbody"));
            String table_info2 = transaction_detail2.getText();
            Assertions.assertEquals(transaction_information, table_info2);




//# to identify the table column headers in row 1
           //WebElement table=driver.find_elements_by_xpath ("/html/body/div[1]/div[3]/div[2]/table");
           //WebElement l=driver.find_elements_by_xpath ("/html/body/div[1]/div[3]/div[2]/table/tbody/tr[4]");
//# to traverse through the list of headers
         //   for l in table :
//# to get the header with text method
          //  print (l.text)
//#to close the browser
           // driver.close ()




        }







}
