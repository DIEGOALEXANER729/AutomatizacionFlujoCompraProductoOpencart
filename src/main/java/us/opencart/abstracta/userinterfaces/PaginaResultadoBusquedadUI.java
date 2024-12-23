package us.opencart.abstracta.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaResultadoBusquedadUI extends PageObject {

    public static final Target BTN_AGREGAR_CARRITO = Target.the("Boton de agregar carrito").located(By.xpath("//button[span[text()='Add to Cart']]"));

}
