package com.hendy.skeleton.driver;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverSingleTon {
    private static WebDriver webDriver;
    private static DriverSingleTon driverSingleTon = null;

    private DriverSingleTon(){
        //setMyDriver(System.getProperty("BROWSERNAME"));
        setMyDriver("chrome");
    }

    private void setMyDriver(String browserName){
        if (browserName.equalsIgnoreCase("chrome")){
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
            webDriver = new ChromeDriver(chromeOptions);
        } else  if (browserName.equalsIgnoreCase("edge")){
            webDriver = new EdgeDriver();
        }
    }

    public static DriverSingleTon setTheDriverSingleTonObject(){
        if (driverSingleTon == null)
            driverSingleTon = new DriverSingleTon();
        return driverSingleTon;
    }

    public static WebDriver getWebDriver(){
        return webDriver;
    }

    public  void navigatTo(String url){
        webDriver.navigate().to(url);
    }
    public void maximizeWindow(){
        webDriver.manage().window().maximize();
    }

    public static void closedriver(){
        webDriver.close();
    }

}
