package ru.praktikum_services.qa_scooter.electiveTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;

    private By orderStatusButton = By.xpath(".//button[text() = 'Статус заказа']");
    private By orderNumberField = By.xpath(".//input[@placeholder = 'Введите номер заказа']");
    private By goButton = By.xpath(".//button[text() = 'Go!']");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void orderStatusButtonClick(){
        driver.findElement(orderStatusButton).click();
    }

    public void waitForOrderNumberField() {
        new WebDriverWait(driver, Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOfElementLocated(orderNumberField));
    }

    public void setOrderNumber(String orderNumber) {
        driver.findElement(orderNumberField).sendKeys(orderNumber);
    }

    public void goButtonClick() {
        driver.findElement(goButton).click();
    }

}

