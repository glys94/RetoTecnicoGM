package orange.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import orange.userinterface.FormRecruitmentPage;
import orange.userinterface.RecruitmentPage;

public class Offerjob implements Task {
    public static Offerjob offerjob()
    {
        return Tasks.instrumented(Offerjob.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RecruitmentPage.OFFERJOBBUTTON),
                Click.on(FormRecruitmentPage.BUTTONSAVE)
        );
    }
}
