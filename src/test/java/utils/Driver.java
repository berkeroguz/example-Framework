package utils;

import org.openqa.selenium.WebDriver;

public class Driver {

    /*
        Sadece Driver'a ait bir
     */

    private Driver(){

    }

    private static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }

    public void quitDriver(){
        if(getDriver()!=null){
            getDriver().quit();
        }
    }

    public static void setUpDriver() {
        //Caps gerekecek
        //driver ayarlanacak.
        switch (ConfigReader.getProperty("driverOption")){
            case "localChrome":
                break;
        }
        driver = null;
    }



}
