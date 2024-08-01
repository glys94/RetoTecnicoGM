Feature:Log in to the Orange page and create a hiring process by entering the requested data

  Background: login success in demo.orange
    Given I log in to the Orange page
    When  add credentials
    |user|pasword|
    |Admin|admin123|
    Then validate login user succesfully



 Scenario: register 'Recruitment' success in demo.orange
    Given go to the Recruitment function.
    When  click on the Add button for create a new candidate
    Then validate register user succesfully

