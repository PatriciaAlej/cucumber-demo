package PageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePF {

	@FindBy(id= "name")
	private WebElement txt_username;
	@FindBy(id= "password")
	private WebElement txt_password;
	@FindBy(id= "login")
	private WebElement buttonLogin;
	
	WebDriver driver;
	public LoginPagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, LoginPagePF.this);
	}
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterPasswork(Integer password) {
		txt_password.sendKeys(String.valueOf(password));
	}
	
	public void clickButonLogin() {
		buttonLogin.click();
	}
}
