package TestNG_Demo.Basics.Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo1 {


//    soft assert
    @Test
    public void test(){
        SoftAssert assertion=new SoftAssert();

        assertion.assertTrue(false);

        System.out.println("soft assert");

        assertion.assertAll();

    }
//    hard assert
    @Test
    public void test1(){


        Assert.assertEquals(12, 13);
        System.out.println("Hard assert");
    }

}
