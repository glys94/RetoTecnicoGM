
#Scenario for Orange Demo

for the creation of the automation I need two scenarios, the main background scenario and a standard scenario, for each scenario I need an amount of data that will be performed in a data table.

Background: successful login to demo.orange
    Since I am logged in on the Orange page
    By adding credentials
      | User Password
      Admin | admin123 | admin123 | admin123 | admin123 | admin123 | admin123 | admin123 | admin123 | admin123
    Then validate the user login successfully


  Scenario: Registration 'Recruitment' successful on demo.orange
    Given go to the recruitment function.
    Clicking on the Add button to create a new candidate
      | firstName | middleName | lastName | lastName | email | contacNumber | keywords | notes | interviewerTitle | interviewer | date | date
      | Adriana | saavedra | tolima | test@test.com | 3115769087 | central area | analyst | meeting wednesday | test | 2024-07-08 |
    Next, validate the user registration successfully

Translated with DeepL.com (free version)


