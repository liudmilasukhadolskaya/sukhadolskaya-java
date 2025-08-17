package com.duolingo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final String URL = "https://www.duolingo.com";
    private final String LINK_LOGIN = "//button[@data-test='have-account']";
    private final String TITLE_LOGIN = "//h1[@class='_3U467']";
    private WebDriver driver;

    LoginPage(WebDriver webDriver) {
        driver = webDriver;
    }

    public void clickLogIn() {
        WebElement linkLogIn = driver.findElement(By.xpath(LINK_LOGIN));
        linkLogIn.click();
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
