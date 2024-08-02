package orange.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import orange.userinterface.FormRecruitmentPage;
import orange.userinterface.RecruitmentPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class ShortList implements Task {
    public static ShortList shortList()
    {
        return Tasks.instrumented(ShortList.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(RecruitmentPage.SHORTLISTBUTTON, isCurrentlyVisible()).forNoMoreThan(20).seconds(),
                Click.on(RecruitmentPage.SHORTLISTBUTTON),
                Click.on(FormRecruitmentPage.BUTTONSAVE),
                WaitUntil.the(RecruitmentPage.SCHEDULEBUTTON, isCurrentlyVisible()).forNoMoreThan(20).seconds(),
                Click.on(RecruitmentPage.SCHEDULEBUTTON)
                );
    }
}
