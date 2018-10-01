package demo.oracledemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
    private WebDriver drv;

    private By userName = By.name("userName");
    private By password = By.name("password");
    private By loginButton = By.name("login");

    public Home(WebDriver drv){
        this.drv = drv;
    }

    public void isReady(){

    }

    public void loginUser(String user, String pass) {
        drv.findElement(userName).sendKeys(user);
        drv.findElement(password).sendKeys(pass);
        drv.findElement(loginButton).click();
    }
}
