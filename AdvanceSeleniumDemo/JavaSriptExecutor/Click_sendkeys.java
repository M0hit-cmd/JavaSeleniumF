package AdvanceSeleniumDemo.JavaSriptExecutor;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.swing.text.Document;
import java.time.Duration;

public class Click_sendkeys {

    @Test
    public void test() throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.google.com/");
        JavascriptExecutor js = (JavascriptExecutor)driver;

        String url = js.executeScript("return document.URL;").toString();
        String domain=js.executeScript("return document.domain;").toString();
        String title=js.executeScript("return document.title;").toString();
        System.out.println(url);
        System.out.println(domain);
        System.out.println(title);
        js.executeScript("history.go(0)");
        js.executeScript("window.location = 'https://practicetestautomation.com/practice-test-login/'");

        js.executeScript("document.getElementById('username').value='student';");
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        js.executeScript("document.getElementById('password').value='Password123';");

        WebElement temp = driver.findElement(By.id("submit"));

//        js.executeScript("arguments[0].click();",temp);
        js.executeScript("document.getElementById('submit').click();");

        String sText =  js.executeScript("return document.documentElement.innerText;").toString();
        System.out.println(sText);

        js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1],5000);");
        // js.executeScript("window.setTimeout(()=>{arguments[0].click()},3000)",btn);
        js.executeScript("alert('successfully logged in');");




    }
}
