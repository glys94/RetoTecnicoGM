package orange.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import orange.userinterface.HomePage;
import orange.userinterface.RecruitmentPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class Recruitment implements Task {
    public static Recruitment openform()
    {
        return Tasks.instrumented(Recruitment.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
                actor.attemptsTo(
                WaitUntil.the(RecruitmentPage.ADD, isCurrentlyVisible()).forNoMoreThan(20).seconds(),
                Click.on(RecruitmentPage.ADD));

    }
}
