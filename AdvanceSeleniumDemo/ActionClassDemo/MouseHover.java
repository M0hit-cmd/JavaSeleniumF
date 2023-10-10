package AdvanceSeleniumDemo.ActionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class MouseHover {
    @Test
    void HoverTest(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lambdatest.com/automation-demos");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Actions action =new Actions(driver);
        WebElement list = driver.findElement(By.partialLinkText("Platform"));

        action.moveToElement(list).build().perform();
}
}
