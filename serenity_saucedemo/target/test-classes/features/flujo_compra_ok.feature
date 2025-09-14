

  Feature: Flujo de compra exitosa en pagina SAUCEDEMO - Evelyn Balseca

    @testCompraOK
    Scenario: El usuario realiza una compra exitosa
      Given el usuario ingresa a la pagina saucedemo "https://www.saucedemo.com/ "
      When el usuario ingresa el nombre de usuario "standard_user" y contraseña "secret_sauce" y da clic en Login
      And selecciona el primer producto y seleciona el segundo producto
      And va al carrito el compras "https://www.saucedemo.com/cart.html/"
      And paga la compra
      And completa el formulario de compra y confirma la compra
      Then finaliza la compra  y se muestra el mensaje "Thank you for your order!"