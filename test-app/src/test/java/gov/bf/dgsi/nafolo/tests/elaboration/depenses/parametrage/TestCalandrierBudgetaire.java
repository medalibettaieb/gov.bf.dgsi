package gov.bf.dgsi.nafolo.tests.elaboration.depenses.parametrage;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestCalandrierBudgetaire {
	private ExtentHtmlReporter htmlReporter;
	private ExtentReports extent;
	// helps to generate the logs in test report.
	private ExtentTest test;
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", "WebDriver\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

//	@BeforeClass(alwaysRun = true)
//	public void setUp() throws Exception {
//		driver = new FirefoxDriver();
//		baseUrl = "https://www.google.com/";
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	}

	@BeforeTest
    public void startReport() {
    	// initialize the HtmlReporter
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");
        
        //initialize ExtentReports and attach the HtmlReporter
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
         
        //To add system or environment info by using the setSystemInfo method.
//        extent.setSystemInfo("OS", OS);
//        extent.setSystemInfo("Browser", browser);
        
        //configuration items to change the look and feel
        //add content, manage tests etc
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setDocumentTitle("Extent Report Demo");
        htmlReporter.config().setReportName("Test Report");
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
    }

	@Test(priority = 0, enabled = true)
	public void testCalendrierBudgRecord() throws Exception {
		test = extent.createTest("testCalendrierBudgRecord", "PASSED test case");
		driver.get(
				"http://10.5.27.201:18080/auth/realms/dgsi/protocol/openid-connect/auth?client_id=sinafolo&redirect_uri=http%3A%2F%2F10.5.27.201%3A8086%2Felab-calendrier-budgetaire&state=edeca422-4802-4caa-87a1-43d5c54457b1&response_mode=fragment&response_type=code&scope=openid&nonce=4dd5ce98-d6f9-4df0-958b-d6caada99e39");
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("sanou@nafolo.bf");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.id("kc-login")).click();
		waitForElementVisibility("//app-menu/ul/li[2]/a/span").click();
		waitForElementVisibility("//li[2]/ul/li[3]/a/span").click();
		waitForElementVisibility("//li[3]/ul/li/a/span").click();
		waitForElementVisibility("//li[3]/ul/li/ul/li/a/span").click();
		waitForElementVisibility("//button/span").click();
		waitForElementVisibility("(//input[@type='text'])[3]").click();
		waitForElementVisibility("//p-dialog/div/div/div[2]").click();
		waitForElementVisibility("(//input[@type='text'])[3]").click();
		waitForElementVisibility("(//input[@type='text'])[3]").clear();
		waitForElementVisibility("(//input[@type='text'])[3]").sendKeys("BUDGET ETAT EXERCICE 2025");
		Thread.sleep(2000);
		waitForElementVisibility("(//input[@type='text'])[4]").click();
		waitForElementVisibility("(//input[@type='text'])[4]").clear();
		waitForElementVisibility("(//input[@type='text'])[4]").sendKeys("01/01/2025");
		Thread.sleep(2000);
		waitForElementVisibility("(//input[@type='text'])[3]").click();
		Thread.sleep(2000);
		waitForElementVisibility("(//input[@type='text'])[5]").click();
		waitForElementVisibility("(//input[@type='text'])[5]").clear();
		waitForElementVisibility("(//input[@type='text'])[5]").sendKeys("31/12/2025");
		waitForElementVisibility("(//input[@type='text'])[4]").click();
		Thread.sleep(2000);
		waitForElementVisibility("//div/button[2]/span[2]").click();
	}

	@Test(priority = 1, enabled = false)
	public void testCalendrierBudgModify() throws Exception {
		driver.get(
				"http://10.5.27.201:18080/auth/realms/dgsi/protocol/openid-connect/auth?client_id=sinafolo&redirect_uri=http%3A%2F%2F10.5.27.201%3A8086%2F&state=01c67080-b438-4502-a346-545fefc630f7&response_mode=fragment&response_type=code&scope=openid&nonce=248d9350-b756-4df0-8a15-57fd933fd39e");
		waitForElementVisibility("//app-menu/ul/li[2]/a/span").click();
		waitForElementVisibility("//li[2]/ul/li[3]/a/span").click();
		waitForElementVisibility("//li[3]/ul/li/a/span").click();
		driver.findElement(By.linkText("Calendrier Budgetaire")).click();
		Thread.sleep(2000);
		waitForElementVisibility(
				"/html/body/app-root/app-main/div/div/div[2]/div/app-calendrier-budgetaire/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[5]/button[1]")
						.click();
		waitForElementVisibility("//td[4]/p-celleditor/p-calendar/span").click();
		waitForElementVisibility("(//input[@type='text'])[5]").clear();
		waitForElementVisibility("(//input[@type='text'])[5]").sendKeys("20/12/2025");
		waitForElementVisibility(
				"/html/body/app-root/app-main/div/div/div[2]/div/app-calendrier-budgetaire/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[1]/p-celleditor")
						.click();
		waitForElementVisibility(
				"/html/body/app-root/app-main/div/div/div[2]/div/app-calendrier-budgetaire/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[5]/button[1]")
						.click();
	}

	@Test(priority = 2, enabled = false)
	public void testCalendrierBudgDelete() throws Exception {
		driver.get(
				"http://10.5.27.201:18080/auth/realms/dgsi/protocol/openid-connect/auth?client_id=sinafolo&redirect_uri=http%3A%2F%2F10.5.27.201%3A8086%2F&state=564cf9df-5136-47d7-8f1d-a89505833d13&response_mode=fragment&response_type=code&scope=openid&nonce=88d7bf0f-b17a-45b1-822f-fd86a51f81a4");
		waitForElementVisibility("//app-menu/ul/li[2]/a/span").click();
		waitForElementVisibility("//li[2]/ul/li[3]/a/span").click();
		waitForElementVisibility("//li[3]/ul/li/a/span").click();
		Thread.sleep(2000);
		waitForElementVisibility("//li[3]/ul/li/ul/li/a/span").click();
		Thread.sleep(2000);
		waitForElementVisibility("//button[2]/span").click();
		Thread.sleep(2000);
		waitForElementVisibility("//p-footer/button[2]/span[2]").click();
		Thread.sleep(2000);
		// waitForElementVisibility("//a[2]/span").click();
	}

	 @AfterMethod
	    public void getResult(ITestResult result) {
	        if(result.getStatus() == ITestResult.FAILURE) {
	            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
	            test.fail(result.getThrowable());
	        }
	        else if(result.getStatus() == ITestResult.SUCCESS) {
	            test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
	        }
	        else {
	            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
	            test.skip(result.getThrowable());
	        }
	    }
	 @AfterTest
	    public void tearDownR() {
	    	//to write or update test information to reporter
	        extent.flush();
	    }
	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		extent.flush();
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}

	private WebElement waitForElementVisibility(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

		return element;

	}
}
