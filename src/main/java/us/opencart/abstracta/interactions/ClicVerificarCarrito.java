package us.opencart.abstracta.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import us.opencart.abstracta.userinterfaces.PaginaCarritoCompraUI;
import us.opencart.abstracta.userinterfaces.PaginaInicioUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicVerificarCarrito implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaCarritoCompraUI.BTN_VERIFICAR));
    }

    public static Performable ClicVerificarCarrito() {
        return instrumented(ClicVerificarCarrito.class);
    }


}
