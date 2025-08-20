package by.nsv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final String URL="https://nsv.by";
    private final String LINK_LOGIN="//header//a[@data-name='auth']";
    private final String BUTTON_ACCEPT="//a[@id='paloma_cookie-accept']";

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openSite(){
        driver.get(URL);
    }

    public void clickAccept() {
        driver.findElement(By.xpath(BUTTON_ACCEPT)).click();
    }
    public void clickLogin(){
        driver.findElement(By.xpath(LINK_LOGIN)).click();
    }

}
