package com.hendy.skeleton.tests.deleteProduct;

import com.hendy.skeleton.tests.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DeleteProductStepDef extends BaseTest {

    @When("click on the delete icon in the home page")
    public void click_on_the_delete_icon_in_the_home_page() throws InterruptedException {
       Thread.sleep(2000);
        browser.ecommerce.eHomePage.clickDeleteProduct();
    }
    @Then("product should be deleted")
    public void product_should_be_deleted() throws InterruptedException {
        Thread.sleep(5000);    }
    @Then("not exist anymore on the home page search with the previous title {string}")
    public void not_exist_anymore_on_the_home_page_search_with_the_previous_title(String prodTitle) throws InterruptedException {
        Thread.sleep(2000);
        browser.ecommerce.eHomePage.searchForProduct(prodTitle);
        Assert.assertFalse(browser.ecommerce.eHomePage.checkProductExist(prodTitle));
    }
}
