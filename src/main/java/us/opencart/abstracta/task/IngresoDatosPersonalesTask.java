package us.opencart.abstracta.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import us.opencart.abstracta.interactions.SeleccionarOpcionPorValor;
import us.opencart.abstracta.utils.EsperaImplicita;
import us.opencart.abstracta.utils.Excel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static us.opencart.abstracta.userinterfaces.PaginaConfirmacionDatosUI.*;

public class IngresoDatosPersonalesTask implements Task {

    private static ArrayList<Map<String, String>> datosExcel = new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            datosExcel = Excel.leerDatosDeHojaDeExcel("src/test/resources/data/Data.xlsx", "Formulario");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Enter.theValue(datosExcel.get(0).get("First Name")).into(TXT_NOMBRE),
                Enter.theValue(datosExcel.get(0).get("Last Name")).into(TXT_APELLIDO),
                Enter.theValue(datosExcel.get(0).get("E-Mail")).into(TXT_CORREO_ELECTRONICO),
                Enter.theValue(datosExcel.get(0).get("Telephone")).into(TXT_TELEFONO),
                Enter.theValue(datosExcel.get(0).get("Company")).into(TXT_EMPRESA),
                Enter.theValue(datosExcel.get(0).get("Address 1")).into(TXT_DIRECCION1),
                Enter.theValue(datosExcel.get(0).get("Address 2")).into(TXT_DIRECCION2),
                Enter.theValue(datosExcel.get(0).get("City")).into(TXT_CIUDAD),
                Enter.theValue(datosExcel.get(0).get("Post Code")).into(TXT_CODIGO_POSTAL),
                SeleccionarOpcionPorValor.seleccionarOpcionPorValor(DROPDOWN_PAIS, "47"),
                SeleccionarOpcionPorValor.seleccionarOpcionPorValor(DROPDOWN_REGION, "744")
        );

    }

    public static Performable IngresoDatosPersonalesTask() {
        return instrumented(IngresoDatosPersonalesTask.class);
    }

}
