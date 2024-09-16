package ru.praktikum_services.qa_scooter.mainPageFAQTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class MainPageFAQ {
    private WebDriver driver;
    private By accordionField1 = By.id("accordion__heading-0");
    private By accordionPanel1Text = By.xpath(".//div[@id='accordion__panel-0']/p");
    private By accordionField2 = By.id("accordion__heading-1");
    private By accordionPanel2Text = By.xpath(".//div[@id='accordion__panel-1']/p");
    private By accordionField3 = By.id("accordion__heading-2");
    private By accordionPanel3Text = By.xpath(".//div[@id='accordion__panel-2']/p");
    private By accordionField4 = By.id("accordion__heading-3");
    private By accordionPanel4Text = By.xpath(".//div[@id='accordion__panel-3']/p");
    private By accordionField5 = By.id("accordion__heading-4");
    private By accordionPanel5Text = By.xpath(".//div[@id='accordion__panel-4']/p");
    private By accordionField6 = By.id("accordion__heading-5");
    private By accordionPanel6Text = By.xpath(".//div[@id='accordion__panel-5']/p");
    private By accordionField7 = By.id("accordion__heading-6");
    private By accordionPanel7Text = By.xpath(".//div[@id='accordion__panel-6']/p");
    private By accordionField8 = By.id("accordion__heading-7");
    private By accordionPanel8Text = By.xpath(".//div[@id='accordion__panel-7']/p");


    public MainPageFAQ(WebDriver driver){
        this.driver =  driver;
    }

    public void openAccordionField1() {
        driver.findElement(accordionField1).click();
    }

    public String getAccordionPanel1Text(){
        return driver.findElement(accordionPanel1Text).getText();
    }

    public void openAccordionField2() {
        driver.findElement(accordionField2).click();
    }

    public String getAccordionPanel2Text(){
        return driver.findElement(accordionPanel2Text).getText();
    }

    public void openAccordionField3() {
        driver.findElement(accordionField3).click();
    }

    public String getAccordionPanel3Text(){
        return driver.findElement(accordionPanel3Text).getText();
    }

    public void openAccordionField4() {
        driver.findElement(accordionField4).click();
    }

    public String getAccordionPanel4Text(){
        return driver.findElement(accordionPanel4Text).getText();
    }

    public void openAccordionField5() {
        driver.findElement(accordionField5).click();
    }

    public String getAccordionPanel5Text(){
        return driver.findElement(accordionPanel5Text).getText();
    }

    public void openAccordionField6() {
        driver.findElement(accordionField6).click();
    }

    public String getAccordionPanel6Text(){
        return driver.findElement(accordionPanel6Text).getText();
    }

    public void openAccordionField7() {
        driver.findElement(accordionField7).click();
    }

    public String getAccordionPanel7Text(){
        return driver.findElement(accordionPanel7Text).getText();
    }

    public void openAccordionField8() {
        driver.findElement(accordionField8).click();
    }

    public String getAccordionPanel8Text(){
        return driver.findElement(accordionPanel8Text).getText();
    }

}
