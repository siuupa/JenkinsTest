package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllegroAllCategoriesPage {
    WebDriver driver;

    @FindBy(xpath="//*[@data-box-id='q4ZPYfDpQdmudfa5ETdCVA==']")
    WebElement consoleCategories;

    @FindBy(xpath="//*[@data-box-id='kptoG1n6QJWYFJAXF4vMsw==']")
    WebElement phoneCategories;

    @FindBy(xpath="//*[@data-box-id='qokyK-3UTJWeWnMFznX5oA==']")
    WebElement photographyCategories;

    @FindBy(xpath="//*[@data-box-id='Zx2qVgmpSSm6V4jZRoMb-w==']")
    WebElement toolsCategories;

    public AllegroAllCategoriesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    void listAllConsoleCategories(){
        consoleCategories.isDisplayed();
        String categoriesText = consoleCategories.getText();
        System.out.println(categoriesText);
    }

    void listAllPhoneCategories(){
        phoneCategories.isDisplayed();
        String categoriesText = phoneCategories.getText();
        System.out.println(categoriesText);
    }

    void listAllPhotographyCategories(){
        photographyCategories.isDisplayed();
        String categoriesText = photographyCategories.getText();
        System.out.println(categoriesText);
    }

    void listAllToolsCategories(){
        toolsCategories.isDisplayed();
        String categoriesText = toolsCategories.getText();
        System.out.println(categoriesText);
    }


}
