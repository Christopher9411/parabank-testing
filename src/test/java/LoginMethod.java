import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginMethod  {
    private static WebDriver driver = Util.getDriver();




    public static void login(){

    WebElement username = driver.findElement(By.cssSelector("#loginPanel > form > div:nth-child(2) > input"));
    username.sendKeys("Tester Joe");
    WebElement password = driver.findElement(By.xpath("//input[@class='input' and @name='password']"));
    password.sendKeys("tonhal123");
    WebElement submit_button = driver.findElement(By.cssSelector("input.button"));
    submit_button.click();





}



}
