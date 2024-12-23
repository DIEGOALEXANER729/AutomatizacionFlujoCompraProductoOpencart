package us.opencart.abstracta.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import us.opencart.abstracta.utils.Excel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import


public class CompletarPasoPago implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(RBN_PAGO_INVITADO)
    }

    public static Performable CompletarPasoPago() {
        return instrumented(CompletarPasoPago.class);
    }

}
