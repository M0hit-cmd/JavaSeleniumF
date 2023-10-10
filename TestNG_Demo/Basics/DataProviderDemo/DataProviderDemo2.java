package TestNG_Demo.Basics.DataProviderDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProviderDemo2{

    @Test(dataProvider = "dp1")
    void test1(String data){

        System.out.println(data);
    }

    @DataProvider()
    public String[] dp1(){

        String[] d =new String[]{"login1", "login3"};
        return d;
    }
}
