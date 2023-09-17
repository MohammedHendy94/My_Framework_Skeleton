package com.hendy.skeleton.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

   private static By loginbt = By.xpath("//a[@class='ico-login']");

    public void clickLogin(){find(loginbt).click();}

}
