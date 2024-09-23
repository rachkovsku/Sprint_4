package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmOrderPage {

    private final WebDriver driver;

    private final By pageHeader = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ' and text()='Хотите оформить заказ?']"); //Страница Хотите оформить заказ?

    private final By yesButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Да']"); //Кнопка Да

    public ConfirmOrderPage (WebDriver driver){
        this.driver=driver;
    }

    public void clickYesButton(){
        driver.findElement(yesButton).click();
    }
}
