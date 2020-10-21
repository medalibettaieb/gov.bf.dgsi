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

public class TestClassificationAdministrative {
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
	  public void testCreationTypeSection() throws Exception {
	    driver.get("http://10.5.27.201:18080/auth/realms/dgsi/protocol/openid-connect/auth?client_id=sinafolo&redirect_uri=http%3A%2F%2F10.5.27.201%3A8086%2F&state=1c83b609-3471-4337-8140-b8d719c113bc&response_mode=fragment&response_type=code&scope=openid&nonce=c898fd22-3369-4e66-8e28-fada60cbf34f");
	    driver.findElement(By.id("username")).click();
	    driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("sanou@nafolo.bf");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test123");
	    driver.findElement(By.id("kc-login")).click();
	    driver.findElement(By.xpath("//app-menu/ul/li[2]/a/span")).click();
	    driver.findElement(By.linkText("buildDépenseskeyboard_arrow_down")).click();
	    driver.findElement(By.xpath("//li[3]/ul/li/a/span")).click();
	    driver.findElement(By.xpath("//li[3]/ul/li/ul/li[4]/a/span")).click();
	    driver.findElement(By.xpath("//span[2]")).click();
	    driver.findElement(By.xpath("//button/span")).click();
	    driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
	    driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Administration indépendante");
	    driver.findElement(By.xpath("//div/button[2]/span[2]")).click();
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
