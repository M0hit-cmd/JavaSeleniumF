package AdvanceSeleniumDemo.POM.POM_Demo2.SampleTest;
import AdvanceSeleniumDemo.POM.POM_Demo2.Pages.Dashboard;
import AdvanceSeleniumDemo.POM.POM_Demo2.Pages.Login;
import AdvanceSeleniumDemo.POM.POM_Demo2.Pages.LogOut;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test1  {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        Login login = new Login(driver);
        Dashboard dashboard = new Dashboard(driver);
        LogOut logout = new LogOut(driver);


        login.enterUserName();
        login.enterPassword();
        login.ClickLogin();

        dashboard.printTitle();

        logout.clickOnProfile();
        logout.clickLogoutBtn();

        driver.quit();

    }


}
