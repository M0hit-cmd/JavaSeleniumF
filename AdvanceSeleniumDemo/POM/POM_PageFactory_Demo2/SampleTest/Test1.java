package AdvanceSeleniumDemo.POM.POM_PageFactory_Demo2.SampleTest;

import AdvanceSeleniumDemo.POM.POM_PageFactory_Demo2.Pages.GoogleSearch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test1 {

    @Test
    public void test1(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.google.com/");
        GoogleSearch s = new GoogleSearch(driver);
        s.search("Himanshu");
    }

}
