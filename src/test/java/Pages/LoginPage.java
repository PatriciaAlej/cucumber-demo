package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	protected WebDriver driver;
	private By txt_username = By.id("name");
	private By txt_password = By.id("password");
	private By btnLogin = By.id("login");
	private By btn_logout = By.id("logout");
	
	public LoginPage(WebDriver driver) throws IllegalAccessException{
		this.driver= driver;
		if(!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalAccessException("Esta no es la Pagina de Login es" 
			+ driver.getCurrentUrl());
		}
	}

	public void enterUsername(String username) {

		driver.findElement(txt_username).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}

	public void clickButton() {
		driver.findElement(btnLogin).click();
	}
	
	public void checkLogin() {
		driver.findElement(btn_logout).isDisplayed();
	}
}
