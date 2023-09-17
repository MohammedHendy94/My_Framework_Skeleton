package com.hendy.skeleton.tests;

import com.hendy.skeleton.browser.Browser;
import com.hendy.skeleton.driver.DriverSingleTon;

import java.util.Properties;

public class BaseTest {
    protected DriverSingleTon driver;
    protected static Browser browser = new Browser();
    protected static Properties properties;
}
