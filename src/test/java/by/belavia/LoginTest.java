package by.belavia;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }

@Test
    public void test1() {
        String url = "https://belavia.by/";
       /* WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));*/
        driver.navigate().to(url);


        final String LINK_PERSONAL_ACCOUNT = "//a[@id='ffp-account']";
        WebElement linkPersonalAccount = driver.findElement(By.xpath(LINK_PERSONAL_ACCOUNT));
        linkPersonalAccount.click();


        final String TITLE_PERSONAL_ACCOUNT_FORM = "//div[@class='title-2IBhr']";
        WebElement titlePersonalAccountForm = driver.findElement(By.xpath(TITLE_PERSONAL_ACCOUNT_FORM));
        String titlePersonalAccountText=titlePersonalAccountForm.getText();

        final String TEXT_PERSONAL_ACCOUNT_FORM="//div[@class='text-3uUxD']";
        WebElement textPersonalAccountForm= driver.findElement(By.xpath(TEXT_PERSONAL_ACCOUNT_FORM));
        String textPersonalAccount=textPersonalAccountForm.getText();

        Assertions.assertEquals("Вход",titlePersonalAccountText);
        Assertions.assertEquals("Если у вас нет аккаунта — он создастся автоматически",textPersonalAccount);

    }

    @Test
    public void test2() {

        LoginPage loginPage= new LoginPage(driver);
        loginPage.openSite();
        loginPage.clickLinkAccount();


        Assertions.assertEquals("Вход",loginPage.getTitleAccountFormText());
        Assertions.assertEquals("Если у вас нет аккаунта — он создастся автоматически",loginPage.getTextAccountFormText());
    }

    @AfterEach
    public void finish(){
        driver.quit();
    }
}
