package orange.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RecruitmentPage {

    public static final Target ADD= Target.the("add buttom").located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
    public static final Target  SHORTLISTBUTTON= Target.the("buttom  Shortlist ").located(By.xpath("//button[text()=' Shortlist ']"));
    public static final Target  SCHEDULEBUTTON= Target.the("buttom  Schedule Interview  ").located(By.xpath("//button[text()=' Schedule Interview ']"));
    public static final Target  APPROVEDBUTTON= Target.the("buttom   Mark Interview Passed   ").located(By.xpath("//button[text()=' Mark Interview Passed ']"));
    public static final Target  OFFERJOBBUTTON= Target.the("buttom    Offer Job    ").located(By.xpath("//button[text()=' Offer Job ']"));
    public static final Target  HIREBUTTON= Target.the("buttom hire").located(By.xpath("//button[text()=' Hire ']"));

}
