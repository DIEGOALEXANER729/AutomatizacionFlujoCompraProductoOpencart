package us.opencart.abstracta.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import us.opencart.abstracta.userinterfaces.PaginaInicioUI;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicVerCarrito implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaInicioUI.BTN_VER_CARRITO));
    }

    public static Performable ClicVerCarrito() {
        return instrumented(ClicVerCarrito.class);
    }


}
