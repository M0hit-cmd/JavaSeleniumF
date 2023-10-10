package AdvanceSeleniumDemo.POM.POM_Demo1.TestCase;

import AdvanceSeleniumDemo.POM.POM_Demo1.pages.Dashboard;
import AdvanceSeleniumDemo.POM.POM_Demo1.pages.HomePage;
import AdvanceSeleniumDemo.POM.POM_Demo1.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/books");
        driver.manage().window().maximize();

        HomePage home= new HomePage(driver);
        LoginPage login= new LoginPage(driver);
        Dashboard dashboard= new Dashboard(driver);

        home.clickLogin();

        Thread.sleep(3000);

        login.enterUserName();
        login.enterPassword();
        login.clickLogin();


        System.out.println(dashboard.getHeading());
        dashboard.clickLogout();

        driver.quit();

    }
}
