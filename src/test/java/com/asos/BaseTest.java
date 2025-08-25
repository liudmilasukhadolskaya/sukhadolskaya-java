package com.asos;

import com.asos.webdriver.WebDriver;
import org.junit.jupiter.api.AfterEach;

public class BaseTest {
    @AfterEach
    public void closeBrowser() {
        WebDriver.quit();
    }
}
