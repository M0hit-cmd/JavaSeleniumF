package TestNG_Demo.Basics;

import org.testng.annotations.Test;

public class invocationCountTest {

    //it will run this test case 10 times
    @Test(invocationCount = 5)
    public void sum(){
    int a=10;
    int b=20;
    int c=a+b;
        System.out.println("Sum is====="+c);
    }
}
