package us.opencart.abstracta.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import us.opencart.abstracta.utils.Excel;
import static us.opencart.abstracta.userinterfaces.PaginaCarritoCompraUI.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ValidarProductoCarritoQuestion implements Question<Boolean> {

    private String nombreProducto;

    @Override
    public Boolean answeredBy(Actor actor) {
        // Leer el nombre del producto desde el archivo Excel
        try {
            ArrayList<Map<String, String>> datosExcel = Excel.leerDatosDeHojaDeExcel("src/test/resources/data/Data.xlsx", "Search");
            nombreProducto = datosExcel.get(0).get("producto");
        } catch (IOException ex) {
            // Si no se puede leer el archivo Excel, se lanza una excepción clara
            throw new RuntimeException("Error al leer los datos de Excel: " + ex.getMessage(), ex);
        }

        // Obtener el nombre del producto del carrito
        String productoValidar = LBL_PRODUCTO_CARRITO.resolveFor(actor).getText();

        // Imprimir los valores por consola para verificar
        System.out.println("Nombre producto desde Excel: " + nombreProducto);
        System.out.println("Producto en el carrito: " + productoValidar);

        // Comparar los valores
        Boolean resultado = nombreProducto.equals(productoValidar);

        // Imprimir el resultado de la comparación
        System.out.println("Resultado de la comparación (¿el producto es el mismo?): " + resultado);


        // Retornar el resultado de la comparación
        return nombreProducto.equals(productoValidar);
    }


    public static ValidarProductoCarritoQuestion validar() {
        return new ValidarProductoCarritoQuestion();
    }
}
