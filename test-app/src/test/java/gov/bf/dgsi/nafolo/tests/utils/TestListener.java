package gov.bf.dgsi.nafolo.tests.utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

public class TestListener implements ITestListener {
	public WebDriver webDriver;

	private static String getTestMethodName(ITestResult iTestResult) {
		return iTestResult.getMethod().getConstructorOrMethod().getName();
	}

	@Override
	public void onStart(ITestContext iTestContext) {
		System.out.println("I am in onStart method " + iTestContext.getName());
		iTestContext.setAttribute("WebDriver", webDriver);
	}

	@Override
	public void onFinish(ITestContext iTestContext) {
		System.out.println("I am in onFinish method " + iTestContext.getName());
		// Do tier down operations for extentreports reporting!
		ExtentTestManager.endTest();
		ExtentManager.getReporter().flush();
	}

	@Override
	public void onTestStart(ITestResult iTestResult) {
		System.out.println("I am in onTestStart method " + getTestMethodName(iTestResult) + " start");
	}

	@Override
	public void onTestSuccess(ITestResult iTestResult) {
		System.out.println("I am in onTestSuccess method " + getTestMethodName(iTestResult) + " succeed");
		// ExtentReports log operation for passed tests.
		ExtentTestManager.getTest().log(LogStatus.PASS, "Test passed");
	}

	@Override
	public void onTestFailure(ITestResult iTestResult) {

		ExtentTestManager.getTest().log(LogStatus.FAIL, iTestResult.getThrowable());
		System.out.println("I am in onTestFailure method " + getTestMethodName(iTestResult) + " failed");

//		// Take base64Screenshot screenshot.
//		String base64Screenshot = "data:image/png;base64,"
//				+ ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BASE64);
//
//		// ExtentReports log and screenshot operations for failed tests.
//		ExtentTestManager.getTest().log(LogStatus.FAIL, "Test Failed",
//				ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));
	}

	@Override
	public void onTestSkipped(ITestResult iTestResult) {
		System.out.println("I am in onTestSkipped method " + getTestMethodName(iTestResult) + " skipped");
		// ExtentReports log operation for skipped tests.
		ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
		System.out.println("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
	}

}
