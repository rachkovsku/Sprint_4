package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPageSamokatForWho {
    private final WebDriver driver;

    private final By orderHeader1 = By.xpath(".//div[@class='Order_Header__BZXOb' and text()='Для кого самокат']"); //Страница Для кого самокат

    private final By fieldName = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Имя']"); //Поле Имя

    private final By fieldSurname = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Фамилия']"); //Поле Фамилия

    private final By fieldMetroStation = By.xpath(".//div[@class='select-search__value']/input[@placeholder='* Станция метро']"); //Поле Станиця метро
    private final By dropdownMetroStation = By.xpath(".//ul[@class='select-search__options']/li[@class='select-search__row']"); //Выбор станции метро

    private final By fieldPhoneNumber = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Телефон: на него позвонит курьер']"); //Поле Номер Телефона

    private final By nextButton = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button[text()='Далее']"); //Кнопка Далее

    public OrderPageSamokatForWho(WebDriver driver){
        this.driver=driver;
    }



    public void getTextFromOrderPageSamokatForWhoHeader(){
        driver.findElement(orderHeader1).getText();
    }

    public void setFieldName(String name){
        driver.findElement(fieldName).sendKeys(name); //Заполнили поле Имя
    }

    public void setFieldSurname(String surname){
        driver.findElement(fieldSurname).sendKeys(surname); //Заполнили поле Фамилия
    }

    public void setMetroStationField(){
        driver.findElement(fieldMetroStation).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.findElement(dropdownMetroStation).click(); //Заполнили поле Станция метро
    }

    public void setFieldPhone(String phone){
        driver.findElement(fieldPhoneNumber).sendKeys(phone); //Заполнили поле Телефон
    }

    public void FillForWhoPage(String name, String surname, String phone){
        setFieldName(name);
        setFieldSurname(surname);
        setMetroStationField();
        setFieldPhone(phone);
        clickNextButton();
    }

    public void clickNextButton(){
        driver.findElement(nextButton).click(); //Кликнули по кнопке Далее
    }
}
