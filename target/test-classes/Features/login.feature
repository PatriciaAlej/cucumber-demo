#Autor: Patricia Munoz
#Cargo: SW3
#Fecha: 23032021
Feature: TestLoginPageAutomation

  Scenario: Verificar que login acceda con las credenciales correctas
    Given Necesito loguearme en la pagina
    When Uso username y password
    And Realizo click en el boton de login
    Then Validar que el usuario este logeado
