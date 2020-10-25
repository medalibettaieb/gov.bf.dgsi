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
		
		
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/p-steps/div/ul/li[1]/a/span[2]").click();
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/app-elab-strategie/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[4]/button[1]/span[1]").click();
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/app-elab-strategie/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[2]/p-celleditor/input").click();
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/app-elab-strategie/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[2]/p-celleditor/input").clear();
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/app-elab-strategie/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[2]/p-celleditor/input").sendKeys("new");
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/app-elab-strategie/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[3]/p-celleditor/input").click();
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/app-elab-strategie/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[3]/p-celleditor/input").clear();
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/app-elab-strategie/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[3]/p-celleditor/input").sendKeys("new");
		waitForElementVisibility("/html/body/app-root/app-main/div/div/div[2]/div/app-step-parametrage-axe/div/app-elab-strategie/app-ref-page/div/div/div/p-table/div/div/table/tbody/tr[1]/td[4]/button[1]/span[1]").click();
		
		
		
		
	}

	private static WebElement waitForElementVisibility(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

		return element;

	}
}
