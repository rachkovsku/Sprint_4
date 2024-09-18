package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePageSamokat {

    private final WebDriver driver;

    private final By orderButtonInHeader = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[text()='Заказать']"); //Кнопка заказать вверху страницы

    private final By orderButtonInMiddlePage = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']"); //Кнопка закать в середине страницы

    private final By accordionHeader = By.xpath(".//div[starts-with(@id, 'accordion__heading-')]");; //Выпадающий список Вопросы о важном
    private final By accordionAnswerText = By.xpath(".//div[starts-with(@id, 'accordion__panel-')]"); ; //Текст после клика по выпадающему списку

    private final By cookieAccept = By.xpath(".//div/button[@class='App_CookieButton__3cvqF']"); //Кнопка принятия кук

    public HomePageSamokat (WebDriver driver){
        this.driver=driver;
    }

    public void clickOrderButtonInHeader(){ //Метод клика по кнопке Заказать вверху главнойс страницы

        driver.findElement(orderButtonInHeader).click();
    }

    public void clickOrderButtonInMiddlePage(){ //Метод клика по кнопке Заказать в середине страницы

        driver.findElement(orderButtonInMiddlePage).click();
    }

    public void clickCookieAcceptButton(){ //Клик по кнопке принятия кук
        driver.findElement(cookieAccept).click();
    }

    public void clickAccordionHeader(int indexNumber){
        driver.findElement(accordionHeader).click();
    }

    public String getAccordionHeaderText(int indexNumber){
        return driver.findElements(accordionHeader).get(indexNumber).getText();
    }

    public String getAccordionAnswerText(int indexNumber){
        return driver.findElements(accordionAnswerText).get(indexNumber).getText();
    }




}

