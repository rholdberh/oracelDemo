package demo.oracle.Pages;

import org.openqa.selenium.By;

public class FlightFinderPage extends PageImpl {

    private By onewayRadio = By.xpath("//input[@value='oneway']");
    private By roundTripRadio = By.xpath("//input[@value='roundtrip']");
    private By passengersNumber = By.name("passCount");
    private By departuresFrom = By.name("fromPort");
    private By departuresDay = By.name("fromDay");
    private By departuresMonth = By.name("fromMonth");
    private By arrivingIn = By.name("toPort");
    private By arrivingDay = By.name("toDay");
    private By arrivingMonth = By.name("toMonth");
    private By businessRadio = By.xpath("//input[@value='Business']");
    private By findFlightsButton = By.name("findFlights");

    public FlightFinderPage(){}

    public void setRoundTrip(){
        drv.findElement(roundTripRadio).click();
    }

    public void setOnewayTrip(){
        drv.findElement(onewayRadio).click();
    }

    public void setDeparturesFrom(String departPlace){
        selectFromDropdownByValue(departuresFrom, departPlace);
    }

    public void setDeparturesTime(String month, String day) {
        drv.findElement(departuresDay).sendKeys(day);
        drv.findElement(departuresMonth).sendKeys(month);
    }

    public void setArrivingTo(String arrivingTo){
        selectFromDropdownByValue(arrivingIn, arrivingTo);
    }

    public void setArrivingTime(String month, String day) {
        drv.findElement(arrivingDay).sendKeys(day);
        drv.findElement(arrivingMonth).sendKeys(month);
    }

    public void pressContinue(){
        drv.findElement(findFlightsButton).click();
    }




}
