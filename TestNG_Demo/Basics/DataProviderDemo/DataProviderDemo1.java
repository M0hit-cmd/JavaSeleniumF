package TestNG_Demo.Basics.DataProviderDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProviderDemo1 {

    @Test(dataProvider = "LoginTestData")
    void test1(String userName, String password){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//form/child::*/div/div[2]/input[@name='username']")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("(//h6[normalize-space()='Dashboard'])[1]")).isDisplayed());
        driver.quit();
    }

    @DataProvider(name="LoginTestData")
    public Object[][] loginData(){
        Object[][] data= new Object[2][2];

        data[0][0]="Admin";
        data[0][1]="admin123";

        data[1][0]="Admin";
        data[1][1]="test123";

        return data;
    }
}
