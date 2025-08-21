package by.nsv.pages;

import by.nsv.webdriver.WebDriver;

public class HomePage {
    private final String URL = "https://nsv.by";
    private final String LINK_LOGIN = "//header//a[@data-name='auth']";
    private final String BUTTON_ACCEPT = "//a[@id='paloma_cookie-accept']";
    private final String BANNER_ADS = "//div[@class='modal_game_width_close']";

    public HomePage() {
    }

    public void openSite() {
        WebDriver.getDriver().get(URL);
    }

    public HomePage clickAccept() {
        WebDriver.clickElement(BUTTON_ACCEPT);
        return this;
    }

    public void clickLogin() {
        WebDriver.clickElement(LINK_LOGIN);
    }

    public void closeBanner() {
        try {
            WebDriver.clickElement(BANNER_ADS);
        } catch (Exception e) {
            System.out.println("Banner is not available");
        }
    }
}
