import PageObject.*;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.CoreMatchers.is;


public class TestOrderFunction {
    private WebDriver driver;


    @Test //Тест процесса заказа через кнопку Заказать вверху страницы
    public void checkOrderFunction() {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageSamokat objHomePage = new HomePageSamokat(driver);

        objHomePage.clickOrderButtonInHeader();

        OrderPageSamokatForWho objOrderPageForWho = new OrderPageSamokatForWho(driver);


        String name = "Иван";
        String surname = "Иванов";
        String phone = "+79999999999";

        objOrderPageForWho.FillForWhoPage(name, surname, phone);

        OrderPageSamokatAboutRent objOrderPageAboutRent = new OrderPageSamokatAboutRent(driver);

        objOrderPageAboutRent.FillAboutRentPage();

        ConfirmOrderPage objConfirmPage = new ConfirmOrderPage(driver);

        objConfirmPage.clickYesButton();

        PageOrderIsCreated objOrderIsCreated = new PageOrderIsCreated(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        MatcherAssert.assertThat("Посмотреть статус", is(driver.findElement(By.xpath(".//div[@class='Order_NextButton__1_rCA']/button")).getText()));

    }

    @Test //Тест процесса заказа через кнопку Заказать по середине страницы
    public void checkOrderFunctionWithButtonInMiddlePage(){

        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageSamokat objHomePage = new HomePageSamokat(driver);

        objHomePage.clickCookieAcceptButton();
        objHomePage.clickOrderButtonInMiddlePage();

        OrderPageSamokatForWho objOrderPageForWho = new OrderPageSamokatForWho(driver);


        String name = "Иван";
        String surname = "Иванов";
        String phone = "+79999999999";

        objOrderPageForWho.FillForWhoPage(name, surname, phone);

        OrderPageSamokatAboutRent objOrderPageAboutRent = new OrderPageSamokatAboutRent(driver);

        objOrderPageAboutRent.FillAboutRentPage();

        ConfirmOrderPage objConfirmPage = new ConfirmOrderPage(driver);

        objConfirmPage.clickYesButton();

        PageOrderIsCreated objOrderIsCreated = new PageOrderIsCreated(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        MatcherAssert.assertThat("Посмотреть статус", is(driver.findElement(By.xpath(".//div[@class='Order_NextButton__1_rCA']/button")).getText()));
    }


        @After
        public void tearDown(){
        driver.quit();
        }
    }

