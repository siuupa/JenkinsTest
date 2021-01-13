package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllegroElectronicPage {
    WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Kolumny głośnikowe')]")
    WebElement speakerSection;

    public AllegroElectronicPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    void clickSpeakerSection() {
        speakerSection.isDisplayed();
        speakerSection.click();
    }

}
