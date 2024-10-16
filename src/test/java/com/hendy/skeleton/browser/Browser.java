package com.hendy.skeleton.browser;

import com.hendy.skeleton.driver.DriverSingleTon;
import com.hendy.skeleton.pages.HomePage;
import com.hendy.skeleton.platform.Ecommerce;

public class Browser {
    private final DriverSingleTon driverSingleTon = DriverSingleTon.setTheDriverSingleTonObject();
   public Ecommerce ecommerce;
    public Browser(){
        ecommerce = new Ecommerce();
    }
}
