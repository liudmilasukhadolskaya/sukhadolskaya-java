package by.pizzatempo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static by.pizzatempo.LoginPageXpath.*;

public class LoginTest {
    WebDriver driver;

    @BeforeEach
    public void start() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.pizzatempo.by/");
    }

    @Test
    public void test1() {


        WebElement inputLoginElement = driver.findElement(By.xpath(INPUT_LOGIN));
        inputLoginElement.sendKeys("John Black");


        WebElement inputPswElement = driver.findElement(By.xpath(INPUT_PSW));
        inputPswElement.sendKeys("qwerty");


        WebElement submitElement = driver.findElement(By.xpath(BUTTON_SUBMIT));
        submitElement.click();

        // String messageXpath = "//div[@class='popupContent']";
        WebElement messageElement = driver.findElement(By.xpath(MESSAGE_TEXT));
        String actual = messageElement.getText();

        Assertions.assertEquals("Неверно указано имя пользователя или пароль.\n" +
                "Ok", actual);

    }

    @AfterEach
    public void finish() {
        driver.quit();
    }
}
