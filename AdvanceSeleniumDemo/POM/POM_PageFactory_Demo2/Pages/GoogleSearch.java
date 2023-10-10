package AdvanceSeleniumDemo.POM.POM_PageFactory_Demo2.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class GoogleSearch {
    public static WebDriver driver;

    @FindBy(xpath = "//textarea[@id='APjFqb']")
    WebElement textArea;

    public GoogleSearch(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void search(String text)
    {
        textArea.sendKeys(text);
        textArea.sendKeys(Keys.ENTER);
    }

}
