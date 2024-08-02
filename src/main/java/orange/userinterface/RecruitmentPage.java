package orange.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RecruitmentPage {

    public static final Target ADD= Target.the("add buttom").located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
    public static final Target  SHORTLISTBUTTON= Target.the("buttom  Shortlist ").located(By.xpath("//button[text()=' Shortlist ']"));
    public static final Target  SCHEDULEBUTTON= Target.the("buttom  Schedule Interview  ").located(By.xpath("//button[text()=' Schedule Interview ']"));

}
