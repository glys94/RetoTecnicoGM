package orange.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import orange.interactions.Wait;
import orange.userinterface.FormRecruitmentPage;
import orange.userinterface.HomePage;
import orange.userinterface.RecruitmentPage;

public class Hire implements Task {
    public static Hire hire() {
        return Tasks.instrumented(Hire.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RecruitmentPage.HIREBUTTON),
                Click.on(FormRecruitmentPage.BUTTONSAVE),
                Click.on(HomePage.RECRUITMENT),
                Wait.milisegundos(4000)
                );
    }
}
