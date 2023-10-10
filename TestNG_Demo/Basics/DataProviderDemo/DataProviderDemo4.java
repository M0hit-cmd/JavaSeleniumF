package TestNG_Demo.Basics.DataProviderDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderDemo4 {
    @Test(dataProvider = "TestData")
    public void test(String temp){
        System.out.println(temp);

    }

    @DataProvider
    public Iterator<String> TestData(){
        List<String> data = new ArrayList<String>();
        data.add("hello");
        data.add("world");
        return data.iterator();
    }

}
