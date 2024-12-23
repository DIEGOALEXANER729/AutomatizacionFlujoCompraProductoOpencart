package us.opencart.abstracta.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicioUI extends PageObject {

    public static final Target TXT_CAMPO_BUSQUEDAD_PRODUCTO = Target.the("Campo de busquedad producto").located(By.xpath("//input[contains(@placeholder, \"Search\")]"));
    public static final Target BTN_VER_CARRITO = Target.the("Boton de ver carrito").located(By.xpath("//strong[contains(text(), 'View Cart')]"));

}
