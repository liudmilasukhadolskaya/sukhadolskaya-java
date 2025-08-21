package by.nsv;

import by.nsv.webdriver.WebDriver;
import org.junit.jupiter.api.AfterEach;

public class BaseTest {

    @AfterEach
    public void closeBrowser() {
        WebDriver.quit();
    }
}
