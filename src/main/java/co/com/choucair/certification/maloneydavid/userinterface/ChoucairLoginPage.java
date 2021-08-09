package co.com.choucair.certification.maloneydavid.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target Login_Button = Target.the("button that shows us the form to login ").located(By.xpath("//*[@id=\"nav-menu\"]/ul/li/a/strong"));
}
