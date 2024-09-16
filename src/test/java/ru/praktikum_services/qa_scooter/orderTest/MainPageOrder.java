package ru.praktikum_services.qa_scooter.orderTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageOrder {
    private WebDriver driver;

    private By upperOrderButtonMainPage = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[text()='Заказать']");
    private By lowerOrderButtonMainPage = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']");
    private By cookiesAcceptButton = By.id("rcc-confirm-button");

    public MainPageOrder(WebDriver driver) {
        this.driver = driver;
    }

    public void cookiesAcceptClick() {
        driver.findElement(cookiesAcceptButton).click();
    }

    public void upperOrderButtonClick() {
        driver.findElement(upperOrderButtonMainPage).click();
    }

    public void lowerOrderButtonClick() {
        driver.findElement(lowerOrderButtonMainPage).click();
    }

}
