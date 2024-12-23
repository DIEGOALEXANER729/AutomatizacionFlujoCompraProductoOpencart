package us.opencart.abstracta.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaConfirmacionDatosUI extends PageObject  {

    public static final Target RBN_PAGO_INVITADO = Target.the("RadioButton pago como invitado").located(By.xpath("//input[@type='radio' and @name='account' and @value='guest']"));
    public static final Target RBN_CONTINUAR_OPCION_PAGO = Target.the("Boton de Continuar de opcion de paog").located(By.xpath("//input[@type='button' and @value='Continue']"));
    public static final Target TXT_NOMBRE = Target.the("Campo de texto nombre").located(By.xpath("//*[@placeholder=\"First Name\"]"));
    public static final Target TXT_APELLIDO = Target.the("").located(By.xpath("//*[@placeholder=\"Last Name\"]"));
    public static final Target TXT_CORREO_ELECTRONICO = Target.the("").located(By.xpath("//*[@id='input-payment-email']"));
    public static final Target TXT_TELEFONO = Target.the("").located(By.xpath("//*[@id='input-payment-telephone']"));
    public static final Target TXT_EMPRESA = Target.the("").located(By.xpath("//input[@placeholder=\"Company\"]"));
    public static final Target TXT_DIRECCION1 = Target.the("").located(By.xpath("//*[@id='input-payment-address-1']"));
    public static final Target TXT_DIRECCION2 = Target.the("").located(By.xpath("//*[@id='input-payment-address-2']"));
    public static final Target TXT_CIUDAD = Target.the("").located(By.xpath("//*[@id='input-payment-city']"));
    public static final Target TXT_CODIGO_POSTAL = Target.the("").located(By.xpath("//*[@id='input-payment-postcode']"));

}
