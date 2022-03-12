package uni.fmi.selenium.models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EmagDetailsModel {

	private WebDriver driver;
	
	public EmagDetailsModel(final WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
