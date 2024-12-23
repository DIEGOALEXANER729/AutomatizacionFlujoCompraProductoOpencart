package us.opencart.abstracta.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarOpcionPorValor implements Interaction {

    private Target dropdown;
    private String valor;

    public SeleccionarOpcionPorValor(Target dropdown, String valor) {
        this.dropdown = dropdown;
        this.valor = valor;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byValue(valor).from(dropdown)
        );
    }

    public static Performable seleccionarOpcionPorValor(Target dropdown, String valor) {
        return instrumented(SeleccionarOpcionPorValor.class, dropdown, valor);
    }
}
