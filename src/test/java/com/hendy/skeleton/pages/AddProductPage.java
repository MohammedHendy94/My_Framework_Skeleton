package com.hendy.skeleton.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.time.Duration;

public class AddProductPage extends PageBase{

    private static By titleTextBox = By.xpath("//input[@name='title']");
    private static By descriptionTextBox = By.xpath("//input[@name='description']");
    private static By priceTextBox = By.xpath("//input[@name='price']");
    private static By createProductButton = By.xpath("//button[@type='submit']");

    private static By saveProductButton = By.xpath("//button[@type='submit']");



    public void fillTitleTextBox(String title){
        wait.until(ExpectedConditions.elementToBeClickable(titleTextBox));
        find(titleTextBox).sendKeys(Keys.CONTROL + "a");
        find(titleTextBox).sendKeys(Keys.DELETE);
        find(titleTextBox).sendKeys(title);
    }

    public void fillDescriptionTextBox(String description){
        wait.until(ExpectedConditions.elementToBeClickable(descriptionTextBox));
        find(descriptionTextBox).sendKeys(Keys.CONTROL + "a");
        find(descriptionTextBox).sendKeys(Keys.DELETE);
        find(descriptionTextBox).sendKeys(description);
    }

    public void fillPriceTextBox(String price) {
        wait.until(ExpectedConditions.elementToBeClickable(priceTextBox));
        find(priceTextBox).sendKeys(Keys.CONTROL + "a");
        find(priceTextBox).sendKeys(Keys.DELETE);
        find(priceTextBox).sendKeys(price);
    }

    public EHomePage clickCreateProduct(){
        find(createProductButton).submit();
        return new EHomePage();
    }

    public EHomePage clickSaveProduct(){
        find(saveProductButton).submit();
        return new EHomePage();
    }





}
