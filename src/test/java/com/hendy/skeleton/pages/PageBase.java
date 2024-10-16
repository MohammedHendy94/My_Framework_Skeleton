package com.hendy.skeleton.pages;

import com.hendy.skeleton.driver.DriverSingleTon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PageBase {
  WebDriver driver = DriverSingleTon.getWebDriver();
  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

  Actions action = new Actions(driver);


  public WebElement find(By element){
    return driver.findElement(element);
  }
  public List<WebElement>  findElements(By locator){
    return driver.findElements(locator);
  }

}
