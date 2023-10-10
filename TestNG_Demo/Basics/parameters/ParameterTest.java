package TestNG_Demo.Basics.parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    WebDriver driver;

    @Test
    @Parameters({"browser","url","emailId"})
    public void yahooLoginTest(String browser,String url, String emailId){
        if(browser.equals("chrome")){
            driver = new ChromeDriver();
        }
        else if(browser.equals("firefox")){
            driver= new FirefoxDriver();
        }

        driver.get(url);
        driver.findElement(By.name("username")).sendKeys(emailId);
        driver.findElement(By.xpath("//input[@id='login-signin']")).click();
        driver.quit();

    }


    @Test
    @Parameters({"num1","num2"})
    public void test2(int a, int b)
    {
        System.out.println(a+b);
    }
}
