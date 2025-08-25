package com.asos;

import com.asos.pages.HomePage;
import com.asos.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class LoginTest extends BaseTest {
    WebDriver driver;

    @BeforeEach
    public void setup() {
        HomePage homePage = new HomePage();
        homePage.openSite();
        homePage.clickAcceptCookies();
        homePage.clickAcceptDelivery();
    }

    @Test
    public void test1() {
        LoginPage loginPage = new LoginPage();
        loginPage.clickLogIn();

        Assertions.assertEquals("Hi friend!", loginPage.getTitleLogInText());
    }

    @Test
    public void test2() {
        LoginPage loginPage = new LoginPage();
        loginPage.clickLogIn();
        loginPage.sendKeysEmail("@gmail");
        loginPage.clickContinue();

        Assertions.assertEquals("Oops! Please type in your correct email address", loginPage.getErrorMsgFromLogin());
    }
}
