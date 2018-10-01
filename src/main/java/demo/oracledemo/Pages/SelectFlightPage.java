package demo.oracledemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectFlightPage {

    private By reserveFlights = By.name("reserveFlights");

    private WebDriver drv;

    public SelectFlightPage(WebDriver drv) {
        this.drv = drv;
    }

    public void pressContinue(){
        drv.findElement(reserveFlights).click();
    }

}
