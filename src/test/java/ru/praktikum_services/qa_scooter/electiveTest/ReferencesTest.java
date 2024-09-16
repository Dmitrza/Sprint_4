package ru.praktikum_services.qa_scooter.electiveTest;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertEquals;

public class ReferencesTest {

    private WebDriver driver;

    @Test
    public void samokatLogoRef() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/order/");
        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.samokatLogoClick();

        assertEquals("Перехода на главную страницу Самоката по клику на логотип Самокат нет", "https://qa-scooter.praktikum-services.ru/", driver.getCurrentUrl());
    }

    @Test
    public void yandexLogoRef() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.yandexLogoClick();
        objOrderPage.waitForLoadPage();

        assertEquals("Перехода на главную страницу Яндекса по клику на логотип Яндекса нет", "https://yandex.ru/", driver.getCurrentUrl());
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
