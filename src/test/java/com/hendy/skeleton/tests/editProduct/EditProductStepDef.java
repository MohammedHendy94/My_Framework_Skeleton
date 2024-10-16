package com.hendy.skeleton.tests.editProduct;

import com.hendy.skeleton.pages.AddProductPage;
import com.hendy.skeleton.tests.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class EditProductStepDef extends BaseTest {

    @When("user search for a product with {string} in the home page")
    public void userSearchForAProductWithInTheHomePage(String prodTitle) throws InterruptedException {
        Thread.sleep(2000);
        browser.ecommerce.eHomePage.searchForProduct(prodTitle);
    }

    @And("click on the edit icon for product title {string} in product page")
    public void clickOnTheEditIconForProductTitleInProductPage(String prodTitle)  {
        browser.ecommerce.addProductPage = browser.ecommerce.eHomePage.clickEditProduct(prodTitle);
    }

    @And("edit the title {string} in the product page")
    public void editTheTitleInTheProductPage(String title)  {
        browser.ecommerce.addProductPage.fillTitleTextBox(title);
    }

    @And("edit the description {string} in the product page")
    public void editTheDescriptionInTheProductPage(String description)  {
        browser.ecommerce.addProductPage.fillDescriptionTextBox(description);
    }

    @And("edit the price {string} in the product page")
    public void editThePriceInTheProductPage(String price)  {
        browser.ecommerce.addProductPage.fillPriceTextBox(price);
    }

    @And("click on save product button in the product page")
    public void clickOnSaveProductButtonInTheProductPage() {
        browser.ecommerce.eHomePage = browser.ecommerce.addProductPage.clickSaveProduct();
    }

    @Then("app should redirect the user to the home page with the new title {string} and {string} and {string}")
    public void appShouldRedirectTheUserToTheHomePageWithTheNewTitleAndAnd(String newTitle, String newDesc, String newPrice) throws InterruptedException {
        browser.ecommerce.eHomePage.searchForProduct(newTitle);
        Thread.sleep(1000);
        Assert.assertTrue(browser.ecommerce.eHomePage.checkProductExist(newTitle));
    }


}
