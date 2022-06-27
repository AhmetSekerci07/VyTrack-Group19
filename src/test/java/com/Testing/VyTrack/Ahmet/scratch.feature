Feature:

  Background: "https://app.vytrack.com/"

  Scenario: 1.Verify that Store manager or sales manager should be able to see all vehicle information once
  navigate to Vehicle page
    Given Authorized User is on fleet management page
    When Authorized User clicks on fleet  on vehicles
    And Authorized User clicks on Vehicle Contract module
    And Authorized User click on Export Grid
    Then Authorized User can see All Vehicle information

  @Test

  Scenario: Verify that Store manager or sales manager should be able to create and cancel a car
    Given Authorized User is on the Vehicle Contract page
    When Authorized User clicks on the Create Vehicle Contract
    And Authorized User inputs drivers information
    Then  Authorized User can create information for the driver

  @Test
  Scenario: Verify that Store manager or sales manager should be able to add Vehicle Module and Vehicle Make
    Given Authorized User is on the Create Vehicle Contract page
    When Authorized User clicks on Cancel module
    Then  Authorized User can cancel Vehicle Contract page

  Scenario:  Verify that Store manager or sales manager should be able to edit or delete the car
    Given Authorized User is on the All Vehicle Contract page
    When  Authorized User hovers over mass action with Edit or Delete displayed
    And Authorized User clicks on either Edit or Delete
    Then Authorized User can either Edit or Delete Vehicle Contract page

  Scenario: Verify that Store manager or sales manager should be able to add event
    Given Authorized User is on the Create Vehicle Contract page
    When Authorized User hovers over reset button
    Then the page is successfully reset

