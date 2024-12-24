package us.opencart.abstracta.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.JavascriptExecutor;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static us.opencart.abstracta.userinterfaces.PaginaConfirmacionDatosUI.BTN_CONTINUAR_OPCION_ENTREGA;


public class ClicContinuarOpcionEntrega implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        // Desplazar hasta el botón de Verificar Carrito
        JavascriptExecutor js = (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();

        // Desplazar hasta el botón de Verificar Carrito
        js.executeScript("arguments[0].scrollIntoView(true);", BTN_CONTINUAR_OPCION_ENTREGA.resolveFor(actor).getElement());

        actor.attemptsTo(
                WaitUntil.the(BTN_CONTINUAR_OPCION_ENTREGA, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_CONTINUAR_OPCION_ENTREGA));
    }

    public static Performable ClicContinuarOpcionEntrega() {
        return instrumented(ClicContinuarOpcionEntrega.class);
    }


}
