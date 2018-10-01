package demo.oracle.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

class PageImpl {


    static WebDriver drv;

    private By registerButton = By.linkText("REGISTER");
    private By homeButton = By.linkText("Home");
    private By flightsButton = By.linkText("Flights");


    static {
        System.setProperty("webdriver.gecko.driver", "c:\\\\Geckodriver\\geckodriver.exe");
        drv = new FirefoxDriver();
        drv.get("http://newtours.demoaut.com/");
    }

    void selectFromDropdownByValue(By fromPortDrop, String departPlace) {
        Select dropDown = new Select(drv.findElement(fromPortDrop));
        dropDown.selectByValue(departPlace);
    }

    void selectFromDropdownByText(By fromPortDrop, String departPlace) {
        Select dropDown = new Select(drv.findElement(fromPortDrop));
        dropDown.selectByVisibleText(departPlace);
    }


    //Left navigation panel
    void pressHome() {
        drv.findElement(homeButton).click();
    }

    public void pressFlights() {
        drv.findElement(flightsButton).click();
    }


    //Top navigation panel
    public void pressRegister() {
        drv.findElement(registerButton).click();
    }


    public void close() {
        drv.quit();
    }

}
