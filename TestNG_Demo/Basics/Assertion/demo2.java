package TestNG_Demo.Basics.Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class demo2 {

    @Test
    public void soft(){

        SoftAssert assertion = new SoftAssert();
        assertion.assertEquals(1,2);
        System.out.println("it is soft assert");
        assertion.assertAll();
    }

    @Test
    public void hard(){
        Assert.assertEquals(1,2);
        System.out.println("it is hard assert");
      }
}
