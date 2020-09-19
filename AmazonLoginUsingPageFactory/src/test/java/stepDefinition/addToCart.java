package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import pageFactory.enterPasswordPage;
import pageFactory.enterUsernamePage;
import pageFactory.landingPage;

public class addToCart {
	
	WebDriver driver = null;
	landingPage landing;
	enterUsernamePage usernamePage;
	enterPasswordPage passwordPage;

	@Given("browser is open")
	public void browser_is_open() {
	    System.out.println("Inside - browser_is_open");
	    
	    String projectPath = System.getProperty("user.dir");
	    
	    System.setProperty("webdriver.gecko.driver", projectPath+"/src/test/resources/Drivers/geckodriver.exe");
	    driver = new FirefoxDriver();
	    
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	    driver.manage().window().maximize();
	    
	}

	@And("navigate to amazon.com")
	public void navigate_to_amazon_com() {
		System.out.println("Inside - navigate_to_amazon_com");
		
		driver.navigate().to("https://www.amazon.com/");
		
	}

	@When("clicks on Hello Sign In")
	public void clicks_on_Hello_sign_in() {
		System.out.println("Inside - clicks_on_Hello_sign_in");
		landing = new landingPage(driver);
		landing.clickHelloSignIn();
		
	}

	@Then("user is navigated to amazon enterUsername page")
	public void user_is_navigated_to_amazon_enterUsername_page() {
		System.out.println("Inside - user_is_navigated_to_amazon_enterUsername_page");
		usernamePage = new enterUsernamePage(driver);
		usernamePage.checkEmailTextBoxIsDisplayed();
		System.out.println("1");
	}
	//System.out.println("11");
//*********************
	//Given user enters <username> then clicks Continue
	@Given("^user enters (.*)$")
	public void user_enters_username(String username) throws InterruptedException {
		System.out.println("111");
		System.out.println("Inside - user_enters_username");
		usernamePage = new enterUsernamePage(driver);
		System.out.println("1111");
		usernamePage.enterUsername(username);
		Thread.sleep(2000);
		usernamePage.clickOnContinue();
		Thread.sleep(2000);
	}
	
	@And("user clicks Continue")
	public void user_clicks_Continue() throws InterruptedException {
		System.out.println("222");
		System.out.println("Inside - user clicks Continue");
		//usernamePage = new enterUsernamePage(driver);
		//usernamePage.enterUserName(username);
		//Thread.sleep(2000);
		usernamePage.clickOnContinue();
		Thread.sleep(2000);
	}

	@And("^user enter (.*)$")
	public void user_enters_password(String password) throws InterruptedException {
		System.out.println("Inside - user_enter_password");
		passwordPage = new enterPasswordPage(driver);
		passwordPage.enterPassword(password);
		Thread.sleep(2000);
	}

	@When("clicks on Sign-In button")
	public void clicks_on_sign_in_button() throws InterruptedException {
		System.out.println("Inside - clicks_on_sign_in_button");
		passwordPage.clickSignInBtn();
		Thread.sleep(2000);
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Inside - user_is_navigated_to_the_home_page");
	}
	
}
