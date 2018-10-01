Feature: oracledemo

  Scenario: register user
    Given User open home page
    When User register with username "rhold12345" and password "rhold12345"
    And User log in with username "rhold12345" and password "rhold12345"
    Then User book ticket from file "data.xlsx"




