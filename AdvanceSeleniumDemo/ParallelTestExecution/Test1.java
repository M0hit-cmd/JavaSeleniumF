package AdvanceSeleniumDemo.ParallelTestExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void Test1(){
        WebDriver driver= new ChromeDriver();
        System.out.println("Test1");

    }
}
