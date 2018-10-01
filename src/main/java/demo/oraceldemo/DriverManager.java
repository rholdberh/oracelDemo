package demo.oraceldemo;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
     static FirefoxDriver getDriver(){
         System.setProperty("webdriver.gecko.driver","c:\\\\Geckodriver\\geckodriver.exe");
         return new FirefoxDriver();
    }
}
