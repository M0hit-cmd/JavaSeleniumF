package AdvanceSeleniumDemo.ActionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Resizable {
    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resizable/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.switchTo().frame(0);

        WebElement drag = driver.findElement(By.xpath("//div[@id='resizable']/child::div[3]"));
        Actions action = new Actions(driver);

        Thread.sleep(2000);

        action.moveToElement(drag).dragAndDropBy(drag,70,70).build().perform();

        Thread.sleep(2000);

    }
}