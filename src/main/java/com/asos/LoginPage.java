package com.asos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final String URL = "https://www.asos.com";
    private final String BUTTON_ACCOUNT = "//button[@data-testid='myAccountIcon']";
    private final String BUTTON_SIGNIN = "//button[@data-testid='signin-link']";
    private final String TITLE_LOGIN = "//h1[@class='TaneGk6J468LunejXKMC']";
    private WebDriver driver;

    LoginPage(WebDriver webDriver) {
        driver = webDriver;
    }

    public void clickLogIn() {
        WebElement buttonAccount = driver.findElement(By.xpath(BUTTON_ACCOUNT));
        buttonAccount.click();
        WebElement buttonSignin = driver.findElement(By.xpath(BUTTON_SIGNIN));
        buttonSignin.click();
    }

    public String getTitleLogInText() {
        WebElement titleLogIn = driver.findElement(By.xpath(TITLE_LOGIN));
        String titleLogInText = titleLogIn.getText();
        return titleLogInText;
    }

    public void openSite() {
        driver.get(URL);
    }
}
