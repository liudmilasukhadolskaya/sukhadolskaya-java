package by.nsv.pages;

import by.nsv.webdriver.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final String HEAD_FORM_TITLE = "//div[@class='form_head']//h2";
    private final String USER_LOGIN_POPUP = "USER_LOGIN_POPUP";
    private final String USER_PASSWORD_POPUP = "USER_PASSWORD_POPUP";
    private final String BUTTON_LOGIN = "Login";
    private final String USER_LOGIN_POPUP_ERROR = "USER_LOGIN_POPUP-error";
    private final String USER_PASSWORD_POPUP_ERROR = "USER_PASSWORD_POPUP-error";

    private org.openqa.selenium.WebDriver driver;

    public LoginPage() {
        this.driver = WebDriver.getDriver();
    }

    public String getTitleLoginText() {
        return WebDriver.getTextFromElement(HEAD_FORM_TITLE);
    }

    private WebElement getElement() {
        return driver.findElement(By.xpath(HEAD_FORM_TITLE));
    }

    public void sendKeysLogin(String login) {
        driver.findElement(By.id(USER_LOGIN_POPUP)).sendKeys(login);
    }

    public void sendKeysPsw(String psw) {
        driver.findElement(By.id(USER_PASSWORD_POPUP)).sendKeys(psw);
    }

    public void clickButtonLogin() {
        driver.findElement(By.name(BUTTON_LOGIN)).click();
    }

    public String getUserLoginPopupErrorText() {
        return driver.findElement(By.id(USER_LOGIN_POPUP_ERROR)).getText();
    }

    public String getUserPswPopupErrorText() {
        return driver.findElement(By.id(USER_PASSWORD_POPUP_ERROR)).getText();
    }
}
