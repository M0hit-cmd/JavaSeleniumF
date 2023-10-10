package AdvanceSeleniumDemo.ParallelTestExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test3 {

    @Test
    public void Test3(){
        WebDriver driver= new FirefoxDriver();
        System.out.println("Test3");

    }
}
