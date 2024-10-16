package com.hendy.skeleton.pages;

import com.github.dockerjava.core.dockerfile.DockerfileStatement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class EHomePage extends PageBase {

    private static By addProductButton = By.xpath("//a[@href='/add']");

    private static By searchTextBox = By.xpath("//input[@placeholder='Search for products ...']");

    private static By productsCards = By.xpath("//div[@class='sc-jXbUNg eZFFTp flex flex-col p-4']");


    private By chooseEditButton (String prodTitle){
        prodTitle =prodTitle.replace(' ','-');
        return  By.xpath("//a[@href='/edit/"+prodTitle+"']");
    }




    public void verifyHomeIsOpen(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://e-commerce-kib.netlify.app/");
    }

    public AddProductPage clickAddProduct(){
        find(addProductButton).click();
    return new AddProductPage();}

    public void searchForProduct(String productTitle){
        wait.until(ExpectedConditions.presenceOfElementLocated(searchTextBox));
        find(searchTextBox).clear();
        find(searchTextBox).sendKeys(productTitle);
        find(searchTextBox).sendKeys(Keys.ENTER);
    }
    public boolean checkProductExist(String productTitle){
        for (WebElement element : findElements(productsCards)) {
            if (element.getText().contains(productTitle)) {
               return true;
                }
            }
        return false;
    }

    public AddProductPage clickEditProduct(String prodTitle){
        wait.until(ExpectedConditions.presenceOfElementLocated(chooseEditButton(prodTitle)));
        find(chooseEditButton(prodTitle)).click();
        return new AddProductPage();
    }



}
