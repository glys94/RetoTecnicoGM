package orange.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import orange.userinterface.FormRecruitmentPage;
import orange.userinterface.RecruitmentPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class Offerjob implements Task {
    public static Offerjob offerjob()
    {
        return Tasks.instrumented(Offerjob.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(RecruitmentPage.OFFERJOBBUTTON, isCurrentlyVisible()).forNoMoreThan(20).seconds(),
                Click.on(RecruitmentPage.OFFERJOBBUTTON),
                Click.on(FormRecruitmentPage.BUTTONSAVE)
        );
    }
}
