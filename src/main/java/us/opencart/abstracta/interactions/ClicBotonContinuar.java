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

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class ClicBotonContinuar implements Interaction {

    private Target boton;
    private boolean desplazar;  // Determina si debe hacer scroll hacia el botón

    public ClicBotonContinuar(Target boton, boolean desplazar) {
        this.boton = boton;
        this.desplazar = desplazar;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Desplazamiento hacia el botón si es necesario
        if (desplazar) {
            JavascriptExecutor js = (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();
            js.executeScript("arguments[0].scrollIntoView(true);", boton.resolveFor(actor).getElement());
        }

        // Esperar que el botón sea visible y hacer clic en él
        actor.attemptsTo(
                WaitUntil.the(boton, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(boton)
        );
    }

    public static Performable clicBotonContinuar(Target boton, boolean desplazar) {
        return instrumented(ClicBotonContinuar.class, boton, desplazar);
    }
}
