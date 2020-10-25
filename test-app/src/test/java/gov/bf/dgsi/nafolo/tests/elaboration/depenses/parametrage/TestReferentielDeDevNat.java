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

import gov.bf.dgsi.nafolo.tests.utils.PropertiesFileUtils;

public class TestReferentielDeDevNat {
	private ExtentHtmlReporter htmlReporter;
	private ExtentReports extent;
	private ExtentTest test;
	private WebDriver driver;
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

	@BeforeTest
	public void startReport() {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/TestReferentielDeDevNat.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("Extent Report Demo");
		htmlReporter.config().setReportName("Test Report");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	}

	@Test(priority = 0, enabled = true)
	public void testCreationRef() throws Exception {
		test = extent.createTest("testCreationRef", "PASSED test case");
		driver.get(
				"http://10.5.27.201:18080/auth/realms/dgsi/protocol/openid-connect/auth?client_id=sinafolo&redirect_uri=http%3A%2F%2F10.5.27.201%3A8086%2F&state=1ec044d8-1e93-43f4-b914-6ae54b536a60&response_mode=fragment&response_type=code&scope=openid&nonce=089183db-1263-4e05-97a1-07e2a36e3cc8");
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("sanou@nafolo.bf");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.id("kc-login")).click();
		driver.findElement(By.xpath("//app-menu/ul/li[2]/a/span")).click();
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[1]/app-menu/ul/li[2]/ul/li[3]/a/span")
				.click();
		waitForElementVisibility("//li[3]/ul/li/a/span").click();
		waitForElementVisibility("//li[3]/ul/li/ul/li[2]/a/span").click();
		Thread.sleep(2000);
		waitForElementVisibility("//button/span").click();
		waitForElementVisibility("(//input[@type='text'])[4]").click();
		waitForElementVisibility("(//input[@type='text'])[4]").clear();
		waitForElementVisibility("(//input[@type='text'])[4]").sendKeys("refTest");
		waitForElementVisibility("(//input[@type='text'])[5]").click();
		waitForElementVisibility("(//input[@type='text'])[5]").clear();
		waitForElementVisibility("(//input[@type='text'])[5]").sendKeys("test referentiel");
		waitForElementVisibility("//div/button[2]/span[2]").click();
		Thread.sleep(1000);
		waitForElementVisibility(
				"/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/p-steps/div/ul/li[2]/a/span[2]")
						.click();
		waitForElementVisibility("//button/span").click();
		waitForElementVisibility("(//input[@type='text'])[3]").click();
		waitForElementVisibility("(//input[@type='text'])[3]").clear();
		waitForElementVisibility("(//input[@type='text'])[3]")
				.sendKeys(PropertiesFileUtils.processValue("code-axe-strategique"));
		waitForElementVisibility("(//input[@type='text'])[4]").click();
		waitForElementVisibility("(//input[@type='text'])[4]").clear();
		waitForElementVisibility("(//input[@type='text'])[4]").sendKeys("test axe");
		waitForElementVisibility("//div/button[2]/span[2]").click();
		Thread.sleep(1000);
		waitForElementVisibility("//li[3]/a/span[2]").click();
		waitForElementVisibility("//button/span").click();
		waitForElementVisibility("//span[@id='dropdown']/span/p-dropdown/div").click();
		waitForElementVisibility("//span[@id='dropdown']/span/p-dropdown/div/div[4]/div[2]/ul/p-dropdownitem[2]/li")
				.click();
		Thread.sleep(500);
		waitForElementVisibility("(//input[@type='text'])[5]").click();
		waitForElementVisibility("(//input[@type='text'])[5]").clear();
		waitForElementVisibility("(//input[@type='text'])[5]")
				.sendKeys(PropertiesFileUtils.processValue("code-sous-axe-strategique"));
		waitForElementVisibility("(//input[@type='text'])[6]").click();
		waitForElementVisibility("(//input[@type='text'])[6]").clear();
		waitForElementVisibility("(//input[@type='text'])[6]").sendKeys("test sous axe");
		waitForElementVisibility("//div/button[2]/span[2]").click();
	}

	@Test(priority = 1, enabled = true)
	public void testUpdateRef() throws Exception {
		test = extent.createTest("testUpdateRef", "PASSED test case");
		
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/p-steps/div/ul/li[1]/a/span[2]").click();
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/app-elab-strategie/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[4]/button[1]/span[1]").click();
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/app-elab-strategie/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[2]/p-celleditor/input").click();
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/app-elab-strategie/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[2]/p-celleditor/input").clear();
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/app-elab-strategie/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[2]/p-celleditor/input").sendKeys("new");
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/app-elab-strategie/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[3]/p-celleditor/input").click();
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/app-elab-strategie/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[3]/p-celleditor/input").clear();
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/app-elab-strategie/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[3]/p-celleditor/input").sendKeys("new");
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/app-elab-strategie/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[4]/button[1]/span[1]").click();
		

		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/p-steps/div/ul/li[2]/a/span[2]").click();
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/app-elab-axe-strategique/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[3]/button[2]/span[1]").click();
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/app-elab-axe-strategique/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[2]/p-celleditor/input").click();
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/app-elab-axe-strategique/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[2]/p-celleditor/input").clear();
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/app-elab-axe-strategique/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[2]/p-celleditor/input").sendKeys("new");
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/app-elab-axe-strategique/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[3]/button[1]/span[1]").click();
		
		
		
		
		
	}

	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " FAILED ", ExtentColor.RED));
			test.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " PASSED ", ExtentColor.GREEN));
		} else {
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " SKIPPED ", ExtentColor.ORANGE));
			test.skip(result.getThrowable());
		}
	}

	@AfterTest
	public void tearDownR() {
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
