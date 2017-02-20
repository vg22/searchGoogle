package SearchGoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//By creating a GoogleSearchTest class and by separating the Test from the page objects
//we are increasing readability. 
public class SearchGoogleTest {
	public static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) {
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com/");
		
		// Use the GoogleHomePageObjects class to declare a new page
		GoogleHomePageObjects page = new GoogleHomePageObjects(driver);
		//use keyword selenium  to search in google
		page.searchGoogle("Selenium");
		
		// Click the link for the Selenium website.
		page.clickSelenium();
		
		// Click Download Tab
		SeleniumPageObject pageSeleniumHQ = new SeleniumPageObject(driver);
		pageSeleniumHQ.ClickDownload();
		// Click Home Page
		pageSeleniumHQ.NavigateHome();
	}

}
