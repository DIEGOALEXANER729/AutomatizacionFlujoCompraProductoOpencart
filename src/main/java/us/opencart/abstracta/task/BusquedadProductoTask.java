package us.opencart.abstracta.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import us.opencart.abstracta.utils.Excel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import static us.opencart.abstracta.userinterfaces.PaginaInicioUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BusquedadProductoTask implements Task {

    private static ArrayList<Map<String, String>> datosExcel = new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            datosExcel = Excel.leerDatosDeHojaDeExcel("src/test/resources/data/Data.xlsx", "Search");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Enter.theValue(Keys.BACK_SPACE).into(TXT_CAMPO_BUSQUEDAD_PRODUCTO),
        Enter.theValue(datosExcel.get(0).get("producto")).into(TXT_CAMPO_BUSQUEDAD_PRODUCTO),
        Hit.the(Keys.ENTER).into(TXT_CAMPO_BUSQUEDAD_PRODUCTO));

    }

    public static Performable BusquedadProductoTask() {
        return instrumented(BusquedadProductoTask.class);
    }

}
