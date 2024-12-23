package us.opencart.abstracta.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import us.opencart.abstracta.userinterfaces.PaginaInicioUI;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicItemCarrito implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaInicioUI.BTN_ITEMS_CARRITO));
    }

    public static Performable ClicItemCarrito() {
        return instrumented(ClicItemCarrito.class);
    }


}
