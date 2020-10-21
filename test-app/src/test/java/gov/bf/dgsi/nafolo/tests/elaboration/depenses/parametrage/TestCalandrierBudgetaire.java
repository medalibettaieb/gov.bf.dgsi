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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCalandrierBudgetaire {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
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
	@Test(priority = 0)
	public void testCalendrierBudgRecord() throws Exception {
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
		driver.findElement(By.xpath("//li[2]/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("//li[3]/ul/li/a/span")).click();
		driver.findElement(By.xpath("//li[3]/ul/li/ul/li/a/span")).click();
		driver.findElement(By.xpath("//button/span")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
		driver.findElement(By.xpath("//p-dialog/div/div/div[2]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("BUDGET ETAT EXERCICE 2025");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("01/01/2025");
		driver.findElement(By.xpath("//div/div/div/div[3]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("31/12/2025");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
		driver.findElement(By.xpath("//div/button[2]/span[2]")).click();
		driver.findElement(By.xpath("//div/div/div/div[3]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("31/12/2025");
		driver.findElement(By.xpath("//a[2]/span")).click();
	}

	@Test(enabled = false)
	public void testCalendrierBudgModify() throws Exception {
		driver.get(
				"http://10.5.27.201:18080/auth/realms/dgsi/protocol/openid-connect/auth?client_id=sinafolo&redirect_uri=http%3A%2F%2F10.5.27.201%3A8086%2F&state=01c67080-b438-4502-a346-545fefc630f7&response_mode=fragment&response_type=code&scope=openid&nonce=248d9350-b756-4df0-8a15-57fd933fd39e");
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("sanou@nafolo.bf");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.id("kc-login")).click();
		driver.findElement(By.xpath("//app-menu/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath("//li[2]/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("//li[3]/ul/li/a/span")).click();
		driver.findElement(By.linkText("Calendrier Budgetaire")).click();
		driver.findElement(By.xpath("//tr[2]/td[5]/button/span")).click();
		driver.findElement(By.xpath("//td[4]/p-celleditor/p-calendar/span")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("20/12/2025");
		driver.findElement(By.xpath("//tr[2]/td[5]/button/span")).click();
		driver.findElement(By.xpath("//a[2]/span")).click();
	}

	@Test(enabled = false)
	public void testCalendrierBudgDelete() throws Exception {
		driver.get(
				"http://10.5.27.201:18080/auth/realms/dgsi/protocol/openid-connect/auth?client_id=sinafolo&redirect_uri=http%3A%2F%2F10.5.27.201%3A8086%2F&state=564cf9df-5136-47d7-8f1d-a89505833d13&response_mode=fragment&response_type=code&scope=openid&nonce=88d7bf0f-b17a-45b1-822f-fd86a51f81a4");
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("sanou@nafolo.bf");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.id("kc-login")).click();
		driver.findElement(By.xpath("//app-menu/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath("//li[2]/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("//li[3]/ul/li/a/span")).click();
		driver.findElement(By.xpath("//li[3]/ul/li/ul/li/a/span")).click();
		driver.findElement(By.xpath("//button[2]/span")).click();
		driver.findElement(By.xpath("//p-footer/button[2]/span[2]")).click();
		driver.findElement(By.xpath("//a[2]/span")).click();
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

	private WebElement waitForElementVisibility(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

		return element;

	}
}
