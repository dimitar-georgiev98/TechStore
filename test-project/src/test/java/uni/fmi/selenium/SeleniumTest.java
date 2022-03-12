package uni.fmi.selenium;

import static org.junit.Assert.assertEquals;
import java.time.Duration;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import uni.fmi.selenium.models.EmagDetailsModel;
import uni.fmi.selenium.models.EmagScreenModel;

public class SeleniumTest {

	private static WebDriver driver;
	private EmagScreenModel emagScreenModel;
	
	@BeforeClass
	public static void setupClass() {
	 System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	}
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
		emagScreenModel = new EmagScreenModel(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@After
	public void after() {
		driver.close();
	}
	
	@Test
	public void testEmagScreen1() throws InterruptedException {
		
		driver.get("https://www.emag.bg/");
		final WebElement queryField = driver.findElement(By.id("searchboxTrigger"));
		queryField.sendKeys("Смартфон");
		queryField.sendKeys(Keys.RETURN);

		Thread.sleep(3000);		
	}
	
	@Test
	public void testEmagScreen2() throws InterruptedException {
		
		driver.get("https://www.emag.bg/");
		driver.findElement(By.className("navbar-aux-help-link")).click();

		Thread.sleep(3000);		
	}
	
	
	@Test
	public void testEmagScreen3() throws InterruptedException {
		emagScreenModel.openScreen();
		driver.findElement(By.id("my_cart")).click();
		
		Thread.sleep(3000);		
	}
	
	@Test
	public void testEmagScreen4() throws InterruptedException {
		emagScreenModel.openScreen();
		emagScreenModel.setQueryParams("Лаптоп");
		final EmagDetailsModel resultScreen = emagScreenModel.clickSearchButton();
		
		Thread.sleep(3000);
	}
	
	@Test
	public void testEmagScreen5() throws InterruptedException {
		emagScreenModel.openScreen();
		emagScreenModel.setQueryParams("OLED TV");
		final EmagDetailsModel resultScreen = emagScreenModel.clickSearchButton();
		
		Thread.sleep(3000);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
