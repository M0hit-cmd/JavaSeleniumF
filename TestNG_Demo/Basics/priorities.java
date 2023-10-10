package TestNG_Demo.Basics;

import org.testng.annotations.Test;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class priorities {

    @Test
    void setup(){
        System.out.println("i am inside setup");
    }

    @Test(priority = 3)
  void testSteps(){
        System.out.println("i am inside test steps");
    }

    @Test(priority =1)
    void tearDown(){
        System.out.println("i am inside tear down");
    }

}