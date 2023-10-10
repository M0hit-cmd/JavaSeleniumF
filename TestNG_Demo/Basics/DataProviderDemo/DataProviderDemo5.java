package TestNG_Demo.Basics.DataProviderDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderDemo5 {
    @Test(dataProvider = "TestData")
    public void test(String temp[]){
        System.out.println(temp[0]+" "+temp[1]);

    }

    @DataProvider
    public Iterator<String[]> TestData(){
        List<String[]> data = new ArrayList<String[]>();
        data.add(new String[]{"hello", "world"});
        data.add(new String[]{"world", "world"});
        return data.iterator();
    }
}
