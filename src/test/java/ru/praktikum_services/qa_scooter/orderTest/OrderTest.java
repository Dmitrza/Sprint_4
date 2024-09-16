package ru.praktikum_services.qa_scooter.orderTest;


import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class OrderTest {

    private final String firstName;
    private final String lastName;
    private final String address;
    private final String metroStation;
    private final String phoneNumber;

    private final String toWhenBringSamokat;
    private final String rentDuration;
    private final String samokatColour;
    private final String comment;

    //private WebDriver driver;

    public OrderTest (String firstName, String lastName, String address, String metroStation,
                      String phoneNumber, String toWhenBringSamokat, String rentDuration,
                      String samokatColour, String comment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.metroStation = metroStation;
        this.phoneNumber = phoneNumber;
        this.toWhenBringSamokat = toWhenBringSamokat;
        this.rentDuration = rentDuration;
        this.samokatColour = samokatColour;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] getOrderInfo() {
        return new Object[][]{
                {"Иван", "Иванов", "ул. Тестировщиков, 62, 3", "Черкизовская", "89998887766", "20.09.2024", "сутки", "чёрный жемчуг", "жду вас с нетерпением!"},
                {"Драгана", "Чулинович", "бул. Михаила Пупина 162, кв. 3", "Митино", "+79114323221", "18.09.2024", "пятеро суток", "серая безысходность", "Драго ми йе!"}
        };
    }

    @Test
    public void OrderProcess() {
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPageOrder objMainPage = new MainPageOrder(driver);
        objMainPage.cookiesAcceptClick();
        objMainPage.upperOrderButtonClick();


        OrderPageScooter objOrderPage = new OrderPageScooter(driver);
        objOrderPage.waitForLoadOrderPage();
        objOrderPage.setFirstName(firstName);
        objOrderPage.setLastName(lastName);
        objOrderPage.setAddressField(address);
        objOrderPage.setMetroStation(metroStation);
        objOrderPage.setPhoneNumber(phoneNumber);
        objOrderPage.nextButtonClick();
        objOrderPage.setToWhenBringSamokat(toWhenBringSamokat);
        objOrderPage.setRentDuration(rentDuration);
        if (samokatColour.equals("чёрный жемчуг")) {
            objOrderPage.setSamokatColourBlack();
        } else if (samokatColour.equals("серая безысходность")) {
            objOrderPage.setSamokatColourGrey();
        }
        objOrderPage.setComment(comment);
        objOrderPage.orderButtonOrderPageClick();
        objOrderPage.yesButtonPopupClick();

        assertEquals("Заказ не оформлен", true, objOrderPage.checkCompletedOrderPopup());

        driver.quit();
    }

    @Test
    public void lowerOrderButtonTest() {
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPageOrder objMainPage = new MainPageOrder(driver);
        objMainPage.cookiesAcceptClick();
        objMainPage.lowerOrderButtonClick();

        OrderPageScooter objOrderPage = new OrderPageScooter(driver);
        objOrderPage.waitForLoadOrderPage();

        assertEquals("Кнопка Заказать внизу страницы не работает или работает некорректно",
                true, objOrderPage.checkFirstNameField());

        driver.quit();
    }

}
