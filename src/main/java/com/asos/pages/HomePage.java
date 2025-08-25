package com.asos.pages;

public class HomePage {
    private final String URL = "https://www.asos.com";
    private final String ACCEPT_COOKIES = "//button[@id='onetrust-accept-btn-handler']";
    private final String ACCEPT_DELIVERY = "//button[@class='qQoHatg sY3mB1c london3-button UNPPQ3g']";
    private org.openqa.selenium.WebDriver driver;

    public HomePage() {
    }

    public void openSite() {
        com.asos.webdriver.WebDriver.getDriver().get(URL);
    }

    public HomePage clickAcceptCookies() {
        com.asos.webdriver.WebDriver.clickElement(ACCEPT_COOKIES);
        return this;
    }

    public void clickAcceptDelivery() {
        try {
            com.asos.webdriver.WebDriver.clickElement(ACCEPT_DELIVERY);
        } catch (Exception e) {
            System.out.println("Delivery pop up is not showing up");
        }
    }
}