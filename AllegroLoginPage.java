package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.lang.Object;
import org.junit.*;

import static org.junit.Assert.assertEquals;


public class AllegroLoginPage {
    WebDriver driver;

    @FindBy(xpath = "//input[@id='username']")
    WebElement login;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//button[@id='login-button']")
    WebElement loginButton;

    @FindBy(xpath = "//div[@id='wrong-password-error-title']")
    WebElement wrongPassword;

    public AllegroLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    void enterLoginPassword() {
        login.isDisplayed();
        password.isDisplayed();
        login.sendKeys("test");
        password.sendKeys("test");
        loginButton.click();
        String wrongPasswordText = wrongPassword.getText();
        assertEquals("Login, e-mail lub hasło są nieprawidłowe", wrongPasswordText);
    }


}
