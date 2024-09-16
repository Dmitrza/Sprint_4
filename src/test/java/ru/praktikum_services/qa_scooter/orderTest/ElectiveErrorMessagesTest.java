package ru.praktikum_services.qa_scooter.orderTest;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertEquals;

public class ElectiveErrorMessagesTest {
    private WebDriver driver;

    @Test
    public void FirstNameErrorMessageTest() {

        String firstName = "Ivan";
        String errorMessage = "Введите корректное имя";

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/order/");
        OrderPageScooter objOrderPage = new OrderPageScooter(driver);

        objOrderPage.cookiesAcceptClick();
        objOrderPage.setFirstName(firstName);
        objOrderPage.nextButtonClick();
        String actual = objOrderPage.firstNameErrorMessage();
        assertEquals("Текст ошибки не -Введите корректное имя-", errorMessage, actual);
    }

    @Test
    public void LastNameErrorMessageTest() {

        String lastName = "Ivanov";
        String errorMessage = "Введите корректную фамилию";

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/order/");
        OrderPageScooter objOrderPage = new OrderPageScooter(driver);

        objOrderPage.cookiesAcceptClick();
        objOrderPage.setLastName(lastName);
        objOrderPage.nextButtonClick();
        String actual = objOrderPage.lastNameErrorMessage();
        assertEquals("Текст ошибки не -Введите корректную фамилию-", errorMessage, actual);
    }

    @Test
    public void AddressErrorMessageTest() {

        String address = "Ligovskaya";
        String errorMessage = "Введите корректный адрес";

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/order/");
        OrderPageScooter objOrderPage = new OrderPageScooter(driver);

        objOrderPage.cookiesAcceptClick();
        objOrderPage.setAddressField(address);
        objOrderPage.nextButtonClick();
        String actual = objOrderPage.addressErrorMessage();
        assertEquals("Текст ошибки не -Введите корректный адрес-", errorMessage, actual);
    }

    @Test
    public void MetroStationErrorMessageTest() {

        String errorMessage = "Выберите станцию";

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/order/");
        OrderPageScooter objOrderPage = new OrderPageScooter(driver);

        objOrderPage.cookiesAcceptClick();
        objOrderPage.nextButtonClick();
        String actual = objOrderPage.metroStationErrorMessage();
        assertEquals("Текст ошибки не -Выберите станцию-", errorMessage, actual);
    }

    @Test
    public void phoneNumberErrorMessageTest() {

        String phoneNumber = "8999";
        String errorMessage = "Введите корректный номер";

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/order/");
        OrderPageScooter objOrderPage = new OrderPageScooter(driver);

        objOrderPage.cookiesAcceptClick();
        objOrderPage.setPhoneNumber(phoneNumber);
        objOrderPage.nextButtonClick();
        String actual = objOrderPage.phoneNumberErrorMessage();
        assertEquals("Текст ошибки не -Введите корректный номер-", errorMessage, actual);
    }

    @Test
    public void commentErrorMessageTest() {

        String comment = "none";
        String errorMessage = "Тут что-то не так";

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/order/");
        OrderPageScooter objOrderPage = new OrderPageScooter(driver);

        objOrderPage.cookiesAcceptClick();
        objOrderPage.setFirstName("Иван");
        objOrderPage.setLastName("Иванов");
        objOrderPage.setAddressField("Фрунзенская");
        objOrderPage.setMetroStation("Черкизовская");
        objOrderPage.setPhoneNumber("89998887766");
        objOrderPage.nextButtonClick();

        objOrderPage.setComment(comment);
        objOrderPage.orderButtonOrderPageClick();
        String actual = objOrderPage.commentErrorMessage();
        assertEquals("Текст ошибки не -Тут что-то не так-", errorMessage, actual);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
