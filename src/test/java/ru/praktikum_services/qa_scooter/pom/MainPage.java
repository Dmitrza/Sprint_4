package ru.praktikum_services.qa_scooter.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private final WebDriver driver;
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";

    // private By questionAccordion = By.xpath(".//div[text()='%s']");
    // private By answerToQuestion = By.xpath(".//div[@id='accordion__panel-0']/p");

    private By orderStatusButton = By.xpath(".//button[text() = 'Статус заказа']");
    private By orderNumberField = By.xpath(".//input[@placeholder = 'Введите номер заказа']");
    private By goButton = By.xpath(".//button[text() = 'Go!']");

    private By upperOrderButtonMainPage = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[text()='Заказать']");
    private By lowerOrderButtonMainPage = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']");
    private By cookiesAcceptButton = By.id("rcc-confirm-button");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getUrl() {
        driver.get(URL);
    }


    public void openQuestionAccordion(String question) {
        String inputQuestion = String.format(".//div[text()='%s']", question);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(inputQuestion)));
        driver.findElement(By.xpath(inputQuestion)).click();
    }

    public String getAnswerToQuestion(String answer){
        String inputAnswer = String.format(".//p[text()='%s']", answer);
        new WebDriverWait(driver, Duration.ofSeconds(1))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(inputAnswer)));
        return driver.findElement(By.xpath(inputAnswer)).getText();
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

