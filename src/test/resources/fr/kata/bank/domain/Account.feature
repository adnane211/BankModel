#noinspection: nonAsciiCharacters

Feature: Bank Account management

  @check
  Scenario: The user checking his back account
    Given I'm checking my bank account
    And My bank account is empty
    When I check the balance
    Then the balance should be 0

  @deposit
  Scenario: Deposit 500 euros in my account
    Given I deposit 500 euros
    When I check the balance
    Then My balance should be 500

  @withdrawal
  Scenario: I withdraw 250 and check the balance
    Given I withdraw 250 euros
    When I check the balance
    Then My balance should be 250

  @balanceenquiry
  Scenario: I print the statement balance
    Given I print the statement
    When The statement is printed
    Then My balance should be 250