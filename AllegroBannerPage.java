package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllegroBannerPage {
    WebDriver driver;

    @FindBy(xpath="//*[@class='_1h7wt _15mod mj9z_5r _07bcb_2W89U' and @data-analytics-click-custom-item-id='9572623005']")
    WebElement offer;

    @FindBy(xpath="//*[@class='_1svub _lf05o _9a071_2MEB_']")
    WebElement price;

    @FindBy(xpath="//*[@class='_1liky _w7z6o _uj8z7 _jmjqf _d2756_1wB6R _15tw4 _d2756_3KVjZ']")
    WebElement printers;

    public AllegroBannerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    void clickOnOffer(){
        offer.isDisplayed();
        offer.click();
    }

    void checkPrice(){
        price.isDisplayed();
        String cena = price.getText();
        System.out.println("Cena: " + cena);
    }

    void clickOnAllPrinters(){
        printers.isDisplayed();
        printers.click();
    }
}
