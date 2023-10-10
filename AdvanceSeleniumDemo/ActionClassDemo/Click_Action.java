package AdvanceSeleniumDemo.ActionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Click_Action {
    @Test
    void ClickTest(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Actions action =new Actions(driver);
        WebElement btn= driver.findElement(By.xpath("//button[normalize-space()='Login']"));
//        action.moveToElement(btn).click().perform();
//        action.contextClick(btn).build().perform();
//        action.doubleClick(btn).perform();

    }
}
