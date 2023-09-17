package com.hendy.skeleton.pages;

import com.hendy.skeleton.driver.DriverSingleTon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBase {
  WebDriver driver = DriverSingleTon.getWebDriver();

  public WebElement find(By element){
    return driver.findElement(element);
  }

}
