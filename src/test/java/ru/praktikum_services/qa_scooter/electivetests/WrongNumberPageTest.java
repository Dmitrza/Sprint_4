package ru.praktikum_services.qa_scooter.electivetests;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.praktikum_services.qa_scooter.pom.MainPage;
import ru.praktikum_services.qa_scooter.pom.StatusPage;

import static org.junit.Assert.assertEquals;

public class WrongNumberPageTest {

    private WebDriver driver;

    @Test
        public void checkWrongNumberStatus() {

        final String orderNumber = "4";
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);

        MainPage objMainPage = new MainPage(driver);
        objMainPage.getUrl();
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