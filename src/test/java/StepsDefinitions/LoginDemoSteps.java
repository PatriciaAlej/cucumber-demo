//package StepsDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//
//public class LoginDemoSteps {
//	
//	
//    WebDriver driver = null;
//    
//	@Given("abrir el navegador")
//	public void abrir_el_navegador() {
//		String projectPath;
//		System.out.println("Paso 1 - Abrir el navegador");
//		projectPath = System.getProperty("user.dir");
//		System.out.println("El path es:" + projectPath);
//		System.setProperty("webdriver.chrome.driver",
//			projectPath + "/src/test/resources/Drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("usuario esta en la pagina de inicio de la sesion")
//	public void usuario_esta_en_la_pagina_de_inicio_de_la_sesion() {
//	   driver.navigate().to("https://example.testproject.io/web");
//	
//	  
//	}
//
//	@When("^escribe (.*) y (.*)$")
//	public void escribe_usuario_y_contrasena(String usuario, String password) throws InterruptedException {
//	  driver.findElement(By.id("name")).sendKeys(usuario);
//	  driver.findElement(By.id("password")).sendKeys(password);
//	  Thread.sleep(1000);
//	}
//
//	@And("realizar click al boton login")
//	public void realizar_click_al_boton_login() {
//	   driver.findElement(By.id("login")).click();
//	}
//
//	@Then("el usuario navega a la pagina inicial")
//	public void el_usuario_navega_a_la_pagina_inicial() {
//	   driver.getTitle().contains("Hello patricia, let's complete the test form:");
//	   driver.close();
//	   driver.quit();
//	}
//
//}
