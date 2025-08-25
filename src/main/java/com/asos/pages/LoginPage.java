package com.asos.pages;

import com.asos.webdriver.WebDriver;

public class LoginPage {

    private final String BUTTON_ACCOUNT = "//button[@data-testid='myAccountIcon']";
    private final String BUTTON_SIGNIN = "//button[@data-testid='signin-link']";
    private final String TITLE_LOGIN = "//h1[@class='TaneGk6J468LunejXKMC']";
    private final String INPUT_EMAIL="//input[@id='email']";
    private final String BUTTON_CONTINUE="//button[@type='submit']";
    private final String ERROR_MSG_LOGIN="//div[@class='hgdilB1r9wGHTwyS5Aow']";
  private org.openqa.selenium.WebDriver driver;

    public LoginPage() {
        this.driver = WebDriver.getDriver();
    }

    public void clickLogIn() {
   WebDriver.clickElement(BUTTON_ACCOUNT);
        WebDriver.clickElement(BUTTON_SIGNIN);
    }

    public String getTitleLogInText() {

        return WebDriver.getTextFromElement(TITLE_LOGIN);
    }

    public void sendKeysEmail(String email){
        WebDriver.sendKeysToElement(INPUT_EMAIL,email);
    }

    public void clickContinue(){
        WebDriver.clickElement(BUTTON_CONTINUE);
    }

    public String getErrorMsgFromLogin() {
    return WebDriver.getTextFromElement(ERROR_MSG_LOGIN);
    }

}
