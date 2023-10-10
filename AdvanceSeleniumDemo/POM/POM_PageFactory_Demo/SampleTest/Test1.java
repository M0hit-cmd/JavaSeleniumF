package AdvanceSeleniumDemo.POM.POM_PageFactory_Demo.SampleTest;
import AdvanceSeleniumDemo.POM.POM_PageFactory_Demo.Pages.Dashboard;
import AdvanceSeleniumDemo.POM.POM_PageFactory_Demo.Pages.Login;
import AdvanceSeleniumDemo.POM.POM_PageFactory_Demo.Pages.Logout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test1 {

    @Test
    public void LoginTest(){
        WebDriver driver = new ChromeDriver();
        Login login= new Login(driver);
        Logout logout= new Logout(driver);
        Dashboard dashboard= new Dashboard(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        login.LoginToPage("Admin","admin123");
        dashboard.printTitle();
        logout.LogOut();

    }
}
