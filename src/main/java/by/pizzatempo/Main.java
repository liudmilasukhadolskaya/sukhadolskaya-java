package by.pizzatempo;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.get("https://dodopizza.by/");
        driver.navigate().to("https://www.pizzatempo.by/");
        //String xpath="//a[@href='https://www.pizzatempo.by/registration/']";
        String xpath="//input[@name='astroauth_login']";
        //By byXpath=By.xpath(xpath);
        WebElement element= driver.findElement(By.xpath(xpath));
        element.sendKeys("John Black");
        //element.click();

        String xpath1="//input[@name='astroauth_pass']";
        WebElement element1= driver.findElement(By.xpath(xpath1));
        element1.sendKeys("qwerty");

        String xpath2="//input[@name='astroauth_submit']";
        WebElement element2= driver.findElement(By.xpath(xpath2));
        element2.click();

        String xpath3="//div[@class='popupContent']";
        WebElement element3= driver.findElement(By.xpath(xpath3));
        String actual=element3.getText();
        System.out.println(actual);
        Assertions.assertEquals("Неверно указано имя пользователя или пароль.\n" +
                "Ok", actual);


    }
}
