package AdvanceSeleniumDemo.POM.POM_Demo2.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;
    public Login(WebDriver driver){
        this.driver = driver;
    }
    By userName= By.name("username");
    By pswd= By.name("password");

    By loginBtn= By.xpath("//button[normalize-space()='Login']");


    public void enterUserName(){
        driver.findElement(userName).sendKeys("Admin");
    }
    public void enterPassword(){
        driver.findElement(pswd).sendKeys("admin123");
    }

    public void ClickLogin(){
        driver.findElement(loginBtn).click();
    }


}
