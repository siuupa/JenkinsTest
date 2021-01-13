package org.example;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests {
    public WebDriver driver;
    AllegroMainPage allegroMainPageObject;
    AllegroElectronicPage allegroElectronicPageObject;
    AllegroSpeakerPage allegroSpeakerPageObject;
    AllegroLoginPage allegroLoginPageObject;
    AllegroBannerPage allegroBannerPageObject;
    AllegroAllCategoriesPage allegroAllCategoriesPageObject;

    @BeforeTest
    public void createDriver() throws Exception {
        driver = new Driver("Chrome").getDriver();
    }

    @AfterTest
    public void closeDriver() throws Exception {
        Thread.sleep(1000);
        driver.close();
    }

    @Test
    public void AllegroSpeakerOffers() throws InterruptedException {
        // Open site
        driver.get("https://allegro.pl/");
        // Accept ADs settings
        allegroMainPageObject = new AllegroMainPage(driver);
        allegroMainPageObject.clickAllegroADS();
        allegroMainPageObject.allegroMainPageDisplayed();
        // Enter Electronic section
        allegroMainPageObject.clickElectronicSection();
        allegroElectronicPageObject = new AllegroElectronicPage(driver);
        // Enter Speaker section
        allegroElectronicPageObject.clickSpeakerSection();
        allegroSpeakerPageObject = new AllegroSpeakerPage(driver);
        // Select price range, only used products and only advertisements.
        Thread.sleep(2000);
        allegroSpeakerPageObject.clickPriceRange();
        allegroSpeakerPageObject.clickUsedProducts();
        allegroSpeakerPageObject.clickOnlyADS();
        // Show how many offers were found and display them in command line
        Thread.sleep(2000);
        allegroSpeakerPageObject.setHowManyOffers();
    }
    @Test
    public void AllegroLoginFail() {
        // Open site
        driver.get("https://allegro.pl/");
        // Accept ADs settings
        allegroMainPageObject = new AllegroMainPage(driver);
        allegroMainPageObject.clickAllegroADS();
        allegroMainPageObject.allegroMainPageDisplayed();
        // Enter login site
        allegroMainPageObject.clickAllegroLogin();
        allegroLoginPageObject = new AllegroLoginPage(driver);
        // Type wrong login and password. If they're incorrect then test is passed, if they're correct test is failed
        allegroLoginPageObject.enterLoginPassword();
    }

    @Test
    public void AllegroClickOnBannerOffer() {
        // Open site
        driver.get("https://allegro.pl/");
        // Accept ADs settings
        allegroMainPageObject = new AllegroMainPage(driver);
        allegroMainPageObject.clickAllegroADS();
        allegroMainPageObject.allegroMainPageDisplayed();
        // Click on banner
        allegroMainPageObject.clickAllegroBannerButton();
        allegroBannerPageObject = new AllegroBannerPage(driver);
    }

    @Test
    public void AllegroBannerOfferPrice() {
        // Open site
        driver.get("https://allegro.pl/");
        // Accept ADs settings
        allegroMainPageObject = new AllegroMainPage(driver);
        allegroMainPageObject.clickAllegroADS();
        allegroMainPageObject.allegroMainPageDisplayed();
        // Click on banner
        allegroMainPageObject.clickAllegroBannerButton();
        allegroBannerPageObject = new AllegroBannerPage(driver);
        allegroBannerPageObject.clickOnOffer();
        allegroBannerPageObject.checkPrice();
    }

    @Test
    public void AllegroBannerOfferToAllPrinters() {
        // Open site
        driver.get("https://allegro.pl/");
        // Accept ADs settings
        allegroMainPageObject = new AllegroMainPage(driver);
        allegroMainPageObject.clickAllegroADS();
        allegroMainPageObject.allegroMainPageDisplayed();
        // Click on banner
        allegroMainPageObject.clickAllegroBannerButton();
        allegroBannerPageObject = new AllegroBannerPage(driver);
        allegroBannerPageObject.clickOnOffer();
        allegroBannerPageObject.clickOnAllPrinters();
    }

    @Test
    public void AllegroAllCategories() {
        // Open site
        driver.get("https://allegro.pl/");
        // Accept ADs settings
        allegroMainPageObject = new AllegroMainPage(driver);
        allegroMainPageObject.clickAllegroADS();
        allegroMainPageObject.allegroMainPageDisplayed();
        // Click on "All categories"
        allegroMainPageObject.clickOnAllCategories();
    }

    @Test
    public void AllegroListAllConsoleCategories() {
        // Open site
        driver.get("https://allegro.pl/");
        // Accept ADs settings
        allegroMainPageObject = new AllegroMainPage(driver);
        allegroMainPageObject.clickAllegroADS();
        allegroMainPageObject.allegroMainPageDisplayed();
        // Click on "All categories"
        allegroMainPageObject.clickOnAllCategories();
        // Get all console categories and show them in console
        allegroAllCategoriesPageObject = new AllegroAllCategoriesPage(driver);
        allegroAllCategoriesPageObject.listAllConsoleCategories();
    }

    @Test
    public void AllegroListAllPhoneCategories() {
        // Open site
        driver.get("https://allegro.pl/");
        // Accept ADs settings
        allegroMainPageObject = new AllegroMainPage(driver);
        allegroMainPageObject.clickAllegroADS();
        allegroMainPageObject.allegroMainPageDisplayed();
        // Click on "All categories"
        allegroMainPageObject.clickOnAllCategories();
        // Get all phone categories and show them in console
        allegroAllCategoriesPageObject = new AllegroAllCategoriesPage(driver);
        allegroAllCategoriesPageObject.listAllPhoneCategories();
    }

    @Test
    public void AllegroListAllPhotographyCategories() {
        // Open site
        driver.get("https://allegro.pl/");
        // Accept ADs settings
        allegroMainPageObject = new AllegroMainPage(driver);
        allegroMainPageObject.clickAllegroADS();
        allegroMainPageObject.allegroMainPageDisplayed();
        // Click on "All categories"
        allegroMainPageObject.clickOnAllCategories();
        // Get all photography categories and show them in console
        allegroAllCategoriesPageObject = new AllegroAllCategoriesPage(driver);
        allegroAllCategoriesPageObject.listAllPhotographyCategories();
    }

    @Test
    public void AllegroListAllToolsCategories() {
        // Open site
        driver.get("https://allegro.pl/");
        // Accept ADs settings
        allegroMainPageObject = new AllegroMainPage(driver);
        allegroMainPageObject.clickAllegroADS();
        allegroMainPageObject.allegroMainPageDisplayed();
        // Click on "All categories"
        allegroMainPageObject.clickOnAllCategories();
        // Get all tools categories and show them in console
        allegroAllCategoriesPageObject = new AllegroAllCategoriesPage(driver);
        allegroAllCategoriesPageObject.listAllToolsCategories();
    }
}
