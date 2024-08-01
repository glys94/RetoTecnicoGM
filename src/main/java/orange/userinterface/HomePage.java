package orange.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target RECRUITMENT= Target.the("buttom recruitment").located(By.xpath("//span[contains(.,'Recruitment')]"));

}
