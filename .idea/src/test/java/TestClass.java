/**
 * Created by Di on 18.10.2016.
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.AfterMethod;
public class TestClass {

     public WebDriver driver;

    @Test

    public void main() {


            // Создаем экземпляр WebDriver
            // Следует отметить что скрипт работает с интерфейсом,
            // а не с реализацией.
            WebDriver driver = new ChromeDriver();

            // Открываем гугл, используя драйвер
            driver.get("http://www.google.com");
            // По-другому это можно сделать так:
            // driver.navigate().to("http://www.google.com");

            // Находим элемент по атрибуту name
            WebElement element = driver.findElement(By.name("q"));

            // Вводим текст
            element.sendKeys("Selenium");

            // Отправляем форму, при этом дравер сам определит как отправить форму по элементу
            element.submit();

            // Проверяем тайтл страницы
            System.out.println("Page title is: " + driver.getTitle());

            // Страницы гугл динамически отрисовывается с помощью javascript
            // Ждем загрузки страницы с таймаутом в 10 секунд
            (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver d) {
                    return d.getTitle().toLowerCase().startsWith("selenium");
                }
            });

            // Ожидаем увидеть: "Selenium - Google Search"
            System.out.println("Page title is: " + driver.getTitle());

            // Закрываем браузер
            driver.quit();
        }
    }