Feature: Woodridge Software Springboard Project Product Landing Page Feature

  @SPR-464
  Scenario: AC.03.1 - Product Name/Description from Product Selector is shown in the product selector for Temenos premier checking product
    Given I am on the WS_ProductSelectorPO page
    When the user clicks on the WS_ProductSelector page Checking accounts explore button
    Then "Temenos premier checking" is the first product displayed to the user
    Then the first product description for the Temenos premier checking product states "A good choice if you want to avoid overdraft fees and don't write checks."
    Then the second product description for the Temenos premier checking product states "Get help spending only the money you have available"
    Then the third product description for the Temenos premier checking product states "Pay with a debit card, Zelle®, Mobile or Online banking - no paper checks available"
    Then the fourth product description for the Temenos premier checking product states "No overdraft fees"
    Then the fifth product description for the Temenos premier checking product states "No monthly fee for eligible students"

  @SPR-464
  Scenario: AC.03.2, - Product Name/Description from Product Selector is shown in the product selector for Temenos basic checking product
    Given I am on the WS_ProductSelectorPO page
    When the user clicks on the WS_ProductSelector page Checking accounts explore button
    Then "Temenos basic checking" is the second product displayed to the user
    And the first product description for the Temenos basic checking product states "The best basic checking account available."
    And the second product description for the Temenos basic checking product states "Easy setup and no savings account required!"
    And the third product description for the Temenos basic checking product states "Pay with a debit card, Zelle®, Mobile or Online banking - no paper checks available"
    And the fourth product description for the Temenos basic checking product states "No monthly fees for anyone"

  @SPR-464
  Scenario: AC.03.3, - Product Name/Description from Product Selector is shown in the product selector for Temenos basic checking product
    Given I am on the WS_ProductSelectorPO page
    When the user clicks on the WS_ProductSelector page Checking accounts explore button
    Then "Advantage plus banking" is the third product displayed to the user
    And the first product description for the Advantage plus banking states "A good choice if you use direct deposit and want a straightforward banking account"
    And the second product description for the Advantage plus banking states "Choose from multiple ways to waive the monthly fee"
    And the third product description for the Advantage plus banking states "Pay with a debit card, Zelle®, Mobile or Online banking - no paper checks"
    And the fourth product description for the Advantage plus banking states " Add optional Overdraft Protection"
    And the fifth product description for the Advantage plus banking states " No monthly fee for eligible students"
    And the sixth product description for the Advantage plus banking states " Advantage Relationship Banking"
    And the seventh product description for the Advantage plus banking states " A good choice if you keep higher balances and want multiple accounts and complimentary services"
    And the eight product description for the Advantage plus banking states "   Earn interest on your balance"
    And the nineth product description for the Advantage plus banking states " Get fee waivers on select services"
    And the tenth product description for the Advantage plus banking states "   Add optional Overdraft Protection"

  @SPR-464
  Scenario: AC.03.4, - Product Name/Description from Product Selector is shown in the product selector for Temenos basic checking product

    Given I am on the WS_ProductSelectorPO page
    When the user clicks on the WS_ProductSelector page Savings accounts explore button
    Then "Temenos premier savings" is the first product displayed
    And the first product description for the Temenos Savings accounts states "Get a head start on your future by starting to save today"
    And the second product description for the Temenos Savings accounts states "Mobile Check Deposits"
    And the third product description for the Temenos Savings accounts states "Automatic Transfers"
    And the fourth product description for the Temenos Savings accounts states "Overdraft Protection"
    And the fifth product description for the Temenos Savings accounts states "FDIC Insured upto $250,000"


  @SPR-464
  Scenario: AC.03.5, - Product Name/Description from Product Selector is shown in the product selector for Temenos basic checking product

    Given I am on the WS_ProductSelectorPO page
    When the user clicks on the WS_ProductSelector page Savings accounts explore button
    Then "Custodial (UTMA) Savings Account" is the second product displayed
    And the first product description for the Custodial (UTMA) Savings Account states "Save for later. Deposit funds into a savings account as a gift for when a child reaches maturity"
    And the second product description for the Custodial (UTMA) Savings Account states "  $8/month. No fee if account owner is under the age of 18"
    And the third product description for the Custodial (UTMA) Savings Account states "Free 6 transfers and withdrawals each monthly statement cycle"
    And the fourth product description for the Custodial (UTMA) Savings Account states "Automatic Transfers"
    And the fifth product description for the Custodial (UTMA) Savings Account states "FDIC Insured"
#
#  @SPR-464
#  Scenario: AC.03.6, - Product Name/Description from Product Selector is shown in the product selector for Temenos basic checking product

#    Given I am on the WS_ProductSelectorPO page
#    When the user clicks on the WS_ProductSelector page Certificate of Deposit (CD) accounts explore button
#    Then "Featured CD account" is the first product displayed to the user
#    And the first product description for the Featured CD account states "Lock in a higher rate with a larger opening deposit"
#    And the second product description for the Featured CD account states "Multiple term options available"
#    And the third product description for the Featured CD account states "Competitive, promotional interest rates"
#    And the fourth product description for the Featured CD account states " $10,000 minimum opening deposit"
#
#  @SPR-464
#  Scenario: AC.03.6, - Product Name/Description from Product Selector is shown in the product selector for Temenos basic checking product
#    Given I am using user "HappyPathUser"
#    Given I am on the WS_ProductSelectorPO page
#    When the user clicks on the WS_ProductSelector page Certificate of Deposit (CD) accounts explore button
#    Then "Standard Term CD account" is the second product displayed to the user
#    And the first product description for the Standard Term CD account states "Set your own term with a smaller opening deposit"
#    And the second product description for the Standard Term CD account states "28 day to 10 year terms available"
#    And the third product description for the Standard Term CD account states "Rates vary based on balance/term"
#    And the fourth product description for the Standard Term CD account states "$1,000 minimum opening deposit"
#











