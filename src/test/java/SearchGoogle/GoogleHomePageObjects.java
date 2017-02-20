package SearchGoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePageObjects {
	public WebDriverWait wait;

	public GoogleHomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 20);
	}
		
		@FindBy(name="q")
		public WebElement txtSearch;
		
		@FindBy(name="btnG")
		public WebElement btnSearch;
		
		@FindBy(linkText="Selenium - Web Browser Automation")
		public WebElement lnkSeleniumHQ;

	

	public void searchGoogle(String searchText) {
		txtSearch.sendKeys(searchText);
		btnSearch.click();

	}
	public SeleniumPageObject clickSelenium(){
		wait.until(ExpectedConditions.elementToBeClickable(lnkSeleniumHQ));
		lnkSeleniumHQ.click();
		
		return  new SeleniumPageObject();
		
	}

}
