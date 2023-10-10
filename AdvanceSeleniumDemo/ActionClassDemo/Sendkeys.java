package AdvanceSeleniumDemo.ActionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Sendkeys {
    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Actions action =new Actions(driver);
        WebElement element= driver.findElement(By.name("username"));

////        sendkeys
        action.sendKeys(element, "Admin").build().perform();
//
////        keys down
        action.keyDown(Keys.SHIFT).perform();
        element.sendKeys("Admin");
        action.keyUp(Keys.SHIFT).perform();
//
//
//
    }
}
