package com.hendy.skeleton.browser;

import com.hendy.skeleton.driver.DriverSingleTon;
import com.hendy.skeleton.pages.HomePage;

public class Browser {
    private final DriverSingleTon driverSingleTon = DriverSingleTon.setTheDriverSingleTonObject();
   public HomePage homePage;
    public Browser(){
        homePage = new HomePage();
    }
}
