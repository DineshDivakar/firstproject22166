package ebox.Selenium.LCCC;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener{

	@Override
	public void onFinish(ITestContext Result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext Result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult Result) {
		System.out.println("Method" +Result.getName()+"Failed");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult Result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult Result) {
		System.out.println(Result.getName()+" test case started");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult Result) {
		System.out.println("Method" + Result.getName() +"Passed");
		// TODO Auto-generated method stub
		
	}

}
