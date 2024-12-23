package us.opencart.abstracta.interactions;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import us.opencart.abstracta.userinterfaces.PaginaResultadoBusquedadUI;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicAgregarCarrito implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaResultadoBusquedadUI.BTN_AGREGAR_CARRITO));
    }

    public static Performable ClicAgregarCarrito() {
        return instrumented(ClicAgregarCarrito.class);
    }


}
