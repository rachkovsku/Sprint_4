package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.time.Duration;

public class PageOrderIsCreated {

    private WebDriver driver;

    private final By checkOrderStatusButton = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button"); //Окно Заказ оформлен

    public PageOrderIsCreated(WebDriver driver){
        this.driver=driver;
    }

    public void getTextFromPageHeader(){
        driver.findElement(checkOrderStatusButton).getText();
    }




}
