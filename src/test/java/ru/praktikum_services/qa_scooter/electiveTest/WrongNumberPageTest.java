package ru.praktikum_services.qa_scooter.electiveTest;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertEquals;

public class WrongNumberPageTest {

    private WebDriver driver;

    @Test
        public void CheckWrongNumberStatus() {

        final String orderNumber = "4";
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);
        objMainPage.orderStatusButtonClick();
        objMainPage.waitForOrderNumberField();
        objMainPage.setOrderNumber(orderNumber);
        objMainPage.goButtonClick();
        StatusPage objStatusPage = new StatusPage(driver);
        objStatusPage.waitNotFoundPic();
        boolean actual = objStatusPage.checkNotFoundPic();

        assertEquals("Нет надписи, что заказа нет", true, actual);

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}