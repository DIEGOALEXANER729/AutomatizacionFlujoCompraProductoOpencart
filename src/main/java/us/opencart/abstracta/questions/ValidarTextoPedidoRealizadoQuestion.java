package us.opencart.abstracta.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import us.opencart.abstracta.userinterfaces.PaginaConfirmacionCompraUI;
import static us.opencart.abstracta.userinterfaces.PaginaConfirmacionCompraUI.LBL_ORDEN_REALIZADA;

public class ValidarTextoPedidoRealizadoQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        // Obtener el texto del mensaje de confirmación
        String textoConfirmacion = LBL_ORDEN_REALIZADA.resolveFor(actor).getText();

        // Validar si el texto es el esperado
        return textoConfirmacion.equals("Your order has been placed!");
    }


    public static ValidarTextoPedidoRealizadoQuestion validarTexto() {
        return new ValidarTextoPedidoRealizadoQuestion();
    }
}
