package TestNG_Demo.Basics.DataProviderDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo3 {

    @Test(dataProvider = "TestData")
    public void test(Integer temp[]){
        System.out.println(temp[0]+" "+temp[1]);

    }

    @DataProvider
    public Integer[][] TestData(){
        Integer[][] data = new Integer[][]{{1,2},{3,4},{5,6},{7,8}};
        return data;
    }
}
