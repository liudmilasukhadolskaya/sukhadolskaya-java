package by.belavia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final String URL = "https://belavia.by/";
    private final String LINK_PERSONAL_ACCOUNT = "//a[@id='ffp-account']";
    private final String TITLE_PERSONAL_ACCOUNT_FORM = "//div[@class='title-2IBhr']";
    private final String TEXT_PERSONAL_ACCOUNT_FORM = "//div[@class='text-3uUxD']";
    private WebDriver driver;

    LoginPage(WebDriver webDriver) {
        driver = webDriver;
    }

    public void clickLinkAccount() {
        WebElement linkPersonalAccount = driver.findElement(By.xpath(LINK_PERSONAL_ACCOUNT));
        linkPersonalAccount.click();
    }

    public String getTitleAccountFormText() {
        WebElement titlePersonalAccountForm = driver.findElement(By.xpath(TITLE_PERSONAL_ACCOUNT_FORM));
        String titlePersonalAccountText = titlePersonalAccountForm.getText();
        return titlePersonalAccountText;
    }

    public String getTextAccountFormText() {
        WebElement textPersonalAccountForm = driver.findElement(By.xpath(TEXT_PERSONAL_ACCOUNT_FORM));
        String textPersonalAccount = textPersonalAccountForm.getText();
        return textPersonalAccount;
    }

    public void openSite() {
        driver.get(URL);
    }

}
