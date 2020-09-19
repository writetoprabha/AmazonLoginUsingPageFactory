package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class landingPage {
	
	@FindBy(id = "nav-link-accountList")
	WebElement linkHelloSignIn;
	
	WebDriver driver;

	public landingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickHelloSignIn() {
		linkHelloSignIn.click();
	}
}
