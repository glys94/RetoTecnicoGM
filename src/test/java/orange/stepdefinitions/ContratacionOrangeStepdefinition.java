package orange.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import orange.interactions.Wait;
import orange.models.FormRecruitmentModel;
import orange.models.LoginModel;
import orange.questions.ValidateLogin;
import orange.tasks.*;
import orange.userinterface.HomePage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class ContratacionOrangeStepdefinition {
    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("gladys");
    }

    @Given("I log in to the Orange page")
    public void iLogInToTheOrangePage() {

        OnStage.theActor("gladys").wasAbleTo(NavegateTo.site());
        OnStage.theActorCalled("gladys").attemptsTo(Wait.milisegundos(1000));

    }

    @When("add credentials")
    public void addCredentials(DataTable dataTable) {
        OnStage.theActorCalled("gladys").attemptsTo(Login.login(LoginModel.setData(dataTable).get(0))

        );
    }

    @Then("validate login user succesfully")
    public void validateLoginUserSuccesfully() {
       OnStage.theActorCalled("gladys").should(seeThat(ValidateLogin.validateLogin(HomePage.VALIDATEDASBOARD),
                equalTo("Dashboard"
                        )));
    }

    @Given("go to the Recruitment function.")
    public void goToTheRecruitmentFunction() {
        OnStage.theActorCalled("gladys").attemptsTo(Home.goToRecruitment());
    }

    @When("click on the Add button for create a new candidate")
    public void clickOnTheAddButtonForCreateANewCandidate(DataTable dataTable) {

        OnStage.theActorCalled("gladys").attemptsTo(Recruitment.openform(),
                FormRecruitment.completeform(FormRecruitmentModel.setData(dataTable).get(0)),
                ShortList.shortList(),
                Schedule.schedule(FormRecruitmentModel.setData(dataTable).get(0)),
                AproveInterviewer.aproveInterviewer(),
                Offerjob.offerjob(),
                Hire.hire()
                );


    }

    @Then("validate register user succesfully")
    public void validateRegisterUserSuccesfully() {

    }


}
