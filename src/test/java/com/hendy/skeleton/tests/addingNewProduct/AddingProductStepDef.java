package com.hendy.skeleton.tests.addingNewProduct;

import com.hendy.skeleton.tests.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddingProductStepDef extends BaseTest {


    @Given("user open the home page")
    public void user_open_the_home_page() {
        browser.ecommerce.eHomePage.verifyHomeIsOpen();
    }

    @When("user click on add new product in the home page")
    public void user_click_on_add_new_product_in_the_home_page() {
        browser.ecommerce.addProductPage = browser.ecommerce.eHomePage.clickAddProduct();
    }
    @When("enter the title {string} in the add product page")
    public void enter_the_title_in_the_add_product_page(String title) {
      browser.ecommerce.addProductPage.fillTitleTextBox(title);
    }
    @When("enter the description {string} in the add product page")
    public void enter_the_description_in_the_add_product_page(String description) {
        browser.ecommerce.addProductPage.fillDescriptionTextBox(description);
    }
    @When("enter the price {string} in the add product page")
    public void enter_the_price_in_the_add_product_page(String price){
        browser.ecommerce.addProductPage.fillPriceTextBox(price);
    }
    @When("click on create product button in the add product page")
    public void click_on_create_product_button_in_the_add_product_page() {
        browser.ecommerce.eHomePage= browser.ecommerce.addProductPage.clickCreateProduct();
    }

    @Then("app should redirect the user to the home page with product with title {string} added")
    public void appShouldRedirectTheUserToTheHomePageWithProductWithTitleAdded(String prodTitle) throws InterruptedException {
        browser.ecommerce.eHomePage.searchForProduct(prodTitle);
        Thread.sleep(1000);
        Assert.assertTrue(browser.ecommerce.eHomePage.checkProductExist(prodTitle));
    }
}
