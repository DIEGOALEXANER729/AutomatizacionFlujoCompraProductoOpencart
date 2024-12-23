# language: es

Característica: Flujo de compra en Opencart abstracta

  Como usuario
  Quiero realizar una compra de un producto sin necesidad de registrarme
  Para poder completar la compra rápidamente y asegurarme de que el producto seleccionado se muestre correctamente en el carrito y en la página de confirmación


  Antecedentes:
    Dado que el usuario abre el navegador y accede a la página principal de Opencart abstracta

  @CompraProducto
  Escenario: Realizar compra de un producto como invitado
    Cuando el usuario agrega el producto Producto al carrito
    Y el usuario visualiza el carrito de compras
    Entonces el carrito debe contener el producto
    Cuando el usuario selecciona la opción Checkout
    Y el usuario elige Guest Checkout para realizar la compra como invitado
    Y el usuario completa los formularios de información personal y dirección de envío
    Y el usuario selecciona el método de pago y confirma la orden
    Entonces el mensaje Your order has been placed! debe aparecer en la página de confirmación de la compra
