package ru.praktikum_services.qa_scooter.electivetests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.praktikum_services.qa_scooter.pom.OrderPage;

import static org.junit.Assert.assertEquals;

public class ReferencesTest {

    private WebDriver driver;

    @Before
    public void start() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }

    @Test
    public void samokatLogoRef() {

        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.getUrl();
        objOrderPage.samokatLogoClick();

        assertEquals("Перехода на главную страницу Самоката по клику на логотип Самокат нет", "https://qa-scooter.praktikum-services.ru/", driver.getCurrentUrl());
    }

    @Test
    public void yandexLogoRef() {

        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.getUrl();
        objOrderPage.yandexLogoClick();
        objOrderPage.waitForLoadYandexPage();

        assertEquals("Перехода на главную страницу Яндекса по клику на логотип Яндекса нет", "https://yandex.ru/", driver.getCurrentUrl());
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
