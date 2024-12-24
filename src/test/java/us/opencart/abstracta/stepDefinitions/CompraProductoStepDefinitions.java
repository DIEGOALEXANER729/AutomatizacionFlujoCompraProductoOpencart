package us.opencart.abstracta.stepDefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import us.opencart.abstracta.interactions.*;
import us.opencart.abstracta.questions.ValidarProductoCarritoQuestion;
import us.opencart.abstracta.questions.ValidarTextoPedidoRealizadoQuestion;
import us.opencart.abstracta.task.BusquedadProductoTask;
import us.opencart.abstracta.task.CompletarPasoPago;
import us.opencart.abstracta.task.IngresoDatosPersonalesTask;
import us.opencart.abstracta.utils.EsperaImplicita;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static us.opencart.abstracta.userinterfaces.PaginaConfirmacionDatosUI.*;

public class CompraProductoStepDefinitions {

    @Before
    public void setUser(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario abre el navegador y accede a la página principal de Opencart abstracta")
    public void queElUsuarioAbreElNavegadorYAccedeALaPáginaPrincipalDeOpencartAbstracta() {
        theActorCalled("Usuario").wasAbleTo(
                Open.url("https://opencart.abstracta.us/")

        );
    }

    @Cuando("el usuario agrega el producto Producto al carrito")
    public void elUsuarioAgregaElProductoProductoAlCarrito() {
        theActorCalled("usuario").attemptsTo(
                BusquedadProductoTask.BusquedadProductoTask(),
                ClicAgregarCarrito.ClicAgregarCarrito());

    }

    @Cuando("el usuario visualiza el carrito de compras")
    public void elUsuarioVisualizaElCarritoDeCompras() {
        theActorCalled("usuario").attemptsTo(
                ClicItemCarrito.ClicItemCarrito(),
                ClicVerCarrito.ClicVerCarrito());
    }
    @Entonces("el carrito debe contener el producto")
    public void elCarritoDebeContenerElProducto() {

       // theActorCalled("usuario").should(seeThat(ValidarProductoCarritoQuestion.validar(), is(true)));

        theActorCalled("usuario").should(
                seeThat(
                        "Se visualiza producto",
                        ValidarProductoCarritoQuestion.validar(), is(true)));

    }
    @Cuando("el usuario selecciona la opción Checkout")
    public void elUsuarioSeleccionaLaOpciónCheckout() {
             theActorCalled("usuario").attemptsTo(ClicVerificarCarrito.ClicVerificarCarrito());
    }
    @Cuando("el usuario elige Guest Checkout para realizar la compra como invitado")
    public void elUsuarioEligeGuestCheckoutParaRealizarLaCompraComoInvitado() {

        theActorCalled("usuario").attemptsTo(CompletarPasoPago.CompletarPasoPago());

    }
    @Cuando("el usuario completa los formularios de información personal y dirección de envío")
    public void elUsuarioCompletaLosFormulariosDeInformaciónPersonalYDirecciónDeEnvío() {
        theActorCalled("usuario").attemptsTo(
                IngresoDatosPersonalesTask.IngresoDatosPersonalesTask(),
                ClicContinuarDetalleFacturacion.ClicContinuarDetalleFacturacion()
        );
    }
    @Cuando("el usuario selecciona el método de pago y confirma la orden")
    public void elUsuarioSeleccionaElMétodoDePagoYConfirmaLaOrden() {
        theActorCalled("usuario").attemptsTo(
                ClicBotonContinuar.clicBotonContinuar(BTN_CONTINUAR_OPCION_ENTREGA, true),
                ClicBotonContinuar.clicBotonContinuar(CHK_TERMINOS_CONDICIONES, false),
                ClicBotonContinuar.clicBotonContinuar(BTN_CONTINUAR_METODO_PAGO, true),
                ClicBotonContinuar.clicBotonContinuar(BTN_CONFIRMAR_PEDIDO, true)
        );
        EsperaImplicita.esperaImplicita(5);


    }
    @Entonces("el mensaje Your order has been placed! debe aparecer en la página de confirmación de la compra")
    public void elMensajeYourOrderHasBeenPlacedDebeAparecerEnLaPáginaDeConfirmaciónDeLaCompra() {

        theActorCalled("usuario").should(
                seeThat("El mensaje de confirmación del pedido está presente",
                        ValidarTextoPedidoRealizadoQuestion.validarTexto(),
                        equalTo(true))  // Asegúrate de que sea un Matcher adecuado para Boolean
        );






    }



}
