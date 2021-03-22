package StepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	
    WebDriver driver = null;
    
	@Given("navegador esta abierto")
	public void navegador_esta_abierto() {

		String projectPath;
		System.out.println("Paso 1 - Abrir el navegador");
		projectPath = System.getProperty("user.dir");
		System.out.println("El path es:" + projectPath);
		System.setProperty("webdriver.chrome.driver",
			projectPath + "/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@And("usar el buscador de google")
	public void usar_el_buscador_de_google() {
		System.out.println("Paso 2 - Buscar en Google");
		driver.navigate().to("https://www.google.com");
	}

	@When("usuario introduce un texto al buscador")
	public void usuario_introduce_un_texto_al_buscador() {
		System.out.println("Paso 3- Introducir el texto a buscar");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	}

	@And("presiona enter")
	public void presiona_enter() {
		System.out.println("Paso 4- Presionar Enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("usuario puede navegar a los resultados del buscador")
	public void usuario_puede_navegar_a_los_resultados_del_buscador() {
		System.out.println("Paso 5 - El usuario esta navegando en los resultados de la busqueda");
		driver.getPageSource().contains("Online Courses");
		driver.close();
		driver.quit();
	}

}
