package us.opencart.abstracta.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static us.opencart.abstracta.userinterfaces.PaginaConfirmacionDatosUI.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import us.opencart.abstracta.utils.EsperaImplicita;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;



public class CompletarPasoPago implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                WaitUntil.the(RBN_PAGO_INVITADO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(RBN_PAGO_INVITADO),
                WaitUntil.the(RBN_CONTINUAR_OPCION_PAGO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(RBN_CONTINUAR_OPCION_PAGO)
        );


    }

    public static Performable CompletarPasoPago() {
        return instrumented(CompletarPasoPago.class);
    }

}
