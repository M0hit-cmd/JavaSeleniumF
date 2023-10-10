package TestNG_Demo.Basics;

import org.testng.annotations.*;

import javax.swing.*;

public class TestNgBasics {

    //Pre-conditions annotations -- starting with @Before
    @BeforeSuite //1
    public void setup(){
        System.out.println(" @BeforeSuite -- setup system property for chrome");
    }

    @BeforeTest //2
    public void launchBrowser(){
        System.out.println(" @BeforeTest -- launch chrome browser");
    }

    @BeforeClass //3
    public void login(){
        System.out.println(" @BeforeClass -- login to app");
    }

    @BeforeMethod //4
    public void enterURL(){
        System.out.println(" @BeforeMethod -- enter the URL");
    }

    @BeforeGroups("hello")
    public void temp(){
        System.out.println("@BeforeGroup");

    }
    //test case -- starting with @Test
    @Test(groups = "hello") //5
    public void googleTitleTest(){
        System.out.println(" @Test -- google title test");
    }

    @Test
    public void searchTest(){
        System.out.println(" @Test -- search test");
    }

    @Test(groups = "hello")
    public void googleLogoTest(){
        System.out.println(" @Test -- google logo test");
    }

    //post conditions -- starting with @After
    @AfterMethod //6
    public void logout(){
        System.out.println(" @AfterMethod -- logout form app");
    }

    @AfterClass //7
    public void closeBrowser()
    {
        System.out.println(" @AfterClass -- close browser");
    }

    @AfterTest //8
    public void deleteAllCookies(){
        System.out.println(" @AfterTest -- Delete all cookies");
    }

    @AfterSuite //9
    public void getTestReport(){
        System.out.println(" @AfterSuite -- generate test report");
    }
}
