package ru.praktikum_services.qa_scooter.electivetests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.praktikum_services.qa_scooter.pom.OrderPage;

import static org.junit.Assert.assertEquals;

public class ElectiveErrorMessagesTest {
    private WebDriver driver;

    @Before
    public void start() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }

    @Test
    public void firstNameErrorMessageTest() {

        String lastName = "Иванов";
        String address = "Фрунзенска, 29";
        String metroStation = "Черкизовская";
        String phoneNumber = "89214225467";
        String errorMessageFirstName = "Введите корректное имя";

        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.getUrl();
        objOrderPage.cookiesAcceptClick();
        objOrderPage.setLastName(lastName);
        objOrderPage.setAddressField(address);
        objOrderPage.setMetroStation(metroStation);
        objOrderPage.setPhoneNumber(phoneNumber);
        objOrderPage.nextButtonClick();
        String actual = objOrderPage.firstNameErrorMessage();
        assertEquals("Текст ошибки не -Введите корректное имя-", errorMessageFirstName, actual);
    }

    @Test
    public void lastNameErrorMessageTest() {

        String firstName = "Иван";
        String address = "Фрунзенска, 29";
        String metroStation = "Черкизовская";
        String phoneNumber = "89214225467";
        String errorMessageLastName = "Введите корректную фамилию";

        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.getUrl();
        objOrderPage.cookiesAcceptClick();
        objOrderPage.setFirstName(firstName);
        objOrderPage.setAddressField(address);
        objOrderPage.setMetroStation(metroStation);
        objOrderPage.setPhoneNumber(phoneNumber);
        objOrderPage.nextButtonClick();
        String actual = objOrderPage.lastNameErrorMessage();
        assertEquals("Текст ошибки не -Введите корректную фамилию-", errorMessageLastName, actual);
    }

    @Test
    public void addressErrorMessageTest() {

        String firstName = "Иван";
        String lastName = "Иванов";
        String metroStation = "Черкизовская";
        String phoneNumber = "89214225467";
        String errorMessage = "Введите корректный адрес";

        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.getUrl();
        objOrderPage.cookiesAcceptClick();
        objOrderPage.setFirstName(firstName);
        objOrderPage.setLastName(lastName);
        objOrderPage.setMetroStation(metroStation);
        objOrderPage.setPhoneNumber(phoneNumber);
        objOrderPage.nextButtonClick();
        String actual = objOrderPage.addressErrorMessage();
        assertEquals("Текст ошибки не -Введите корректный адрес-", errorMessage, actual);
    }

    @Test
    public void metroStationErrorMessageTest() {

        String firstName = "Иван";
        String lastName = "Иванов";
        String address = "Фрунзенска, 29";
        String phoneNumber = "89214225467";
        String errorMessage = "Выберите станцию";

        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.getUrl();
        objOrderPage.cookiesAcceptClick();
        objOrderPage.setFirstName(firstName);
        objOrderPage.setLastName(lastName);
        objOrderPage.setAddressField(address);
        objOrderPage.setPhoneNumber(phoneNumber);
        objOrderPage.nextButtonClick();
        String actual = objOrderPage.metroStationErrorMessage();
        assertEquals("Текст ошибки не -Выберите станцию-", errorMessage, actual);
    }

    @Test
    public void phoneNumberErrorMessageTest() {

        String firstName = "Иван";
        String lastName = "Иванов";
        String address = "Фрунзенска, 29";
        String metroStation = "Черкизовская";
        String phoneNumber = "8999";
        String errorMessage = "Введите корректный номер";

        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.getUrl();
        objOrderPage.cookiesAcceptClick();
        objOrderPage.setFirstName(firstName);
        objOrderPage.setLastName(lastName);
        objOrderPage.setAddressField(address);
        objOrderPage.setMetroStation(metroStation);
        objOrderPage.nextButtonClick();
        String actual = objOrderPage.phoneNumberErrorMessage();
        assertEquals("Текст ошибки не -Введите корректный номер-", errorMessage, actual);
    }

    @Test
    public void commentErrorMessageTest() {

        String comment = "none";
        String errorMessage = "Тут что-то не так";

        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.getUrl();
        objOrderPage.cookiesAcceptClick();
        objOrderPage.setFirstName("Иван");
        objOrderPage.setLastName("Иванов");
        objOrderPage.setAddressField("Фрунзенская, 29");
        objOrderPage.setMetroStation("Черкизовская");
        objOrderPage.setPhoneNumber("89214225467");
        objOrderPage.nextButtonClick();

        objOrderPage.orderButtonOrderPageClick();
        String actual = objOrderPage.commentErrorMessage();
        assertEquals("Текст ошибки не -Тут что-то не так-", errorMessage, actual);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
