package TestNG_Demo.Basics.LinstenersDemo;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListenersDemo1 implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("TestCases failed and details are "+ result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("TestCases skipped and details are "+ result.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("TestCases started and details are "+ result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("TestCases success and details are "+ result.getName());
    }




}
