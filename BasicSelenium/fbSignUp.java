package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;


public class fbSignUp {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.facebook.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println("URl:"+driver.getCurrentUrl());
        System.out.println("Title: "+driver.getTitle());

        driver.findElement(By.xpath("//form/child::*/a[contains(text(),'Create')]")).click();
        driver.findElement(By.name("firstname")).sendKeys("Himanshu");
        driver.findElement(By.name("lastname")).sendKeys("jadoun");
        driver.findElement(By.name("reg_email__")).sendKeys("hjadoun9@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("hjadoun9@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Himanshu@123");

        Select dd= new Select(driver.findElement(By.id("day")));
        dd.selectByVisibleText("22");

        Select mm= new Select(driver.findElement(By.id("month")));
        mm.selectByVisibleText("Sep");

        Select yy= new Select(driver.findElement(By.id("year")));
        yy.selectByVisibleText("2000");

        driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement buttons = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[contains(text(),'Sign')]"))));
        buttons.click();

    }}
