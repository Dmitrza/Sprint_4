package ru.praktikum_services.qa_scooter.electiveTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StatusPage {
    private WebDriver driver;

    private By notFoundPic = By.xpath(".//img[@alt = 'Not found']");

    public StatusPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitNotFoundPic() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(notFoundPic));
    }

    public boolean checkNotFoundPic() {
        return driver.findElement(notFoundPic).isDisplayed();
    }
}
