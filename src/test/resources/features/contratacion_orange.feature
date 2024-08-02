Feature:Log in to the Orange page and create a hiring process by entering the requested data

  Background: login success in demo.orange
    Given I log in to the Orange page
    When  add credentials
      | user  | pasword  |
      | Admin | admin123 |
    Then validate login user succesfully


  Scenario: register 'Recruitment' success in demo.orange
    Given go to the Recruitment function.
    When  click on the Add button for create a new candidate
      | firstName | middleName | lastName | email         | contacNumber | keywords    | notes    | interviewerTitle  | interviewer | date       |
      | Adriana   | saavedra   | tolima   | test@test.com | 3115769087   | zona centro | analista | reunion miercoles | test        | 2024-07-08 |
    Then validate register user succesfully

