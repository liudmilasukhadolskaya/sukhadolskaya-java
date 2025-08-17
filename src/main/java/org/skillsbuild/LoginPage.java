package org.skillsbuild;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final String URL = "https://skillsbuild.org/";
    private final String LINK_LOGIN = "//button[@class='sb-header-login sb--header-login-btn cds--btn cds--btn--ghost']";
    private final String TITLE_LOGIN = "//h2[@id='cds--modal-header__heading--modal-id-«r0»']";
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
