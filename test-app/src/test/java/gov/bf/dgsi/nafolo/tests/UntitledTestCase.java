package gov.bf.dgsi.nafolo.tests;

import static org.testng.Assert.fail;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UntitledTestCase {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

//  @BeforeClass(alwaysRun = true)
//  public void setUp() throws Exception {
//    driver = new FirefoxDriver();
//    baseUrl = "https://www.google.com/";
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//  }
	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "WebDriver\\chromedriver.exe");
		driver = new ChromeDriver(options);
	}

	@Test
	public void testUntitledTestCase() throws Exception {
		driver.get(
				"http://10.5.27.201:18080/auth/realms/dgsi/protocol/openid-connect/auth?client_id=sinafolo&redirect_uri=http%3A%2F%2F10.5.27.201%3A8086%2F&state=fbc4f74c-3b34-4c33-87b1-2b49c03ef8ad&response_mode=fragment&response_type=code&scope=openid&nonce=2d85bb70-b41c-4927-8fde-bc68d52b6325");
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("sanou@nafolo.bf");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.id("kc-login")).click();
		driver.findElement(By.xpath("//a[@id='topbar-menu-button']/i")).click();
		driver.findElement(By.xpath("//a[@id='topbar-menu-button']/i")).click();
		driver.findElement(By.xpath("//a[@id='topbar-menu-button']/i")).click();
		driver.findElement(By.xpath("//a[@id='menu-button']/i")).click();
		driver.findElement(By.xpath("//a[@id='topbar-menu-button']/i")).click();
		driver.findElement(By.xpath("//a[@id='topbar-menu-button']/i")).click();
		driver.findElement(By.xpath("//a[@id='menu-button']/i")).click();
		driver.findElement(By.xpath("//app-topbar/div/div[2]")).click();
		driver.findElement(By.xpath("//a[@id='topbar-menu-button']/i")).click();
		driver.findElement(By.xpath("//a[@id='menu-button']/i")).click();
		driver.findElement(By.linkText("buildElaboration budgétairekeyboard_arrow_down")).click();
		driver.findElement(By.xpath("//li[3]/a/span")).click();
		driver.findElement(By.linkText("buildContratkeyboard_arrow_down")).click();
		driver.findElement(By.xpath("//li[4]/ul/li/a/span")).click();
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
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
}
