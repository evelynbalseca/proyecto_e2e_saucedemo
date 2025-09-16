

  Feature: Flujo de compra exitosa en pagina SAUCEDEMO - Evelyn Balseca

    @testCompraOK
    Scenario Outline: El usuario realiza una compra exitosa
      Given el usuario ingresa a la pagina saucedemo "https://www.saucedemo.com/ "
      When el usuario ingresa el nombre de usuario "<username>" y contraseña "<password>" y da clic en Login
      And selecciona el primer producto "<producto1>" y seleciona el segundo producto "<producto2>"
      And va al carrito el compras "https://www.saucedemo.com/cart.html/"
      And paga la compra
      And completa el formulario de compra y confirma la compra
      Then finaliza la compra  y se muestra el mensaje "Thank you for your order!"

      Examples:
        | username       | password     | producto1            | producto2             |
        | standard_user  | secret_sauce | add-to-cart-sauce-labs-backpack  | add-to-cart-sauce-labs-bike-light |
        | standard_user   | secret_sauce | add-to-cart-sauce-labs-fleece-jacket | add-to-cart-sauce-labs-onesie |