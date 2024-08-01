package orange.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormRecruitmentPage {
    public static final Target FIRSTNAME= Target.the("add firstName").located(By.name("firstName"));
    public static final Target MIDDLETNAME= Target.the("add middleName").located(By.name("middleName"));
    public static final Target LASTNAME= Target.the("add lastName").located(By.name("lastName"));
/*ESTE SE MAPEAN LOS DATOS DESPLEGABLES EN EL TASK*/
    public static final Target VACANCY= Target.the("select vacancy").located(By.xpath("//div[@class='oxd-select-text-input']"));

    public static final Target EMAIL= Target.the("email").located(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
    public static final Target NUMBER= Target.the("number").located(By.xpath("(//input[@placeholder='Type here'])[2]"));
    public static final Target KEYWORDS= Target.the("Keywords").located(By.xpath("//input[@placeholder='Enter comma seperated words...']"));
    public static final Target NOTES= Target.the("notes").located(By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']"));
    public static final Target BUTTONSAVE= Target.the("save botton").located(By.xpath("//button[@type='submit']"));

}
