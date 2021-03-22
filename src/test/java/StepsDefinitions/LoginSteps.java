package StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("^Necesito loguearme en la pagina$")
	public void necesito_loguearme_en_la_pagina() {
		System.out.println("hola mundo");
		//throw new io.cucumber.java.PendingException();
	}

	@When("Uso username y password")
	public void uso_username_y_password() {
		System.out.println("hola mundo");
		//throw new io.cucumber.java.PendingException();
													
	}

	@And("Realizo click en el boton de login")
	public void realizo_click_en_el_boton_de_login() {
		System.out.println("hola mundo");
		//throw new io.cucumber.java.PendingException();

	}

	@Then("Validar que el usuario este logeado")
	public void validar_que_el_usuario_este_logeado() {
		System.out.println("hola mundo");
		//throw new io.cucumber.java.PendingException();

	}

}
