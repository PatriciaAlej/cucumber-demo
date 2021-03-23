#Author: Patricia Munoz
#Version:1.0
Feature: TestLogeoPageTestProject

  Scenario Outline: Validar que usuario creado se logue al sitio correctamente con sus credenciales
    Given abrir el navegador
    And usuario esta en la pagina de inicio de la sesion
    When escribe <usuario> y <contrasena>
    And realizar click al boton login
    Then el usuario navega a la pagina inicial

    Examples: 
      | usuario  | contrasena |
      | Patricia |      12345 |
      | Felipe   |      12345 |
      | Hola     |      12345 |
