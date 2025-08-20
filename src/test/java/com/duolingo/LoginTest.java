package com.duolingo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @BeforeEach
    public void setUp() {
        HomePage homePage = new HomePage(driver);
        homePage.openSite();
        homePage.acceptCookies();
        homePage.clickLoginToAccountLink();
    }

    @Test
    @DisplayName("Verify login form is opened")
    public void test1() {
        LoginPage loginPage = new com.duolingo.LoginPage(driver);

        Assertions.assertEquals("Log in", loginPage.getTitleLogInText());
    }

    @Test
    @DisplayName("Verify messages for missing username and psw")
    public void test2() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginButton();

        Assertions.assertEquals("Invalid email address", loginPage.getInvalidEmailText());
        Assertions.assertEquals("Password too short", loginPage.getInvalidPswText());
    }

    @Test
    @DisplayName("Verify message for missing username")
    public void test3() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysPsw("12345678");
        loginPage.clickLoginButton();

        Assertions.assertEquals("Invalid email address", loginPage.getInvalidEmailText());
    }

    @Test
    @DisplayName("Verify message for missing psw")
    public void test4() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysUserName("qwerty@gmail.com");
        loginPage.clickLoginButton();

        Assertions.assertEquals("Password too short", loginPage.getInvalidPswText());
    }

    @Test
    @DisplayName("Verify message for an account that does not exist")
    public void test5() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysUserName("@gmail.com");
        loginPage.sendKeysPsw("carol7569");
        loginPage.clickLoginButton();

        Assertions.assertEquals("There is no Duolingo account associated with @gmail.com. Please try again.", loginPage.getAccountNotExistText());
    }

    @Test
    @DisplayName("Verify message for a wrong psw")
    public void test6() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysUserName("qwerty@gmail.com");
        loginPage.sendKeysPsw("carol7569");
        loginPage.clickLoginButton();

        Assertions.assertEquals("Wrong password. Please try again.", loginPage.getWrongPswText());
    }
}

