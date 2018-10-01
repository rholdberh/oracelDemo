package demo.oracle.Pages;

import org.openqa.selenium.By;

public class BookFlightPage extends PageImpl {

    private By firstName = By.name("passFirst0");
    private By lastName = By.name("passLast0");

    private By cardTypeDropdown = By.name("creditCard");
    private By creditCardNumber = By.name("creditnumber");
    private By cardExpirationMonth = By.name("cc_exp_dt_mn");
    private By cardExpirationYear = By.name("cc_exp_dt_yr");

    private By securePurchase = By.name("buyFlights");


    public void setPassender(String user, String pass){
        drv.findElement(firstName).sendKeys(user);
        drv.findElement(lastName).sendKeys(pass);
    }

    public void setCard(String cardType, String cardNumber, String expMonth, String expYear){
        selectFromDropdownByText(cardTypeDropdown,cardType);
        drv.findElement(creditCardNumber).sendKeys(cardNumber);
        drv.findElement(cardExpirationMonth).sendKeys(expMonth);
        drv.findElement(cardExpirationYear).sendKeys(expYear);
    }

    public void pressSecurePurchase(){
        drv.findElement(securePurchase).click();
    }

}
