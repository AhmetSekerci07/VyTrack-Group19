Feature: Truck Driver
  Scenario: Truck driver can see all vehicles information
    Given driver is on fleet management page
    When driver clicks on fleet module
    And driver clicks on vehicle module
    Then driver can see all vehicles information

  Scenario: Truck driver can see general information by clicking any car on the grid
    Given driver is on the grid page
    When driver clicks on an available car
    Then driver should be able to see general information about car

  Scenario: Truck driver should be able to add an event and should display under activity tab
    Given track driver is on event page
    When  truck driver adds an event
    Then  event should be displayed under activity tap

  Scenario: Truck driver should be able to add an event and should display under general information page
    Given track driver is on event page
    When  truck driver adds an event
    Then  event should be displayed under general information page

  Scenario: Truck driver can reset the setting
    Given truck driver is on the setting page
    When truck driver clicks on reset setting
    Then the setting is successfully reset