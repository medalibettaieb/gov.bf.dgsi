package gov.bf.dgsi.nafolo.tests.elaboration.depenses.parametrage;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

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

public class TestReferentielDeDevNat {
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

	@Test(enabled=false)  
	public void testReferentielDeDevNat() throws Exception {
		driver.get("http://10.5.27.201:8086/");
		driver.findElement(By.xpath("//i[2]")).click();
		driver.findElement(By.xpath("//li[2]/ul/li[3]/a/i[2]")).click();
		driver.findElement(By.xpath("//li[3]/ul/li/a/i[2]")).click();
		driver.findElement(By.xpath("//li[3]/ul/li/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath("//button/span")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("PNDS");
		driver.findElement(By.xpath("//div/div/div/div[2]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("REF1");
		driver.findElement(By.xpath("//div/button[2]/span[2]")).click();
		driver.findElement(By.xpath("//button/span")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("PNDS2");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("REF3");
		driver.findElement(By.xpath("//div/button[2]/span[2]")).click();
		driver.findElement(By.xpath("//tr[3]/td[4]/button/span")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("REF2");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("PNDS");
		driver.findElement(By.xpath("//tr[3]/td[4]/button/span")).click();
		driver.findElement(By.xpath("//tr[3]/td[4]/button[2]/span")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
		driver.findElement(By.xpath("//li[2]/a/span[2]")).click();
		driver.findElement(By.xpath("//button/span")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("CA1");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("AXE TEST");
		driver.findElement(By.xpath("//button[2]/span[2]")).click();
		driver.findElement(By.xpath("//button/span")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("CA2");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("AXE TEST2");
		driver.findElement(By.xpath("//div/button[2]/span[2]")).click();
		driver.findElement(By.xpath("//tr[2]/td[3]/button[2]/span")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("AXE TEST1");
		driver.findElement(By.xpath("//tr[2]/td[3]/button/span")).click();
		driver.findElement(By.xpath("//tr[2]/td[3]/button[3]/span")).click();
		driver.findElement(By.xpath("//p-footer/button[2]/span")).click();
		driver.findElement(By.xpath("//li[3]/a/span[2]")).click();
		driver.findElement(By.xpath("//button/span")).click();
		driver.findElement(By.xpath("//span[@id='dropdown']/span/p-dropdown/div")).click();
		driver.findElement(By.xpath("//span[@id='dropdown']/span/p-dropdown/div/div[4]/div[2]/ul/p-dropdownitem/li"))
				.click();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("CSA1");
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("SOUS AXE TEST");
		driver.findElement(By.xpath("//div/button[2]/span[2]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("CSA2");
		driver.findElement(By.xpath("//div/button[2]/span[2]")).click();
		driver.findElement(By.xpath("//button/span")).click();
		driver.findElement(By.xpath("//span[@id='dropdown']/span/p-dropdown/div")).click();
		driver.findElement(By.xpath("//span[@id='dropdown']/span/p-dropdown/div/div[4]/div[2]/ul/p-dropdownitem/li"))
				.click();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("CSA3");
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("SOUS AXE TEST 3");
		driver.findElement(By.xpath("//div/button[2]/span[2]")).click();
		driver.findElement(By.xpath("//tr[3]/td[4]/button/span")).click();
		driver.findElement(By.xpath("//tr[3]/td[3]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("SOUS AXE TEST *");
		driver.findElement(By.xpath("//tr[3]/td[2]")).click();
		driver.findElement(By.xpath("//div[3]/span")).click();
		driver.findElement(By.xpath("//p-dropdownitem/li")).click();
		driver.findElement(By.xpath("//tr[3]/td[4]/button/span")).click();
		driver.findElement(By.xpath("//tr[3]/td[4]/button[2]/span")).click();
		driver.findElement(By.xpath("//p-footer/button[2]/span[2]")).click();
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
