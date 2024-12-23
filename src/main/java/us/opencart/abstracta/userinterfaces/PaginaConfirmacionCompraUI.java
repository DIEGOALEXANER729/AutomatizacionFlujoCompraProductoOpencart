package us.opencart.abstracta.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaConfirmacionCompraUI extends PageObject {

    public static final Target LBL_ORDEN_REALIZADA = Target.the("texto de confirmacion de pedido").located(By.xpath("//div[@id='content']/h1[contains(text(), 'Your order has been placed!')]"));


}
