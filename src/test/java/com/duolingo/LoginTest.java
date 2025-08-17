package com.duolingo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Test
    public void test1() {
        LoginPage loginPage = new com.duolingo.LoginPage(driver);
        loginPage.openSite();
        loginPage.clickLogIn();


        Assertions.assertEquals("Log in", loginPage.getTitleLogInText());
    }

    @AfterEach
    public void closeBrowser() {
        driver.quit();
    }
}
