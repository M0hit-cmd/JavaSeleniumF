package AdvanceSeleniumDemo.POM.POM_PageFactory_Demo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

    WebDriver driver;
    @FindBy(xpath = "//*[contains(text(),'Paul')]")
    WebElement profileBtn;

    @FindBy(linkText = "Logout")
    WebElement logoutBtn;

    public Logout(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnProfile(){
        profileBtn.click();
    }

    public void ClickOnLogOut(){
        logoutBtn.click();
    }

    public  void LogOut(){
        this.clickOnProfile();
        this.ClickOnLogOut();
    }
}
