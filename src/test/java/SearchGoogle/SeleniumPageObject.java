package SearchGoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumPageObject {
	public WebDriverWait wait;

	public SeleniumPageObject() {

	}

	public SeleniumPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 20);
	}

	@FindBy(linkText = "Download")
	public WebElement lnkDownload;

	@FindBy(xpath = "html/body/div/div[1]/h1/a")
	public WebElement lnkHome;

	public void ClickDownload() {
		wait.until(ExpectedConditions.elementToBeClickable(lnkDownload));
		lnkDownload.click();

	}

	public void NavigateHome() {

		wait.until(ExpectedConditions.elementToBeClickable(lnkHome));
		lnkHome.click();
	}

}
