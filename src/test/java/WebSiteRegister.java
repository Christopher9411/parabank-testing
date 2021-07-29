


import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


public class WebSiteRegister {
    private WebDriver driver = Util.getDriver();


    @Test
    public void WebSiteRegister() {
        RegisterMethod.register();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }


    @Test
    public void Login() {
        LoginMethod.login();

    }


    @Test
    public void AccountBalance() {
        LoginMethod.login();
        CheckAccountBalanceMethod.balance();


    }


    @Test
    public void OpenAccount() {
        LoginMethod.login();
        OpenAccount.CreateAccount();

    }


    @Test
    public void UpdatInfo() {
        LoginMethod.login();
        UpdateInformationsMethod.SetProfile();

    }


    @Test
    public void Loan() {
        LoginMethod.login();
        RequestLoanMethod.loanapply();

    }


    @Test
    public void TransactionID() {
        LoginMethod.login();

    }


    @Test
    public void SearchForTransaction() {
        LoginMethod.login();
        TransactionsearchMethod.TransactionSearch();


    }


    @Test
    public void PayingBills() {
        LoginMethod.login();
        PayBillingMethod.PayBills();
    }



   /* public void TransferFunds() {
        LoginMethod.login();
        TransferFundsMethods.transfer_money(); */
    }





