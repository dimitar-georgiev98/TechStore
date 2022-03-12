package uni.fmi.selenium.models;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmagScreenModel {

	private WebDriver driver;
	private WebElement queryField;

	public EmagScreenModel(final WebDriver driver) {
		this.driver = driver;
	}
	
	public void openScreen() {
		driver.get("https://www.emag.bg/");
	}
	
	/**
	 * @return the queryField
	 */
	public WebElement getQueryField() {
		queryField = driver.findElement(By.id("searchboxTrigger"));
		return queryField;
	}

	/**
	 */
	public void getSearchButton() {
		final WebElement queryField = driver.findElement(By.id("searchboxTrigger"));
		queryField.sendKeys(Keys.RETURN);
	}
	
	public EmagDetailsModel clickSearchButton() {
		getSearchButton();
		return new EmagDetailsModel(driver);
	}
	
	public void setQueryParams(final String queryValue) {
		getQueryField().sendKeys(queryValue);
	}
	
	
}
