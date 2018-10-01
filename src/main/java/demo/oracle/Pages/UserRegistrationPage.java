package demo.oracle.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class UserRegistrationPage extends PageImpl {

    private By userName = By.name("email");
    private By password = By.name("password");
    private By confirmPassword = By.name("confirmPassword");
    private By submitButton = By.name("register");


    public void fillRegistrationForm(String user, String pass) {
        drv.findElement(userName).sendKeys(user);
        drv.findElement(password).sendKeys(pass);
        drv.findElement(confirmPassword).sendKeys(pass);
    }

    public void pressSubmit(){
        drv.findElement(submitButton).click();
    }

    public void checkRegisteredPage(){
        String confirmationText = drv.findElement(By.xpath("//tr[3]/td/p[2]/font")).getText();
        Assert.assertTrue(confirmationText.contains("Thank you for registering"));

    }

}
