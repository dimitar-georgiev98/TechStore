package uni.fmi.selenium;

import static org.junit.Assert.assertEquals;
import java.time.Duration;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import uni.fmi.selenium.models.DetailsScreenModel;
import uni.fmi.selenium.models.WikipediaScreenModel;

public class SeleniumTest {

	private static WebDriver driver;
	private WikipediaScreenModel wikiScreenModel;
	
	@BeforeClass
	public static void setupClass() {
	 System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	}
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
		wikiScreenModel = new WikipediaScreenModel(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@After
	public void after() {
		driver.close();
	}
	
	@Test
	public void testWikipediaScreen() throws InterruptedException {
		driver.get("https://bg.wikipedia.org/wiki/%D0%9D%D0%B0%D1%87%D0%B0%D0%BB%D0%BD%D0%B0_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
		
		final WebElement queryField = driver.findElement(By.id("searchInput"));
		queryField.sendKeys("България");
		final WebElement searchButton = driver.findElement(By.id("searchButton"));
		searchButton.click();
		final WebElement h1 = driver.findElement(By.id("firstHeading"));
		assertEquals("България", h1.getText());
		Thread.sleep(3000);		
	}
	
	@Test
	public void testWikipediaScreen2() throws InterruptedException {
		wikiScreenModel.openScreen();
		wikiScreenModel.setQueryParams("София");

		final DetailsScreenModel resultScreen = wikiScreenModel.clickSearchButton();
		assertEquals("София", resultScreen.getHeaderValue());
		
		Thread.sleep(3000);		
	}
	
	@Test
	public void testWikipediaScreen3() throws InterruptedException {
		wikiScreenModel.openScreen();
		wikiScreenModel.setQueryParams("Пловдив");
		
		final DetailsScreenModel resultScreen = wikiScreenModel.clickSearchButton();
		assertEquals("Пловдив", resultScreen.getHeaderValue());
		
		Thread.sleep(3000);
	}
	
	@Test
	public void testWikipediaScreen4() throws InterruptedException {
		wikiScreenModel.openScreen();
		wikiScreenModel.setQueryParams("Варна");
		
		final DetailsScreenModel resultScreen = wikiScreenModel.clickSearchButton();
		assertEquals("Варна", resultScreen.getHeaderValue());
		
		Thread.sleep(3000);
	}
	
	@Test
	public void testWikipediaScreen5() throws InterruptedException {
		wikiScreenModel.openScreen();
		wikiScreenModel.setQueryParams("Бургас");
		
		final DetailsScreenModel resultScreen = wikiScreenModel.clickSearchButton();
		assertEquals("Бургас", resultScreen.getHeaderValue());
		
		Thread.sleep(3000);
	}
	
	@Test
	public void testWikipediaScreen6() throws InterruptedException {
		wikiScreenModel.openScreen();
		wikiScreenModel.setQueryParams("Пазарджик");
		
		final DetailsScreenModel resultScreen = wikiScreenModel.clickSearchButton();
		assertEquals("Пазарджик", resultScreen.getHeaderValue());
		
		Thread.sleep(3000);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
