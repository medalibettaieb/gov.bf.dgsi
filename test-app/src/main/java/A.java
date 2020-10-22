import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A {
	private static  WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", "WebDriver\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
		//waitForElementVisibility("//div/div/div/div[3]").click();
		waitForElementVisibility("(//input[@type='text'])[5]").click();
		waitForElementVisibility("(//input[@type='text'])[5]").clear();
		waitForElementVisibility("(//input[@type='text'])[5]").sendKeys("31/12/2025");
		waitForElementVisibility("(//input[@type='text'])[4]").click();Thread.sleep(2000);
		waitForElementVisibility("//div/button[2]/span[2]").click();
//		waitForElementVisibility("//div/div/div/div[3]").click();
//		waitForElementVisibility("(//input[@type='text'])[5]").click();
//		waitForElementVisibility("(//input[@type='text'])[5]").clear();
//		waitForElementVisibility("(//input[@type='text'])[5]").sendKeys("31/12/2025");
//		waitForElementVisibility("//a[2]/span").click();
	}

	private static WebElement waitForElementVisibility(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

		return element;

	}
}
