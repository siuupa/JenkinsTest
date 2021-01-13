package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllegroSpeakerPage {
    WebDriver driver;

    @FindBy(xpath = "//label[contains(text(),'450 zł do 1250 zł')]")
    WebElement priceRange;

    @FindBy(xpath = "//span[contains(text(),'używane')]")
    WebElement usedProducts;

    @FindBy(xpath = "//span[contains(text(),'ogłoszenia')]")
    WebElement onlyADS;

    @FindBy(xpath = "//*[@class='_11fdd_39FjG']")
    WebElement howManyOffers;

    public AllegroSpeakerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    void clickPriceRange() {
        priceRange.isDisplayed();
        priceRange.click();
    }

    void clickUsedProducts() {
        usedProducts.isDisplayed();
        usedProducts.click();
    }

    void clickOnlyADS() {
        onlyADS.isDisplayed();
        onlyADS.click();
    }

    void setHowManyOffers() {
        howManyOffers.isDisplayed();
        String offers = howManyOffers.getText();
        System.out.println("Znaleziono " + offers + " ofert");
    }
}
