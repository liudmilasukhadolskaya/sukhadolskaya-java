package com.duolingo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private final String TITLE_LOGIN = "//h1[@class='_3U467']";
    private final String INVALID_EMAIL_ADDRESS_MSG= "//input[@data-test='email-input']/following::div[contains(@class, '_90spc') and contains(@class, '_3c2kP')][1]";
    private final String INVALID_PSW_MSG="//input[@data-test='password-input']/parent::div/following-sibling::div";
    private final String WRONG_PSW_MSG="//div[@data-test='invalid-form-field']";
    private final String ACCOUNT_DOES_NOT_EXIST_MSG="//div[@data-test='invalid-form-field']";
    private final String BUTTON_LOGIN="//button[@data-test='register-button']";
    private final String INPUT_EMAIL_FIELD="//input[@data-test='email-input']";
    private final String INPUT_PSW_FIED="//input[@data-test='password-input']";
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public String getTitleLogInText() {
        return driver.findElement(By.xpath(TITLE_LOGIN)).getText();
    }

    public String getInvalidEmailText(){
        return driver.findElement(By.xpath(INVALID_EMAIL_ADDRESS_MSG)).getText();
    }

    public String getInvalidPswText() {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(INVALID_PSW_MSG))).getText();
   }

    public String getWrongPswText(){
        return driver.findElement(By.xpath(WRONG_PSW_MSG)).getText();
    }

    public String getAccountNotExistText(){
        return driver.findElement(By.xpath(ACCOUNT_DOES_NOT_EXIST_MSG)).getText();
    }

    public void clickLoginButton(){
        driver.findElement(By.xpath(BUTTON_LOGIN)).click();
    }

    public void  sendKeysUserName(String username){
        driver.findElement(By.xpath(INPUT_EMAIL_FIELD)).sendKeys(username);
    }

    public void  sendKeysPsw(String psw){
        driver.findElement(By.xpath(INPUT_PSW_FIED)).sendKeys(psw);
    }
}
