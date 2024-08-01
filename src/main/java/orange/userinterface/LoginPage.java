package orange.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target USER= Target.the("add user").located(By.name("username"));
    public static final Target PASS= Target.the("add password").located(By.name("password"));
    public static final Target BUTTONLOGIN= Target.the("click in button").located(By.xpath("//button[contains(text(), Login )]"));

}
