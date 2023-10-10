package AdvanceSeleniumDemo.POM.POM_Demo2.Pages;

import org.openqa.selenium.WebDriver;

public class Dashboard {
    WebDriver driver;
    public Dashboard(WebDriver driver){
        this.driver = driver;
    }

    public void printTitle(){
        System.out.println(driver.getTitle());
    }
}
