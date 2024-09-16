package ru.praktikum_services.qa_scooter.mainPageFAQTest;


import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ListQuestionsTest {

    private WebDriver driver;

    @Test
    public void checkAccordion1Text(){
        ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
            driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageFAQ objMainPageFAQ = new MainPageFAQ(driver);
        final String textAccordion1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";

        WebElement element = driver.findElement(By.id("accordion__heading-0"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        objMainPageFAQ.openAccordionField1();
        String panel1Text = objMainPageFAQ.getAccordionPanel1Text();
        assertEquals("Текст не " + textAccordion1, textAccordion1, panel1Text);
    }

    @Test
    public void checkAccordion2Text(){
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageFAQ objMainPageFAQ = new MainPageFAQ(driver);
        final String textAccordion2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";

        WebElement element = driver.findElement(By.id("accordion__heading-1"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        objMainPageFAQ.openAccordionField2();
        String panel2Text = objMainPageFAQ.getAccordionPanel2Text();
        assertEquals("Текст не " + textAccordion2, textAccordion2, panel2Text);
    }

    @Test
    public void checkAccordion3Text(){
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageFAQ objMainPageFAQ = new MainPageFAQ(driver);
        final String textAccordion3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";

        WebElement element = driver.findElement(By.id("accordion__heading-1"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        objMainPageFAQ.openAccordionField3();
        String panel3Text = objMainPageFAQ.getAccordionPanel3Text();
        assertEquals("Текст не " + textAccordion3, textAccordion3, panel3Text);
    }

    @Test
    public void checkAccordion4Text(){
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageFAQ objMainPageFAQ = new MainPageFAQ(driver);
        final String textAccordion4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";

        WebElement element = driver.findElement(By.id("accordion__heading-1"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        objMainPageFAQ.openAccordionField4();
        String panel4text = objMainPageFAQ.getAccordionPanel4Text();
        assertEquals("Текст не " + textAccordion4, textAccordion4, panel4text);
    }

    @Test
    public void checkAccordion5Text(){
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageFAQ objMainPageFAQ = new MainPageFAQ(driver);
        final String textAccordion5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";

        WebElement element = driver.findElement(By.id("accordion__heading-1"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        objMainPageFAQ.openAccordionField5();
        String panel5Text = objMainPageFAQ.getAccordionPanel5Text();
        assertEquals("Текст не " + textAccordion5, textAccordion5, panel5Text);
    }

    @Test
    public void checkAccordion6Text(){
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageFAQ objMainPageFAQ = new MainPageFAQ(driver);
        final String textAccordion6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";

        WebElement element = driver.findElement(By.id("accordion__heading-1"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        objMainPageFAQ.openAccordionField6();
        String panel6Text = objMainPageFAQ.getAccordionPanel6Text();
        assertEquals("Текст не " + textAccordion6, textAccordion6, panel6Text);
    }

    @Test
    public void checkAccordion7Text(){
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageFAQ objMainPageFAQ = new MainPageFAQ(driver);
        final String textAccordion7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";

        WebElement element = driver.findElement(By.id("accordion__heading-1"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        objMainPageFAQ.openAccordionField7();
        String panel7Text = objMainPageFAQ.getAccordionPanel7Text();
        assertEquals("Текст не " + textAccordion7, textAccordion7, panel7Text);
    }

    @Test
    public void checkAccordion8Text(){
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageFAQ objMainPageFAQ = new MainPageFAQ(driver);
        final String textAccordion8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

        WebElement element = driver.findElement(By.id("accordion__heading-1"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        objMainPageFAQ.openAccordionField8();
        String panel8Text = objMainPageFAQ.getAccordionPanel8Text();
        assertEquals("Текст не " + textAccordion8, textAccordion8, panel8Text);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
