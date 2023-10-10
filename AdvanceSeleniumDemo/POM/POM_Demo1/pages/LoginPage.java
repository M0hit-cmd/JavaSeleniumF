package AdvanceSeleniumDemo.POM.POM_Demo1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    By username= By.id("userName");
    By password= By.id("password");

    By loginBtn= By.xpath("//*[contains(text(),'Login') and @id='login']");

    public void enterUserName(){
        driver.findElement(username).sendKeys("joy22092000");
    }

    public void enterPassword(){
        driver.findElement(password).sendKeys("Himanshu@123");
    }

    public void clickLogin(){
        {
            driver.findElement(password).sendKeys(Keys.ENTER);
        }

    }

}
