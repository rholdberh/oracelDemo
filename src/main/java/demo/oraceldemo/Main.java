package demo.oraceldemo;

import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args) {

        WebDriver drv = DriverManager.getDriver();
        drv.get("http://newtours.demoaut.com/ ");



    }
}
