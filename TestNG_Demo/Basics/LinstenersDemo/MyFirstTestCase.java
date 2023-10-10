package TestNG_Demo.Basics.LinstenersDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNgListenersDemo1.class)
public class MyFirstTestCase {


    @Test
    public void GoogleTitleVerification() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        System.out.println("Title: "+ driver.getTitle());
        driver.quit();

    }

    @Test
    public  void TitleMatchTest() {
        System.out.println("Test 2 dummy");
        Assert.assertTrue(false);

    }
}
