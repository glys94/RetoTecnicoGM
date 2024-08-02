package orange.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target RECRUITMENT= Target.the("buttom recruitment").located(By.xpath("//span[contains(.,'Recruitment')]"));
    public static final Target VALIDATEDASBOARD= Target.the("dasboard ").located(By.xpath("//h6[contains(text(),Dashboard)]"));

}
