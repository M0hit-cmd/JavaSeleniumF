package AdvanceSeleniumDemo.ActionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Slider {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/slider/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.switchTo().frame(0);

        WebElement bar= driver.findElement(By.cssSelector(".ui-slider-handle.ui-corner-all.ui-state-default"));

        Actions action =new Actions(driver);
        action.moveToElement(bar).dragAndDropBy(bar, 300, 0).perform();
    }
}
