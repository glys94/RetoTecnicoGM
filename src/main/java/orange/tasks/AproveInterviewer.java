package orange.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import orange.userinterface.FormRecruitmentPage;
import orange.userinterface.RecruitmentPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class AproveInterviewer implements Task {
    public static AproveInterviewer aproveInterviewer()
    {
        return Tasks.instrumented(AproveInterviewer.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(RecruitmentPage.APPROVEDBUTTON),
                Click.on(FormRecruitmentPage.BUTTONSAVE)


        );
    }
}
