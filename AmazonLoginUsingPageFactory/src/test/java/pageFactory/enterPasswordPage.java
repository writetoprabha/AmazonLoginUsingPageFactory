package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class enterPasswordPage {
	
	@FindBy(id = "ap_password")
	WebElement txt_password;
	
	@FindBy(id = "signInSubmit")
	WebElement btn_SignIn;
	
	WebDriver driver;
	
	public enterPasswordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickSignInBtn() {
		btn_SignIn.click();
	}

}
