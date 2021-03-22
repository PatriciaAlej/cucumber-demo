#Author: Patricia Munoz
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
Feature: TestBuscarEnGoogle

  Scenario: Validar que la busqueda de google este funcionando
    Given navegador esta abierto
    And usar el buscador de google
    When usuario introduce un texto al buscador
    And presiona enter
    Then usuario puede navegar a los resultados del buscador
