package ru.praktikum_services.qa_scooter.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPage {
    private final WebDriver driver;
    public static final String URL = "https://qa-scooter.praktikum-services.ru/order/";

    //Принять куки
    private By cookiesAcceptButton = By.id("rcc-confirm-button");

    //1-ая страница с полями заказа
    private By firstNameField = By.xpath(".//input[@placeholder = '* Имя']");
    private By lastNameField = By.xpath(".//input[@placeholder = '* Фамилия']");
    private By addressField = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");
    private By metroStationField = By.xpath(".//input[@placeholder = '* Станция метро']");
    private By phoneNumberField = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");
    private By nextButton = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button[text()='Далее']");

    //2-ая страница с полями заказа
    private By toWhenBringSamokatField = By.xpath(".//input[@placeholder = '* Когда привезти самокат']");
    private By toWhenBringSamokatSelectedDate = By.xpath(".//div[@class = 'react-datepicker__week']/div[@tabindex = '0']");
    private By rentDurationField = By.xpath(".//div[@class = 'Dropdown-root']");
    //private By rentDurationOption = By.xpath(".//div[normalize-space(text())='%s']");
    private By samokatColourBlack = By.id("black");
    //private By samokatColourBlackCheckbox = By.xpath(".//input[@id = 'black']/parent::label/parent::div");
    private By samokatColourGrey = By.id("grey");
    //private By samokatColourGreyCheckbox = By.xpath(".//input[@id = 'grey']/parent::label/parent::div");
    private By commentField = By.xpath(".//input[@placeholder=\"Комментарий для курьера\"]");
    private By orderButtonOrderPage = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");
    //кнопа "Да" попапа Подвердить заказ
    private By yesButtonPopup = By.xpath(".//button[text()='Да']");
    //Форма попапа о совершенном заказе
    private By completedOrderPopup = By.className("Order_Modal__YZ-d3");

    //Сообщения об ошибках Страница 1
    private By firstNameErrorMessage = By.xpath(".//div[text()='Введите корректное имя']");
    private By lastNameErrorMessage = By.xpath(".//div[text()='Введите корректную фамилию']");
    private By addressErrorMessage = By.xpath(".//div[text()='Введите корректный адрес']");
    private By metroStationErrorMessage = By.xpath(".//div[text()='Выберите станцию']");
    private By phoneNumberErrorMessage = By.xpath(".//div[text()='Введите корректный номер']");
    //Сообщения об ошибках Страница 2
    private By commentErrorMessage = By.xpath(".//div[text()='Комментарий для курьера']");

    private By samokatLogo = By.xpath(".//img[@alt = 'Scooter']");
    private By yandexLogo = By.xpath(".//img[@alt = 'Yandex']");


    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getUrl() {
        driver.get(URL);
    }

    public void waitForLoadOrderPage() {
    new WebDriverWait(driver, Duration.ofSeconds(3))
            .until(ExpectedConditions.visibilityOfElementLocated(firstNameField));
    }

    public void cookiesAcceptClick() {
        driver.findElement(cookiesAcceptButton).click();
    }

    public boolean checkFirstNameField() {
        return driver.findElement(firstNameField).isDisplayed();
    }

    public void setFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setAddressField(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void setMetroStation(String metroStation) {
        driver.findElement(metroStationField).click();
        String inputMetroStation = String.format(".//div[text()='%s']/parent::button", metroStation);
        driver.findElement(By.xpath(inputMetroStation)).click();
    }

    public void setPhoneNumber(String phoneNumber) {
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }

    public void nextButtonClick() {
        driver.findElement(nextButton).click();
    }

    public void setToWhenBringSamokat(String toWhenBringSamokat) {
        driver.findElement(toWhenBringSamokatField).sendKeys(toWhenBringSamokat);
        driver.findElement(toWhenBringSamokatSelectedDate).click();
    }

    public void setRentDuration(String rentDuration) {
        driver.findElement(rentDurationField).click();
        driver.findElement(By.xpath(".//div[text()='"+rentDuration+"']")).click();
    }

    public void setSamokatColourBlack() {
        driver.findElement(samokatColourBlack).click();
    }

    public void setSamokatColourGrey() {
        driver.findElement(samokatColourGrey).click();
    }

    public void setComment(String comment) {
        driver.findElement(commentField).sendKeys(comment);
    }

    public void orderButtonOrderPageClick() {
        driver.findElement(orderButtonOrderPage).click();
    }

    public void yesButtonPopupClick(){
        driver.findElement(yesButtonPopup).click();
    }

    public boolean checkCompletedOrderPopup() {
        return driver.findElement(completedOrderPopup).isDisplayed();
    }

    //Проверка сообщений об ощибках

    public String firstNameErrorMessage() {
        return driver.findElement(firstNameErrorMessage).getText();
    }

    public String lastNameErrorMessage() {
        return driver.findElement(lastNameErrorMessage).getText();
    }

    public String addressErrorMessage() {
        return driver.findElement(addressErrorMessage).getText();
    }

    public String metroStationErrorMessage() {
        return driver.findElement(metroStationErrorMessage).getText();
    }

    public String phoneNumberErrorMessage() {
        return driver.findElement(phoneNumberErrorMessage).getText();
    }

    public String commentErrorMessage() {
        return driver.findElement(commentErrorMessage).getText();
    }

    public void waitForLoadYandexPage() {
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
