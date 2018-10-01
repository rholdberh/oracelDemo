package demo.oracle.Pages;

import org.openqa.selenium.By;

public class SelectFlightPage extends PageImpl {

    private By continueButton = By.name("reserveFlights");

    public void pressContinue(){
        drv.findElement(continueButton).click();
    }

}
