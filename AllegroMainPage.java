package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllegroMainPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@data-role='accept-consent']")
    WebElement allegroADS;

    @FindBy(xpath = "//*[@itemprop='logo']")
    WebElement allegroLogo;

    @FindBy(xpath = "//*[@data-group-id='departments_Elektronika']")
    WebElement electronicSection;

    @FindBy(xpath = "//*[@data-role='header-username']")
    WebElement allegroLogin;

    @FindBy(xpath = "//*[@data-role='auth-button' and @data-analytics-click-value='login-button']")
    WebElement allegroLoginButton;

    @FindBy(xpath= "//*[@class='mp7g_oh mpof_ki mr3m_1 mli2_1 m389_6m m7er_k4 mjyo_6x munh_56 m3h2_56 meqh_en']")
    WebElement allegroBannerButton;

    @FindBy(xpath="//a[contains(text(),'wszystkie kategorie')]")
    WebElement allegroAllCategories;

    public AllegroMainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    void clickAllegroADS() {
        allegroADS.click();
    }

    void allegroMainPageDisplayed() {
        allegroLogo.isDisplayed();
    }

    void clickAllegroLogin() {
        allegroLogin.click();
        allegroLoginButton.click();
    }

    void clickAllegroBannerButton() {
        allegroBannerButton.click();
    }

    void clickElectronicSection() {
        electronicSection.isDisplayed();
        electronicSection.click();
    }

    void clickOnAllCategories() {
        allegroAllCategories.isDisplayed();
        allegroAllCategories.click();
    }
}
