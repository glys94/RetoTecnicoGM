package orange.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import orange.interactions.Wait;
import orange.userinterface.FormRecruitmentPage;
import orange.userinterface.HomePage;
import orange.userinterface.RecruitmentPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class Hire implements Task {
    public static Hire hire() {
        return Tasks.instrumented(Hire.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(RecruitmentPage.HIREBUTTON, isCurrentlyVisible()).forNoMoreThan(20).seconds(),
                Click.on(RecruitmentPage.HIREBUTTON),
                Click.on(FormRecruitmentPage.BUTTONSAVE),
                Click.on(HomePage.RECRUITMENT),
                Scroll.to(RecruitmentPage.ADD),
                Wait.milisegundos(4000)

                );
    }
}
