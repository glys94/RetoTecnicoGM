package orange.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import orange.interactions.Wait;
import orange.models.FormRecruitmentModel;
import orange.models.LoginModel;
import orange.userinterface.FormRecruitmentPage;
import orange.userinterface.LoginPage;
import orange.userinterface.RecruitmentPage;
import orange.userinterface.SchedulePage;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class Schedule implements Task {

    FormRecruitmentModel formRecruitmentModel;

    public Schedule(FormRecruitmentModel formRecruitmentModel) {
        this.formRecruitmentModel = formRecruitmentModel;
    }

    public static Schedule schedule(FormRecruitmentModel formRecruitmentModel) {
        return Tasks.instrumented(Schedule.class, formRecruitmentModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(formRecruitmentModel.getInterviewerTitle()).into(SchedulePage.INTERVIEWERTITLE),
                Enter.theValue(formRecruitmentModel.getInterviewer()).into(SchedulePage.INTERVIEWER),
                Wait.milisegundos(3000),
                Enter.keyValues(Keys.ARROW_DOWN).into(SchedulePage.INTERVIEWER),
                Enter.keyValues(Keys.ENTER).into(SchedulePage.INTERVIEWER),
                Enter.theValue(formRecruitmentModel.getDate()).into(SchedulePage.DATE),
                Click.on(FormRecruitmentPage.BUTTONSAVE)

                );
    }
}
