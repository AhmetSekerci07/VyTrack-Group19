Feature:
  Scenario: Store managers and Sales managers can to access Vehicle Contract
    Given Store managers and Sales managers are on the log in page
    When Store managers and Sales managers enter valid username (storemanager243)
    And valid password (UserUser123)
    Then  Store managers and Sales managers can access the fleet management page

    Scenario: Drivers can NOT access Vehicle Contract
      Given Drivers are on the log in page
      When Drivers enter given username
      And Drivers enter given password
      Then they will not be able to log in with these credentials
