package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class enterUsernamePage {
	
	@FindBy(id = "ap_email")
	WebElement txt_username;
	
	@FindBy(id = "continue")
	WebElement btn_continue;
	
	WebDriver driver;
	
	public enterUsernamePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void checkEmailTextBoxIsDisplayed() {
		txt_username.isDisplayed();
	}
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void clickOnContinue() {
		btn_continue.click();
	}

}
