package demo.oracle.Pages;


import org.junit.Assert;
import org.openqa.selenium.By;

public class FlightConfirmationPage extends PageImpl {

    public void validateDeparturingDestinations(){
        String confirationText = drv.findElement(By.xpath("//font[2]")).getText();
        Assert.assertTrue(confirationText.contains("Your itinerary has been booked!"));
    }

}
