package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class OrderPageSamokatAboutRent {
    private final WebDriver driver;

    private final By orderHeader2 = By.xpath(".//div[@class='Order_Header__BZXOb' and text()='Про аренду']"); //Страница Про аренду

    private final By whenSamokatToBeDeliverField = By.xpath(".//div[@class='react-datepicker__input-container']/input[@placeholder='* Когда привезти самокат']"); //Поле Когда привезти самокат

    private final By calendar = By.xpath(".//div[@class='react-datepicker__day react-datepicker__day--029 react-datepicker__day--weekend']"); //Всплывающий календарь

    private final By rentTimeField = By.xpath(".//div[@class='Dropdown-control']/div[text()='* Срок аренды']"); //Поле Срок аренды

    private final By dropdownRentTime = By.xpath(".//div[@class='Dropdown-menu']/div[@class='Dropdown-option' and text()='трое суток']");

    private final By orderButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']"); //Кнопка заказать

    public OrderPageSamokatAboutRent (WebDriver driver){
        this.driver=driver;
    }



    public void setWhenSamokatToBeDeliverField (){
        driver.findElement(whenSamokatToBeDeliverField).click();
        driver.findElement(calendar).click(); //Заполнили поле Когда привезти самокат
    }


    public void setRentTimeField(){
        driver.findElement(rentTimeField).click();
        driver.findElement(dropdownRentTime).click(); //Заполнили поле Срок аренды
    }


    public void clickOrderButton(){
        driver.findElement(orderButton).click(); //Кликнули по кнопке Заказать
    }

    public void FillAboutRentPage(){
        setWhenSamokatToBeDeliverField ();
        setRentTimeField();
        clickOrderButton();
    }
}
