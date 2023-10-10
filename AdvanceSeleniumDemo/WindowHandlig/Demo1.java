package AdvanceSeleniumDemo.WindowHandlig;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.*;

import java.time.Duration;

public class Demo1 {
    @Test
    public  void test(){
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoqa.com/browser-windows");

        List <WebElement> btns= driver.findElements(By.xpath("//*[contains(text(),'New')]"));


        for(WebElement x:btns)
        {
            x.click();
        }
        String parentWindow =driver.getWindowHandle();
        Set<String> windows= driver.getWindowHandles();

        for(String x:windows)
        {
            driver.switchTo().window(x);
            System.out.println(driver.getTitle());
        }

        driver.switchTo().window(parentWindow);

        driver.quit();

    }
}
