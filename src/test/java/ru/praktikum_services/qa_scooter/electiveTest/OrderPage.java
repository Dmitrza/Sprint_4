package ru.praktikum_services.qa_scooter.electiveTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPage {
    private WebDriver driver;

    private By samokatLogo = By.xpath(".//img[@alt = 'Scooter']");
    private By yandexLogo = By.xpath(".//img[@alt = 'Yandex']");

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForLoadPage() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//a[@aria-label = 'Яндекс']"))));
    }

    public void samokatLogoClick() {
        driver.findElement(samokatLogo).click();
    }

    public void yandexLogoClick() {
        driver.findElement(yandexLogo).click();
    }

}
