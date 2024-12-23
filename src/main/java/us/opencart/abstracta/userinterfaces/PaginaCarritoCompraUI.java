package us.opencart.abstracta.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCarritoCompraUI extends PageObject {

    public static final Target LBL_PRODUCTO_CARRITO = Target.the("Label del producto agregado al carrito").located(By.xpath("//table[@class='table table-bordered']//td[@class='text-left']/a[text()='Samsung Galaxy Tab 10.1']"));
    public static final Target BTN_VERIFICAR = Target.the("Boton CheckOut").located(By.xpath("//a[text()='Checkout']"));




}
