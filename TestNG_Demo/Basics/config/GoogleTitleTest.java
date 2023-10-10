package TestNG_Demo.Basics.config;

import TestNG_Demo.Basics.config.PropertiesFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleTitleTest {
    WebDriver driver;
    public static String browserName=null;

    @BeforeMethod
    public void setUp(){

        PropertiesFile.getProperties();
        if(browserName.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox"))
        {
         driver= new FirefoxDriver();
        }

//        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");

    }

    @Test(priority = 1, groups = "Title")
    public void googleTitleTest(){
        String title = driver.getTitle();
        System.out.println(title);

        Assert.assertEquals(title, "Google","Title is not matched");
    }

    @Test(priority = 2,groups = "logo")
    public void googleLogoTest(){
        boolean b= driver.findElement(By.cssSelector("img[alt='Google']")).isDisplayed();
        Assert.assertTrue(b);
        Assert.assertEquals(b,true);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
        PropertiesFile.setProperties();


    }
}
