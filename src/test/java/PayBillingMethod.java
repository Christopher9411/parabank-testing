import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PayBillingMethod {
    private static final WebDriver driver =  Util.getDriver();




public static void PayBills(){
    WebElement billpay = driver.findElement(By.xpath("//a[@href='/parabank/billpay.htm']"));
    billpay.click();
    WebElement payee_name = driver.findElement(By.xpath("//*[contains(@name,'payee.name')]"));
    payee_name.sendKeys("Mickey");
    WebElement address = driver.findElement(By.xpath("//*[contains(@name,'payee.address.street')]"));
    address.sendKeys("Michigan Street 12");
    WebElement City = driver.findElement(By.cssSelector(".form2 > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(2) > input:nth-child(1)"));
    City.sendKeys("Washington");
    WebElement State = driver.findElement(By.xpath("//*[contains(@name,'payee.address.state')]"));
    State.sendKeys("NY");
    WebElement zip_code = driver.findElement(By.xpath("//*[contains(@name,'payee.address.zipCode')]"));
    zip_code.sendKeys("2010");
    WebElement phone_number = driver.findElement(By.xpath("//*[contains(@name,'payee.phoneNumber')]"));
    phone_number.sendKeys("02345678");
    WebElement account_number = driver.findElement(By.xpath("//*[contains(@name,'payee.accountNumber')]"));
    account_number.sendKeys("54321");
    WebElement verify_accountno= driver.findElement(By.xpath("//*[contains(@name,'verifyAccount')]"));
    verify_accountno.sendKeys("54321");
    WebElement amount = driver.findElement(By.xpath("//*[contains(@name,'amount')]"));
    amount.sendKeys("40");
    WebElement send_payment = driver.findElement(By.xpath("//*[@type='submit'or @type='submit']"));
    send_payment.click();
   String payment_confirmation= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[2]/h1")).getText();
   WebElement Account_overview = driver.findElement(By.xpath("//a[@href='/parabank/overview.htm']"));
   Account_overview.click();
   WebElement Account_number = driver.findElement(By.xpath("//a[@href='activity.htm?id=16674']"));
   Account_number.click();
    List<WebElement> elements = driver.findElements(By.cssSelector("#rightPanel > div:nth-child(1) > div:nth-child(1) > table:nth-child(2)"));

    for(WebElement element: elements)
    {
        if(element.getText().equals("Balance"))
            System.out.println(element.getText());
    }


        }

    }







