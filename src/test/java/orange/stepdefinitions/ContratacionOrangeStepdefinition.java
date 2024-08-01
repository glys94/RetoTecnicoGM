package orange.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import orange.interactions.Wait;
import orange.models.LoginModel;
import orange.tasks.Login;
import orange.tasks.NavegateTo;

import java.util.List;

public class ContratacionOrangeStepdefinition {
    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("gladys");
    }

    @Given("I log in to the Orange page")
    public void iLogInToTheOrangePage() {

        OnStage.theActor("gladys").wasAbleTo(NavegateTo.site());
        OnStage.theActorCalled("gladys").attemptsTo(Wait.milisegundos(3000));

    }

    @When("add credentials")
    public void addCredentials(DataTable dataTable) {
        OnStage.theActorCalled("gladys").attemptsTo(Login.login(LoginModel.setData(dataTable).get(0))

        );
    }

    @Then("validate login user succesfully")
    public void validateLoginUserSuccesfully() {

    }

    @Given("go to the Recruitment function.")
    public void goToTheRecruitmentFunction() {

    }

    @When("click on the Add button for create a new candidate")
    public void clickOnTheAddButtonForCreateANewCandidate() {

    }

    @Then("validate register user succesfully")
    public void validateRegisterUserSuccesfully() {

    }


}
