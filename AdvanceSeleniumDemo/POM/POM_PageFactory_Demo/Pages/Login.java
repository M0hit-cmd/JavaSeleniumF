package AdvanceSeleniumDemo.POM.POM_PageFactory_Demo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;

    public Login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    WebElement Username;

    @FindBy(name = "password")
    WebElement Pwd;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement LoginButton;
    public void EnterUserName(String username){
        Username.sendKeys(username);
    }

    public void EnterPassword(String password){
        Pwd.sendKeys(password);
    }

    public void ClickLogin()
    {
        LoginButton.click();

    }
    public void LoginToPage(String username, String password )
    {
        this.EnterUserName(username);
        this.EnterPassword(password);
        this.ClickLogin();

    }

}
