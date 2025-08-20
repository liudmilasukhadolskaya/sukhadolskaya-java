package by.nsv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {
     @BeforeEach
      public void openSiteAcceptCookiesClickLogin(){
         HomePage homePage= new HomePage(driver);
         homePage.openSite();
         homePage.clickAccept();
         homePage.clickLogin();

      }

    @Test
    public void test1() {
         LoginPage loginPage= new LoginPage(driver);
         Assertions.assertEquals("Личный кабинет", loginPage.getTitleLoginText() );
    }

    @Test
    public void test2(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.clickButtonLogin();

Assertions.assertEquals("Заполните это поле",loginPage.getUserLoginPopupErrorText());
Assertions.assertEquals("Заполните это поле",loginPage.getUserPswPopupErrorText());
    }

    @Test
    public void test3(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.sendKeysLogin("user");
        loginPage.clickButtonLogin();

        Assertions.assertEquals("Заполните это поле",loginPage.getUserPswPopupErrorText());
    }

    @Test
    public void test4(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.clickButtonLogin();
        loginPage.sendKeysPsw("1234567");

        Assertions.assertEquals("Заполните это поле",loginPage.getUserLoginPopupErrorText());
    }
}

