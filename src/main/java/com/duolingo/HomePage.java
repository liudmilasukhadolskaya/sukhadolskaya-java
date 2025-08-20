package com.duolingo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final String URL = "https://www.duolingo.com";
    private final String ACCEPT_COOKIES = "//button[@id='onetrust-accept-btn-handler']";
    private final String LINK_LOGIN = "//button[@data-test='have-account']";
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openSite() {
        driver.get(URL);
    }

    public void acceptCookies() {
        driver.findElement(By.xpath(ACCEPT_COOKIES)).click();
    }

    public void clickLoginToAccountLink() {
        driver.findElement(By.xpath(LINK_LOGIN)).click();
    }
}
