package us.opencart.abstracta.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaConfirmacionDatosUI extends PageObject  {

    public static final Target RBN_PAGO_INVITADO = Target.the("RadioButton pago como invitado").located(By.xpath("//input[@type='radio' and @name='account' and @value='guest']"));
    public static final Target RBN_CONTINUAR_OPCION_PAGO = Target.the("Boton de Continuar de opcion de paog").located(By.xpath("//input[@type='button' and @value='Continue']"));
    public static final Target TXT_NOMBRE = Target.the("Campo de texto nombre").located(By.xpath("//*[@placeholder=\"First Name\"]"));
    public static final Target TXT_APELLIDO = Target.the("Campo de texto apellido").located(By.xpath("//*[@placeholder=\"Last Name\"]"));
    public static final Target TXT_CORREO_ELECTRONICO = Target.the("campo de correo electronico").located(By.xpath("//*[@id='input-payment-email']"));
    public static final Target TXT_TELEFONO = Target.the("campo de telefono").located(By.xpath("//*[@id='input-payment-telephone']"));
    public static final Target TXT_EMPRESA = Target.the("campo empresa").located(By.xpath("//input[@placeholder=\"Company\"]"));
    public static final Target TXT_DIRECCION1 = Target.the("campo direccion 1").located(By.xpath("//*[@id='input-payment-address-1']"));
    public static final Target TXT_DIRECCION2 = Target.the("campo de direccion 2").located(By.xpath("//*[@id='input-payment-address-2']"));
    public static final Target TXT_CIUDAD = Target.the("campo ciudad").located(By.xpath("//*[@id='input-payment-city']"));
    public static final Target TXT_CODIGO_POSTAL = Target.the("campo codigo postal").located(By.xpath("//*[@id='input-payment-postcode']"));
    public static final Target DROPDOWN_PAIS = Target.the("dropdown para seleccionar el país").located(By.id("input-payment-country"));
    public static final Target DROPDOWN_REGION = Target.the("dropdown para seleccionar la región/estado").located(By.id("input-payment-zone"));
    public static final Target BTN_CONTINUAR_DETALLE_FACTURACION = Target.the("Boton continuar a detalle de facturacion").located(By.xpath("//*[@id='button-guest']"));
    public static final Target BTN_CONTINUAR_OPCION_ENTREGA = Target.the("Boton continuar opcion de entrega").located(By.xpath("//*[@id='button-shipping-method']"));
    public static final Target CHK_TERMINOS_CONDICIONES = Target.the("Check de terminos y condiciones").located(By.xpath("//*[contains(@name, \"agree\")]"));
    public static final Target BTN_CONTINUAR_METODO_PAGO = Target.the("Boton continuar a metodo de pago").located(By.xpath("//*[@id='button-payment-method']"));
    public static final Target BTN_CONFIRMAR_PEDIDO = Target.the("Boton continuar para confirmar pedido").located(By.xpath("//*[@id='button-confirm']"));


}


