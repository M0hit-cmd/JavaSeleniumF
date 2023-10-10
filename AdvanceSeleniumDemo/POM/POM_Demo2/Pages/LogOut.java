package AdvanceSeleniumDemo.POM.POM_Demo2.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOut {

    WebDriver driver;

    public LogOut(WebDriver driver){
        this.driver=driver;
    }




    public void clickOnProfile(){
        By ProfileBtn= By.xpath("//*[contains(text(),'Paul')]");
        driver.findElement(ProfileBtn).click();
    }

    public void clickLogoutBtn(){
        By logOutBtn=By.linkText("Logout");
        driver.findElement(logOutBtn).click();
    }
}
