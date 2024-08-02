package orange.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SchedulePage {
    public static final Target INTERVIEWERTITLE= Target.the("Interview Title").located(By.xpath("(//input[@class='oxd-input oxd-input--active'])[6]"));
    public static final Target INTERVIEWER= Target.the("Interviewer").located(By.xpath("//input[@placeholder='Type for hints...']"));
    public static final Target DATE= Target.the("date").located(By.xpath("(//input[@class='oxd-input oxd-input--active'])[7]"));
}
