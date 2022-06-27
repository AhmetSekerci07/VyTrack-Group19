Feature:
 @
  Scenario: Authorized User can see all vehicle contracts on the grid.
    Given Authorized User is on fleet management page
    When Authorized User clicks on fleet module
    And Authorized User clicks on Vehicle Contract module
    Then Authorized User can see All Vehicle Contract

    Scenario: Authorized User can create Vehicle contract.
      Given Authorized User is on the Vehicle Contract page
      When Authorized User clicks on the Create Vehicle Contract
      And Authorized User inputs drivers information
      Then  Authorized User can create information for the driver

      Scenario: Authorized User can cancel Vehicle Contract
        Given Authorized User is on the Create Vehicle Contract page
        When Authorized User clicks on Cancel module
        Then  Authorized User can cancel Vehicle Contract page

        Scenario:  Authorized User should be able to Edit or delete the Vehicle Contract
          Given Authorized User is on the All Vehicle Contract page
          When  Authorized User hovers over mass action with Edit or Delete displayed
          And Authorized User clicks on either Edit or Delete
          Then Authorized User can either Edit or Delete Vehicle Contract page

        Scenario: Authorized User can reset the grid by click on Grid setting
          Given Authorized User is on the Create Vehicle Contract page
          When Authorized User hovers over reset button
          Then the page is successfully reset







