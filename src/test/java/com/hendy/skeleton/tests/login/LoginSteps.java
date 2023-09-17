package com.hendy.skeleton.tests.login;

import com.hendy.skeleton.tests.BaseTest;
import io.cucumber.java.en.Given;

public class LoginSteps extends BaseTest {

    @Given("user open login page")
    public void user_open_login_page() {
        browser.homePage.clickLogin();
    }

}
