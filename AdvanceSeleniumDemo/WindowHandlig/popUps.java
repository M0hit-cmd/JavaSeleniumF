package AdvanceSeleniumDemo.WindowHandlig;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class popUps {

    @Test
    public void test(){

        WebDriver driver= new ChromeDriver();
        driver.get("https://nxtgenaiacademy.com/alertandpopup/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement btn1 = driver.findElement(By.name("alertbox"));
        WebElement btn2 = driver.findElement(By.name("confirmalertbox"));
        WebElement btn3 = driver.findElement(By.name("promptalertbox1234"));

        btn1.click();
        driver.switchTo().alert().accept();

        btn2.click();
        driver.switchTo().alert().dismiss();

        btn3.click();
        Alert alert= driver.switchTo().alert();
        alert.sendKeys("yes");
        alert.accept();
    }

}
