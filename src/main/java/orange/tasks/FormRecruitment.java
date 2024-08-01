package orange.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import orange.interactions.Wait;
import orange.models.FormRecruitmentModel;
import orange.userinterface.FormRecruitmentPage;
import org.openqa.selenium.Keys;

public class FormRecruitment implements Task {

    FormRecruitmentModel formRecruitment;

    public FormRecruitment(FormRecruitmentModel formRecruitment) {
        this.formRecruitment = formRecruitment;
    }

    public static FormRecruitment completeform(FormRecruitmentModel formRecruitment) {
        return Tasks.instrumented(FormRecruitment.class,formRecruitment);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(formRecruitment.getFirstName()).into(FormRecruitmentPage.FIRSTNAME),
                Enter.theValue(formRecruitment.getMiddleName()).into(FormRecruitmentPage.MIDDLETNAME),
                Enter.theValue(formRecruitment.getLastName()).into(FormRecruitmentPage.LASTNAME),
                Click.on(FormRecruitmentPage.VACANCY),
                Enter.keyValues(Keys.ARROW_DOWN).into(FormRecruitmentPage.VACANCY),
                Enter.keyValues(Keys.ENTER).into(FormRecruitmentPage.VACANCY),
                Enter.theValue(formRecruitment.getEmail()).into(FormRecruitmentPage.EMAIL),
                Enter.theValue(formRecruitment.getContacNumber()).into(FormRecruitmentPage.NUMBER),
                Enter.theValue(formRecruitment.getKeywords()).into(FormRecruitmentPage.KEYWORDS),
                Scroll.to(FormRecruitmentPage.BUTTONSAVE),
                Enter.theValue(formRecruitment.getNotes()).into(FormRecruitmentPage.NOTES),
                Click.on(FormRecruitmentPage.BUTTONSAVE),
                Wait.milisegundos(3000)

                );
    }
}
