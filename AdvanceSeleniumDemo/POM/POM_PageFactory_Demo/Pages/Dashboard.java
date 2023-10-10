package AdvanceSeleniumDemo.POM.POM_PageFactory_Demo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

    WebDriver driver;

    public Dashboard(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void printTitle(){
        System.out.println(driver.getTitle());
    }
}
