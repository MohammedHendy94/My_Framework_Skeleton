package com.hendy.skeleton.tests;

import com.hendy.skeleton.ReadProperties.ReadPropertis;
import com.hendy.skeleton.driver.DriverSingleTon;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class HoolksHandler extends BaseTest{

    String link;

    @Before
    public void setTheStart() throws IOException {
        driver = DriverSingleTon.setTheDriverSingleTonObject();
        properties = ReadPropertis.envProperties();
        driver.maximizeWindow();
        link = properties.getProperty("url");
        driver.navigatTo(link);
    }

    @After
    public void setTheEnd(){
       // DriverSingleTon.closedriver();
    }


}
