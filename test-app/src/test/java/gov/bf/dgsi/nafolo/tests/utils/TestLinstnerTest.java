package gov.bf.dgsi.nafolo.tests.utils;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestLinstnerTest extends TestListenerAdapter {
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test start");
	}

	@Override
	public void onTestSuccess(ITestResult tr) {
		System.out.println("test succes");
	}

	@Override
	public void onTestFailure(ITestResult tr) {
		System.out.println("test fail");
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		System.out.println("test skip");
	}
}
