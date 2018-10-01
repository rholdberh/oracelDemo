package demo.oracle.Pages;

import org.openqa.selenium.By;

public class HomePage extends PageImpl {

    private By userName = By.name("userName");
    private By password = By.name("password");
    private By loginButton = By.name("login");

    public void loginUser(String user, String pass) {
        pressHome();
        drv.findElement(userName).sendKeys(user);
        drv.findElement(password).sendKeys(pass);
        drv.findElement(loginButton).click();
    }

}
