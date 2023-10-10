package AdvanceSeleniumDemo.POM.POM_Demo1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Dashboard {

    WebDriver driver;


    //Constructor that will be automatically called as soon as the object of the class is created
    public Dashboard(WebDriver driver) {
        this.driver=driver;
    }


    //Locators for the page title and the logout button
    By heading = By.xpath("//div[@class=\"main-header\"]");


    //Method to capture the page heading
    public String getHeading() {
        String head = driver.findElement(heading).getText();
        return head;
    }

    //Method to click on Logout button
    public void clickLogout() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        By logoutBtn = By.xpath("//button[@id='submit']");
        driver.findElement(logoutBtn).click();
    }
}
