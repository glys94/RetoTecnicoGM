package orange.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidationFinal implements Question<String> {
    private Target target;

    public ValidationFinal(Target target) {
        this.target = target;
    }
    public static ValidationFinal validationFinal(Target target) {
        return new ValidationFinal(target);
    }
    @Override
    public String answeredBy(Actor actor) {
        return actor.asksFor(Text.of(target));
    }
}
