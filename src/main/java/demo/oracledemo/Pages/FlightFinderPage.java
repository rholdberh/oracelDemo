package demo.oracledemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightFinderPage {
    private WebDriver drv;

    private By onewayRadio = By.xpath("//input[@value='oneway']");
    private By fromPortDrop = By.name("fromPort");
    private By fromDayDrop = By.name("fromDay");
    private By businessRadio = By.xpath("//input[@value='Business']");
    private By findFlightsButton = By.name("findFlights");

    public FlightFinderPage(WebDriver drv) {
        this.drv = drv;
    }

    public void FindFlight(String departPlace, String departDate){
        drv.findElement(onewayRadio).click();
        Select dropFrom = new Select(drv.findElement(fromPortDrop));
        dropFrom.selectByValue(departPlace);
        Select dropDay = new Select(drv.findElement(fromDayDrop));
        dropDay.selectByValue(departDate);
        drv.findElement(businessRadio).click();
        drv.findElement(findFlightsButton).click();
    }

}
